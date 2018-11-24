package movable;

public class TransportSimulator {

	Movable movable;
	
	public TransportSimulator(Movable movable) {
		this.movable = movable;
	}
	
	private void increaseSpeedByRandom() {
		if (movable instanceof CanMoveHorizontally) {
			CanMoveHorizontally horizMovingM = (CanMoveHorizontally) movable;
			horizMovingM.increaseHorizonalSpeed(Math.random()*100);
		}
		if (movable instanceof CanMoveVertically) {
			CanMoveVertically verticMovingM = (CanMoveVertically) movable;
			verticMovingM.increaseVerticalSpeed(Math.random()*10-5);
		}
	}
	
	private void simulate(int steps) {
		for (int i = 1; i <= steps; i++) {
			increaseSpeedByRandom();
			if (movable instanceof CanMoveHorizontally && Math.random() < 0.25) {
				CanMoveHorizontally horizMovingM = (CanMoveHorizontally) movable;
				horizMovingM.turnBy(Math.random());
			}
			movable.move();
			if (i%10 == 0) {
				System.out.println("\nTransport Simulation, Step " + i);
				System.out.println(movable.toString());
			}
		}
	}
	
	public static void main(String[] args) {
		
		TransportSimulator TS1 = new TransportSimulator(new Elevator("Fahrstuhl", 0));
		TS1.simulate(100);
		TransportSimulator TS2 = new TransportSimulator(new Ship("Schiff", 0, 0));
		TS2.simulate(100);
		TransportSimulator TS3 = new TransportSimulator(new Helicopter("Heli", 0, 0, 0));
		TS3.simulate(100);
	}

}
