package net.ptidej.tutorial.animals.impl;

import java.awt.Color;

import net.ptidej.tutorial.animals.IBird;
import net.ptidej.tutorial.animals.IMammal;
import net.ptidej.tutorial.animals.ISnake;
import net.ptidej.tutorial.animals.behaviour.impl.AggregationMechanismNone;
import net.ptidej.tutorial.animals.behaviour.impl.FightMechanismVenom;
import net.ptidej.tutorial.animals.behaviour.impl.NursingMechanismLactation;
import net.ptidej.tutorial.animals.behaviour.impl.ReproductionMechanismOviparity;

public class Platypus extends AbstractMammal implements IMammal, IBird, ISnake {
	public Platypus() {
		super(new AggregationMechanismNone(), new FightMechanismVenom(), new NursingMechanismLactation(),
				new ReproductionMechanismOviparity());
	}

	@Override
	public void injectVenom() {
		this.fight();
	}

	@Override
	public int layEgg() {
		this.reproduce();
		return this.getEggSize();
	}

	@Override
	public void secreteMilk() {
		this.nurse();
	}

	@Override
	public String getSubclass() {
		return "Prototheria";
	}

	@Override
	public int getEggSize() {
		return 15;
	}

	@Override
	public Color getEggColour() {
		return Color.WHITE;
	}
}
