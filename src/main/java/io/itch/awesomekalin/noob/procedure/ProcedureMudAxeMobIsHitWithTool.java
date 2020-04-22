package io.itch.awesomekalin.noob.procedure;

import net.minecraft.world.World;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.Entity;

import io.itch.awesomekalin.noob.ElementsTheGameofNoobs;

@ElementsTheGameofNoobs.ModElement.Tag
public class ProcedureMudAxeMobIsHitWithTool extends ElementsTheGameofNoobs.ModElement {
	public ProcedureMudAxeMobIsHitWithTool(ElementsTheGameofNoobs instance) {
		super(instance, 9);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MudAxeMobIsHitWithTool!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MudAxeMobIsHitWithTool!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MudAxeMobIsHitWithTool!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MudAxeMobIsHitWithTool!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MudAxeMobIsHitWithTool!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (entity instanceof EntityPlayer && !world.isRemote) {
			((EntityPlayer) entity).sendStatusMessage(new TextComponentString("How DARE you fight my kind with me."), (false));
		}
		world.addWeatherEffect(new EntityLightningBolt(world, (int) x, (int) y, (int) z, false));
	}
}
