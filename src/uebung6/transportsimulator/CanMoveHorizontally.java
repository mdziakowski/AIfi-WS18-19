package uebung6.transportsimulator;

public interface CanMoveHorizontally extends Movable{
	void increaseHorizontalSpeed(double by);
	void turnBy (double radians);

}
