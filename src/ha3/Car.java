package ha3;

import java.awt.Color;
import gridworld.framework.actor.Actor;
import gridworld.framework.actor.Flower;
import gridworld.framework.grid.Grid;
import gridworld.framework.grid.Location;

public class Car extends Actor {

	int speed;
	int colCar;
	int abstand;

	Car(int colCar) {

		this.setColor(Color.BLACK);
		this.speed = 5;
		// this.speed = randInt(4, 6);
		this.colCar = colCar;

	}

	public void act() {

		for (int i = 0; i < speed; i++) {

			move();

		}

		beschleunigen();
		troedeln();

	}

	public void beschleunigen() {

		if (this.speed < 5) {

			speed++;

		}

	}

	public void troedeln() {

		if (Math.random() <= 0.3) {

			speed--;

		}

	}

	public void move() {

		Grid<Actor> gr = getGrid();

		if (gr == null) {

			return;

		}

		Location loc = getLocation();
		Location next = loc.getAdjacentLocation(getDirection());

		if (gr.isValid(next)) {

			moveTo(next);

		}

	}

	public boolean canMove() {

		Grid<Actor> gr = getGrid();

		if (gr == null) {

			return false;

		}
		Location loc = getLocation();
		Location next = loc.getAdjacentLocation(getDirection());

		if (!gr.isValid(next)) {

			return false;

		}

		Actor neighbor = gr.get(next);
		return (neighbor == null) || (neighbor instanceof Flower);

	}

}
