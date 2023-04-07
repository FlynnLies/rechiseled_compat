package mrthomas20121.rechiseled_compat.compat;

import mrthomas20121.rechiseled_compat.core.Core;
import mrthomas20121.rechiseled_compat.datagen.CompatForgeTagsProvider;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.IForgeRegistryEntry;

public class Undergarden extends Mod {
    public static final String[] PLANKS = {
            "undergarden_grongle_planks_beams",
            "undergarden_grongle_planks_beams_connecting",
            "undergarden_grongle_planks_bricks",
            "undergarden_grongle_planks_bricks_connecting",
            "undergarden_grongle_planks_crate",
            "undergarden_grongle_planks_crate_connecting",
            "undergarden_grongle_planks_diagonal_stripes",
            "undergarden_grongle_planks_diagonal_stripes_connecting",
            "undergarden_grongle_planks_diagonal_tiles",
            "undergarden_grongle_planks_diagonal_tiles_connecting",
            "undergarden_grongle_planks_dotted",
            "undergarden_grongle_planks_dotted_connecting",
            "undergarden_grongle_planks_flooring",
            "undergarden_grongle_planks_flooring_connecting",
            "undergarden_grongle_planks_large_tiles",
            "undergarden_grongle_planks_large_tiles_connecting",
            "undergarden_grongle_planks_pattern",
            "undergarden_grongle_planks_pattern_connecting",
            "undergarden_grongle_planks_small_bricks",
            "undergarden_grongle_planks_small_bricks_connecting",
            "undergarden_grongle_planks_small_tiles",
            "undergarden_grongle_planks_small_tiles_connecting",
            "undergarden_grongle_planks_squares",
            "undergarden_grongle_planks_squares_connecting",
            "undergarden_grongle_planks_tiles",
            "undergarden_grongle_planks_tiles_connecting",
            "undergarden_grongle_planks_wavy",
            "undergarden_grongle_planks_wavy_connecting",
            "undergarden_grongle_planks_woven",
            "undergarden_grongle_planks_woven_connecting",
            "undergarden_smogstem_planks_beams",
            "undergarden_smogstem_planks_beams_connecting",
            "undergarden_smogstem_planks_bricks",
            "undergarden_smogstem_planks_bricks_connecting",
            "undergarden_smogstem_planks_crate",
            "undergarden_smogstem_planks_crate_connecting",
            "undergarden_smogstem_planks_diagonal_stripes",
            "undergarden_smogstem_planks_diagonal_stripes_connecting",
            "undergarden_smogstem_planks_diagonal_tiles",
            "undergarden_smogstem_planks_diagonal_tiles_connecting",
            "undergarden_smogstem_planks_dotted",
            "undergarden_smogstem_planks_dotted_connecting",
            "undergarden_smogstem_planks_flooring",
            "undergarden_smogstem_planks_flooring_connecting",
            "undergarden_smogstem_planks_large_tiles",
            "undergarden_smogstem_planks_large_tiles_connecting",
            "undergarden_smogstem_planks_pattern",
            "undergarden_smogstem_planks_pattern_connecting",
            "undergarden_smogstem_planks_small_bricks",
            "undergarden_smogstem_planks_small_bricks_connecting",
            "undergarden_smogstem_planks_small_tiles",
            "undergarden_smogstem_planks_small_tiles_connecting",
            "undergarden_smogstem_planks_squares",
            "undergarden_smogstem_planks_squares_connecting",
            "undergarden_smogstem_planks_tiles",
            "undergarden_smogstem_planks_tiles_connecting",
            "undergarden_smogstem_planks_wavy",
            "undergarden_smogstem_planks_wavy_connecting",
            "undergarden_smogstem_planks_woven",
            "undergarden_smogstem_planks_woven_connecting",
            "undergarden_wigglewood_planks_beams",
            "undergarden_wigglewood_planks_beams_connecting",
            "undergarden_wigglewood_planks_bricks",
            "undergarden_wigglewood_planks_bricks_connecting",
            "undergarden_wigglewood_planks_crate",
            "undergarden_wigglewood_planks_crate_connecting",
            "undergarden_wigglewood_planks_diagonal_stripes",
            "undergarden_wigglewood_planks_diagonal_stripes_connecting",
            "undergarden_wigglewood_planks_diagonal_tiles",
            "undergarden_wigglewood_planks_diagonal_tiles_connecting",
            "undergarden_wigglewood_planks_dotted",
            "undergarden_wigglewood_planks_dotted_connecting",
            "undergarden_wigglewood_planks_flooring",
            "undergarden_wigglewood_planks_flooring_connecting",
            "undergarden_wigglewood_planks_large_tiles",
            "undergarden_wigglewood_planks_large_tiles_connecting",
            "undergarden_wigglewood_planks_pattern",
            "undergarden_wigglewood_planks_pattern_connecting",
            "undergarden_wigglewood_planks_small_bricks",
            "undergarden_wigglewood_planks_small_bricks_connecting",
            "undergarden_wigglewood_planks_small_tiles",
            "undergarden_wigglewood_planks_small_tiles_connecting",
            "undergarden_wigglewood_planks_squares",
            "undergarden_wigglewood_planks_squares_connecting",
            "undergarden_wigglewood_planks_tiles",
            "undergarden_wigglewood_planks_tiles_connecting",
            "undergarden_wigglewood_planks_wavy",
            "undergarden_wigglewood_planks_wavy_connecting",
            "undergarden_wigglewood_planks_woven",
            "undergarden_wigglewood_planks_woven_connecting"
    };

    private Undergarden() {
    }

    public String getModId() {
        return "undergarden";
    }

    public void registerBlocks() {

        for (String block : PLANKS) {
            Core.registerBlock("minecraft:oak_planks", block);
        }

    }

    // for data generation
    public <T extends IForgeRegistryEntry<T>> void addTags(CompatForgeTagsProvider<T> provider) {
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