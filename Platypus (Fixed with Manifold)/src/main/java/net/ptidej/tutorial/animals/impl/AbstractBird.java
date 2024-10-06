package net.ptidej.tutorial.animals.impl;

import java.awt.Color;

import manifold.ext.delegation.rt.api.part;
import net.ptidej.tutorial.animals.behaviour.IAggregationMechanism;
import net.ptidej.tutorial.animals.behaviour.IFightMechanism;
import net.ptidej.tutorial.animals.behaviour.INursingMechanism;
import net.ptidej.tutorial.animals.behaviour.IReproductionMechanism;

public abstract class AbstractBird extends AbstractVertebrate {
	public AbstractBird(final IAggregationMechanism anAggregationMechanism, final IFightMechanism aFigthMechanism,
			final INursingMechanism aNursingMechanism, final IReproductionMechanism aReproductionMechanism) {
		super(anAggregationMechanism, aFigthMechanism, aNursingMechanism, aReproductionMechanism);
	}

	@Override
	public String getClazs() {
		return "Aves";
	}

	public abstract int getEggSize();

	public abstract Color getEggColour();

	// @Override // An AbstractBird is NOT an IBird
	public int layEgg() {
		this.reproduce();
		return this.getEggSize();
	}
}