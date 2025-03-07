package mrthomas20121.rechiseled_compat.compat;

import com.mojang.datafixers.util.Pair;
import mrthomas20121.rechiseled_compat.core.Core;

import java.util.Collection;
import java.util.List;

public class BlueSkies extends Mod {
    public static final String[] PLANKS = {
            "blue_skies_bluebright_planks_beams",
            "blue_skies_bluebright_planks_beams_connecting",
            "blue_skies_bluebright_planks_bricks",
            "blue_skies_bluebright_planks_bricks_connecting",
            "blue_skies_bluebright_planks_crate",
            "blue_skies_bluebright_planks_crate_connecting",
            "blue_skies_bluebright_planks_diagonal_stripes",
            "blue_skies_bluebright_planks_diagonal_stripes_connecting",
            "blue_skies_bluebright_planks_diagonal_tiles",
            "blue_skies_bluebright_planks_diagonal_tiles_connecting",
            "blue_skies_bluebright_planks_dotted",
            "blue_skies_bluebright_planks_dotted_connecting",
            "blue_skies_bluebright_planks_flooring",
            "blue_skies_bluebright_planks_flooring_connecting",
            "blue_skies_bluebright_planks_large_tiles",
            "blue_skies_bluebright_planks_large_tiles_connecting",
            "blue_skies_bluebright_planks_pattern",
            "blue_skies_bluebright_planks_pattern_connecting",
            "blue_skies_bluebright_planks_small_bricks",
            "blue_skies_bluebright_planks_small_bricks_connecting",
            "blue_skies_bluebright_planks_small_tiles",
            "blue_skies_bluebright_planks_small_tiles_connecting",
            "blue_skies_bluebright_planks_squares",
            "blue_skies_bluebright_planks_squares_connecting",
            "blue_skies_bluebright_planks_tiles",
            "blue_skies_bluebright_planks_tiles_connecting",
            "blue_skies_bluebright_planks_wavy",
            "blue_skies_bluebright_planks_wavy_connecting",
            "blue_skies_bluebright_planks_woven",
            "blue_skies_bluebright_planks_woven_connecting",
            "blue_skies_cherry_planks_beams",
            "blue_skies_cherry_planks_beams_connecting",
            "blue_skies_cherry_planks_bricks",
            "blue_skies_cherry_planks_bricks_connecting",
            "blue_skies_cherry_planks_crate",
            "blue_skies_cherry_planks_crate_connecting",
            "blue_skies_cherry_planks_diagonal_stripes",
            "blue_skies_cherry_planks_diagonal_stripes_connecting",
            "blue_skies_cherry_planks_diagonal_tiles",
            "blue_skies_cherry_planks_diagonal_tiles_connecting",
            "blue_skies_cherry_planks_dotted",
            "blue_skies_cherry_planks_dotted_connecting",
            "blue_skies_cherry_planks_flooring",
            "blue_skies_cherry_planks_flooring_connecting",
            "blue_skies_cherry_planks_large_tiles",
            "blue_skies_cherry_planks_large_tiles_connecting",
            "blue_skies_cherry_planks_pattern",
            "blue_skies_cherry_planks_pattern_connecting",
            "blue_skies_cherry_planks_small_bricks",
            "blue_skies_cherry_planks_small_bricks_connecting",
            "blue_skies_cherry_planks_small_tiles",
            "blue_skies_cherry_planks_small_tiles_connecting",
            "blue_skies_cherry_planks_squares",
            "blue_skies_cherry_planks_squares_connecting",
            "blue_skies_cherry_planks_tiles",
            "blue_skies_cherry_planks_tiles_connecting",
            "blue_skies_cherry_planks_wavy",
            "blue_skies_cherry_planks_wavy_connecting",
            "blue_skies_cherry_planks_woven",
            "blue_skies_cherry_planks_woven_connecting",
            "blue_skies_frostbright_planks_beams",
            "blue_skies_frostbright_planks_beams_connecting",
            "blue_skies_frostbright_planks_bricks",
            "blue_skies_frostbright_planks_bricks_connecting",
            "blue_skies_frostbright_planks_crate",
            "blue_skies_frostbright_planks_crate_connecting",
            "blue_skies_frostbright_planks_diagonal_stripes",
            "blue_skies_frostbright_planks_diagonal_stripes_connecting",
            "blue_skies_frostbright_planks_diagonal_tiles",
            "blue_skies_frostbright_planks_diagonal_tiles_connecting",
            "blue_skies_frostbright_planks_dotted",
            "blue_skies_frostbright_planks_dotted_connecting",
            "blue_skies_frostbright_planks_flooring",
            "blue_skies_frostbright_planks_flooring_connecting",
            "blue_skies_frostbright_planks_large_tiles",
            "blue_skies_frostbright_planks_large_tiles_connecting",
            "blue_skies_frostbright_planks_pattern",
            "blue_skies_frostbright_planks_pattern_connecting",
            "blue_skies_frostbright_planks_small_bricks",
            "blue_skies_frostbright_planks_small_bricks_connecting",
            "blue_skies_frostbright_planks_small_tiles",
            "blue_skies_frostbright_planks_small_tiles_connecting",
            "blue_skies_frostbright_planks_squares",
            "blue_skies_frostbright_planks_squares_connecting",
            "blue_skies_frostbright_planks_tiles",
            "blue_skies_frostbright_planks_tiles_connecting",
            "blue_skies_frostbright_planks_wavy",
            "blue_skies_frostbright_planks_wavy_connecting",
            "blue_skies_frostbright_planks_woven",
            "blue_skies_frostbright_planks_woven_connecting",
            "blue_skies_maple_planks_beams",
            "blue_skies_maple_planks_beams_connecting",
            "blue_skies_maple_planks_bricks",
            "blue_skies_maple_planks_bricks_connecting",
            "blue_skies_maple_planks_crate",
            "blue_skies_maple_planks_crate_connecting",
            "blue_skies_maple_planks_diagonal_stripes",
            "blue_skies_maple_planks_diagonal_stripes_connecting",
            "blue_skies_maple_planks_diagonal_tiles",
            "blue_skies_maple_planks_diagonal_tiles_connecting",
            "blue_skies_maple_planks_dotted",
            "blue_skies_maple_planks_dotted_connecting",
            "blue_skies_maple_planks_flooring",
            "blue_skies_maple_planks_flooring_connecting",
            "blue_skies_maple_planks_large_tiles",
            "blue_skies_maple_planks_large_tiles_connecting",
            "blue_skies_maple_planks_pattern",
            "blue_skies_maple_planks_pattern_connecting",
            "blue_skies_maple_planks_small_bricks",
            "blue_skies_maple_planks_small_bricks_connecting",
            "blue_skies_maple_planks_small_tiles",
            "blue_skies_maple_planks_small_tiles_connecting",
            "blue_skies_maple_planks_squares",
            "blue_skies_maple_planks_squares_connecting",
            "blue_skies_maple_planks_tiles",
            "blue_skies_maple_planks_tiles_connecting",
            "blue_skies_maple_planks_wavy",
            "blue_skies_maple_planks_wavy_connecting",
            "blue_skies_maple_planks_woven",
            "blue_skies_maple_planks_woven_connecting",
            "blue_skies_starlit_planks_beams",
            "blue_skies_starlit_planks_beams_connecting",
            "blue_skies_starlit_planks_bricks",
            "blue_skies_starlit_planks_bricks_connecting",
            "blue_skies_starlit_planks_crate",
            "blue_skies_starlit_planks_crate_connecting",
            "blue_skies_starlit_planks_diagonal_stripes",
            "blue_skies_starlit_planks_diagonal_stripes_connecting",
            "blue_skies_starlit_planks_diagonal_tiles",
            "blue_skies_starlit_planks_diagonal_tiles_connecting",
            "blue_skies_starlit_planks_dotted",
            "blue_skies_starlit_planks_dotted_connecting",
            "blue_skies_starlit_planks_flooring",
            "blue_skies_starlit_planks_flooring_connecting",
            "blue_skies_starlit_planks_large_tiles",
            "blue_skies_starlit_planks_large_tiles_connecting",
            "blue_skies_starlit_planks_pattern",
            "blue_skies_starlit_planks_pattern_connecting",
            "blue_skies_starlit_planks_small_bricks",
            "blue_skies_starlit_planks_small_bricks_connecting",
            "blue_skies_starlit_planks_small_tiles",
            "blue_skies_starlit_planks_small_tiles_connecting",
            "blue_skies_starlit_planks_squares",
            "blue_skies_starlit_planks_squares_connecting",
            "blue_skies_starlit_planks_tiles",
            "blue_skies_starlit_planks_tiles_connecting",
            "blue_skies_starlit_planks_wavy",
            "blue_skies_starlit_planks_wavy_connecting",
            "blue_skies_starlit_planks_woven",
            "blue_skies_starlit_planks_woven_connecting"
    };

    private BlueSkies() {
    }

    public String getModId() {
        return "blue_skies";
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
