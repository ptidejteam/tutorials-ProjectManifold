package net.ptidej.tutorial.animals.behaviour.impl;

import net.ptidej.tutorial.animals.behaviour.IFightMechanism;

public class FightMechanismHissing implements IFightMechanism {
	@Override
	public void fight() {
		System.out.println("Clawing adversary...");
	}
}