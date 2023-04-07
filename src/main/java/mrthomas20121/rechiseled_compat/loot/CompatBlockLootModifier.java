package mrthomas20121.rechiseled_compat.loot;

import com.google.gson.JsonObject;
import mrthomas20121.rechiseled_compat.RechiseledCompat;
import mrthomas20121.rechiseled_compat.core.Core;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.common.loot.LootModifier;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nonnull;
import java.util.List;

public class CompatBlockLootModifier extends LootModifier {

    protected CompatBlockLootModifier(LootItemCondition[] conditionsIn) {
        super(conditionsIn);
    }

    @Nonnull
    @Override
    protected List<ItemStack> doApply(List<ItemStack> generatedLoot, LootContext context) {
        if (Core.DEBUG) {
            System.out.printf("Loot Table ID: %s\n", context.getQueriedLootTableId().getPath());
        }

        // we can already assume that the modifier only gets applied when
        // the block in question is from this mod due to the {NamespaceCondition}
        // in ".../loot_modifiers/block_compat.json"
        String blocks = "blocks/";
        int blocksLength = blocks.length();

        // ie "blocks/quark_yellow_stained_planks_woven_connecting"
        String path = context.getQueriedLootTableId().getPath();
        ResourceLocation resourceLocation = new ResourceLocation(RechiseledCompat.MOD_ID, path.substring(blocksLength));
        BlockItem item = (BlockItem) ForgeRegistries.ITEMS.getValue(resourceLocation);
        generatedLoot.add(new ItemStack(item));

        return generatedLoot;
    }

    public static class Serializer extends GlobalLootModifierSerializer<CompatBlockLootModifier> {

        @Override
        public CompatBlockLootModifier read(ResourceLocation name, JsonObject object, LootItemCondition[] conditionsIn) {
            return new CompatBlockLootModifier(conditionsIn);
        }

        @Override
        public JsonObject write(CompatBlockLootModifier instance) {
            return makeConditions(instance.conditions);
        }
    }
}
