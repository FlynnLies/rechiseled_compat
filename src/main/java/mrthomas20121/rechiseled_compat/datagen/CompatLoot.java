package mrthomas20121.rechiseled_compat.datagen;

import mrthomas20121.rechiseled_compat.core.Core;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.Set;

public class CompatLoot extends BlockLootSubProvider {

    // Used to create a factory method for the wrapping Supplier
    public CompatLoot() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        for (Iterator<Block> it = Core.getBlocks().getEntries().stream().flatMap(RegistryObject::stream).iterator(); it.hasNext(); ) {
            // empty loot table
            LootTable.Builder builder = LootTable.lootTable().withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1)));
            this.add(it.next(), builder);
        }
    }

    // The method used to generate the loot tables
    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return Core.getBlocks().getEntries() // Get all registered entries
                .stream() // Stream the wrapped objects
                .flatMap(RegistryObject::stream) // Get the object if available
                ::iterator; // Create the iterable
    }
}
