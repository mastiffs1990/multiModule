package prj.com.it;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MoltiplicatoreTest {

	@BeforeClass
	public static void beforeClass()
	{
		System.out.println("Before class");
	}
	
	@Before
	public void before()
	{
		System.out.println("Before");
	}
	
	@After
	public void after() {
		System.out.println("After");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After class");
	}
	
	@Test
	public void testMultiply() {
		Moltiplicatore m = new Moltiplicatore ();
		assertEquals("10 x 1 = 10", 10, m.multiply(10, 1));
	}
	
	@Test
	public void testMultiply2() {
		Moltiplicatore m = new Moltiplicatore ();
		assertEquals("10 x 2 = 20", 20, m.multiply(10, 2));
	}
	
}
