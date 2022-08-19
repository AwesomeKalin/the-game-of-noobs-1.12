package io.itch.awesomekalin.noob.procedure;

import net.minecraft.util.EnumHand;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import java.util.Map;

import io.itch.awesomekalin.noob.ElementsNoobMod;

@ElementsNoobMod.ModElement.Tag
public class ProcedureTheNoobEntityIsHurt extends ElementsNoobMod.ModElement {
	public ProcedureTheNoobEntityIsHurt(ElementsNoobMod instance) {
		super(instance, 50);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure TheNoobEntityIsHurt!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase) {
			((EntityLivingBase) entity).swingArm(EnumHand.MAIN_HAND);
		}
	}
}
