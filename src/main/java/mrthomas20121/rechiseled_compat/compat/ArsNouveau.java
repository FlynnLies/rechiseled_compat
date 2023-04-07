package mrthomas20121.rechiseled_compat.compat;

import mrthomas20121.rechiseled_compat.core.Core;
import mrthomas20121.rechiseled_compat.datagen.CompatForgeTagsProvider;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.IForgeRegistryEntry;

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