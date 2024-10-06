package net.ptidej.tutorial.animals.impl;

import java.awt.Color;

import net.ptidej.tutorial.animals.IBird;
import net.ptidej.tutorial.animals.IMammal;
import net.ptidej.tutorial.animals.behaviour.impl.AggregationMechanismNone;
import net.ptidej.tutorial.animals.behaviour.impl.FightMechanismClaws;
import net.ptidej.tutorial.animals.behaviour.impl.NursingMechanismLactation;
import net.ptidej.tutorial.animals.behaviour.impl.ReproductionMechanismOviparity;

public class Echidna2 extends AbstractMammal implements IBird, IMammal {
	private final Mallard birdTraits = new Mallard();

	public Echidna2() {
		super(new AggregationMechanismNone(), new FightMechanismClaws(), new NursingMechanismLactation(),
				new ReproductionMechanismOviparity());
	}

	@Override
	public Color getEggColour() {
		return Color.WHITE;
	}

	@Override
	public int getEggSize() {
		return 20;
	}

	@Override
	public String getSubclass() {
		return "Prototheria";
	}

	@Override
	public int layEgg() {
		// Reuse net.ptidej.tutorial.animals.impl.AbstractBird.layEgg() but BROKEN
		return this.birdTraits.layEgg();
	}
}
