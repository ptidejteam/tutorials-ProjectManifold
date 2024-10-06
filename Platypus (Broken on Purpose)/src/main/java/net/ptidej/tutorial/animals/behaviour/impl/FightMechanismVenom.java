package net.ptidej.tutorial.animals.behaviour.impl;

import net.ptidej.tutorial.animals.behaviour.IFightMechanism;

public class FightMechanismVenom implements IFightMechanism {
	@Override
	public void fight() {
		System.out.println("Injecting venom...");
	}
}
