package net.ptidej.tutorial.manifold;

public class Student1 implements IStudent {
	private final IPerson person;

	private final String major;

	public Student1(final IPerson person, final String major) {
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
		return this.person.getTitledName();
	}
}