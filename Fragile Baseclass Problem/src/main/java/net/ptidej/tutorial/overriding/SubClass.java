package net.ptidej.tutorial.overriding;

import java.util.Date;

public class SubClass extends SuperClass {

	private final Date date;

	public SubClass() {
		this.date = new Date();
	}

	@Override
	public void overrideMe() {
		System.out.println(this.date.toString());
	}

}
