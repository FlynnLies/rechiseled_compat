package mrthomas20121.rechiseled_compat.datagen;

import mrthomas20121.rechiseled_compat.core.Core;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

public class CompatLoot extends BlockLoot {

    // Used to create a factory method for the wrapping Supplier
    public CompatLoot() {
    }

    @Override
    protected void addTables() {
        for (Iterator<Block> it = Core.getBlocks().getEntries().stream().flatMap(RegistryObject::stream).iterator(); it.hasNext(); ) {
            // empty loot table
            LootTable.Builder builder = LootTable.lootTable().withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)));
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
