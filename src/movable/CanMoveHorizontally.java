package movable;

public interface CanMoveHorizontally extends Movable{

	void increaseHorizonalSpeed(double by);
	void turnBy(double radians);
	
}
