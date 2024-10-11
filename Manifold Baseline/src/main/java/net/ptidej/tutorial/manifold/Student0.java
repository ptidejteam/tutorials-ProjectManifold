package net.ptidej.tutorial.manifold;

public class Student0 extends Person implements IStudent {
	private final String major;

	public Student0(final String name, final String major) {
		super(name);
		this.major = major;
	}

	public String getTitle() {
		return "Student";
	}

	public String getMajor() {
		return this.major;
	}

	// No need to implement this method, it's forwarded on "IPerson person"
	// @Override
	// public String getName() {
	// return super.getName();
	// }

	// No need to implement this method, it's forwarded on "IPerson person"
	// @Override
	// public String getTitledName() {
	// return super.getTitledName();
	// }
}