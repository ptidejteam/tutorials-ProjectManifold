package net.ptidej.tutorial.animals.test;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;

import net.ptidej.tutorial.animals.IBird;
import net.ptidej.tutorial.animals.IVertebrate;
import net.ptidej.tutorial.animals.behaviour.impl.FightMechanismHissing;
import net.ptidej.tutorial.animals.behaviour.impl.FightMechanismTeeth;
import net.ptidej.tutorial.animals.impl.Cat;
import net.ptidej.tutorial.animals.impl.Echidna1;
import net.ptidej.tutorial.animals.impl.Echidna2;

class Tests {

	@org.junit.jupiter.api.Test
	void testUnexpectedCallToOverridingMethod() {
		final IVertebrate nyx = new Cat();
		Assertions.assertEquals(1, nyx.getNumberOfFightMechanisms());

		nyx.addFightingMechanisms(Arrays.asList(new FightMechanismHissing(), new FightMechanismTeeth()));

		Assertions.assertEquals(3, nyx.getNumberOfFightMechanisms(),
				"The method net.ptidej.tutorial.animals.IVertebrate.addFightingMechanism() is NOT called by net.ptidej.tutorial.animals.IVertebrate.addFightingMechanisms()");
	}

	@org.junit.jupiter.api.Test
	void testUnexpectedMissingCallToOverridingMethod() {
		final IBird echidna1 = new Echidna1();
		Assertions.assertEquals(20, echidna1.layEgg());

		final IBird echidna2 = new Echidna2();
		Assertions.assertEquals(20, echidna2.layEgg(),
				"The method net.ptidej.tutorial.animals.impl.Echidna2.getEggSize() IS called by net.ptidej.tutorial.animals.impl.AbstractBird.layEgg()");
	}

}
