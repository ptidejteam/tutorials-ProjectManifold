package net.ptidej.tutorial.animals;

import java.util.Iterator;
import java.util.List;

import net.ptidej.tutorial.animals.behaviour.IAggregationMechanism;
import net.ptidej.tutorial.animals.behaviour.IFightMechanism;
import net.ptidej.tutorial.animals.behaviour.INursingMechanism;
import net.ptidej.tutorial.animals.behaviour.IReproductionMechanism;

public interface IVertebrate {
	// General
	String getKingdom();

	String getPhylum();

	String getSubphylum();

	String getClazs();

	String getSubclass();
	
	String getTaxonomicClassification();

	// Fighting
	void fight();

	void addFightingMechanism(final IFightMechanism aFightMechanism);

	void addFightingMechanisms(final List<IFightMechanism> someFightMechanisms);
	
	int getNumberOfFightMechanisms();

	Iterator<IFightMechanism> getFightingMechanisms();

	// Nursing
	void nurse();

	void addNursingMechanism(final INursingMechanism aNursingMechanism);

	void addNursingMechanisms(final List<INursingMechanism> someNursingMechanisms);

	Iterator<INursingMechanism> getNursingMechanisms();

	// Reproduction
	void reproduce();

	void addReproductionMechanism(final IReproductionMechanism aReproductionMechanism);

	void addReproductionMechanisms(final List<IReproductionMechanism> someReproductionMechanisms);

	Iterator<IReproductionMechanism> getReproductionMechanisms();

	// Aggregation
	void aggregate();

	void addAggregationMechanism(final IAggregationMechanism anAggregationMechanism);

	void addAggregationMechanisms(final List<IAggregationMechanism> someAggregationMechanisms);

	Iterator<IAggregationMechanism> getAggregationMechanisms();
}
