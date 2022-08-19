package io.itch.awesomekalin.noob.procedure;

import net.minecraft.world.World;
import net.minecraft.world.GameType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import java.util.Map;

import io.itch.awesomekalin.noob.NoobModVariables;
import io.itch.awesomekalin.noob.ElementsNoobMod;

@ElementsNoobMod.ModElement.Tag
public class ProcedureCreativeGauntletRightClicked extends ElementsNoobMod.ModElement {
	public ProcedureCreativeGauntletRightClicked(ElementsNoobMod instance) {
		super(instance, 52);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure CreativeGauntletRightClicked!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure CreativeGauntletRightClicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		World world = (World) dependencies.get("world");
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).setGameType(GameType.CREATIVE);
		NoobModVariables.WorldVariables.get(world).CreativeTimer = (double) ((world.getWorldTime()) + 600);
		NoobModVariables.WorldVariables.get(world).syncData(world);
		NoobModVariables.WorldVariables.get(world).ActivatedGauntlet = (boolean) (true);
		NoobModVariables.WorldVariables.get(world).syncData(world);
	}
}
