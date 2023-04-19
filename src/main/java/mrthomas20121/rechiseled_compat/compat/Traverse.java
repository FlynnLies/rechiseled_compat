package mrthomas20121.rechiseled_compat.compat;

import com.mojang.datafixers.util.Pair;
import mrthomas20121.rechiseled_compat.core.Core;

import java.util.Collection;
import java.util.List;

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
    @Override
    public Collection<Pair<String[], String[]>> getBlockTags() {
        return List.of(
                Pair.of(PLANKS, new String[]{
                    "minecraft:planks",
                    "minecraft:mineable/axe"
                })/*,
                Pair.of(STONES, new String[]{
                    ...
                })*/
        );
    }

    // for data generation
    @Override
    public Collection<Pair<String[], String[]>> getItemTags() {
        return List.of(
                Pair.of(PLANKS, new String[]{
                        "minecraft:planks",
                })
        );
    }
}