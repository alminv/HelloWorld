import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest {
	
	/**
	@Test
	public void test() {
		fail("Not yet implemented");
	}*/
	
	@Test
	public void testSum() {
		assertEquals(4, HelloWorld.sum());
	}
	
	@Test
	public void testSum2(){
		assertNotEquals(5, HelloWorld.sum());
	}

}
