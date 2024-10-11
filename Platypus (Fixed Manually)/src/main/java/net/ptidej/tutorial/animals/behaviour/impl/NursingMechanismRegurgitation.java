package net.ptidej.tutorial.animals.behaviour.impl;

import net.ptidej.tutorial.animals.behaviour.INursingMechanism;

public class NursingMechanismRegurgitation implements INursingMechanism {
	@Override
	public void nurse() {
		System.out.println("Feeding youngs partially digested food...");
	}
}
