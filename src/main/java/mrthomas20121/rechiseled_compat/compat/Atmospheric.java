package mrthomas20121.rechiseled_compat.compat;

import com.mojang.datafixers.util.Pair;
import mrthomas20121.rechiseled_compat.core.Core;

import java.util.Collection;
import java.util.List;

public class Atmospheric extends Mod {
    public static final String[] PLANKS = {
            "atmospheric_arid_sandstone_bricks",
            "atmospheric_arid_sandstone_bricks_connecting",
            "atmospheric_arid_sandstone_large_tiles",
            "atmospheric_arid_sandstone_large_tiles_connecting",
            "atmospheric_arid_sandstone_polished",
            "atmospheric_arid_sandstone_polished_connecting",
            "atmospheric_arid_sandstone_tiles",
            "atmospheric_arid_sandstone_tiles_connecting",
            "atmospheric_aspen_planks_beams",
            "atmospheric_aspen_planks_beams_connecting",
            "atmospheric_aspen_planks_bricks",
            "atmospheric_aspen_planks_bricks_connecting",
            "atmospheric_aspen_planks_crate",
            "atmospheric_aspen_planks_crate_connecting",
            "atmospheric_aspen_planks_diagonal_stripes",
            "atmospheric_aspen_planks_diagonal_stripes_connecting",
            "atmospheric_aspen_planks_diagonal_tiles",
            "atmospheric_aspen_planks_diagonal_tiles_connecting",
            "atmospheric_aspen_planks_dotted",
            "atmospheric_aspen_planks_dotted_connecting",
            "atmospheric_aspen_planks_flooring",
            "atmospheric_aspen_planks_flooring_connecting",
            "atmospheric_aspen_planks_large_tiles",
            "atmospheric_aspen_planks_large_tiles_connecting",
            "atmospheric_aspen_planks_pattern",
            "atmospheric_aspen_planks_pattern_connecting",
            "atmospheric_aspen_planks_small_bricks",
            "atmospheric_aspen_planks_small_bricks_connecting",
            "atmospheric_aspen_planks_small_tiles",
            "atmospheric_aspen_planks_small_tiles_connecting",
            "atmospheric_aspen_planks_squares",
            "atmospheric_aspen_planks_squares_connecting",
            "atmospheric_aspen_planks_tiles",
            "atmospheric_aspen_planks_tiles_connecting",
            "atmospheric_aspen_planks_wavy",
            "atmospheric_aspen_planks_wavy_connecting",
            "atmospheric_aspen_planks_woven",
            "atmospheric_aspen_planks_woven_connecting",
            "atmospheric_grimwood_planks_beams",
            "atmospheric_grimwood_planks_beams_connecting",
            "atmospheric_grimwood_planks_bricks",
            "atmospheric_grimwood_planks_bricks_connecting",
            "atmospheric_grimwood_planks_crate",
            "atmospheric_grimwood_planks_crate_connecting",
            "atmospheric_grimwood_planks_diagonal_stripes",
            "atmospheric_grimwood_planks_diagonal_stripes_connecting",
            "atmospheric_grimwood_planks_diagonal_tiles",
            "atmospheric_grimwood_planks_diagonal_tiles_connecting",
            "atmospheric_grimwood_planks_dotted",
            "atmospheric_grimwood_planks_dotted_connecting",
            "atmospheric_grimwood_planks_flooring",
            "atmospheric_grimwood_planks_flooring_connecting",
            "atmospheric_grimwood_planks_large_tiles",
            "atmospheric_grimwood_planks_large_tiles_connecting",
            "atmospheric_grimwood_planks_pattern",
            "atmospheric_grimwood_planks_pattern_connecting",
            "atmospheric_grimwood_planks_small_bricks",
            "atmospheric_grimwood_planks_small_bricks_connecting",
            "atmospheric_grimwood_planks_small_tiles",
            "atmospheric_grimwood_planks_small_tiles_connecting",
            "atmospheric_grimwood_planks_squares",
            "atmospheric_grimwood_planks_squares_connecting",
            "atmospheric_grimwood_planks_tiles",
            "atmospheric_grimwood_planks_tiles_connecting",
            "atmospheric_grimwood_planks_wavy",
            "atmospheric_grimwood_planks_wavy_connecting",
            "atmospheric_grimwood_planks_woven",
            "atmospheric_grimwood_planks_woven_connecting",
            "atmospheric_kousa_planks_beams",
            "atmospheric_kousa_planks_beams_connecting",
            "atmospheric_kousa_planks_bricks",
            "atmospheric_kousa_planks_bricks_connecting",
            "atmospheric_kousa_planks_crate",
            "atmospheric_kousa_planks_crate_connecting",
            "atmospheric_kousa_planks_diagonal_stripes",
            "atmospheric_kousa_planks_diagonal_stripes_connecting",
            "atmospheric_kousa_planks_diagonal_tiles",
            "atmospheric_kousa_planks_diagonal_tiles_connecting",
            "atmospheric_kousa_planks_dotted",
            "atmospheric_kousa_planks_dotted_connecting",
            "atmospheric_kousa_planks_flooring",
            "atmospheric_kousa_planks_flooring_connecting",
            "atmospheric_kousa_planks_large_tiles",
            "atmospheric_kousa_planks_large_tiles_connecting",
            "atmospheric_kousa_planks_pattern",
            "atmospheric_kousa_planks_pattern_connecting",
            "atmospheric_kousa_planks_small_bricks",
            "atmospheric_kousa_planks_small_bricks_connecting",
            "atmospheric_kousa_planks_small_tiles",
            "atmospheric_kousa_planks_small_tiles_connecting",
            "atmospheric_kousa_planks_squares",
            "atmospheric_kousa_planks_squares_connecting",
            "atmospheric_kousa_planks_tiles",
            "atmospheric_kousa_planks_tiles_connecting",
            "atmospheric_kousa_planks_wavy",
            "atmospheric_kousa_planks_wavy_connecting",
            "atmospheric_kousa_planks_woven",
            "atmospheric_kousa_planks_woven_connecting",
            "atmospheric_morado_planks_beams",
            "atmospheric_morado_planks_beams_connecting",
            "atmospheric_morado_planks_bricks",
            "atmospheric_morado_planks_bricks_connecting",
            "atmospheric_morado_planks_crate",
            "atmospheric_morado_planks_crate_connecting",
            "atmospheric_morado_planks_diagonal_stripes",
            "atmospheric_morado_planks_diagonal_stripes_connecting",
            "atmospheric_morado_planks_diagonal_tiles",
            "atmospheric_morado_planks_diagonal_tiles_connecting",
            "atmospheric_morado_planks_dotted",
            "atmospheric_morado_planks_dotted_connecting",
            "atmospheric_morado_planks_flooring",
            "atmospheric_morado_planks_flooring_connecting",
            "atmospheric_morado_planks_large_tiles",
            "atmospheric_morado_planks_large_tiles_connecting",
            "atmospheric_morado_planks_pattern",
            "atmospheric_morado_planks_pattern_connecting",
            "atmospheric_morado_planks_small_bricks",
            "atmospheric_morado_planks_small_bricks_connecting",
            "atmospheric_morado_planks_small_tiles",
            "atmospheric_morado_planks_small_tiles_connecting",
            "atmospheric_morado_planks_squares",
            "atmospheric_morado_planks_squares_connecting",
            "atmospheric_morado_planks_tiles",
            "atmospheric_morado_planks_tiles_connecting",
            "atmospheric_morado_planks_wavy",
            "atmospheric_morado_planks_wavy_connecting",
            "atmospheric_morado_planks_woven",
            "atmospheric_morado_planks_woven_connecting",
            "atmospheric_rosewood_planks_beams",
            "atmospheric_rosewood_planks_beams_connecting",
            "atmospheric_rosewood_planks_bricks",
            "atmospheric_rosewood_planks_bricks_connecting",
            "atmospheric_rosewood_planks_crate",
            "atmospheric_rosewood_planks_crate_connecting",
            "atmospheric_rosewood_planks_diagonal_stripes",
            "atmospheric_rosewood_planks_diagonal_stripes_connecting",
            "atmospheric_rosewood_planks_diagonal_tiles",
            "atmospheric_rosewood_planks_diagonal_tiles_connecting",
            "atmospheric_rosewood_planks_dotted",
            "atmospheric_rosewood_planks_dotted_connecting",
            "atmospheric_rosewood_planks_flooring",
            "atmospheric_rosewood_planks_flooring_connecting",
            "atmospheric_rosewood_planks_large_tiles",
            "atmospheric_rosewood_planks_large_tiles_connecting",
            "atmospheric_rosewood_planks_pattern",
            "atmospheric_rosewood_planks_pattern_connecting",
            "atmospheric_rosewood_planks_small_bricks",
            "atmospheric_rosewood_planks_small_bricks_connecting",
            "atmospheric_rosewood_planks_small_tiles",
            "atmospheric_rosewood_planks_small_tiles_connecting",
            "atmospheric_rosewood_planks_squares",
            "atmospheric_rosewood_planks_squares_connecting",
            "atmospheric_rosewood_planks_tiles",
            "atmospheric_rosewood_planks_tiles_connecting",
            "atmospheric_rosewood_planks_wavy",
            "atmospheric_rosewood_planks_wavy_connecting",
            "atmospheric_rosewood_planks_woven",
            "atmospheric_rosewood_planks_woven_connecting",
            "atmospheric_yucca_planks_beams",
            "atmospheric_yucca_planks_beams_connecting",
            "atmospheric_yucca_planks_bricks",
            "atmospheric_yucca_planks_bricks_connecting",
            "atmospheric_yucca_planks_crate",
            "atmospheric_yucca_planks_crate_connecting",
            "atmospheric_yucca_planks_diagonal_stripes",
            "atmospheric_yucca_planks_diagonal_stripes_connecting",
            "atmospheric_yucca_planks_diagonal_tiles",
            "atmospheric_yucca_planks_diagonal_tiles_connecting",
            "atmospheric_yucca_planks_dotted",
            "atmospheric_yucca_planks_dotted_connecting",
            "atmospheric_yucca_planks_flooring",
            "atmospheric_yucca_planks_flooring_connecting",
            "atmospheric_yucca_planks_large_tiles",
            "atmospheric_yucca_planks_large_tiles_connecting",
            "atmospheric_yucca_planks_pattern",
            "atmospheric_yucca_planks_pattern_connecting",
            "atmospheric_yucca_planks_small_bricks",
            "atmospheric_yucca_planks_small_bricks_connecting",
            "atmospheric_yucca_planks_small_tiles",
            "atmospheric_yucca_planks_small_tiles_connecting",
            "atmospheric_yucca_planks_squares",
            "atmospheric_yucca_planks_squares_connecting",
            "atmospheric_yucca_planks_tiles",
            "atmospheric_yucca_planks_tiles_connecting",
            "atmospheric_yucca_planks_wavy",
            "atmospheric_yucca_planks_wavy_connecting",
            "atmospheric_yucca_planks_woven",
            "atmospheric_yucca_planks_woven_connecting"
    };

    private Atmospheric() {
    }

    public String getModId() {
        return "atmospheric";
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