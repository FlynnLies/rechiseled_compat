package mrthomas20121.rechiseled_compat.compat;

import mrthomas20121.rechiseled_compat.RechiseledCompat;
import mrthomas20121.rechiseled_compat.block.ChiseledBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
public class DruidcraftBlocks {

    public static DeferredRegister<Block> BLOCKS = DeferredRegister.create(Block.class, RechiseledCompat.MOD_ID);

    public static RegistryObject<Block>  DRUIDCRAFT_DARKWOOD_PLANKS_BEAMS = BLOCKS.register("druidcraft_darkwood_planks_beams", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  DRUIDCRAFT_DARKWOOD_PLANKS_BEAMS_CONNECTING = BLOCKS.register("druidcraft_darkwood_planks_beams_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  DRUIDCRAFT_DARKWOOD_PLANKS_BRICKS = BLOCKS.register("druidcraft_darkwood_planks_bricks", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  DRUIDCRAFT_DARKWOOD_PLANKS_BRICKS_CONNECTING = BLOCKS.register("druidcraft_darkwood_planks_bricks_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  DRUIDCRAFT_DARKWOOD_PLANKS_CRATE = BLOCKS.register("druidcraft_darkwood_planks_crate", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  DRUIDCRAFT_DARKWOOD_PLANKS_CRATE_CONNECTING = BLOCKS.register("druidcraft_darkwood_planks_crate_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  DRUIDCRAFT_DARKWOOD_PLANKS_DIAGONAL_STRIPES = BLOCKS.register("druidcraft_darkwood_planks_diagonal_stripes", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  DRUIDCRAFT_DARKWOOD_PLANKS_DIAGONAL_STRIPES_CONNECTING = BLOCKS.register("druidcraft_darkwood_planks_diagonal_stripes_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  DRUIDCRAFT_DARKWOOD_PLANKS_DIAGONAL_TILES = BLOCKS.register("druidcraft_darkwood_planks_diagonal_tiles", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  DRUIDCRAFT_DARKWOOD_PLANKS_DIAGONAL_TILES_CONNECTING = BLOCKS.register("druidcraft_darkwood_planks_diagonal_tiles_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  DRUIDCRAFT_DARKWOOD_PLANKS_DOTTED = BLOCKS.register("druidcraft_darkwood_planks_dotted", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  DRUIDCRAFT_DARKWOOD_PLANKS_DOTTED_CONNECTING = BLOCKS.register("druidcraft_darkwood_planks_dotted_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  DRUIDCRAFT_DARKWOOD_PLANKS_FLOORING = BLOCKS.register("druidcraft_darkwood_planks_flooring", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  DRUIDCRAFT_DARKWOOD_PLANKS_FLOORING_CONNECTING = BLOCKS.register("druidcraft_darkwood_planks_flooring_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  DRUIDCRAFT_DARKWOOD_PLANKS_LARGE_TILES = BLOCKS.register("druidcraft_darkwood_planks_large_tiles", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  DRUIDCRAFT_DARKWOOD_PLANKS_LARGE_TILES_CONNECTING = BLOCKS.register("druidcraft_darkwood_planks_large_tiles_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  DRUIDCRAFT_DARKWOOD_PLANKS_PATTERN = BLOCKS.register("druidcraft_darkwood_planks_pattern", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  DRUIDCRAFT_DARKWOOD_PLANKS_PATTERN_CONNECTING = BLOCKS.register("druidcraft_darkwood_planks_pattern_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  DRUIDCRAFT_DARKWOOD_PLANKS_SMALL_BRICKS = BLOCKS.register("druidcraft_darkwood_planks_small_bricks", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  DRUIDCRAFT_DARKWOOD_PLANKS_SMALL_BRICKS_CONNECTING = BLOCKS.register("druidcraft_darkwood_planks_small_bricks_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  DRUIDCRAFT_DARKWOOD_PLANKS_SMALL_TILES = BLOCKS.register("druidcraft_darkwood_planks_small_tiles", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  DRUIDCRAFT_DARKWOOD_PLANKS_SMALL_TILES_CONNECTING = BLOCKS.register("druidcraft_darkwood_planks_small_tiles_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  DRUIDCRAFT_DARKWOOD_PLANKS_SQUARES = BLOCKS.register("druidcraft_darkwood_planks_squares", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  DRUIDCRAFT_DARKWOOD_PLANKS_SQUARES_CONNECTING = BLOCKS.register("druidcraft_darkwood_planks_squares_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  DRUIDCRAFT_DARKWOOD_PLANKS_TILES = BLOCKS.register("druidcraft_darkwood_planks_tiles", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  DRUIDCRAFT_DARKWOOD_PLANKS_TILES_CONNECTING = BLOCKS.register("druidcraft_darkwood_planks_tiles_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  DRUIDCRAFT_DARKWOOD_PLANKS_WAVY = BLOCKS.register("druidcraft_darkwood_planks_wavy", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  DRUIDCRAFT_DARKWOOD_PLANKS_WAVY_CONNECTING = BLOCKS.register("druidcraft_darkwood_planks_wavy_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  DRUIDCRAFT_DARKWOOD_PLANKS_WOVEN = BLOCKS.register("druidcraft_darkwood_planks_woven", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  DRUIDCRAFT_DARKWOOD_PLANKS_WOVEN_CONNECTING = BLOCKS.register("druidcraft_darkwood_planks_woven_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  DRUIDCRAFT_ELDER_PLANKS_BEAMS = BLOCKS.register("druidcraft_elder_planks_beams", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  DRUIDCRAFT_ELDER_PLANKS_BEAMS_CONNECTING = BLOCKS.register("druidcraft_elder_planks_beams_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  DRUIDCRAFT_ELDER_PLANKS_BRICKS = BLOCKS.register("druidcraft_elder_planks_bricks", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  DRUIDCRAFT_ELDER_PLANKS_BRICKS_CONNECTING = BLOCKS.register("druidcraft_elder_planks_bricks_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  DRUIDCRAFT_ELDER_PLANKS_CRATE = BLOCKS.register("druidcraft_elder_planks_crate", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  DRUIDCRAFT_ELDER_PLANKS_CRATE_CONNECTING = BLOCKS.register("druidcraft_elder_planks_crate_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  DRUIDCRAFT_ELDER_PLANKS_DIAGONAL_STRIPES = BLOCKS.register("druidcraft_elder_planks_diagonal_stripes", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  DRUIDCRAFT_ELDER_PLANKS_DIAGONAL_STRIPES_CONNECTING = BLOCKS.register("druidcraft_elder_planks_diagonal_stripes_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  DRUIDCRAFT_ELDER_PLANKS_DIAGONAL_TILES = BLOCKS.register("druidcraft_elder_planks_diagonal_tiles", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  DRUIDCRAFT_ELDER_PLANKS_DIAGONAL_TILES_CONNECTING = BLOCKS.register("druidcraft_elder_planks_diagonal_tiles_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  DRUIDCRAFT_ELDER_PLANKS_DOTTED = BLOCKS.register("druidcraft_elder_planks_dotted", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  DRUIDCRAFT_ELDER_PLANKS_DOTTED_CONNECTING = BLOCKS.register("druidcraft_elder_planks_dotted_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  DRUIDCRAFT_ELDER_PLANKS_FLOORING = BLOCKS.register("druidcraft_elder_planks_flooring", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  DRUIDCRAFT_ELDER_PLANKS_FLOORING_CONNECTING = BLOCKS.register("druidcraft_elder_planks_flooring_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  DRUIDCRAFT_ELDER_PLANKS_LARGE_TILES = BLOCKS.register("druidcraft_elder_planks_large_tiles", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  DRUIDCRAFT_ELDER_PLANKS_LARGE_TILES_CONNECTING = BLOCKS.register("druidcraft_elder_planks_large_tiles_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  DRUIDCRAFT_ELDER_PLANKS_PATTERN = BLOCKS.register("druidcraft_elder_planks_pattern", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  DRUIDCRAFT_ELDER_PLANKS_PATTERN_CONNECTING = BLOCKS.register("druidcraft_elder_planks_pattern_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  DRUIDCRAFT_ELDER_PLANKS_SMALL_BRICKS = BLOCKS.register("druidcraft_elder_planks_small_bricks", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  DRUIDCRAFT_ELDER_PLANKS_SMALL_BRICKS_CONNECTING = BLOCKS.register("druidcraft_elder_planks_small_bricks_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  DRUIDCRAFT_ELDER_PLANKS_SMALL_TILES = BLOCKS.register("druidcraft_elder_planks_small_tiles", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  DRUIDCRAFT_ELDER_PLANKS_SMALL_TILES_CONNECTING = BLOCKS.register("druidcraft_elder_planks_small_tiles_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  DRUIDCRAFT_ELDER_PLANKS_SQUARES = BLOCKS.register("druidcraft_elder_planks_squares", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  DRUIDCRAFT_ELDER_PLANKS_SQUARES_CONNECTING = BLOCKS.register("druidcraft_elder_planks_squares_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  DRUIDCRAFT_ELDER_PLANKS_TILES = BLOCKS.register("druidcraft_elder_planks_tiles", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  DRUIDCRAFT_ELDER_PLANKS_TILES_CONNECTING = BLOCKS.register("druidcraft_elder_planks_tiles_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  DRUIDCRAFT_ELDER_PLANKS_WAVY = BLOCKS.register("druidcraft_elder_planks_wavy", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  DRUIDCRAFT_ELDER_PLANKS_WAVY_CONNECTING = BLOCKS.register("druidcraft_elder_planks_wavy_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  DRUIDCRAFT_ELDER_PLANKS_WOVEN = BLOCKS.register("druidcraft_elder_planks_woven", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  DRUIDCRAFT_ELDER_PLANKS_WOVEN_CONNECTING = BLOCKS.register("druidcraft_elder_planks_woven_connecting", ()-> new ChiseledBlock(true, getProperties()));

    public static AbstractBlock.Properties getProperties() {
        return AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD);    }
}