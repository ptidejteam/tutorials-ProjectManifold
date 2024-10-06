package net.ptidej.tutorial.animals.impl;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import net.ptidej.tutorial.animals.IVertebrate;
import net.ptidej.tutorial.animals.behaviour.IAggregationMechanism;
import net.ptidej.tutorial.animals.behaviour.IFightMechanism;
import net.ptidej.tutorial.animals.behaviour.INursingMechanism;
import net.ptidej.tutorial.animals.behaviour.IReproductionMechanism;

public abstract class AbstractVertebrate implements IVertebrate {
	private IAggregationMechanism[] aggregationMechanisms = new IAggregationMechanism[10];
	private int numberOfAggreationMechanisms = 0;
	private IFightMechanism[] figthMechanisms = new IFightMechanism[10];
	private int numberOfFightMechanisms = 0;
	private INursingMechanism[] nursingMechanisms = new INursingMechanism[10];
	private int numberOfNursingMechanisms = 0;
	private IReproductionMechanism[] reproductionMechanisms = new IReproductionMechanism[10];
	private int numberOfReproductionMechanisms = 0;

	public AbstractVertebrate(final IAggregationMechanism anAggregationMechanism, final IFightMechanism aFigthMechanism,
			final INursingMechanism aNursingMechanism, final IReproductionMechanism aReproductionMechanism) {

		this.addAggregationMechanism(anAggregationMechanism);
		this.addFightingMechanism(aFigthMechanism);
		this.addNursingMechanism(aNursingMechanism);
		this.addReproductionMechanism(aReproductionMechanism);
	}

	@Override
	public void addAggregationMechanism(final IAggregationMechanism anAggregationMechanism) {
		if (this.numberOfAggreationMechanisms == this.aggregationMechanisms.length) {
			this.aggregationMechanisms = Arrays.copyOf(this.aggregationMechanisms,
					this.numberOfAggreationMechanisms * 2);
		}
		this.aggregationMechanisms[this.numberOfAggreationMechanisms] = anAggregationMechanism;
		this.numberOfAggreationMechanisms++;
	}

	@Override
	public void addAggregationMechanisms(final List<IAggregationMechanism> someAggregationMechanisms) {
		for (final IAggregationMechanism theAggregationMechanism : someAggregationMechanisms) {
			this.addAggregationMechanism(theAggregationMechanism);
		}
	}

	@Override
	public void addFightingMechanism(final IFightMechanism aFightMechanism) {
		if (this.numberOfFightMechanisms == this.figthMechanisms.length) {
			this.figthMechanisms = Arrays.copyOf(this.figthMechanisms, this.numberOfFightMechanisms * 2);
		}
		this.figthMechanisms[this.numberOfFightMechanisms] = aFightMechanism;
		this.numberOfFightMechanisms++;
	}

	@Override
	public void addFightingMechanisms(final List<IFightMechanism> someFightMechanisms) {
		for (final IFightMechanism theFightMechanism : someFightMechanisms) {
			this.addFightingMechanism(theFightMechanism);
		}
	}

	@Override
	public void addNursingMechanism(final INursingMechanism aNursingMechanism) {
		if (this.numberOfNursingMechanisms == this.nursingMechanisms.length) {
			this.nursingMechanisms = Arrays.copyOf(this.nursingMechanisms, this.numberOfNursingMechanisms * 2);
		}
		this.nursingMechanisms[this.numberOfNursingMechanisms] = aNursingMechanism;
		this.numberOfNursingMechanisms++;
	}

	@Override
	public void addNursingMechanisms(final List<INursingMechanism> someNursingMechanisms) {
		for (final INursingMechanism theNursingMechanism : someNursingMechanisms) {
			this.addNursingMechanism(theNursingMechanism);
		}
	}

	@Override
	public void addReproductionMechanism(final IReproductionMechanism aReproductionMechanism) {
		if (this.numberOfReproductionMechanisms == this.reproductionMechanisms.length) {
			this.reproductionMechanisms = Arrays.copyOf(this.reproductionMechanisms,
					this.numberOfReproductionMechanisms * 2);
		}
		this.reproductionMechanisms[this.numberOfReproductionMechanisms] = aReproductionMechanism;
		this.numberOfReproductionMechanisms++;
	}

	@Override
	public void addReproductionMechanisms(final List<IReproductionMechanism> someReproductionMechanisms) {
		for (final IReproductionMechanism theReproductionMechanism : someReproductionMechanisms) {
			this.addReproductionMechanism(theReproductionMechanism);
		}
	}

	@Override
	public void aggregate() {
		for (final IAggregationMechanism theAggregationMechanism : this.aggregationMechanisms) {
			theAggregationMechanism.aggregate();
		}
	}

	@Override
	public final void fight() {
		final Iterator<IFightMechanism> iterator = this.getFightingMechanisms();
		while (iterator.hasNext()) {
			final IFightMechanism figthMechanism = iterator.next();
			figthMechanism.fight();
		}
	}

	@Override
	public Iterator<IAggregationMechanism> getAggregationMechanisms() {
		return Arrays.stream(this.aggregationMechanisms, 0, this.numberOfAggreationMechanisms)
				.collect(Collectors.toList()).iterator();
	}

	@Override
	public Iterator<IFightMechanism> getFightingMechanisms() {
		return Arrays.stream(this.figthMechanisms, 0, this.numberOfFightMechanisms).collect(Collectors.toList())
				.iterator();
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
		return Arrays.stream(this.nursingMechanisms, 0, this.numberOfNursingMechanisms).collect(Collectors.toList())
				.iterator();
	}

	@Override
	public String getPhylum() {
		return "Chordata";
	}

	@Override
	public Iterator<IReproductionMechanism> getReproductionMechanisms() {
		return Arrays.stream(this.reproductionMechanisms, 0, this.numberOfReproductionMechanisms)
				.collect(Collectors.toList()).iterator();
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
		final Iterator<INursingMechanism> iterator = this.getNursingMechanisms();
		while (iterator.hasNext()) {
			final INursingMechanism nursingMechanism = iterator.next();
			nursingMechanism.nurse();
		}
	}

	@Override
	public final void reproduce() {
		final Iterator<IReproductionMechanism> iterator = this.getReproductionMechanisms();
		while (iterator.hasNext()) {
			final IReproductionMechanism reproductionMechanism = iterator.next();
			reproductionMechanism.reproduce();
		}
	}
}
