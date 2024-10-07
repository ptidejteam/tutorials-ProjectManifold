package net.ptidej.tutorial.manifold;

public class Person implements IPerson {
	private final String name;

	public Person(final String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public String getTitle() {
		return "Person";
	}

	public String getTitledName() {
		return this.getTitle() + " " + this.getName();
	}
}
