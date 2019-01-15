package uebung11;

public class EigeneCheckedException extends Exception {

	public EigeneCheckedException() {
		super("Ich bin eine Exception");
	}
	
	public EigeneCheckedException(String fehlermeldung) {
		super(fehlermeldung);
	}
	
}
