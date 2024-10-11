package net.ptidej.tutorial.animals.behaviour.impl;

import net.ptidej.tutorial.animals.behaviour.IReproductionMechanism;

public class ReproductionMechanismOviparity implements IReproductionMechanism {
	@Override
	public void reproduce() {
		System.out.println("Laying eggs...");
	}
}
