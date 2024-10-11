package net.ptidej.tutorial.animals.behaviour.impl;

import net.ptidej.tutorial.animals.behaviour.IFightMechanism;

public class FightMechanismNone implements IFightMechanism {
	@Override
	public void fight() {
		System.out.println("Not fighting...");
	}
}
