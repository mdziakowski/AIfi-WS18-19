package uebung6;

interface CanMoveHorizontally extends Movable {
	void increaseHorizontalSpeed(double by);
	void turnBy(double radians);
}
