package net.ptidej.tutorial.animals.impl;

import java.util.List;

import net.ptidej.tutorial.animals.behaviour.IAggregationMechanism;
import net.ptidej.tutorial.animals.behaviour.IFightMechanism;
import net.ptidej.tutorial.animals.behaviour.INursingMechanism;
import net.ptidej.tutorial.animals.behaviour.IReproductionMechanism;

public abstract class AbstractMammal extends AbstractVertebrate {
	private int numberOfFightMechanisms;

	public AbstractMammal(final IAggregationMechanism anAggregationMechanism, final IFightMechanism aFigthMechanism,
			final INursingMechanism aNursingMechanism, final IReproductionMechanism aReproductionMechanism) {
		super(anAggregationMechanism, aFigthMechanism, aNursingMechanism, aReproductionMechanism);
	}

	@Override
	public void addFightingMechanism(final IFightMechanism aFightMechanism) {
		this.numberOfFightMechanisms++;
		super.addFightingMechanism(aFightMechanism);
	}

	@Override
	public void addFightingMechanisms(final List<IFightMechanism> someFightMechanisms) {
		this.numberOfFightMechanisms += someFightMechanisms.size();
		super.addFightingMechanisms(someFightMechanisms);
	}

	@Override
	public String getClazs() {
		return "Mammalia";
	}

	@Override
	public int getNumberOfFightMechanisms() {
		return this.numberOfFightMechanisms;
	}

	// @Override // An AbstractMammal is NOT an IMammal
	public void secreteMilk() {
		this.nurse();
	}
}
