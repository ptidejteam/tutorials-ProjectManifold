package net.ptidej.tutorial.animals.impl;

import net.ptidej.tutorial.animals.IMammal;
import net.ptidej.tutorial.animals.behaviour.impl.AggregationMechanismNone;
import net.ptidej.tutorial.animals.behaviour.impl.FightMechanismClaws;
import net.ptidej.tutorial.animals.behaviour.impl.NursingMechanismLactation;
import net.ptidej.tutorial.animals.behaviour.impl.ReproductionMechanismViviparity;

public class Cat extends AbstractMammal implements IMammal {
	public Cat() {
		super(new AggregationMechanismNone(), new FightMechanismClaws(), new NursingMechanismLactation(),
				new ReproductionMechanismViviparity());
	}

	@Override
	public String getSubclass() {
		return "Theria";
	}
}
