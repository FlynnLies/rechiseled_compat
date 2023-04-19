package mrthomas20121.rechiseled_compat.compat;

import com.mojang.datafixers.util.Pair;
import mrthomas20121.rechiseled_compat.core.Core;

import java.util.Collection;
import java.util.List;

public class BayouBlue extends Mod {
    public static final String[] PLANKS = {
            "bayou_blues_cypress_planks_beams",
            "bayou_blues_cypress_planks_beams_connecting",
            "bayou_blues_cypress_planks_bricks",
            "bayou_blues_cypress_planks_bricks_connecting",
            "bayou_blues_cypress_planks_crate",
            "bayou_blues_cypress_planks_crate_connecting",
            "bayou_blues_cypress_planks_diagonal_stripes",
            "bayou_blues_cypress_planks_diagonal_stripes_connecting",
            "bayou_blues_cypress_planks_diagonal_tiles",
            "bayou_blues_cypress_planks_diagonal_tiles_connecting",
            "bayou_blues_cypress_planks_dotted",
            "bayou_blues_cypress_planks_dotted_connecting",
            "bayou_blues_cypress_planks_flooring",
            "bayou_blues_cypress_planks_flooring_connecting",
            "bayou_blues_cypress_planks_large_tiles",
            "bayou_blues_cypress_planks_large_tiles_connecting",
            "bayou_blues_cypress_planks_pattern",
            "bayou_blues_cypress_planks_pattern_connecting",
            "bayou_blues_cypress_planks_small_bricks",
            "bayou_blues_cypress_planks_small_bricks_connecting",
            "bayou_blues_cypress_planks_small_tiles",
            "bayou_blues_cypress_planks_small_tiles_connecting",
            "bayou_blues_cypress_planks_squares",
            "bayou_blues_cypress_planks_squares_connecting",
            "bayou_blues_cypress_planks_tiles",
            "bayou_blues_cypress_planks_tiles_connecting",
            "bayou_blues_cypress_planks_wavy",
            "bayou_blues_cypress_planks_wavy_connecting",
            "bayou_blues_cypress_planks_woven",
            "bayou_blues_cypress_planks_woven_connecting"
    };

    private BayouBlue() {
    }

    public String getModId() {
        return "bayou_blues";
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