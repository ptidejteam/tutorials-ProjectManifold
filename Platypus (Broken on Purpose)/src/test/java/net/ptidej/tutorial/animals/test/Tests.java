package net.ptidej.tutorial.animals.test;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;

import net.ptidej.tutorial.animals.IBird;
import net.ptidej.tutorial.animals.IVertebrate;
import net.ptidej.tutorial.animals.behaviour.IFightMechanism;
import net.ptidej.tutorial.animals.behaviour.impl.FightMechanismClaws;
import net.ptidej.tutorial.animals.behaviour.impl.FightMechanismHissing;
import net.ptidej.tutorial.animals.behaviour.impl.FightMechanismNone;
import net.ptidej.tutorial.animals.behaviour.impl.FightMechanismTeeth;
import net.ptidej.tutorial.animals.behaviour.impl.FightMechanismVenom;
import net.ptidej.tutorial.animals.impl.Cat;
import net.ptidej.tutorial.animals.impl.Echidna1;
import net.ptidej.tutorial.animals.impl.Echidna2;
import net.ptidej.tutorial.animals.impl.Platypus;

class Tests {

	@org.junit.jupiter.api.Test
	void test1() {
		final IVertebrate platypus = new Platypus();
		platypus.addFightingMechanisms(Arrays.asList(new IFightMechanism[] { new FightMechanismHissing(),
				new FightMechanismTeeth(), new FightMechanismClaws(), new FightMechanismNone(),
				new FightMechanismVenom(), new FightMechanismHissing(), new FightMechanismTeeth(),
				new FightMechanismClaws(), new FightMechanismNone(), new FightMechanismVenom() }));

		Assertions.assertEquals(21, platypus.getNumberOfFightMechanisms());
	}

	@org.junit.jupiter.api.Test
	void testUnexpectedCallToOverridingMethod() {
		final IVertebrate nyx = new Cat();
		Assertions.assertEquals(1, nyx.getNumberOfFightMechanisms());

		nyx.addFightingMechanisms(Arrays.asList(new FightMechanismHissing(), new FightMechanismTeeth()));

		System.out.println(
				"\nWARNING: All the tests should pass, but net.ptidej.tutorial.forwarding.Tests.testUnexpectedCallToOverridingMethod() actually shows the erroneous behaviour!\n");
		Assertions.assertEquals(5, nyx.getNumberOfFightMechanisms(),
				"Received 5 but expected 3, because the method net.ptidej.tutorial.animals.IVertebrate.addFightingMechanism() is called by net.ptidej.tutorial.animals.IVertebrate.addFightingMechanisms()");
	}

	@org.junit.jupiter.api.Test
	void testUnexpectedMissingCallToOverridingMethod() {
		final IBird echidna1 = new Echidna1();
		Assertions.assertEquals(20, echidna1.layEgg());

		final IBird echidna2 = new Echidna2();
		System.out.println(
				"\nWARNING: All the tests should pass, but net.ptidej.tutorial.forwarding.Tests.testUnexpectedMissingCallToOverridingMethod() actually shows the erroneous behaviour!\n");
		Assertions.assertEquals(50, echidna2.layEgg(),
				"Received 50 but expected 20, because the method net.ptidej.tutorial.animals.impl.Echidna2.getEggSize() is NOT called by net.ptidej.tutorial.animals.impl.AbstractBird.layEgg()");
	}

}
