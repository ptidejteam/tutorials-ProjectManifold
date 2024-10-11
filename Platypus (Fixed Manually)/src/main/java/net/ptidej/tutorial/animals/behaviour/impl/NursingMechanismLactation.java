package net.ptidej.tutorial.animals.behaviour.impl;

import net.ptidej.tutorial.animals.behaviour.INursingMechanism;

public class NursingMechanismLactation implements INursingMechanism {
	@Override
	public void nurse() {
		System.out.println("Lactating to feed youngs...");
	}
}
