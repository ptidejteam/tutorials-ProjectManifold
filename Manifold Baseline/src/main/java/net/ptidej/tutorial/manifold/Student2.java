package net.ptidej.tutorial.manifold;

public class Student2 implements IStudent {
	private final IPerson person;

	private final String major;

	public Student2(final IPerson person, final String major) {
		this.person = person;
		this.major = major;
	}

	public String getTitle() {
		return "Student";
	}

	public String getMajor() {
		return this.major;
	}

	// Must implement this method, even tough it's forwarded on "IPerson person"
	@Override
	public String getName() {
		return this.person.getName();
	}

	// Must implement this method, even though it's forwarded on "IPerson person"
	@Override
	public String getTitledName() {
		// Copied/Pasted from net.ptidej.tutorial.manifold.Person.getTitledName()
		return this.getTitle() + " " + this.getName();
	}
}