package uebung3;

import org.junit.Assert;
import org.junit.Test;

public class TestFarm {
	
	private final Cow cow1 = new Cow("Berta");
	private final Cow cow2 = new Cow("Hilde");
	private final Cow cow3 = new Cow("Miltank");
	
	@Test
	public void testFarm() {
		Assert.assertEquals(3, Cow.getCowCount());
	}
	
}