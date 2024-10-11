package net.ptidej.tutorial.animals.impl;

import net.ptidej.tutorial.animals.IFish;
import net.ptidej.tutorial.animals.behaviour.impl.AggregationMechanismShoal;
import net.ptidej.tutorial.animals.behaviour.impl.FightMechanismTeeth;
import net.ptidej.tutorial.animals.behaviour.impl.NursingMechanismNone;
import net.ptidej.tutorial.animals.behaviour.impl.ReproductionMechanismOvoviviparity;

public class Shark extends AbstractFish implements IFish {
	public Shark() {
		super(new AggregationMechanismShoal(), new FightMechanismTeeth(), new NursingMechanismNone(),
				new ReproductionMechanismOvoviviparity());
	}

	@Override
	public String getSubclass() {
		return "Elasmobranchii";
	}
}
