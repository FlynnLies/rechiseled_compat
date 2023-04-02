package mrthomas20121.rechiseled_compat.loot;

import com.google.common.base.Suppliers;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import mrthomas20121.rechiseled_compat.RechiseledCompat;
import mrthomas20121.rechiseled_compat.core.Core;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.common.loot.LootModifier;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public class CompatBlockLootModifier extends LootModifier {

    public static final Supplier<Codec<CompatBlockLootModifier>> CODEC = Suppliers.memoize(()
            -> RecordCodecBuilder.create(inst -> codecStart(inst).apply(inst, CompatBlockLootModifier::new)));

    protected CompatBlockLootModifier(LootItemCondition[] conditionsIn) {
        super(conditionsIn);
    }

    @Override
    protected @NotNull ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> generatedLoot, LootContext context) {

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

    @Override
    public Codec<? extends IGlobalLootModifier> codec() {
        return CODEC.get();
    }
}
