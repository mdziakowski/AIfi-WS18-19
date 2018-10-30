package uebung3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCowCounter {

	@Before
	public void setUp(){
		
	}
	
	@Test
	public void testCowCounter() {
		
		Cow testcow1 = new Cow("Jannika");
		Cow testcow2 = new Cow("Pier");
		Cow testcow3 = new Cow("Tom");
		Cow testcow4 = new Cow("Arnold");
				
		Assert.assertEquals("4",4,Cow.cowCounter);
	}

}
