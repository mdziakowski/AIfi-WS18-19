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
		
		@SuppressWarnings("unused")
		Cow testcow1 = new Cow("Jannika");
		@SuppressWarnings("unused")
		Cow testcow2 = new Cow("Pier");
		@SuppressWarnings("unused")
		Cow testcow3 = new Cow("Tom");
		@SuppressWarnings("unused")
		Cow testcow4 = new Cow("Arnold");
				
		Assert.assertEquals("4",4,Cow.cowCounter);
	}

}
