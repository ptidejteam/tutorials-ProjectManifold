package net.ptidej.tutorial.animals.behaviour.impl;

import net.ptidej.tutorial.animals.behaviour.INursingMechanism;

public class NursingMechanismNone implements INursingMechanism {
	@Override
	public void nurse() {
		System.out.println("Not nursing...");
	}
}
