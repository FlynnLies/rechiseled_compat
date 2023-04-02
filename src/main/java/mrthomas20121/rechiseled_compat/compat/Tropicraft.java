package mrthomas20121.rechiseled_compat.compat;

import mrthomas20121.rechiseled_compat.core.Core;
import mrthomas20121.rechiseled_compat.datagen.CompatForgeTagsProvider;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class Tropicraft extends Mod {
    public static final String[] PLANKS = {
            "tropicraft_mahogany_planks_beams",
            "tropicraft_mahogany_planks_beams_connecting",
            "tropicraft_mahogany_planks_bricks",
            "tropicraft_mahogany_planks_bricks_connecting",
            "tropicraft_mahogany_planks_crate",
            "tropicraft_mahogany_planks_crate_connecting",
            "tropicraft_mahogany_planks_diagonal_stripes",
            "tropicraft_mahogany_planks_diagonal_stripes_connecting",
            "tropicraft_mahogany_planks_diagonal_tiles",
            "tropicraft_mahogany_planks_diagonal_tiles_connecting",
            "tropicraft_mahogany_planks_dotted",
            "tropicraft_mahogany_planks_dotted_connecting",
            "tropicraft_mahogany_planks_flooring",
            "tropicraft_mahogany_planks_flooring_connecting",
            "tropicraft_mahogany_planks_large_tiles",
            "tropicraft_mahogany_planks_large_tiles_connecting",
            "tropicraft_mahogany_planks_pattern",
            "tropicraft_mahogany_planks_pattern_connecting",
            "tropicraft_mahogany_planks_small_bricks",
            "tropicraft_mahogany_planks_small_bricks_connecting",
            "tropicraft_mahogany_planks_small_tiles",
            "tropicraft_mahogany_planks_small_tiles_connecting",
            "tropicraft_mahogany_planks_squares",
            "tropicraft_mahogany_planks_squares_connecting",
            "tropicraft_mahogany_planks_tiles",
            "tropicraft_mahogany_planks_tiles_connecting",
            "tropicraft_mahogany_planks_wavy",
            "tropicraft_mahogany_planks_wavy_connecting",
            "tropicraft_mahogany_planks_woven",
            "tropicraft_mahogany_planks_woven_connecting",
            "tropicraft_mangrove_planks_beams",
            "tropicraft_mangrove_planks_beams_connecting",
            "tropicraft_mangrove_planks_bricks",
            "tropicraft_mangrove_planks_bricks_connecting",
            "tropicraft_mangrove_planks_crate",
            "tropicraft_mangrove_planks_crate_connecting",
            "tropicraft_mangrove_planks_diagonal_stripes",
            "tropicraft_mangrove_planks_diagonal_stripes_connecting",
            "tropicraft_mangrove_planks_diagonal_tiles",
            "tropicraft_mangrove_planks_diagonal_tiles_connecting",
            "tropicraft_mangrove_planks_dotted",
            "tropicraft_mangrove_planks_dotted_connecting",
            "tropicraft_mangrove_planks_flooring",
            "tropicraft_mangrove_planks_flooring_connecting",
            "tropicraft_mangrove_planks_large_tiles",
            "tropicraft_mangrove_planks_large_tiles_connecting",
            "tropicraft_mangrove_planks_pattern",
            "tropicraft_mangrove_planks_pattern_connecting",
            "tropicraft_mangrove_planks_small_bricks",
            "tropicraft_mangrove_planks_small_bricks_connecting",
            "tropicraft_mangrove_planks_small_tiles",
            "tropicraft_mangrove_planks_small_tiles_connecting",
            "tropicraft_mangrove_planks_squares",
            "tropicraft_mangrove_planks_squares_connecting",
            "tropicraft_mangrove_planks_tiles",
            "tropicraft_mangrove_planks_tiles_connecting",
            "tropicraft_mangrove_planks_wavy",
            "tropicraft_mangrove_planks_wavy_connecting",
            "tropicraft_mangrove_planks_woven",
            "tropicraft_mangrove_planks_woven_connecting",
            "tropicraft_palm_planks_beams",
            "tropicraft_palm_planks_beams_connecting",
            "tropicraft_palm_planks_bricks",
            "tropicraft_palm_planks_bricks_connecting",
            "tropicraft_palm_planks_crate",
            "tropicraft_palm_planks_crate_connecting",
            "tropicraft_palm_planks_diagonal_stripes",
            "tropicraft_palm_planks_diagonal_stripes_connecting",
            "tropicraft_palm_planks_diagonal_tiles",
            "tropicraft_palm_planks_diagonal_tiles_connecting",
            "tropicraft_palm_planks_dotted",
            "tropicraft_palm_planks_dotted_connecting",
            "tropicraft_palm_planks_flooring",
            "tropicraft_palm_planks_flooring_connecting",
            "tropicraft_palm_planks_large_tiles",
            "tropicraft_palm_planks_large_tiles_connecting",
            "tropicraft_palm_planks_pattern",
            "tropicraft_palm_planks_pattern_connecting",
            "tropicraft_palm_planks_small_bricks",
            "tropicraft_palm_planks_small_bricks_connecting",
            "tropicraft_palm_planks_small_tiles",
            "tropicraft_palm_planks_small_tiles_connecting",
            "tropicraft_palm_planks_squares",
            "tropicraft_palm_planks_squares_connecting",
            "tropicraft_palm_planks_tiles",
            "tropicraft_palm_planks_tiles_connecting",
            "tropicraft_palm_planks_wavy",
            "tropicraft_palm_planks_wavy_connecting",
            "tropicraft_palm_planks_woven",
            "tropicraft_palm_planks_woven_connecting"
    };

    private Tropicraft() {
    }

    public String getModId() {
        return "tropicraft";
    }

    public void registerBlocks() {

        for (String block : PLANKS) {
            Core.registerBlock("minecraft:oak_planks", block);
        }

    }

    // for data generation
    public <T> void addTags(CompatForgeTagsProvider<T> provider) {
        // from minecraft:oak_planks

        provider.whenType(Block.class, Core::addBlockTags, PLANKS, new String[]{
                "minecraft:planks",
                "minecraft:mineable/axe"
        });

        provider.whenType(Item.class, Core::addItemTags, PLANKS, new String[]{
                "minecraft:planks",
        });
    }
}