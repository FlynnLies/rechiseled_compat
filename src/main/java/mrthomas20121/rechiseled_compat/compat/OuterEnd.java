package mrthomas20121.rechiseled_compat.compat;

import com.mojang.datafixers.util.Pair;
import mrthomas20121.rechiseled_compat.core.Core;

import java.util.Collection;
import java.util.List;

public class OuterEnd extends Mod {
    public static final String[] PLANKS = {
            "outer_end_azure_planks_beams",
            "outer_end_azure_planks_beams_connecting",
            "outer_end_azure_planks_bricks",
            "outer_end_azure_planks_bricks_connecting",
            "outer_end_azure_planks_crate",
            "outer_end_azure_planks_crate_connecting",
            "outer_end_azure_planks_diagonal_stripes",
            "outer_end_azure_planks_diagonal_stripes_connecting",
            "outer_end_azure_planks_diagonal_tiles",
            "outer_end_azure_planks_diagonal_tiles_connecting",
            "outer_end_azure_planks_dotted",
            "outer_end_azure_planks_dotted_connecting",
            "outer_end_azure_planks_flooring",
            "outer_end_azure_planks_flooring_connecting",
            "outer_end_azure_planks_large_tiles",
            "outer_end_azure_planks_large_tiles_connecting",
            "outer_end_azure_planks_pattern",
            "outer_end_azure_planks_pattern_connecting",
            "outer_end_azure_planks_small_bricks",
            "outer_end_azure_planks_small_bricks_connecting",
            "outer_end_azure_planks_small_tiles",
            "outer_end_azure_planks_small_tiles_connecting",
            "outer_end_azure_planks_squares",
            "outer_end_azure_planks_squares_connecting",
            "outer_end_azure_planks_tiles",
            "outer_end_azure_planks_tiles_connecting",
            "outer_end_azure_planks_wavy",
            "outer_end_azure_planks_wavy_connecting",
            "outer_end_azure_planks_woven",
            "outer_end_azure_planks_woven_connecting"
    };

    private OuterEnd() {
    }

    public String getModId() {
        return "outer_end";
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