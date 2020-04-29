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
		String PreviousName = "";
		double tickVar = 0;
		PreviousName = (String) ((itemstack).getDisplayName());
		itemstack.setStackDisplayName("Thank You...");
		for (int index0 = 0; index0 < (int) (100); index0++) {
			tickVar = (double) ((tickVar) + 1);
		}
		tickVar = (double) 0;
		itemstack.setStackDisplayName((PreviousName));
	}
}
