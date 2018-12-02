package eigeneUebung6;

import java.util.Random;
import java.util.stream.DoubleStream;

class Main {
	
	public static void main(String[] args) {
		Elevator el = new Elevator("Bruno", 12);
		
		el.increaseVerticalSpeed(3.0);
		el.move();
		System.out.println(el);
		
		Ship sh = new Ship("Klara", 5.8, 7.9);
		sh.turnBy(2.4);
		sh.incraeseHorizontalSpeed(4.2);
		sh.move();
		System.out.println(sh);
		
		Helicopter hel = new Helicopter("Helena", 5.9, 7.9, 4.5);
		hel.incraeseHorizontalSpeed(3.3);
		hel.turnBy(2.14);
		hel.increaseVerticalSpeed(-5.0);
		hel.move();
		System.out.println(hel);
	}

}
