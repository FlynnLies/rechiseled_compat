package mrthomas20121.rechiseled_compat.compat;

import mrthomas20121.rechiseled_compat.core.Core;
import mrthomas20121.rechiseled_compat.datagen.CompatForgeTagsProvider;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class Atum extends Mod {
    public static final String[] PLANKS = {
            "atum_deadwood_planks_beams",
            "atum_deadwood_planks_beams_connecting",
            "atum_deadwood_planks_bricks",
            "atum_deadwood_planks_bricks_connecting",
            "atum_deadwood_planks_crate",
            "atum_deadwood_planks_crate_connecting",
            "atum_deadwood_planks_diagonal_stripes",
            "atum_deadwood_planks_diagonal_stripes_connecting",
            "atum_deadwood_planks_diagonal_tiles",
            "atum_deadwood_planks_diagonal_tiles_connecting",
            "atum_deadwood_planks_dotted",
            "atum_deadwood_planks_dotted_connecting",
            "atum_deadwood_planks_flooring",
            "atum_deadwood_planks_flooring_connecting",
            "atum_deadwood_planks_large_tiles",
            "atum_deadwood_planks_large_tiles_connecting",
            "atum_deadwood_planks_pattern",
            "atum_deadwood_planks_pattern_connecting",
            "atum_deadwood_planks_small_bricks",
            "atum_deadwood_planks_small_bricks_connecting",
            "atum_deadwood_planks_small_tiles",
            "atum_deadwood_planks_small_tiles_connecting",
            "atum_deadwood_planks_squares",
            "atum_deadwood_planks_squares_connecting",
            "atum_deadwood_planks_tiles",
            "atum_deadwood_planks_tiles_connecting",
            "atum_deadwood_planks_wavy",
            "atum_deadwood_planks_wavy_connecting",
            "atum_deadwood_planks_woven",
            "atum_deadwood_planks_woven_connecting",
            "atum_palm_planks_beams",
            "atum_palm_planks_beams_connecting",
            "atum_palm_planks_bricks",
            "atum_palm_planks_bricks_connecting",
            "atum_palm_planks_crate",
            "atum_palm_planks_crate_connecting",
            "atum_palm_planks_diagonal_stripes",
            "atum_palm_planks_diagonal_stripes_connecting",
            "atum_palm_planks_diagonal_tiles",
            "atum_palm_planks_diagonal_tiles_connecting",
            "atum_palm_planks_dotted",
            "atum_palm_planks_dotted_connecting",
            "atum_palm_planks_flooring",
            "atum_palm_planks_flooring_connecting",
            "atum_palm_planks_large_tiles",
            "atum_palm_planks_large_tiles_connecting",
            "atum_palm_planks_pattern",
            "atum_palm_planks_pattern_connecting",
            "atum_palm_planks_small_bricks",
            "atum_palm_planks_small_bricks_connecting",
            "atum_palm_planks_small_tiles",
            "atum_palm_planks_small_tiles_connecting",
            "atum_palm_planks_squares",
            "atum_palm_planks_squares_connecting",
            "atum_palm_planks_tiles",
            "atum_palm_planks_tiles_connecting",
            "atum_palm_planks_wavy",
            "atum_palm_planks_wavy_connecting",
            "atum_palm_planks_woven",
            "atum_palm_planks_woven_connecting"
    };

    private Atum() {
    }

    public String getModId() {
        return "atum";
    }

    public void registerBlocks() {

        for (String block : PLANKS) {
            Core.registerBlock("minecraft:oak_planks", block);
        }

    }

    // for data generation
    public <T> void addTags(CompatForgeTagsProvider<T> provider) {
        // from minecraft:oak_planks

        provider.whenType(Block.class, Core::addBlockTags, PLANKS, new String[]{
                "minecraft:planks",
                "minecraft:mineable/axe"
        });

        provider.whenType(Item.class, Core::addItemTags, PLANKS, new String[]{
                "minecraft:planks",
        });
    }
}