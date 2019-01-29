package vl.objectHierarchiesAbc;

class Child extends AbstractAgent {
	Child( String name ){
		super(name) ;
	}
	@Override
	public void move() {
		System.out.println("calling child move method") ;
	}
}
