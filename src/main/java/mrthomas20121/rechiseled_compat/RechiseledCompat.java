package mrthomas20121.rechiseled_compat;

import mrthomas20121.rechiseled_compat.compat.*;
import mrthomas20121.rechiseled_compat.core.Core;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@net.minecraftforge.fml.common.Mod(RechiseledCompat.MOD_ID)
public class RechiseledCompat {

	/**
	 * Load all the mods even when their base mod is not installed.
	 * most likely you will want to use this when generating data via
	 * {@link net.minecraft.data.DataGenerator} but you can also use it
	 * to simply unlock all the blocks.
	 */
	private static final Boolean RUN_DATA = false;

	public static final String MOD_ID = "rechiseled_compat";
	public static final Logger LOGGER = LogManager.getLogger();


	public RechiseledCompat() {

		load(ArsNouveau.class);
		load(Atmospheric.class);
		load(Atum.class);
		load(BayouBlue.class);
		load(Betterendforge.class);
		load(Betternether.class);
		load(Biomesoplenty.class);
		load(BlueSkies.class);
		load(Byg.class);
		load(Druidcraft.class);
		load(Endergetic.class);
		load(Environmental.class);
		load(Genericeco.class);
		load(Naturesaura.class);
		load(OuterEnd.class);
		load(Quark.class);
		load(Tconstruct.class);
		load(Traverse.class);
		load(Tropicraft.class);
		load(Twilightforest.class);
		load(Undergarden.class);

		Core.register(FMLJavaModLoadingContext.get().getModEventBus(), MinecraftForge.EVENT_BUS);
	}

	private static void load(Class<? extends Mod> modClass) {
		Mod mod = Mod.getInstance(modClass);
		if (Core.isModLoaded(mod.getModId()) || RUN_DATA) {
			mod.registerBlocks();
		}
	}
}
