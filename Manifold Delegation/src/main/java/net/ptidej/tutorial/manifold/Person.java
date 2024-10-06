package net.ptidej.tutorial.manifold;

import manifold.ext.delegation.rt.api.part;

@part
public class Person implements IPerson {
	private final String name;

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String getTitle() {
		return "Person";
	}

	public String getTitledName() {
		return getTitle() + " " + getName();
	}
}
