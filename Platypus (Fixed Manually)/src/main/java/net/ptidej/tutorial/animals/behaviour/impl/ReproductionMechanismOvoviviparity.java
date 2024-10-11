package net.ptidej.tutorial.animals.behaviour.impl;

import net.ptidej.tutorial.animals.behaviour.IReproductionMechanism;

public class ReproductionMechanismOvoviviparity implements IReproductionMechanism {
	@Override
	public void reproduce() {
		System.out.println("Giving live births from eggs...");
	}
}
