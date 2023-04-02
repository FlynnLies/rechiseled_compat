package mrthomas20121.rechiseled_compat.compat;

import mrthomas20121.rechiseled_compat.core.Core;
import mrthomas20121.rechiseled_compat.datagen.CompatForgeTagsProvider;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

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