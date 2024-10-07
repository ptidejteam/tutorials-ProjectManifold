package net.ptidej.tutorial.manifold;

import manifold.ext.delegation.rt.api.link;

public class Student implements IStudent {
	@link
	IPerson person;

	private final String major;

	public Student(final IPerson person, final String major) {
		this.person = person;
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
	// return null;
	// }

	// No need to implement this method, it's forwarded on "IPerson person"
	// @Override
	// public String getTitledName() {
	// return XXX;
	// }
}