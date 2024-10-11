package net.ptidej.tutorial.overriding;

public class SafeSuperClass {

	public SafeSuperClass() {
		this.cannotOverrideMe();
	}

	public final void cannotOverrideMe() {
		// Some behaviour...
	}

}
