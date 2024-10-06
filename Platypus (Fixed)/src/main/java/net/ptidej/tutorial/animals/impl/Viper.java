package net.ptidej.tutorial.animals.impl;

import net.ptidej.tutorial.animals.ISnake;
import net.ptidej.tutorial.animals.behaviour.impl.AggregationMechanismNone;
import net.ptidej.tutorial.animals.behaviour.impl.FightMechanismVenom;
import net.ptidej.tutorial.animals.behaviour.impl.NursingMechanismNone;
import net.ptidej.tutorial.animals.behaviour.impl.ReproductionMechanismOviparity;

public class Viper extends AbstractReptile implements ISnake {
	public Viper() {
		super(new AggregationMechanismNone(), new FightMechanismVenom(), new NursingMechanismNone(),
				new ReproductionMechanismOviparity());
	}

	@Override
	public String getSubclass() {
		return "Lepidosauria";
	}
}
