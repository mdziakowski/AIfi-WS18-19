package vl.objectHierarchiesAbc;

class Child extends AbstractAgent implements HasSchool {
	private String school;

	Child( String name ){
		super(name) ;
	}
	@Override
	public void move() {
		System.out.println("calling child move method") ;
	}
	@Override
	public String getSchool() {
		return school ;
	}
	void setSchool( String str ) {
		this.school = str ;
	}
}
