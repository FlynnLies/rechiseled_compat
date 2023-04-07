package mrthomas20121.rechiseled_compat.core;

import mrthomas20121.rechiseled_compat.RechiseledCompat;
import mrthomas20121.rechiseled_compat.compat.Mod;
import mrthomas20121.rechiseled_compat.datagen.CompatForgeTagsProvider;
import mrthomas20121.rechiseled_compat.loot.LootModifiers;
import mrthomas20121.rechiseled_compat.loot.NamespaceCondition;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;


public class Core {

    /**
     * Enables more debug output.
     */
    public static final Boolean DEBUG = false;
    public static final ArrayList<Mod> MOD_LIST = new ArrayList<>();

    /**
     * Enables the collection of tags from all template blocks inside a world.
     * *
     * Tags only get loaded if the world is loaded, and we want to add exactly the same tags to the new block that
     * the template blocks have. However, we want to not have to load the tags every time we start a world first and so
     * only collect them once and copy them from the console into the data generator manually.
     * Most of this is done by {@link DataHandler}.
     **/
    private static final Boolean COLLECT_TAGS = false;

    /**
     * Registers all necessary blocks, items, tags, etc.
     *
     * @param loadingBus The bus that is used for events in the loading phases of the game.
     * @param gameBus    The bus that is used for events inside or while loading a world.
     */
    public static void register(IEventBus loadingBus, IEventBus gameBus) {
        DataHandler.register(loadingBus);
        LootModifiers.register(loadingBus);
        loadingBus.addListener(NamespaceCondition::register);
        if (COLLECT_TAGS) {
            DataHandler.listener(gameBus);
        }

    }


    public static void addMod(Mod mod) {
        MOD_LIST.add(mod);
    }

    /**
     * Checks if a mod is loaded.
     *
     * @param modId Mod id to check.
     * @return If the mod is loaded.
     */
    public static boolean isModLoaded(String modId) {
        return ModList.get().isLoaded(modId);
    }


    /**
     * Tries to add a new block to the registry and applying behaviour from a template block and
     * skips without error if the parent block is not found.
     *
     * @param template_block_id The block to copy properties from. Will also be used when collecting tags.
     * @param new_block_id The block to copy to.
     */
    public static void registerBlock(String template_block_id, String new_block_id) {
        DataHandler.registerBlock(template_block_id, new_block_id, COLLECT_TAGS);
    }


    /**
     * Set tags for list of blocks
     * must only be called inside a CompatForgeTagsProvider<T>#addTags (not necessarily directly)
     **/
    public static void addBlockTags(CompatForgeTagsProvider<Block> provider, String[] blocks, String[] tags) {
        for (String tagName : tags) {
            TagKey<Block> key = BlockTags.create(new ResourceLocation(tagName));
            for (String id : blocks) {
                provider.addOptionalTag(key, new ResourceLocation(RechiseledCompat.MOD_ID, id));
            }
        }
    }

    public static void addItemTags(CompatForgeTagsProvider<Item> provider, String[] items, String[] tags) {
        for (String tagName : tags) {
            TagKey<Item> key = ItemTags.create(new ResourceLocation(tagName));
            for (String id : items) {
                provider.addOptionalTag(key, new ResourceLocation(RechiseledCompat.MOD_ID, id));
            }
        }
    }

    public static DeferredRegister<Block> getBlocks() {
        return DataHandler.getBlocks();
    }

    public static DeferredRegister<Item> getItems() {
        return DataHandler.getItems();
    }


}
