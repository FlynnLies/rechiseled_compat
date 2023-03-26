package mrthomas20121.rechiseled_compat.compat;

import mrthomas20121.rechiseled_compat.RechiseledCompat;
import mrthomas20121.rechiseled_compat.block.ChiseledBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;import net.minecraftforge.registries.ForgeRegistries;
public class BayouBluesBlocks {

    public static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, RechiseledCompat.MOD_ID);

    public static RegistryObject<Block>  BAYOU_BLUES_CYPRESS_PLANKS_BEAMS = BLOCKS.register("bayou_blues_cypress_planks_beams", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  BAYOU_BLUES_CYPRESS_PLANKS_BEAMS_CONNECTING = BLOCKS.register("bayou_blues_cypress_planks_beams_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  BAYOU_BLUES_CYPRESS_PLANKS_BRICKS = BLOCKS.register("bayou_blues_cypress_planks_bricks", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  BAYOU_BLUES_CYPRESS_PLANKS_BRICKS_CONNECTING = BLOCKS.register("bayou_blues_cypress_planks_bricks_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  BAYOU_BLUES_CYPRESS_PLANKS_CRATE = BLOCKS.register("bayou_blues_cypress_planks_crate", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  BAYOU_BLUES_CYPRESS_PLANKS_CRATE_CONNECTING = BLOCKS.register("bayou_blues_cypress_planks_crate_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  BAYOU_BLUES_CYPRESS_PLANKS_DIAGONAL_STRIPES = BLOCKS.register("bayou_blues_cypress_planks_diagonal_stripes", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  BAYOU_BLUES_CYPRESS_PLANKS_DIAGONAL_STRIPES_CONNECTING = BLOCKS.register("bayou_blues_cypress_planks_diagonal_stripes_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  BAYOU_BLUES_CYPRESS_PLANKS_DIAGONAL_TILES = BLOCKS.register("bayou_blues_cypress_planks_diagonal_tiles", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  BAYOU_BLUES_CYPRESS_PLANKS_DIAGONAL_TILES_CONNECTING = BLOCKS.register("bayou_blues_cypress_planks_diagonal_tiles_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  BAYOU_BLUES_CYPRESS_PLANKS_DOTTED = BLOCKS.register("bayou_blues_cypress_planks_dotted", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  BAYOU_BLUES_CYPRESS_PLANKS_DOTTED_CONNECTING = BLOCKS.register("bayou_blues_cypress_planks_dotted_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  BAYOU_BLUES_CYPRESS_PLANKS_FLOORING = BLOCKS.register("bayou_blues_cypress_planks_flooring", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  BAYOU_BLUES_CYPRESS_PLANKS_FLOORING_CONNECTING = BLOCKS.register("bayou_blues_cypress_planks_flooring_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  BAYOU_BLUES_CYPRESS_PLANKS_LARGE_TILES = BLOCKS.register("bayou_blues_cypress_planks_large_tiles", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  BAYOU_BLUES_CYPRESS_PLANKS_LARGE_TILES_CONNECTING = BLOCKS.register("bayou_blues_cypress_planks_large_tiles_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  BAYOU_BLUES_CYPRESS_PLANKS_PATTERN = BLOCKS.register("bayou_blues_cypress_planks_pattern", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  BAYOU_BLUES_CYPRESS_PLANKS_PATTERN_CONNECTING = BLOCKS.register("bayou_blues_cypress_planks_pattern_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  BAYOU_BLUES_CYPRESS_PLANKS_SMALL_BRICKS = BLOCKS.register("bayou_blues_cypress_planks_small_bricks", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  BAYOU_BLUES_CYPRESS_PLANKS_SMALL_BRICKS_CONNECTING = BLOCKS.register("bayou_blues_cypress_planks_small_bricks_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  BAYOU_BLUES_CYPRESS_PLANKS_SMALL_TILES = BLOCKS.register("bayou_blues_cypress_planks_small_tiles", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  BAYOU_BLUES_CYPRESS_PLANKS_SMALL_TILES_CONNECTING = BLOCKS.register("bayou_blues_cypress_planks_small_tiles_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  BAYOU_BLUES_CYPRESS_PLANKS_SQUARES = BLOCKS.register("bayou_blues_cypress_planks_squares", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  BAYOU_BLUES_CYPRESS_PLANKS_SQUARES_CONNECTING = BLOCKS.register("bayou_blues_cypress_planks_squares_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  BAYOU_BLUES_CYPRESS_PLANKS_TILES = BLOCKS.register("bayou_blues_cypress_planks_tiles", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  BAYOU_BLUES_CYPRESS_PLANKS_TILES_CONNECTING = BLOCKS.register("bayou_blues_cypress_planks_tiles_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  BAYOU_BLUES_CYPRESS_PLANKS_WAVY = BLOCKS.register("bayou_blues_cypress_planks_wavy", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  BAYOU_BLUES_CYPRESS_PLANKS_WAVY_CONNECTING = BLOCKS.register("bayou_blues_cypress_planks_wavy_connecting", ()-> new ChiseledBlock(true, getProperties()));
    public static RegistryObject<Block>  BAYOU_BLUES_CYPRESS_PLANKS_WOVEN = BLOCKS.register("bayou_blues_cypress_planks_woven", ()-> new ChiseledBlock(false, getProperties()));
    public static RegistryObject<Block>  BAYOU_BLUES_CYPRESS_PLANKS_WOVEN_CONNECTING = BLOCKS.register("bayou_blues_cypress_planks_woven_connecting", ()-> new ChiseledBlock(true, getProperties()));

    public static BlockBehaviour.Properties getProperties() {
        return BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD);    }
}