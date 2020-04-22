package io.itch.awesomekalin.noob.procedure;

import io.itch.awesomekalin.noob.ElementsTheGameofNoobs;

@ElementsTheGameofNoobs.ModElement.Tag
public class ProcedureMudAxeOnPlayerStoppedUsing extends ElementsTheGameofNoobs.ModElement {
	public ProcedureMudAxeOnPlayerStoppedUsing(ElementsTheGameofNoobs instance) {
		super(instance, 10);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		System.out.println("Thank You...");
	}
}
