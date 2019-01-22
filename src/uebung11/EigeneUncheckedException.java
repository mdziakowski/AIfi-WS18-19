package uebung11;

public class EigeneUncheckedException extends RuntimeException{
	
	public EigeneUncheckedException() {
		super("Ich bin eine Exception");
	}
	
	public EigeneUncheckedException(String fehlermeldung) {
		super(fehlermeldung);
	}

}
