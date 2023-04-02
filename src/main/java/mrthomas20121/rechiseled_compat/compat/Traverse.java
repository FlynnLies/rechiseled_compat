package mrthomas20121.rechiseled_compat.compat;

import mrthomas20121.rechiseled_compat.core.Core;
import mrthomas20121.rechiseled_compat.datagen.CompatForgeTagsProvider;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class Traverse extends Mod {
    public static final String[] PLANKS = {
            "traverse_fir_planks_beams",
            "traverse_fir_planks_beams_connecting",
            "traverse_fir_planks_bricks",
            "traverse_fir_planks_bricks_connecting",
            "traverse_fir_planks_crate",
            "traverse_fir_planks_crate_connecting",
            "traverse_fir_planks_diagonal_stripes",
            "traverse_fir_planks_diagonal_stripes_connecting",
            "traverse_fir_planks_diagonal_tiles",
            "traverse_fir_planks_diagonal_tiles_connecting",
            "traverse_fir_planks_dotted",
            "traverse_fir_planks_dotted_connecting",
            "traverse_fir_planks_flooring",
            "traverse_fir_planks_flooring_connecting",
            "traverse_fir_planks_large_tiles",
            "traverse_fir_planks_large_tiles_connecting",
            "traverse_fir_planks_pattern",
            "traverse_fir_planks_pattern_connecting",
            "traverse_fir_planks_small_bricks",
            "traverse_fir_planks_small_bricks_connecting",
            "traverse_fir_planks_small_tiles",
            "traverse_fir_planks_small_tiles_connecting",
            "traverse_fir_planks_squares",
            "traverse_fir_planks_squares_connecting",
            "traverse_fir_planks_tiles",
            "traverse_fir_planks_tiles_connecting",
            "traverse_fir_planks_wavy",
            "traverse_fir_planks_wavy_connecting",
            "traverse_fir_planks_woven",
            "traverse_fir_planks_woven_connecting"
    };

    private Traverse() {
    }

    public String getModId() {
        return "traverse";
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