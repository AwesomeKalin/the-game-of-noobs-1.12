package io.itch.awesomekalin.noob.procedure;

import net.minecraft.item.ItemStack;

import io.itch.awesomekalin.noob.ElementsTheGameofNoobs;

@ElementsTheGameofNoobs.ModElement.Tag
public class ProcedureMudAxeOnPlayerStoppedUsing extends ElementsTheGameofNoobs.ModElement {
	public ProcedureMudAxeOnPlayerStoppedUsing(ElementsTheGameofNoobs instance) {
		super(instance, 10);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure MudAxeOnPlayerStoppedUsing!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		itemstack.setStackDisplayName("Thank You...");
	}
}
