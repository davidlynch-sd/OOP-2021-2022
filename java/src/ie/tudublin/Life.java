package ie.tudublin;

import processing.core.PApplet;

public class Life extends PApplet {


	LifeBoard board;
	public void settings() {
		size(500, 500);
	}

	public void setup() {
		colorMode(HSB);
		board.randomise();

	}

	
	public void draw() {
		board.render();
	}
}
