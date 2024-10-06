package net.ptidej.tutorial.animals.behaviour.impl;

import net.ptidej.tutorial.animals.behaviour.IFightMechanism;

public class FightMechanismTeeth implements IFightMechanism {
	@Override
	public void fight() {
		System.out.println("Biting with teeth...");
	}
}
