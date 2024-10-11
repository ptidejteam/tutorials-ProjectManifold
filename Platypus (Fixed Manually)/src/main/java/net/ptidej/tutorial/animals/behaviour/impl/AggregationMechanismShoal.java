package net.ptidej.tutorial.animals.behaviour.impl;

import net.ptidej.tutorial.animals.behaviour.IAggregationMechanism;

public class AggregationMechanismShoal implements IAggregationMechanism {
	@Override
	public void aggregate() {
		System.out.println("Shoaling...");
	}
}
