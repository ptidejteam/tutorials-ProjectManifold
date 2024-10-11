package net.ptidej.tutorial.animals.behaviour.impl;

import net.ptidej.tutorial.animals.behaviour.IAggregationMechanism;

public class AggregationMechanismSchool implements IAggregationMechanism {
	@Override
	public void aggregate() {
		System.out.println("Forming schools...");
	}
}
