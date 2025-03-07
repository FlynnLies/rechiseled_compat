package mrthomas20121.rechiseled_compat.compat;

import com.mojang.datafixers.util.Pair;
import mrthomas20121.rechiseled_compat.core.Core;

import java.util.Collection;
import java.util.List;

public class Twilightforest extends Mod {
    public static final String[] PLANKS = {
            "twilightforest_planks_canopy_beams",
            "twilightforest_planks_canopy_beams_connecting",
            "twilightforest_planks_canopy_bricks",
            "twilightforest_planks_canopy_bricks_connecting",
            "twilightforest_planks_canopy_crate",
            "twilightforest_planks_canopy_crate_connecting",
            "twilightforest_planks_canopy_diagonal_stripes",
            "twilightforest_planks_canopy_diagonal_stripes_connecting",
            "twilightforest_planks_canopy_diagonal_tiles",
            "twilightforest_planks_canopy_diagonal_tiles_connecting",
            "twilightforest_planks_canopy_dotted",
            "twilightforest_planks_canopy_dotted_connecting",
            "twilightforest_planks_canopy_flooring",
            "twilightforest_planks_canopy_flooring_connecting",
            "twilightforest_planks_canopy_large_tiles",
            "twilightforest_planks_canopy_large_tiles_connecting",
            "twilightforest_planks_canopy_pattern",
            "twilightforest_planks_canopy_pattern_connecting",
            "twilightforest_planks_canopy_small_bricks",
            "twilightforest_planks_canopy_small_bricks_connecting",
            "twilightforest_planks_canopy_small_tiles",
            "twilightforest_planks_canopy_small_tiles_connecting",
            "twilightforest_planks_canopy_squares",
            "twilightforest_planks_canopy_squares_connecting",
            "twilightforest_planks_canopy_tiles",
            "twilightforest_planks_canopy_tiles_connecting",
            "twilightforest_planks_canopy_wavy",
            "twilightforest_planks_canopy_wavy_connecting",
            "twilightforest_planks_canopy_woven",
            "twilightforest_planks_canopy_woven_connecting",
            "twilightforest_planks_darkwood_beams",
            "twilightforest_planks_darkwood_beams_connecting",
            "twilightforest_planks_darkwood_bricks",
            "twilightforest_planks_darkwood_bricks_connecting",
            "twilightforest_planks_darkwood_crate",
            "twilightforest_planks_darkwood_crate_connecting",
            "twilightforest_planks_darkwood_diagonal_stripes",
            "twilightforest_planks_darkwood_diagonal_stripes_connecting",
            "twilightforest_planks_darkwood_diagonal_tiles",
            "twilightforest_planks_darkwood_diagonal_tiles_connecting",
            "twilightforest_planks_darkwood_dotted",
            "twilightforest_planks_darkwood_dotted_connecting",
            "twilightforest_planks_darkwood_flooring",
            "twilightforest_planks_darkwood_flooring_connecting",
            "twilightforest_planks_darkwood_large_tiles",
            "twilightforest_planks_darkwood_large_tiles_connecting",
            "twilightforest_planks_darkwood_pattern",
            "twilightforest_planks_darkwood_pattern_connecting",
            "twilightforest_planks_darkwood_small_bricks",
            "twilightforest_planks_darkwood_small_bricks_connecting",
            "twilightforest_planks_darkwood_small_tiles",
            "twilightforest_planks_darkwood_small_tiles_connecting",
            "twilightforest_planks_darkwood_squares",
            "twilightforest_planks_darkwood_squares_connecting",
            "twilightforest_planks_darkwood_tiles",
            "twilightforest_planks_darkwood_tiles_connecting",
            "twilightforest_planks_darkwood_wavy",
            "twilightforest_planks_darkwood_wavy_connecting",
            "twilightforest_planks_darkwood_woven",
            "twilightforest_planks_darkwood_woven_connecting",
            "twilightforest_planks_mine_beams",
            "twilightforest_planks_mine_beams_connecting",
            "twilightforest_planks_mine_bricks",
            "twilightforest_planks_mine_bricks_connecting",
            "twilightforest_planks_mine_crate",
            "twilightforest_planks_mine_crate_connecting",
            "twilightforest_planks_mine_diagonal_stripes",
            "twilightforest_planks_mine_diagonal_stripes_connecting",
            "twilightforest_planks_mine_diagonal_tiles",
            "twilightforest_planks_mine_diagonal_tiles_connecting",
            "twilightforest_planks_mine_dotted",
            "twilightforest_planks_mine_dotted_connecting",
            "twilightforest_planks_mine_flooring",
            "twilightforest_planks_mine_flooring_connecting",
            "twilightforest_planks_mine_large_tiles",
            "twilightforest_planks_mine_large_tiles_connecting",
            "twilightforest_planks_mine_pattern",
            "twilightforest_planks_mine_pattern_connecting",
            "twilightforest_planks_mine_small_bricks",
            "twilightforest_planks_mine_small_bricks_connecting",
            "twilightforest_planks_mine_small_tiles",
            "twilightforest_planks_mine_small_tiles_connecting",
            "twilightforest_planks_mine_squares",
            "twilightforest_planks_mine_squares_connecting",
            "twilightforest_planks_mine_tiles",
            "twilightforest_planks_mine_tiles_connecting",
            "twilightforest_planks_mine_wavy",
            "twilightforest_planks_mine_wavy_connecting",
            "twilightforest_planks_mine_woven",
            "twilightforest_planks_mine_woven_connecting",
            "twilightforest_planks_sort_beams",
            "twilightforest_planks_sort_beams_connecting",
            "twilightforest_planks_sort_bricks",
            "twilightforest_planks_sort_bricks_connecting",
            "twilightforest_planks_sort_crate",
            "twilightforest_planks_sort_crate_connecting",
            "twilightforest_planks_sort_diagonal_stripes",
            "twilightforest_planks_sort_diagonal_stripes_connecting",
            "twilightforest_planks_sort_diagonal_tiles",
            "twilightforest_planks_sort_diagonal_tiles_connecting",
            "twilightforest_planks_sort_dotted",
            "twilightforest_planks_sort_dotted_connecting",
            "twilightforest_planks_sort_flooring",
            "twilightforest_planks_sort_flooring_connecting",
            "twilightforest_planks_sort_large_tiles",
            "twilightforest_planks_sort_large_tiles_connecting",
            "twilightforest_planks_sort_pattern",
            "twilightforest_planks_sort_pattern_connecting",
            "twilightforest_planks_sort_small_bricks",
            "twilightforest_planks_sort_small_bricks_connecting",
            "twilightforest_planks_sort_small_tiles",
            "twilightforest_planks_sort_small_tiles_connecting",
            "twilightforest_planks_sort_squares",
            "twilightforest_planks_sort_squares_connecting",
            "twilightforest_planks_sort_tiles",
            "twilightforest_planks_sort_tiles_connecting",
            "twilightforest_planks_sort_wavy",
            "twilightforest_planks_sort_wavy_connecting",
            "twilightforest_planks_sort_woven",
            "twilightforest_planks_sort_woven_connecting",
            "twilightforest_planks_time_beams",
            "twilightforest_planks_time_beams_connecting",
            "twilightforest_planks_time_bricks",
            "twilightforest_planks_time_bricks_connecting",
            "twilightforest_planks_time_crate",
            "twilightforest_planks_time_crate_connecting",
            "twilightforest_planks_time_diagonal_stripes",
            "twilightforest_planks_time_diagonal_stripes_connecting",
            "twilightforest_planks_time_diagonal_tiles",
            "twilightforest_planks_time_diagonal_tiles_connecting",
            "twilightforest_planks_time_dotted",
            "twilightforest_planks_time_dotted_connecting",
            "twilightforest_planks_time_flooring",
            "twilightforest_planks_time_flooring_connecting",
            "twilightforest_planks_time_large_tiles",
            "twilightforest_planks_time_large_tiles_connecting",
            "twilightforest_planks_time_pattern",
            "twilightforest_planks_time_pattern_connecting",
            "twilightforest_planks_time_small_bricks",
            "twilightforest_planks_time_small_bricks_connecting",
            "twilightforest_planks_time_small_tiles",
            "twilightforest_planks_time_small_tiles_connecting",
            "twilightforest_planks_time_squares",
            "twilightforest_planks_time_squares_connecting",
            "twilightforest_planks_time_tiles",
            "twilightforest_planks_time_tiles_connecting",
            "twilightforest_planks_time_wavy",
            "twilightforest_planks_time_wavy_connecting",
            "twilightforest_planks_time_woven",
            "twilightforest_planks_time_woven_connecting",
            "twilightforest_planks_trans_beams",
            "twilightforest_planks_trans_beams_connecting",
            "twilightforest_planks_trans_bricks",
            "twilightforest_planks_trans_bricks_connecting",
            "twilightforest_planks_trans_crate",
            "twilightforest_planks_trans_crate_connecting",
            "twilightforest_planks_trans_diagonal_stripes",
            "twilightforest_planks_trans_diagonal_stripes_connecting",
            "twilightforest_planks_trans_diagonal_tiles",
            "twilightforest_planks_trans_diagonal_tiles_connecting",
            "twilightforest_planks_trans_dotted",
            "twilightforest_planks_trans_dotted_connecting",
            "twilightforest_planks_trans_flooring",
            "twilightforest_planks_trans_flooring_connecting",
            "twilightforest_planks_trans_large_tiles",
            "twilightforest_planks_trans_large_tiles_connecting",
            "twilightforest_planks_trans_pattern",
            "twilightforest_planks_trans_pattern_connecting",
            "twilightforest_planks_trans_small_bricks",
            "twilightforest_planks_trans_small_bricks_connecting",
            "twilightforest_planks_trans_small_tiles",
            "twilightforest_planks_trans_small_tiles_connecting",
            "twilightforest_planks_trans_squares",
            "twilightforest_planks_trans_squares_connecting",
            "twilightforest_planks_trans_tiles",
            "twilightforest_planks_trans_tiles_connecting",
            "twilightforest_planks_trans_wavy",
            "twilightforest_planks_trans_wavy_connecting",
            "twilightforest_planks_trans_woven",
            "twilightforest_planks_trans_woven_connecting",
            "twilightforest_planks_twilight_oak_beams",
            "twilightforest_planks_twilight_oak_beams_connecting",
            "twilightforest_planks_twilight_oak_bricks",
            "twilightforest_planks_twilight_oak_bricks_connecting",
            "twilightforest_planks_twilight_oak_crate",
            "twilightforest_planks_twilight_oak_crate_connecting",
            "twilightforest_planks_twilight_oak_diagonal_stripes",
            "twilightforest_planks_twilight_oak_diagonal_stripes_connecting",
            "twilightforest_planks_twilight_oak_diagonal_tiles",
            "twilightforest_planks_twilight_oak_diagonal_tiles_connecting",
            "twilightforest_planks_twilight_oak_dotted",
            "twilightforest_planks_twilight_oak_dotted_connecting",
            "twilightforest_planks_twilight_oak_flooring",
            "twilightforest_planks_twilight_oak_flooring_connecting",
            "twilightforest_planks_twilight_oak_large_tiles",
            "twilightforest_planks_twilight_oak_large_tiles_connecting",
            "twilightforest_planks_twilight_oak_pattern",
            "twilightforest_planks_twilight_oak_pattern_connecting",
            "twilightforest_planks_twilight_oak_small_bricks",
            "twilightforest_planks_twilight_oak_small_bricks_connecting",
            "twilightforest_planks_twilight_oak_small_tiles",
            "twilightforest_planks_twilight_oak_small_tiles_connecting",
            "twilightforest_planks_twilight_oak_squares",
            "twilightforest_planks_twilight_oak_squares_connecting",
            "twilightforest_planks_twilight_oak_tiles",
            "twilightforest_planks_twilight_oak_tiles_connecting",
            "twilightforest_planks_twilight_oak_wavy",
            "twilightforest_planks_twilight_oak_wavy_connecting",
            "twilightforest_planks_twilight_oak_woven",
            "twilightforest_planks_twilight_oak_woven_connecting"
    };

    private Twilightforest() {
    }

    public String getModId() {
        return "twilightforest";
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