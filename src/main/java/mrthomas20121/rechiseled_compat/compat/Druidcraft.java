package mrthomas20121.rechiseled_compat.compat;

import com.mojang.datafixers.util.Pair;
import mrthomas20121.rechiseled_compat.core.Core;

import java.util.Collection;
import java.util.List;

public class Druidcraft extends Mod {
    public static final String[] PLANKS = {
            "druidcraft_darkwood_planks_beams",
            "druidcraft_darkwood_planks_beams_connecting",
            "druidcraft_darkwood_planks_bricks",
            "druidcraft_darkwood_planks_bricks_connecting",
            "druidcraft_darkwood_planks_crate",
            "druidcraft_darkwood_planks_crate_connecting",
            "druidcraft_darkwood_planks_diagonal_stripes",
            "druidcraft_darkwood_planks_diagonal_stripes_connecting",
            "druidcraft_darkwood_planks_diagonal_tiles",
            "druidcraft_darkwood_planks_diagonal_tiles_connecting",
            "druidcraft_darkwood_planks_dotted",
            "druidcraft_darkwood_planks_dotted_connecting",
            "druidcraft_darkwood_planks_flooring",
            "druidcraft_darkwood_planks_flooring_connecting",
            "druidcraft_darkwood_planks_large_tiles",
            "druidcraft_darkwood_planks_large_tiles_connecting",
            "druidcraft_darkwood_planks_pattern",
            "druidcraft_darkwood_planks_pattern_connecting",
            "druidcraft_darkwood_planks_small_bricks",
            "druidcraft_darkwood_planks_small_bricks_connecting",
            "druidcraft_darkwood_planks_small_tiles",
            "druidcraft_darkwood_planks_small_tiles_connecting",
            "druidcraft_darkwood_planks_squares",
            "druidcraft_darkwood_planks_squares_connecting",
            "druidcraft_darkwood_planks_tiles",
            "druidcraft_darkwood_planks_tiles_connecting",
            "druidcraft_darkwood_planks_wavy",
            "druidcraft_darkwood_planks_wavy_connecting",
            "druidcraft_darkwood_planks_woven",
            "druidcraft_darkwood_planks_woven_connecting",
            "druidcraft_elder_planks_beams",
            "druidcraft_elder_planks_beams_connecting",
            "druidcraft_elder_planks_bricks",
            "druidcraft_elder_planks_bricks_connecting",
            "druidcraft_elder_planks_crate",
            "druidcraft_elder_planks_crate_connecting",
            "druidcraft_elder_planks_diagonal_stripes",
            "druidcraft_elder_planks_diagonal_stripes_connecting",
            "druidcraft_elder_planks_diagonal_tiles",
            "druidcraft_elder_planks_diagonal_tiles_connecting",
            "druidcraft_elder_planks_dotted",
            "druidcraft_elder_planks_dotted_connecting",
            "druidcraft_elder_planks_flooring",
            "druidcraft_elder_planks_flooring_connecting",
            "druidcraft_elder_planks_large_tiles",
            "druidcraft_elder_planks_large_tiles_connecting",
            "druidcraft_elder_planks_pattern",
            "druidcraft_elder_planks_pattern_connecting",
            "druidcraft_elder_planks_small_bricks",
            "druidcraft_elder_planks_small_bricks_connecting",
            "druidcraft_elder_planks_small_tiles",
            "druidcraft_elder_planks_small_tiles_connecting",
            "druidcraft_elder_planks_squares",
            "druidcraft_elder_planks_squares_connecting",
            "druidcraft_elder_planks_tiles",
            "druidcraft_elder_planks_tiles_connecting",
            "druidcraft_elder_planks_wavy",
            "druidcraft_elder_planks_wavy_connecting",
            "druidcraft_elder_planks_woven",
            "druidcraft_elder_planks_woven_connecting"
    };

    private Druidcraft() {
    }

    public String getModId() {
        return "druidcraft";
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