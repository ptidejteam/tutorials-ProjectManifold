package net.ptidej.tutorial.animals.client;

import java.util.Arrays;

import net.ptidej.tutorial.animals.IVertebrate;
import net.ptidej.tutorial.animals.behaviour.impl.FightMechanismHissing;
import net.ptidej.tutorial.animals.behaviour.impl.FightMechanismTeeth;
import net.ptidej.tutorial.animals.impl.Cat;
import net.ptidej.tutorial.animals.impl.Echidna1;
import net.ptidej.tutorial.animals.impl.Echidna2;
import net.ptidej.tutorial.animals.impl.Platypus;
import net.ptidej.tutorial.animals.impl.Shark;

public class Client {
	public static void main(final String[] args) {
		// Cats
		System.out.println("Cats");
		final IVertebrate nyx = new Cat();
		nyx.fight();
		nyx.nurse();
		nyx.reproduce();

		System.out.println(nyx.getTaxonomicClassification());

		System.out.println(nyx.getNumberOfFightMechanisms());
		nyx.addFightingMechanisms(Arrays.asList(new FightMechanismHissing(), new FightMechanismTeeth()));
		System.out.println(nyx.getNumberOfFightMechanisms());

		// Sharks
		System.out.println("\nSharks");
		final IVertebrate bruce = new Shark();
		bruce.fight();
		bruce.nurse();
		bruce.reproduce();

		System.out.println(bruce.getTaxonomicClassification());

		// Platypuses
		System.out.println("\nPlatypuses");
		final IVertebrate ovid = new Platypus();
		ovid.fight();
		ovid.nurse();
		ovid.reproduce();

		System.out.println(ovid.getTaxonomicClassification());

		// Echidna
		System.out.println("\nEchidnas");
		final IVertebrate echidna0 = new Echidna1();
		echidna0.fight();
		echidna0.nurse();
		echidna0.reproduce();

		System.out.println(echidna0.getTaxonomicClassification());

		final Echidna1 echidna1 = new Echidna1();
		echidna1.layEgg();
		echidna1.secreteMilk();

		System.out.println(echidna1.getTaxonomicClassification());

		final Echidna2 echidna2 = new Echidna2();
		echidna2.layEgg();
		echidna2.secreteMilk();

		System.out.println(echidna2.getTaxonomicClassification());
	}
}