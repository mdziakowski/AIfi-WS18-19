package vl.objectHierarchiesAbc;

abstract class AbstractAgent implements AgentI{

	private final String id;

	AbstractAgent( String str ) {
		this.id = str ;
	}

	public String getId() {
		return id ;
	}
	@Override
	public void move() {
		System.out.println("calling abstractAgent move method") ;
	}

}
