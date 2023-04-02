package mrthomas20121.rechiseled_compat.compat;

import mrthomas20121.rechiseled_compat.core.Core;
import mrthomas20121.rechiseled_compat.datagen.CompatForgeTagsProvider;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class Tconstruct extends Mod {
    public static final String[] PLANKS = {
            "tconstruct_greenheart_planks_beams",
            "tconstruct_greenheart_planks_beams_connecting",
            "tconstruct_greenheart_planks_bricks",
            "tconstruct_greenheart_planks_bricks_connecting",
            "tconstruct_greenheart_planks_crate",
            "tconstruct_greenheart_planks_crate_connecting",
            "tconstruct_greenheart_planks_diagonal_stripes",
            "tconstruct_greenheart_planks_diagonal_stripes_connecting",
            "tconstruct_greenheart_planks_diagonal_tiles",
            "tconstruct_greenheart_planks_diagonal_tiles_connecting",
            "tconstruct_greenheart_planks_dotted",
            "tconstruct_greenheart_planks_dotted_connecting",
            "tconstruct_greenheart_planks_flooring",
            "tconstruct_greenheart_planks_flooring_connecting",
            "tconstruct_greenheart_planks_large_tiles",
            "tconstruct_greenheart_planks_large_tiles_connecting",
            "tconstruct_greenheart_planks_pattern",
            "tconstruct_greenheart_planks_pattern_connecting",
            "tconstruct_greenheart_planks_small_bricks",
            "tconstruct_greenheart_planks_small_bricks_connecting",
            "tconstruct_greenheart_planks_small_tiles",
            "tconstruct_greenheart_planks_small_tiles_connecting",
            "tconstruct_greenheart_planks_squares",
            "tconstruct_greenheart_planks_squares_connecting",
            "tconstruct_greenheart_planks_tiles",
            "tconstruct_greenheart_planks_tiles_connecting",
            "tconstruct_greenheart_planks_wavy",
            "tconstruct_greenheart_planks_wavy_connecting",
            "tconstruct_greenheart_planks_woven",
            "tconstruct_greenheart_planks_woven_connecting",
            "tconstruct_skyroot_planks_beams",
            "tconstruct_skyroot_planks_beams_connecting",
            "tconstruct_skyroot_planks_bricks",
            "tconstruct_skyroot_planks_bricks_connecting",
            "tconstruct_skyroot_planks_crate",
            "tconstruct_skyroot_planks_crate_connecting",
            "tconstruct_skyroot_planks_diagonal_stripes",
            "tconstruct_skyroot_planks_diagonal_stripes_connecting",
            "tconstruct_skyroot_planks_diagonal_tiles",
            "tconstruct_skyroot_planks_diagonal_tiles_connecting",
            "tconstruct_skyroot_planks_dotted",
            "tconstruct_skyroot_planks_dotted_connecting",
            "tconstruct_skyroot_planks_flooring",
            "tconstruct_skyroot_planks_flooring_connecting",
            "tconstruct_skyroot_planks_large_tiles",
            "tconstruct_skyroot_planks_large_tiles_connecting",
            "tconstruct_skyroot_planks_pattern",
            "tconstruct_skyroot_planks_pattern_connecting",
            "tconstruct_skyroot_planks_small_bricks",
            "tconstruct_skyroot_planks_small_bricks_connecting",
            "tconstruct_skyroot_planks_small_tiles",
            "tconstruct_skyroot_planks_small_tiles_connecting",
            "tconstruct_skyroot_planks_squares",
            "tconstruct_skyroot_planks_squares_connecting",
            "tconstruct_skyroot_planks_tiles",
            "tconstruct_skyroot_planks_tiles_connecting",
            "tconstruct_skyroot_planks_wavy",
            "tconstruct_skyroot_planks_wavy_connecting",
            "tconstruct_skyroot_planks_woven",
            "tconstruct_skyroot_planks_woven_connecting",
            "tconstruct_bloodshroom_planks_beams",
            "tconstruct_bloodshroom_planks_beams_connecting",
            "tconstruct_bloodshroom_planks_bricks",
            "tconstruct_bloodshroom_planks_bricks_connecting",
            "tconstruct_bloodshroom_planks_crate",
            "tconstruct_bloodshroom_planks_crate_connecting",
            "tconstruct_bloodshroom_planks_diagonal_stripes",
            "tconstruct_bloodshroom_planks_diagonal_stripes_connecting",
            "tconstruct_bloodshroom_planks_diagonal_tiles",
            "tconstruct_bloodshroom_planks_diagonal_tiles_connecting",
            "tconstruct_bloodshroom_planks_dotted",
            "tconstruct_bloodshroom_planks_dotted_connecting",
            "tconstruct_bloodshroom_planks_flooring",
            "tconstruct_bloodshroom_planks_flooring_connecting",
            "tconstruct_bloodshroom_planks_large_tiles",
            "tconstruct_bloodshroom_planks_large_tiles_connecting",
            "tconstruct_bloodshroom_planks_pattern",
            "tconstruct_bloodshroom_planks_pattern_connecting",
            "tconstruct_bloodshroom_planks_small_bricks",
            "tconstruct_bloodshroom_planks_small_bricks_connecting",
            "tconstruct_bloodshroom_planks_small_tiles",
            "tconstruct_bloodshroom_planks_small_tiles_connecting",
            "tconstruct_bloodshroom_planks_squares",
            "tconstruct_bloodshroom_planks_squares_connecting",
            "tconstruct_bloodshroom_planks_tiles",
            "tconstruct_bloodshroom_planks_tiles_connecting",
            "tconstruct_bloodshroom_planks_wavy",
            "tconstruct_bloodshroom_planks_wavy_connecting",
            "tconstruct_bloodshroom_planks_woven",
            "tconstruct_bloodshroom_planks_woven_connecting",
            "tconstruct_nahuatl_beams",
            "tconstruct_nahuatl_beams_connecting",
            "tconstruct_nahuatl_bricks",
            "tconstruct_nahuatl_bricks_connecting",
            "tconstruct_nahuatl_crate",
            "tconstruct_nahuatl_crate_connecting",
            "tconstruct_nahuatl_diagonal_stripes",
            "tconstruct_nahuatl_diagonal_stripes_connecting",
            "tconstruct_nahuatl_diagonal_tiles",
            "tconstruct_nahuatl_diagonal_tiles_connecting",
            "tconstruct_nahuatl_dotted",
            "tconstruct_nahuatl_dotted_connecting",
            "tconstruct_nahuatl_flooring",
            "tconstruct_nahuatl_flooring_connecting",
            "tconstruct_nahuatl_large_tiles",
            "tconstruct_nahuatl_large_tiles_connecting",
            "tconstruct_nahuatl_pattern",
            "tconstruct_nahuatl_pattern_connecting",
            "tconstruct_nahuatl_small_bricks",
            "tconstruct_nahuatl_small_bricks_connecting",
            "tconstruct_nahuatl_small_tiles",
            "tconstruct_nahuatl_small_tiles_connecting",
            "tconstruct_nahuatl_squares",
            "tconstruct_nahuatl_squares_connecting",
            "tconstruct_nahuatl_tiles",
            "tconstruct_nahuatl_tiles_connecting",
            "tconstruct_nahuatl_wavy",
            "tconstruct_nahuatl_wavy_connecting",
            "tconstruct_nahuatl_woven",
            "tconstruct_nahuatl_woven_connecting"
    };

    private Tconstruct() {
    }

    public String getModId() {
        return "tconstruct";
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