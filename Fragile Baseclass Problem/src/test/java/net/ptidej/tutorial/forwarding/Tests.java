package net.ptidej.tutorial.forwarding;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;

class Tests {

	@org.junit.jupiter.api.Test
	void test1() {
		final CountingSet<String> s = new net.ptidej.tutorial.forwarding.broken.CountingHashSet<String>();

		s.addAll(Arrays.asList("Rick Deckard", "Roy Batty", "Pris Stratton", "Zhora Salome", "Leon Kowalski",
				"Rachael"));
		s.remove("Leon Kowalski");
		s.remove("Zhora Salome");
		s.remove("Pris Stratton");
		s.remove("Roy Batty");
		s.add("Tyrell");

		System.out.println(
				"\nWARNING: All the tests should pass, but net.ptidej.tutorial.forwarding.Tests.test1() actually shows the erroneous behaviour!\n");
		Assertions.assertEquals(13, s.getAddCount(),
				"Received 13 but expected 7, because the method InstrumentedHashSet.add() is called by InstrumentedHashSet.addAll()");
	}

	@org.junit.jupiter.api.Test
	void test2() {
		final CountingSet<String> s = new net.ptidej.tutorial.forwarding.working.CountingHashSet<String>();

		s.addAll(Arrays.asList("Rick Deckard", "Roy Batty", "Pris Stratton", "Zhora Salome", "Leon Kowalski",
				"Rachael"));
		s.remove("Leon Kowalski");
		s.remove("Zhora Salome");
		s.remove("Pris Stratton");
		s.remove("Roy Batty");
		s.add("Tyrell");

		Assertions.assertEquals(7, s.getAddCount(),
				"Received 7 as expected, because the method InstrumentedHashSet.add() is NOT called by HashSet.addAll()");
	}

	@org.junit.jupiter.api.Test
	void test3() {
		final CountingSet<String> s = new net.ptidej.tutorial.forwarding.working.manifold.CountingHashSet<String>();

		s.addAll(Arrays.asList("Rick Deckard", "Roy Batty", "Pris Stratton", "Zhora Salome", "Leon Kowalski",
				"Rachael"));
		s.remove("Leon Kowalski");
		s.remove("Zhora Salome");
		s.remove("Pris Stratton");
		s.remove("Roy Batty");
		s.add("Tyrell");

		Assertions.assertEquals(7, s.getAddCount(),
				"Received 7 as expected, because the method InstrumentedHashSet.add() is NOT called by HashSet.addAll()");
	}

}
