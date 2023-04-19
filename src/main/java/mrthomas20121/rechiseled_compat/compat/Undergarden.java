package mrthomas20121.rechiseled_compat.compat;

import com.mojang.datafixers.util.Pair;
import mrthomas20121.rechiseled_compat.core.Core;

import java.util.Collection;
import java.util.List;

public class Undergarden extends Mod {
    public static final String[] PLANKS = {
            "undergarden_grongle_planks_beams",
            "undergarden_grongle_planks_beams_connecting",
            "undergarden_grongle_planks_bricks",
            "undergarden_grongle_planks_bricks_connecting",
            "undergarden_grongle_planks_crate",
            "undergarden_grongle_planks_crate_connecting",
            "undergarden_grongle_planks_diagonal_stripes",
            "undergarden_grongle_planks_diagonal_stripes_connecting",
            "undergarden_grongle_planks_diagonal_tiles",
            "undergarden_grongle_planks_diagonal_tiles_connecting",
            "undergarden_grongle_planks_dotted",
            "undergarden_grongle_planks_dotted_connecting",
            "undergarden_grongle_planks_flooring",
            "undergarden_grongle_planks_flooring_connecting",
            "undergarden_grongle_planks_large_tiles",
            "undergarden_grongle_planks_large_tiles_connecting",
            "undergarden_grongle_planks_pattern",
            "undergarden_grongle_planks_pattern_connecting",
            "undergarden_grongle_planks_small_bricks",
            "undergarden_grongle_planks_small_bricks_connecting",
            "undergarden_grongle_planks_small_tiles",
            "undergarden_grongle_planks_small_tiles_connecting",
            "undergarden_grongle_planks_squares",
            "undergarden_grongle_planks_squares_connecting",
            "undergarden_grongle_planks_tiles",
            "undergarden_grongle_planks_tiles_connecting",
            "undergarden_grongle_planks_wavy",
            "undergarden_grongle_planks_wavy_connecting",
            "undergarden_grongle_planks_woven",
            "undergarden_grongle_planks_woven_connecting",
            "undergarden_smogstem_planks_beams",
            "undergarden_smogstem_planks_beams_connecting",
            "undergarden_smogstem_planks_bricks",
            "undergarden_smogstem_planks_bricks_connecting",
            "undergarden_smogstem_planks_crate",
            "undergarden_smogstem_planks_crate_connecting",
            "undergarden_smogstem_planks_diagonal_stripes",
            "undergarden_smogstem_planks_diagonal_stripes_connecting",
            "undergarden_smogstem_planks_diagonal_tiles",
            "undergarden_smogstem_planks_diagonal_tiles_connecting",
            "undergarden_smogstem_planks_dotted",
            "undergarden_smogstem_planks_dotted_connecting",
            "undergarden_smogstem_planks_flooring",
            "undergarden_smogstem_planks_flooring_connecting",
            "undergarden_smogstem_planks_large_tiles",
            "undergarden_smogstem_planks_large_tiles_connecting",
            "undergarden_smogstem_planks_pattern",
            "undergarden_smogstem_planks_pattern_connecting",
            "undergarden_smogstem_planks_small_bricks",
            "undergarden_smogstem_planks_small_bricks_connecting",
            "undergarden_smogstem_planks_small_tiles",
            "undergarden_smogstem_planks_small_tiles_connecting",
            "undergarden_smogstem_planks_squares",
            "undergarden_smogstem_planks_squares_connecting",
            "undergarden_smogstem_planks_tiles",
            "undergarden_smogstem_planks_tiles_connecting",
            "undergarden_smogstem_planks_wavy",
            "undergarden_smogstem_planks_wavy_connecting",
            "undergarden_smogstem_planks_woven",
            "undergarden_smogstem_planks_woven_connecting",
            "undergarden_wigglewood_planks_beams",
            "undergarden_wigglewood_planks_beams_connecting",
            "undergarden_wigglewood_planks_bricks",
            "undergarden_wigglewood_planks_bricks_connecting",
            "undergarden_wigglewood_planks_crate",
            "undergarden_wigglewood_planks_crate_connecting",
            "undergarden_wigglewood_planks_diagonal_stripes",
            "undergarden_wigglewood_planks_diagonal_stripes_connecting",
            "undergarden_wigglewood_planks_diagonal_tiles",
            "undergarden_wigglewood_planks_diagonal_tiles_connecting",
            "undergarden_wigglewood_planks_dotted",
            "undergarden_wigglewood_planks_dotted_connecting",
            "undergarden_wigglewood_planks_flooring",
            "undergarden_wigglewood_planks_flooring_connecting",
            "undergarden_wigglewood_planks_large_tiles",
            "undergarden_wigglewood_planks_large_tiles_connecting",
            "undergarden_wigglewood_planks_pattern",
            "undergarden_wigglewood_planks_pattern_connecting",
            "undergarden_wigglewood_planks_small_bricks",
            "undergarden_wigglewood_planks_small_bricks_connecting",
            "undergarden_wigglewood_planks_small_tiles",
            "undergarden_wigglewood_planks_small_tiles_connecting",
            "undergarden_wigglewood_planks_squares",
            "undergarden_wigglewood_planks_squares_connecting",
            "undergarden_wigglewood_planks_tiles",
            "undergarden_wigglewood_planks_tiles_connecting",
            "undergarden_wigglewood_planks_wavy",
            "undergarden_wigglewood_planks_wavy_connecting",
            "undergarden_wigglewood_planks_woven",
            "undergarden_wigglewood_planks_woven_connecting"
    };

    private Undergarden() {
    }

    public String getModId() {
        return "undergarden";
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