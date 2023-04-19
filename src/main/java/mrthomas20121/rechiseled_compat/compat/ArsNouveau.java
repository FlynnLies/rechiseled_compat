package mrthomas20121.rechiseled_compat.compat;

import com.mojang.datafixers.util.Pair;
import mrthomas20121.rechiseled_compat.core.Core;

import java.util.Collection;
import java.util.List;

public class ArsNouveau extends Mod {
    public static final String[] PLANKS = {
            "ars_nouveau_archwood_planks_beams",
            "ars_nouveau_archwood_planks_beams_connecting",
            "ars_nouveau_archwood_planks_bricks",
            "ars_nouveau_archwood_planks_bricks_connecting",
            "ars_nouveau_archwood_planks_crate",
            "ars_nouveau_archwood_planks_crate_connecting",
            "ars_nouveau_archwood_planks_diagonal_stripes",
            "ars_nouveau_archwood_planks_diagonal_stripes_connecting",
            "ars_nouveau_archwood_planks_diagonal_tiles",
            "ars_nouveau_archwood_planks_diagonal_tiles_connecting",
            "ars_nouveau_archwood_planks_dotted",
            "ars_nouveau_archwood_planks_dotted_connecting",
            "ars_nouveau_archwood_planks_flooring",
            "ars_nouveau_archwood_planks_flooring_connecting",
            "ars_nouveau_archwood_planks_large_tiles",
            "ars_nouveau_archwood_planks_large_tiles_connecting",
            "ars_nouveau_archwood_planks_pattern",
            "ars_nouveau_archwood_planks_pattern_connecting",
            "ars_nouveau_archwood_planks_small_bricks",
            "ars_nouveau_archwood_planks_small_bricks_connecting",
            "ars_nouveau_archwood_planks_small_tiles",
            "ars_nouveau_archwood_planks_small_tiles_connecting",
            "ars_nouveau_archwood_planks_squares",
            "ars_nouveau_archwood_planks_squares_connecting",
            "ars_nouveau_archwood_planks_tiles",
            "ars_nouveau_archwood_planks_tiles_connecting",
            "ars_nouveau_archwood_planks_wavy",
            "ars_nouveau_archwood_planks_wavy_connecting",
            "ars_nouveau_archwood_planks_woven",
            "ars_nouveau_archwood_planks_woven_connecting"
    };

    private ArsNouveau() {
    }

    public String getModId() {
        return "ars_nouveau";
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