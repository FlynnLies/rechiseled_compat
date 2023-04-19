package mrthomas20121.rechiseled_compat.compat;

import com.mojang.datafixers.util.Pair;
import mrthomas20121.rechiseled_compat.core.Core;

import java.util.Collection;
import java.util.List;

public class Environmental extends Mod {
    public static final String[] PLANKS = {
            "environmental_cherry_planks_beams",
            "environmental_cherry_planks_beams_connecting",
            "environmental_cherry_planks_bricks",
            "environmental_cherry_planks_bricks_connecting",
            "environmental_cherry_planks_crate",
            "environmental_cherry_planks_crate_connecting",
            "environmental_cherry_planks_diagonal_stripes",
            "environmental_cherry_planks_diagonal_stripes_connecting",
            "environmental_cherry_planks_diagonal_tiles",
            "environmental_cherry_planks_diagonal_tiles_connecting",
            "environmental_cherry_planks_dotted",
            "environmental_cherry_planks_dotted_connecting",
            "environmental_cherry_planks_flooring",
            "environmental_cherry_planks_flooring_connecting",
            "environmental_cherry_planks_large_tiles",
            "environmental_cherry_planks_large_tiles_connecting",
            "environmental_cherry_planks_pattern",
            "environmental_cherry_planks_pattern_connecting",
            "environmental_cherry_planks_small_bricks",
            "environmental_cherry_planks_small_bricks_connecting",
            "environmental_cherry_planks_small_tiles",
            "environmental_cherry_planks_small_tiles_connecting",
            "environmental_cherry_planks_squares",
            "environmental_cherry_planks_squares_connecting",
            "environmental_cherry_planks_tiles",
            "environmental_cherry_planks_tiles_connecting",
            "environmental_cherry_planks_wavy",
            "environmental_cherry_planks_wavy_connecting",
            "environmental_cherry_planks_woven",
            "environmental_cherry_planks_woven_connecting",
            "environmental_willow_planks_beams",
            "environmental_willow_planks_beams_connecting",
            "environmental_willow_planks_bricks",
            "environmental_willow_planks_bricks_connecting",
            "environmental_willow_planks_crate",
            "environmental_willow_planks_crate_connecting",
            "environmental_willow_planks_diagonal_stripes",
            "environmental_willow_planks_diagonal_stripes_connecting",
            "environmental_willow_planks_diagonal_tiles",
            "environmental_willow_planks_diagonal_tiles_connecting",
            "environmental_willow_planks_dotted",
            "environmental_willow_planks_dotted_connecting",
            "environmental_willow_planks_flooring",
            "environmental_willow_planks_flooring_connecting",
            "environmental_willow_planks_large_tiles",
            "environmental_willow_planks_large_tiles_connecting",
            "environmental_willow_planks_pattern",
            "environmental_willow_planks_pattern_connecting",
            "environmental_willow_planks_small_bricks",
            "environmental_willow_planks_small_bricks_connecting",
            "environmental_willow_planks_small_tiles",
            "environmental_willow_planks_small_tiles_connecting",
            "environmental_willow_planks_squares",
            "environmental_willow_planks_squares_connecting",
            "environmental_willow_planks_tiles",
            "environmental_willow_planks_tiles_connecting",
            "environmental_willow_planks_wavy",
            "environmental_willow_planks_wavy_connecting",
            "environmental_willow_planks_woven",
            "environmental_willow_planks_woven_connecting",
            "environmental_wisteria_planks_beams",
            "environmental_wisteria_planks_beams_connecting",
            "environmental_wisteria_planks_bricks",
            "environmental_wisteria_planks_bricks_connecting",
            "environmental_wisteria_planks_crate",
            "environmental_wisteria_planks_crate_connecting",
            "environmental_wisteria_planks_diagonal_stripes",
            "environmental_wisteria_planks_diagonal_stripes_connecting",
            "environmental_wisteria_planks_diagonal_tiles",
            "environmental_wisteria_planks_diagonal_tiles_connecting",
            "environmental_wisteria_planks_dotted",
            "environmental_wisteria_planks_dotted_connecting",
            "environmental_wisteria_planks_flooring",
            "environmental_wisteria_planks_flooring_connecting",
            "environmental_wisteria_planks_large_tiles",
            "environmental_wisteria_planks_large_tiles_connecting",
            "environmental_wisteria_planks_pattern",
            "environmental_wisteria_planks_pattern_connecting",
            "environmental_wisteria_planks_small_bricks",
            "environmental_wisteria_planks_small_bricks_connecting",
            "environmental_wisteria_planks_small_tiles",
            "environmental_wisteria_planks_small_tiles_connecting",
            "environmental_wisteria_planks_squares",
            "environmental_wisteria_planks_squares_connecting",
            "environmental_wisteria_planks_tiles",
            "environmental_wisteria_planks_tiles_connecting",
            "environmental_wisteria_planks_wavy",
            "environmental_wisteria_planks_wavy_connecting",
            "environmental_wisteria_planks_woven",
            "environmental_wisteria_planks_woven_connecting"
    };

    private Environmental() {
    }

    public String getModId() {
        return "environmental";
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