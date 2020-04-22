package io.itch.awesomekalin.noob.procedure;

import net.minecraft.world.World;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import io.itch.awesomekalin.noob.ElementsTheGameofNoobs;

@ElementsTheGameofNoobs.ModElement.Tag
public class ProcedureMudAxeOnPlayerStoppedUsing extends ElementsTheGameofNoobs.ModElement {
	public ProcedureMudAxeOnPlayerStoppedUsing(ElementsTheGameofNoobs instance) {
		super(instance, 10);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MudAxeOnPlayerStoppedUsing!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MudAxeOnPlayerStoppedUsing!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		World world = (World) dependencies.get("world");
		if (entity instanceof EntityPlayer && !world.isRemote) {
			((EntityPlayer) entity).sendStatusMessage(new TextComponentString("Thank You..."), (false));
		}
	}
}
