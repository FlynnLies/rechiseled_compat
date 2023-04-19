package mrthomas20121.rechiseled_compat.core;

import com.mojang.datafixers.util.Pair;
import mrthomas20121.rechiseled_compat.RechiseledCompat;
import mrthomas20121.rechiseled_compat.block.ChiseledBlock;
import net.minecraft.core.Holder;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.event.server.ServerStartedEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.tags.IReverseTag;
import org.apache.logging.log4j.LogManager;
import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DataHandler {

    @Mod.EventBusSubscriber(modid = RechiseledCompat.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ModCreativeModeTabs {

        private static CreativeModeTab COMMON_TAB;
        public static CreativeModeTab CONNECTING_TAB;

        @SubscribeEvent
        public static void registerConnectingTab(CreativeModeTabEvent.Register event) {
            if (Core.getItems().getEntries().size() == 0){return;}

            Supplier<ItemStack> connectingSupplier = () -> {
                Item item;
                Iterator<RegistryObject<Item>> iterator = Core.getItems().getEntries().iterator();
                for (int i = 0; i<30; i++) {iterator.next();} // skip to the next block (has about 30 variations [common + connecting])
                item = iterator.next().get();

                return new ItemStack(item);
            };

            Supplier<ItemStack> commonSupplier = () -> {
                Item item = Core.getItems().getEntries().iterator().next().get();
                return new ItemStack(item);
            };

            CONNECTING_TAB = event.registerCreativeModeTab(new ResourceLocation(RechiseledCompat.MOD_ID, "rechisled_compat_connecting"),
                    builder -> builder.icon(connectingSupplier).title(Component.translatable("creativemodetab.rechisled_compat_connecting")));

            COMMON_TAB = event.registerCreativeModeTab(new ResourceLocation(RechiseledCompat.MOD_ID, "rechisled_compat_common"),
                    builder -> builder.icon(commonSupplier).title(Component.translatable("creativemodetab.rechisled_compat_common")));
        }
    }

    private static void addCreativeTabs(CreativeModeTabEvent.BuildContents event) {

        // connecting blocks
        if(event.getTab() == ModCreativeModeTabs.CONNECTING_TAB) {
            Core.getItems().getEntries().forEach((item) -> {
                if (item.getId().getPath().contains("connecting")) {event.accept(item);}
            });
        }

        // not connecting blocks
        if(event.getTab() == ModCreativeModeTabs.COMMON_TAB) {
            Core.getItems().getEntries().forEach((item) -> {
                if (!item.getId().getPath().contains("connecting")) {event.accept(item);}
            });
        }
    }

    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, RechiseledCompat.MOD_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RechiseledCompat.MOD_ID);

    private static ArrayList<Pair<Block, String>> BLOCK_TEMPLATE_MAP;
    private static Dictionary<Block, ArrayList<TagKey<Block>>> TEMPLATE_BLOCK_TAGS;

    private static ArrayList<Pair<Block, String>> getTemplateMap() {
        if (BLOCK_TEMPLATE_MAP == null) {
            BLOCK_TEMPLATE_MAP = new ArrayList<>();
        }
        return BLOCK_TEMPLATE_MAP;
    }

    private static Dictionary<Block, ArrayList<TagKey<Block>>> getTemplateBlockTags() {
        if (TEMPLATE_BLOCK_TAGS == null) {
            TEMPLATE_BLOCK_TAGS = new Hashtable<>();
        }
        return TEMPLATE_BLOCK_TAGS;
    }

    protected static DeferredRegister<Block> getBlocks() {
        return BLOCKS;
    }

    protected static DeferredRegister<Item> getItems() {
        return ITEMS;
    }


    private static void registerTemplate(Block template, String compatBlockDescriptionId) {
        getTemplateMap().add(Pair.of(template, compatBlockDescriptionId));
        System.out.printf("Registered template %s for block %s\n", template.getDescriptionId(), compatBlockDescriptionId);
    }

    // must be done when a world is loaded, else the registry will not be loaded
    private static void registerBlockTagsFromBlock(Block template) {
        // get a stream of all tags for this block and collect them into a ArrayList
        @NotNull Optional<IReverseTag<Block>> reverseTagOptional = Objects.requireNonNull(ForgeRegistries.BLOCKS.tags()).getReverseTag(template);
        Stream<TagKey<Block>> tagKeyStream;
        if (reverseTagOptional.isPresent()) {
            tagKeyStream = reverseTagOptional.get().getTagKeys();

            Collector<TagKey<Block>, ?, ArrayList<TagKey<Block>>> toArrayList = Collectors.toCollection(ArrayList::new);
            getTemplateBlockTags().put(
                    template,
                    tagKeyStream.collect(toArrayList)
            );
        }
    }

    @SubscribeEvent
    static void dumpTemplateBlockTags(ServerStartedEvent event) {
        for (Pair<Block, String> pair : getTemplateMap()) {
            registerBlockTagsFromBlock(pair.getFirst());
        }

        LogManager.getLogger().info("Template block tags:");

        Dictionary<Block, ArrayList<TagKey<Block>>> templateBlockTags = getTemplateBlockTags();
        for (Enumeration<Block> keys = templateBlockTags.keys(); keys.hasMoreElements(); ) {
            Block template = keys.nextElement();
            ArrayList<TagKey<Block>> tagKeys = templateBlockTags.get(template);

            System.out.printf("Block '%s' has %d tags: %s\n", template.getDescriptionId(), tagKeys.size(), tagKeys);
        }
    }

    protected static void listener(IEventBus eventBus) {
        eventBus.addListener(DataHandler::dumpTemplateBlockTags);
    }

    protected static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);

        eventBus.addListener(DataHandler::addCreativeTabs);
    }

    protected static void registerBlock(String parent_block_id, String new_block_id, Boolean collect_tags) {

        Block parent = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(parent_block_id));

        Optional<Holder<Block>> optional = ForgeRegistries.BLOCKS.getHolder(parent);
        if (optional.isPresent() && parent != null) {
            // register the block
            RegistryObject<Block> block = BLOCKS.register(new_block_id, () -> new ChiseledBlock(false, getBlockProperties(parent)));

            // register the item
            @SuppressWarnings("unused")
            RegistryObject<Item> item = ITEMS.register(new_block_id, () -> new BlockItem(block.get(), getItemProperties(block.get())));

            if (collect_tags) {
                DataHandler.registerTemplate(parent, RechiseledCompat.MOD_ID + ":" + new_block_id);
            }

        } else {
            System.out.printf("Block %s not found or Holder is not present, skipping %s:%s\n", parent_block_id, RechiseledCompat.MOD_ID, new_block_id);
        }
    }

    @SuppressWarnings("DataFlowIssue")
    private static BlockBehaviour.Properties getBlockProperties(Block parent) {

        BlockState parent_state = parent.defaultBlockState();
        SoundType soundType = parent_state.getSoundType();
        Material material = parent_state.getMaterial();
        MaterialColor materialColor = parent_state.getMaterial().getColor();

        float explosionResistance = parent.getExplosionResistance(null, null, null, null);
        float hardness = parent_state.getDestroySpeed(null, null);

        return BlockBehaviour.Properties.of(material, materialColor).strength(hardness, explosionResistance).sound(soundType);
    }

    private static Item.Properties getItemProperties(Block block) {
        return new Item.Properties();
    }


}
