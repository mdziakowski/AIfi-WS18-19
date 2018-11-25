package implementationsuebungen;

public class Main2 {
	
	static void aMethod( AgentI agent) {
		System.out.println("calling AgentI");
	}
	
	static void aMethod ( Adult person) {
		System.out.println("calling Adult");
		
	}

	public static void main(String[] args) {
		AgentI pers1 = new Adult();
		aMethod(pers1);
	}

}
