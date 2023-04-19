package mrthomas20121.rechiseled_compat.compat;

import com.mojang.datafixers.util.Pair;
import mrthomas20121.rechiseled_compat.core.Core;

import java.util.Collection;
import java.util.List;

public class Naturesaura extends Mod {
    public static final String[] PLANKS = {
            "naturesaura_ancient_planks_beams",
            "naturesaura_ancient_planks_beams_connecting",
            "naturesaura_ancient_planks_bricks",
            "naturesaura_ancient_planks_bricks_connecting",
            "naturesaura_ancient_planks_crate",
            "naturesaura_ancient_planks_crate_connecting",
            "naturesaura_ancient_planks_diagonal_stripes",
            "naturesaura_ancient_planks_diagonal_stripes_connecting",
            "naturesaura_ancient_planks_diagonal_tiles",
            "naturesaura_ancient_planks_diagonal_tiles_connecting",
            "naturesaura_ancient_planks_dotted",
            "naturesaura_ancient_planks_dotted_connecting",
            "naturesaura_ancient_planks_flooring",
            "naturesaura_ancient_planks_flooring_connecting",
            "naturesaura_ancient_planks_large_tiles",
            "naturesaura_ancient_planks_large_tiles_connecting",
            "naturesaura_ancient_planks_pattern",
            "naturesaura_ancient_planks_pattern_connecting",
            "naturesaura_ancient_planks_small_bricks",
            "naturesaura_ancient_planks_small_bricks_connecting",
            "naturesaura_ancient_planks_small_tiles",
            "naturesaura_ancient_planks_small_tiles_connecting",
            "naturesaura_ancient_planks_squares",
            "naturesaura_ancient_planks_squares_connecting",
            "naturesaura_ancient_planks_tiles",
            "naturesaura_ancient_planks_tiles_connecting",
            "naturesaura_ancient_planks_wavy",
            "naturesaura_ancient_planks_wavy_connecting",
            "naturesaura_ancient_planks_woven",
            "naturesaura_ancient_planks_woven_connecting"
    };

    private Naturesaura() {
    }

    public String getModId() {
        return "naturesaura";
    }

    public void registerBlocks() {
        for (String block : PLANKS) {
            Core.registerBlock("minecraft:oak_planks", block);
        }
    }

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