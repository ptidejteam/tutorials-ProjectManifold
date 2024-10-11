package net.ptidej.tutorial.animals.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import manifold.ext.delegation.rt.api.part;
import net.ptidej.tutorial.animals.IVertebrate;
import net.ptidej.tutorial.animals.behaviour.IAggregationMechanism;
import net.ptidej.tutorial.animals.behaviour.IFightMechanism;
import net.ptidej.tutorial.animals.behaviour.INursingMechanism;
import net.ptidej.tutorial.animals.behaviour.IReproductionMechanism;

@part
public abstract class AbstractVertebrate implements IVertebrate {
	private final List<IAggregationMechanism> aggregationMechanisms = new ArrayList<>();
	private final List<IFightMechanism> figthMechanisms = new ArrayList<>();
	private final List<INursingMechanism> nursingMechanisms = new ArrayList<>();
	private final List<IReproductionMechanism> reproductionMechanisms = new ArrayList<>();

	public AbstractVertebrate(final IAggregationMechanism anAggregationMechanism, final IFightMechanism aFigthMechanism,
			final INursingMechanism aNursingMechanism, final IReproductionMechanism aReproductionMechanism) {

		this.addAggregationMechanism(anAggregationMechanism);
		this.addFightingMechanism(aFigthMechanism);
		this.addNursingMechanism(aNursingMechanism);
		this.addReproductionMechanism(aReproductionMechanism);
	}

	@Override
	public void addAggregationMechanism(final IAggregationMechanism anAggregationMechanism) {
		this.aggregationMechanisms.add(anAggregationMechanism);
	}

	@Override
	public void addAggregationMechanisms(final List<IAggregationMechanism> someAggregationMechanisms) {
		this.aggregationMechanisms.addAll(someAggregationMechanisms);
	}

	@Override
	public void addFightingMechanism(final IFightMechanism aFightMechanism) {
		this.figthMechanisms.add(aFightMechanism);
	}

	@Override
	public void addFightingMechanisms(final List<IFightMechanism> someFightMechanisms) {
		this.figthMechanisms.addAll(someFightMechanisms);
	}

	@Override
	public void addNursingMechanism(final INursingMechanism aNursingMechanism) {
		this.nursingMechanisms.add(aNursingMechanism);
	}

	@Override
	public void addNursingMechanisms(final List<INursingMechanism> someNursingMechanisms) {
		this.nursingMechanisms.addAll(someNursingMechanisms);
	}

	@Override
	public void addReproductionMechanism(final IReproductionMechanism aReproductionMechanism) {
		this.reproductionMechanisms.add(aReproductionMechanism);
	}

	@Override
	public void addReproductionMechanisms(final List<IReproductionMechanism> someReproductionMechanisms) {
		this.reproductionMechanisms.addAll(someReproductionMechanisms);
	}

	@Override
	public void aggregate() {
		for (final IAggregationMechanism theAggregationMechanism : this.aggregationMechanisms) {
			theAggregationMechanism.aggregate();
		}
	}

	@Override
	public final void fight() {
		for (final IFightMechanism theFightingMechanism : this.figthMechanisms) {
			theFightingMechanism.fight();
		}
	}

	@Override
	public Iterator<IAggregationMechanism> getAggregationMechanisms() {
		return this.aggregationMechanisms.iterator();
	}

	@Override
	public Iterator<IFightMechanism> getFightingMechanisms() {
		return this.figthMechanisms.iterator();
	}

	@Override
	public String getKingdom() {
		return "Animalia";
	}

	@Override
	public int getNumberOfFightMechanisms() {
		return -1;
	}

	@Override
	public Iterator<INursingMechanism> getNursingMechanisms() {
		return this.nursingMechanisms.iterator();
	}

	@Override
	public String getPhylum() {
		return "Chordata";
	}

	@Override
	public Iterator<IReproductionMechanism> getReproductionMechanisms() {
		return this.reproductionMechanisms.iterator();
	}

	@Override
	public String getSubphylum() {
		return "Vertebrata";
	}

	@Override
	public String getTaxonomicClassification() {
		return this.getKingdom() + " → " + this.getPhylum() + " → " + this.getSubphylum() + " → " + this.getClazs()
				+ " → " + this.getSubclass();
	}

	@Override
	public final void nurse() {
		for (final INursingMechanism theNursingMechanism : this.nursingMechanisms) {
			theNursingMechanism.nurse();
		}
	}

	@Override
	public final void reproduce() {
		for (final IReproductionMechanism theReproductionMechanism : this.reproductionMechanisms) {
			theReproductionMechanism.reproduce();
		}
	}
}
