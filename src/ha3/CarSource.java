package ha3;

import java.awt.Color;
import gridworld.framework.actor.Actor;
import gridworld.framework.grid.Grid;
import gridworld.framework.grid.Location;

public class CarSource extends Actor {

	float probability;
	int row;

	CarSource(float prob, int row) {

		this.setColor(Color.BLACK);
		this.probability = prob;
		this.row = row;

	}

	public void act() {

		if (Math.random() <= this.probability) {

			spornNewCar();

		}

	}

	public void spornNewCar() {

		Grid<Actor> gr = getGrid();

		if (gr == null) {

			return;

		}

		Location loc = new Location(this.row, 1);
		Location locOld = getLocation();

		if (gr.isValid(loc)) {

			moveTo(loc);

		} else {

			removeSelfFromGrid();

		}

		CarSource source = new CarSource(this.probability, this.row);
		source.setDirection(90);
		source.putSelfInGrid(gr, locOld);
		Car newCar = new Car(this.row);
		newCar.setDirection(90);
		newCar.putSelfInGrid(gr, loc);

	}

}
