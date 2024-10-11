package net.ptidej.tutorial.animals.impl;

import net.ptidej.tutorial.animals.behaviour.IAggregationMechanism;
import net.ptidej.tutorial.animals.behaviour.IFightMechanism;
import net.ptidej.tutorial.animals.behaviour.INursingMechanism;
import net.ptidej.tutorial.animals.behaviour.IReproductionMechanism;

public abstract class AbstractFish extends AbstractVertebrate {
	public AbstractFish(final IAggregationMechanism anaAggregationMechanism, final IFightMechanism aFigthMechanism,
			final INursingMechanism aNursingMechanism, final IReproductionMechanism aReproductionMechanism) {
		super(anaAggregationMechanism, aFigthMechanism, aNursingMechanism, aReproductionMechanism);
	}

	@Override
	public String getClazs() {
		return "Pisces";
	}

	// @Override // An AbstractFish is NOT an IFish
	public void formSchool() {
		this.aggregate();
	}
}
