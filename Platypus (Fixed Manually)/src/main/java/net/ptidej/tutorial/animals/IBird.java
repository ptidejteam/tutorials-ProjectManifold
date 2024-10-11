package net.ptidej.tutorial.animals;

import java.awt.Color;

public interface IBird extends IWarmBlooded {
	int layEgg();

	int getEggSize();

	Color getEggColour();
}
