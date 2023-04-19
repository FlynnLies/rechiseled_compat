package mrthomas20121.rechiseled_compat.compat;

import com.mojang.datafixers.util.Pair;
import mrthomas20121.rechiseled_compat.core.Core;

import java.util.Collection;
import java.util.List;

public class Endergetic extends Mod {
    public static final String[] PLANKS = {
            "endergetic_poise_planks_beams",
            "endergetic_poise_planks_beams_connecting",
            "endergetic_poise_planks_bricks",
            "endergetic_poise_planks_bricks_connecting",
            "endergetic_poise_planks_crate",
            "endergetic_poise_planks_crate_connecting",
            "endergetic_poise_planks_diagonal_stripes",
            "endergetic_poise_planks_diagonal_stripes_connecting",
            "endergetic_poise_planks_diagonal_tiles",
            "endergetic_poise_planks_diagonal_tiles_connecting",
            "endergetic_poise_planks_dotted",
            "endergetic_poise_planks_dotted_connecting",
            "endergetic_poise_planks_flooring",
            "endergetic_poise_planks_flooring_connecting",
            "endergetic_poise_planks_large_tiles",
            "endergetic_poise_planks_large_tiles_connecting",
            "endergetic_poise_planks_pattern",
            "endergetic_poise_planks_pattern_connecting",
            "endergetic_poise_planks_small_bricks",
            "endergetic_poise_planks_small_bricks_connecting",
            "endergetic_poise_planks_small_tiles",
            "endergetic_poise_planks_small_tiles_connecting",
            "endergetic_poise_planks_squares",
            "endergetic_poise_planks_squares_connecting",
            "endergetic_poise_planks_tiles",
            "endergetic_poise_planks_tiles_connecting",
            "endergetic_poise_planks_wavy",
            "endergetic_poise_planks_wavy_connecting",
            "endergetic_poise_planks_woven",
            "endergetic_poise_planks_woven_connecting"
    };

    private Endergetic() {
    }

    public String getModId() {
        return "endergetic";
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