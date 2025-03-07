package mrthomas20121.rechiseled_compat.compat;

import com.mojang.datafixers.util.Pair;
import mrthomas20121.rechiseled_compat.core.Core;

import java.util.Collection;
import java.util.List;

public class Biomesoplenty extends Mod {
    public static final String[] PLANKS = {
            "biomesoplenty_cherry_planks_beams",
            "biomesoplenty_cherry_planks_beams_connecting",
            "biomesoplenty_cherry_planks_bricks",
            "biomesoplenty_cherry_planks_bricks_connecting",
            "biomesoplenty_cherry_planks_crate",
            "biomesoplenty_cherry_planks_crate_connecting",
            "biomesoplenty_cherry_planks_diagonal_stripes",
            "biomesoplenty_cherry_planks_diagonal_stripes_connecting",
            "biomesoplenty_cherry_planks_diagonal_tiles",
            "biomesoplenty_cherry_planks_diagonal_tiles_connecting",
            "biomesoplenty_cherry_planks_dotted",
            "biomesoplenty_cherry_planks_dotted_connecting",
            "biomesoplenty_cherry_planks_flooring",
            "biomesoplenty_cherry_planks_flooring_connecting",
            "biomesoplenty_cherry_planks_large_tiles",
            "biomesoplenty_cherry_planks_large_tiles_connecting",
            "biomesoplenty_cherry_planks_pattern",
            "biomesoplenty_cherry_planks_pattern_connecting",
            "biomesoplenty_cherry_planks_small_bricks",
            "biomesoplenty_cherry_planks_small_bricks_connecting",
            "biomesoplenty_cherry_planks_small_tiles",
            "biomesoplenty_cherry_planks_small_tiles_connecting",
            "biomesoplenty_cherry_planks_squares",
            "biomesoplenty_cherry_planks_squares_connecting",
            "biomesoplenty_cherry_planks_tiles",
            "biomesoplenty_cherry_planks_tiles_connecting",
            "biomesoplenty_cherry_planks_wavy",
            "biomesoplenty_cherry_planks_wavy_connecting",
            "biomesoplenty_cherry_planks_woven",
            "biomesoplenty_cherry_planks_woven_connecting",
            "biomesoplenty_dead_planks_beams",
            "biomesoplenty_dead_planks_beams_connecting",
            "biomesoplenty_dead_planks_bricks",
            "biomesoplenty_dead_planks_bricks_connecting",
            "biomesoplenty_dead_planks_crate",
            "biomesoplenty_dead_planks_crate_connecting",
            "biomesoplenty_dead_planks_diagonal_stripes",
            "biomesoplenty_dead_planks_diagonal_stripes_connecting",
            "biomesoplenty_dead_planks_diagonal_tiles",
            "biomesoplenty_dead_planks_diagonal_tiles_connecting",
            "biomesoplenty_dead_planks_dotted",
            "biomesoplenty_dead_planks_dotted_connecting",
            "biomesoplenty_dead_planks_flooring",
            "biomesoplenty_dead_planks_flooring_connecting",
            "biomesoplenty_dead_planks_large_tiles",
            "biomesoplenty_dead_planks_large_tiles_connecting",
            "biomesoplenty_dead_planks_pattern",
            "biomesoplenty_dead_planks_pattern_connecting",
            "biomesoplenty_dead_planks_small_bricks",
            "biomesoplenty_dead_planks_small_bricks_connecting",
            "biomesoplenty_dead_planks_small_tiles",
            "biomesoplenty_dead_planks_small_tiles_connecting",
            "biomesoplenty_dead_planks_squares",
            "biomesoplenty_dead_planks_squares_connecting",
            "biomesoplenty_dead_planks_tiles",
            "biomesoplenty_dead_planks_tiles_connecting",
            "biomesoplenty_dead_planks_wavy",
            "biomesoplenty_dead_planks_wavy_connecting",
            "biomesoplenty_dead_planks_woven",
            "biomesoplenty_dead_planks_woven_connecting",
            "biomesoplenty_fir_planks_beams",
            "biomesoplenty_fir_planks_beams_connecting",
            "biomesoplenty_fir_planks_bricks",
            "biomesoplenty_fir_planks_bricks_connecting",
            "biomesoplenty_fir_planks_crate",
            "biomesoplenty_fir_planks_crate_connecting",
            "biomesoplenty_fir_planks_diagonal_stripes",
            "biomesoplenty_fir_planks_diagonal_stripes_connecting",
            "biomesoplenty_fir_planks_diagonal_tiles",
            "biomesoplenty_fir_planks_diagonal_tiles_connecting",
            "biomesoplenty_fir_planks_dotted",
            "biomesoplenty_fir_planks_dotted_connecting",
            "biomesoplenty_fir_planks_flooring",
            "biomesoplenty_fir_planks_flooring_connecting",
            "biomesoplenty_fir_planks_large_tiles",
            "biomesoplenty_fir_planks_large_tiles_connecting",
            "biomesoplenty_fir_planks_pattern",
            "biomesoplenty_fir_planks_pattern_connecting",
            "biomesoplenty_fir_planks_small_bricks",
            "biomesoplenty_fir_planks_small_bricks_connecting",
            "biomesoplenty_fir_planks_small_tiles",
            "biomesoplenty_fir_planks_small_tiles_connecting",
            "biomesoplenty_fir_planks_squares",
            "biomesoplenty_fir_planks_squares_connecting",
            "biomesoplenty_fir_planks_tiles",
            "biomesoplenty_fir_planks_tiles_connecting",
            "biomesoplenty_fir_planks_wavy",
            "biomesoplenty_fir_planks_wavy_connecting",
            "biomesoplenty_fir_planks_woven",
            "biomesoplenty_fir_planks_woven_connecting",
            "biomesoplenty_hellbark_planks_beams",
            "biomesoplenty_hellbark_planks_beams_connecting",
            "biomesoplenty_hellbark_planks_bricks",
            "biomesoplenty_hellbark_planks_bricks_connecting",
            "biomesoplenty_hellbark_planks_crate",
            "biomesoplenty_hellbark_planks_crate_connecting",
            "biomesoplenty_hellbark_planks_diagonal_stripes",
            "biomesoplenty_hellbark_planks_diagonal_stripes_connecting",
            "biomesoplenty_hellbark_planks_diagonal_tiles",
            "biomesoplenty_hellbark_planks_diagonal_tiles_connecting",
            "biomesoplenty_hellbark_planks_dotted",
            "biomesoplenty_hellbark_planks_dotted_connecting",
            "biomesoplenty_hellbark_planks_flooring",
            "biomesoplenty_hellbark_planks_flooring_connecting",
            "biomesoplenty_hellbark_planks_large_tiles",
            "biomesoplenty_hellbark_planks_large_tiles_connecting",
            "biomesoplenty_hellbark_planks_pattern",
            "biomesoplenty_hellbark_planks_pattern_connecting",
            "biomesoplenty_hellbark_planks_small_bricks",
            "biomesoplenty_hellbark_planks_small_bricks_connecting",
            "biomesoplenty_hellbark_planks_small_tiles",
            "biomesoplenty_hellbark_planks_small_tiles_connecting",
            "biomesoplenty_hellbark_planks_squares",
            "biomesoplenty_hellbark_planks_squares_connecting",
            "biomesoplenty_hellbark_planks_tiles",
            "biomesoplenty_hellbark_planks_tiles_connecting",
            "biomesoplenty_hellbark_planks_wavy",
            "biomesoplenty_hellbark_planks_wavy_connecting",
            "biomesoplenty_hellbark_planks_woven",
            "biomesoplenty_hellbark_planks_woven_connecting",
            "biomesoplenty_jacaranda_planks_beams",
            "biomesoplenty_jacaranda_planks_beams_connecting",
            "biomesoplenty_jacaranda_planks_bricks",
            "biomesoplenty_jacaranda_planks_bricks_connecting",
            "biomesoplenty_jacaranda_planks_crate",
            "biomesoplenty_jacaranda_planks_crate_connecting",
            "biomesoplenty_jacaranda_planks_diagonal_stripes",
            "biomesoplenty_jacaranda_planks_diagonal_stripes_connecting",
            "biomesoplenty_jacaranda_planks_diagonal_tiles",
            "biomesoplenty_jacaranda_planks_diagonal_tiles_connecting",
            "biomesoplenty_jacaranda_planks_dotted",
            "biomesoplenty_jacaranda_planks_dotted_connecting",
            "biomesoplenty_jacaranda_planks_flooring",
            "biomesoplenty_jacaranda_planks_flooring_connecting",
            "biomesoplenty_jacaranda_planks_large_tiles",
            "biomesoplenty_jacaranda_planks_large_tiles_connecting",
            "biomesoplenty_jacaranda_planks_pattern",
            "biomesoplenty_jacaranda_planks_pattern_connecting",
            "biomesoplenty_jacaranda_planks_small_bricks",
            "biomesoplenty_jacaranda_planks_small_bricks_connecting",
            "biomesoplenty_jacaranda_planks_small_tiles",
            "biomesoplenty_jacaranda_planks_small_tiles_connecting",
            "biomesoplenty_jacaranda_planks_squares",
            "biomesoplenty_jacaranda_planks_squares_connecting",
            "biomesoplenty_jacaranda_planks_tiles",
            "biomesoplenty_jacaranda_planks_tiles_connecting",
            "biomesoplenty_jacaranda_planks_wavy",
            "biomesoplenty_jacaranda_planks_wavy_connecting",
            "biomesoplenty_jacaranda_planks_woven",
            "biomesoplenty_jacaranda_planks_woven_connecting",
            "biomesoplenty_magic_planks_beams",
            "biomesoplenty_magic_planks_beams_connecting",
            "biomesoplenty_magic_planks_bricks",
            "biomesoplenty_magic_planks_bricks_connecting",
            "biomesoplenty_magic_planks_crate",
            "biomesoplenty_magic_planks_crate_connecting",
            "biomesoplenty_magic_planks_diagonal_stripes",
            "biomesoplenty_magic_planks_diagonal_stripes_connecting",
            "biomesoplenty_magic_planks_diagonal_tiles",
            "biomesoplenty_magic_planks_diagonal_tiles_connecting",
            "biomesoplenty_magic_planks_dotted",
            "biomesoplenty_magic_planks_dotted_connecting",
            "biomesoplenty_magic_planks_flooring",
            "biomesoplenty_magic_planks_flooring_connecting",
            "biomesoplenty_magic_planks_large_tiles",
            "biomesoplenty_magic_planks_large_tiles_connecting",
            "biomesoplenty_magic_planks_pattern",
            "biomesoplenty_magic_planks_pattern_connecting",
            "biomesoplenty_magic_planks_small_bricks",
            "biomesoplenty_magic_planks_small_bricks_connecting",
            "biomesoplenty_magic_planks_small_tiles",
            "biomesoplenty_magic_planks_small_tiles_connecting",
            "biomesoplenty_magic_planks_squares",
            "biomesoplenty_magic_planks_squares_connecting",
            "biomesoplenty_magic_planks_tiles",
            "biomesoplenty_magic_planks_tiles_connecting",
            "biomesoplenty_magic_planks_wavy",
            "biomesoplenty_magic_planks_wavy_connecting",
            "biomesoplenty_magic_planks_woven",
            "biomesoplenty_magic_planks_woven_connecting",
            "biomesoplenty_mahogany_planks_beams",
            "biomesoplenty_mahogany_planks_beams_connecting",
            "biomesoplenty_mahogany_planks_bricks",
            "biomesoplenty_mahogany_planks_bricks_connecting",
            "biomesoplenty_mahogany_planks_crate",
            "biomesoplenty_mahogany_planks_crate_connecting",
            "biomesoplenty_mahogany_planks_diagonal_stripes",
            "biomesoplenty_mahogany_planks_diagonal_stripes_connecting",
            "biomesoplenty_mahogany_planks_diagonal_tiles",
            "biomesoplenty_mahogany_planks_diagonal_tiles_connecting",
            "biomesoplenty_mahogany_planks_dotted",
            "biomesoplenty_mahogany_planks_dotted_connecting",
            "biomesoplenty_mahogany_planks_flooring",
            "biomesoplenty_mahogany_planks_flooring_connecting",
            "biomesoplenty_mahogany_planks_large_tiles",
            "biomesoplenty_mahogany_planks_large_tiles_connecting",
            "biomesoplenty_mahogany_planks_pattern",
            "biomesoplenty_mahogany_planks_pattern_connecting",
            "biomesoplenty_mahogany_planks_small_bricks",
            "biomesoplenty_mahogany_planks_small_bricks_connecting",
            "biomesoplenty_mahogany_planks_small_tiles",
            "biomesoplenty_mahogany_planks_small_tiles_connecting",
            "biomesoplenty_mahogany_planks_squares",
            "biomesoplenty_mahogany_planks_squares_connecting",
            "biomesoplenty_mahogany_planks_tiles",
            "biomesoplenty_mahogany_planks_tiles_connecting",
            "biomesoplenty_mahogany_planks_wavy",
            "biomesoplenty_mahogany_planks_wavy_connecting",
            "biomesoplenty_mahogany_planks_woven",
            "biomesoplenty_mahogany_planks_woven_connecting",
            "biomesoplenty_palm_planks_beams",
            "biomesoplenty_palm_planks_beams_connecting",
            "biomesoplenty_palm_planks_bricks",
            "biomesoplenty_palm_planks_bricks_connecting",
            "biomesoplenty_palm_planks_crate",
            "biomesoplenty_palm_planks_crate_connecting",
            "biomesoplenty_palm_planks_diagonal_stripes",
            "biomesoplenty_palm_planks_diagonal_stripes_connecting",
            "biomesoplenty_palm_planks_diagonal_tiles",
            "biomesoplenty_palm_planks_diagonal_tiles_connecting",
            "biomesoplenty_palm_planks_dotted",
            "biomesoplenty_palm_planks_dotted_connecting",
            "biomesoplenty_palm_planks_flooring",
            "biomesoplenty_palm_planks_flooring_connecting",
            "biomesoplenty_palm_planks_large_tiles",
            "biomesoplenty_palm_planks_large_tiles_connecting",
            "biomesoplenty_palm_planks_pattern",
            "biomesoplenty_palm_planks_pattern_connecting",
            "biomesoplenty_palm_planks_small_bricks",
            "biomesoplenty_palm_planks_small_bricks_connecting",
            "biomesoplenty_palm_planks_small_tiles",
            "biomesoplenty_palm_planks_small_tiles_connecting",
            "biomesoplenty_palm_planks_squares",
            "biomesoplenty_palm_planks_squares_connecting",
            "biomesoplenty_palm_planks_tiles",
            "biomesoplenty_palm_planks_tiles_connecting",
            "biomesoplenty_palm_planks_wavy",
            "biomesoplenty_palm_planks_wavy_connecting",
            "biomesoplenty_palm_planks_woven",
            "biomesoplenty_palm_planks_woven_connecting",
            "biomesoplenty_redwood_planks_beams",
            "biomesoplenty_redwood_planks_beams_connecting",
            "biomesoplenty_redwood_planks_bricks",
            "biomesoplenty_redwood_planks_bricks_connecting",
            "biomesoplenty_redwood_planks_crate",
            "biomesoplenty_redwood_planks_crate_connecting",
            "biomesoplenty_redwood_planks_diagonal_stripes",
            "biomesoplenty_redwood_planks_diagonal_stripes_connecting",
            "biomesoplenty_redwood_planks_diagonal_tiles",
            "biomesoplenty_redwood_planks_diagonal_tiles_connecting",
            "biomesoplenty_redwood_planks_dotted",
            "biomesoplenty_redwood_planks_dotted_connecting",
            "biomesoplenty_redwood_planks_flooring",
            "biomesoplenty_redwood_planks_flooring_connecting",
            "biomesoplenty_redwood_planks_large_tiles",
            "biomesoplenty_redwood_planks_large_tiles_connecting",
            "biomesoplenty_redwood_planks_pattern",
            "biomesoplenty_redwood_planks_pattern_connecting",
            "biomesoplenty_redwood_planks_small_bricks",
            "biomesoplenty_redwood_planks_small_bricks_connecting",
            "biomesoplenty_redwood_planks_small_tiles",
            "biomesoplenty_redwood_planks_small_tiles_connecting",
            "biomesoplenty_redwood_planks_squares",
            "biomesoplenty_redwood_planks_squares_connecting",
            "biomesoplenty_redwood_planks_tiles",
            "biomesoplenty_redwood_planks_tiles_connecting",
            "biomesoplenty_redwood_planks_wavy",
            "biomesoplenty_redwood_planks_wavy_connecting",
            "biomesoplenty_redwood_planks_woven",
            "biomesoplenty_redwood_planks_woven_connecting",
            "biomesoplenty_umbran_planks_beams",
            "biomesoplenty_umbran_planks_beams_connecting",
            "biomesoplenty_umbran_planks_bricks",
            "biomesoplenty_umbran_planks_bricks_connecting",
            "biomesoplenty_umbran_planks_crate",
            "biomesoplenty_umbran_planks_crate_connecting",
            "biomesoplenty_umbran_planks_diagonal_stripes",
            "biomesoplenty_umbran_planks_diagonal_stripes_connecting",
            "biomesoplenty_umbran_planks_diagonal_tiles",
            "biomesoplenty_umbran_planks_diagonal_tiles_connecting",
            "biomesoplenty_umbran_planks_dotted",
            "biomesoplenty_umbran_planks_dotted_connecting",
            "biomesoplenty_umbran_planks_flooring",
            "biomesoplenty_umbran_planks_flooring_connecting",
            "biomesoplenty_umbran_planks_large_tiles",
            "biomesoplenty_umbran_planks_large_tiles_connecting",
            "biomesoplenty_umbran_planks_pattern",
            "biomesoplenty_umbran_planks_pattern_connecting",
            "biomesoplenty_umbran_planks_small_bricks",
            "biomesoplenty_umbran_planks_small_bricks_connecting",
            "biomesoplenty_umbran_planks_small_tiles",
            "biomesoplenty_umbran_planks_small_tiles_connecting",
            "biomesoplenty_umbran_planks_squares",
            "biomesoplenty_umbran_planks_squares_connecting",
            "biomesoplenty_umbran_planks_tiles",
            "biomesoplenty_umbran_planks_tiles_connecting",
            "biomesoplenty_umbran_planks_wavy",
            "biomesoplenty_umbran_planks_wavy_connecting",
            "biomesoplenty_umbran_planks_woven",
            "biomesoplenty_umbran_planks_woven_connecting",
            "biomesoplenty_willow_planks_beams",
            "biomesoplenty_willow_planks_beams_connecting",
            "biomesoplenty_willow_planks_bricks",
            "biomesoplenty_willow_planks_bricks_connecting",
            "biomesoplenty_willow_planks_crate",
            "biomesoplenty_willow_planks_crate_connecting",
            "biomesoplenty_willow_planks_diagonal_stripes",
            "biomesoplenty_willow_planks_diagonal_stripes_connecting",
            "biomesoplenty_willow_planks_diagonal_tiles",
            "biomesoplenty_willow_planks_diagonal_tiles_connecting",
            "biomesoplenty_willow_planks_dotted",
            "biomesoplenty_willow_planks_dotted_connecting",
            "biomesoplenty_willow_planks_flooring",
            "biomesoplenty_willow_planks_flooring_connecting",
            "biomesoplenty_willow_planks_large_tiles",
            "biomesoplenty_willow_planks_large_tiles_connecting",
            "biomesoplenty_willow_planks_pattern",
            "biomesoplenty_willow_planks_pattern_connecting",
            "biomesoplenty_willow_planks_small_bricks",
            "biomesoplenty_willow_planks_small_bricks_connecting",
            "biomesoplenty_willow_planks_small_tiles",
            "biomesoplenty_willow_planks_small_tiles_connecting",
            "biomesoplenty_willow_planks_squares",
            "biomesoplenty_willow_planks_squares_connecting",
            "biomesoplenty_willow_planks_tiles",
            "biomesoplenty_willow_planks_tiles_connecting",
            "biomesoplenty_willow_planks_wavy",
            "biomesoplenty_willow_planks_wavy_connecting",
            "biomesoplenty_willow_planks_woven",
            "biomesoplenty_willow_planks_woven_connecting"
    };

    private Biomesoplenty() {
    }

    public String getModId() {
        return "biomesoplenty";
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