package uebung6.transportsimulator;

public class TransportSimulator {
	
	Movable movable;

	TransportSimulator(Movable movable){
		this.movable = movable;
	}

	public static void main(String[] args) {
		TransportSimulator elevator1 = new TransportSimulator (new Elevator("Elevator 1", 0));
		TransportSimulator ship1 = new TransportSimulator(new Ship("Ship 1", 0, 0));
		TransportSimulator helicopter1 = new TransportSimulator (new Helicopter("Helicopter 1", 0,0,0));
		
		//elevator1.simulate(12);
		//ship1.simulate(12);
		//helicopter1.simulate(1);
	

	}
	
	private void increaseSpeedByRandom() {
		if ( movable instanceof CanMoveHorizontally) {
			//CanMoveHorizontally horizMovingM = (CanMoveHorizontally) movable;
			//horizMovingM.increaseHorizontalSpeed(Math.random()*100);
			((CanMoveHorizontally) movable).increaseHorizontalSpeed(Math.random()*100);
		}
		
		if ( movable instanceof CanMoveVertically) {
			//CanMoveVertically verticMovingM = (CanMoveVertically) movable;
			//verticMovingM.increaseVerticalSpeed(Math.random()*10-5);
			((CanMoveVertically) movable).increaseVerticalSpeed(Math.random()*10-5);
			
		}
	}
	
	private void simulate (int steps) {
		for (int ii = 1 ; ii <= steps ; ii++ ) {
			this.increaseSpeedByRandom();
			if (movable instanceof CanMoveHorizontally && (Math.random() <= 0.25)) {
				CanMoveHorizontally horizMovingM = (CanMoveHorizontally) movable;
				horizMovingM.turnBy(Math.random());
			}
			movable.move();
			System.out.println(movable.toString());
			
		}
		
	}

}
