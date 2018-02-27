package prj.com.it;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoltiplicatoreConEclipseTest {

	@Test
	public void testMultiply() {
		Moltiplicatore m = new Moltiplicatore ();
		assertEquals("10 x 1 = 10", 10, m.multiply(10, 1));

	}

}
