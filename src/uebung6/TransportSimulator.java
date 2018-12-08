package uebung6;

class TransportSimulator {
	
	Movable movable;
	
	TransportSimulator(Movable movable) {
		this.movable = movable;
	}
	
	void increaseSpeedByRandom() {
		if (movable instanceof CanMoveVertically) {
			CanMoveVertically moveVertical = (CanMoveVertically) movable;
			moveVertical.increaseVerticalSpeed(Math.random() * 10 - 5);
		}
		
		if (movable instanceof CanMoveHorizontally) {
			CanMoveHorizontally moveHorizontal = (CanMoveHorizontally) movable;
			moveHorizontal.increaseHorizontalSpeed(Math.random() * 100);
		}
	}
	
	void simulate(int steps) {
		for (int i=0; i<steps; ++i) {
			increaseSpeedByRandom();
			if (movable instanceof CanMoveHorizontally && Math.random() <= 0.25) {
				CanMoveHorizontally moveHorizontal = (CanMoveHorizontally) movable;
				moveHorizontal.turnBy(Math.random() * 4*Math.PI - 2*Math.PI);
			}
			movable.move();
			System.out.println(movable.toString());
		}
	}
	
	public static void main(String[] args) {
		TransportSimulator elevator = new TransportSimulator(new Elevator("Emma", 0));
		TransportSimulator ship = new TransportSimulator(new Ship("Sascha", 0,0));
		TransportSimulator helicopter = new TransportSimulator(new Helicopter("Hans", 0,0,100));
		
		elevator.simulate(10);
		ship.simulate(10);
		helicopter.simulate(10);
	}
}
