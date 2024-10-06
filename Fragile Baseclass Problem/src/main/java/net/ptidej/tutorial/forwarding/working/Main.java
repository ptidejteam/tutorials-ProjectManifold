package net.ptidej.tutorial.forwarding.working;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		final InstrumentedHashSet<String> s = new InstrumentedHashSet<String>();

		s.addAll(Arrays.asList("Rick Deckard", "Roy Batty", "Pris Stratton", "Zhora Salome", "Leon Kowalski",
				"Rachael"));
		s.remove("Leon Kowalski");
		s.remove("Zhora Salome");
		s.remove("Pris Stratton");
		s.remove("Roy Batty");
		s.add("Tyrell");

		System.out.print("Was expected 7, got ");
		System.out.println(s.getAddCount());
	}
}
