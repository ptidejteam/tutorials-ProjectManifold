package net.ptidej.tutorial.animals.impl;

import net.ptidej.tutorial.animals.behaviour.IAggregationMechanism;
import net.ptidej.tutorial.animals.behaviour.IFightMechanism;
import net.ptidej.tutorial.animals.behaviour.INursingMechanism;
import net.ptidej.tutorial.animals.behaviour.IReproductionMechanism;

public abstract class AbstractReptile extends AbstractVertebrate {
	public AbstractReptile(final IAggregationMechanism anAggregationMechanism, final IFightMechanism aFigthMechanism,
			final INursingMechanism aNursingMechanism, final IReproductionMechanism aReproductionMechanism) {
		super(anAggregationMechanism, aFigthMechanism, aNursingMechanism, aReproductionMechanism);
	}

	@Override
	public String getClazs() {
		return "Reptilia";
	}

	// @Override // An AbstractReptile is NOT an IReptile
	public void injectVenom() {
		this.fight();
	}
}
