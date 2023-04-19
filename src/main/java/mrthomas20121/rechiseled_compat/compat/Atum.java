package mrthomas20121.rechiseled_compat.compat;

import com.mojang.datafixers.util.Pair;
import mrthomas20121.rechiseled_compat.core.Core;

import java.util.Collection;
import java.util.List;

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