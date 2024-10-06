package net.ptidej.tutorial.animals.impl;

import java.awt.Color;

import manifold.ext.delegation.rt.api.part;
import net.ptidej.tutorial.animals.IBird;
import net.ptidej.tutorial.animals.behaviour.impl.AggregationMechanismNone;
import net.ptidej.tutorial.animals.behaviour.impl.FightMechanismNone;
import net.ptidej.tutorial.animals.behaviour.impl.NursingMechanismRegurgitation;
import net.ptidej.tutorial.animals.behaviour.impl.ReproductionMechanismOviparity;

public class Mallard extends AbstractBird implements IBird {
	public Mallard() {
		super(new AggregationMechanismNone(), new FightMechanismNone(), new NursingMechanismRegurgitation(),
				new ReproductionMechanismOviparity());
	}

	@Override
	public String getSubclass() {
		return "Neornithes";
	}

	@Override
	public int getEggSize() {
		return 50;
	}

	@Override
	public Color getEggColour() {
		return Color.BLUE;
	}
}
