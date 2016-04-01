import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TriangleTest {
	private Triangle triangle;
	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}
	@Test
	public void testGetType() {
		triangle = new Triangle(2,2,2);
		assertEquals("Regular",triangle.getType(triangle));
		triangle = new Triangle(2,3,4);
		assertEquals("Scalene",triangle.getType(triangle));
		triangle = new Triangle(2,2,3);
		assertEquals("Isosceles",triangle.getType(triangle));
		triangle = new Triangle(0,0,0);
		assertEquals("Illegal",triangle.getType(triangle));
		triangle = new Triangle(1,4,500);
		assertEquals("Illegal",triangle.getType(triangle));
	}

	@Test
	public void testGetBorders() {
		triangle = new Triangle(2,2,2);
		long[] result = triangle.getBorders();
		long[] expected = {2,2,2};
		assertArrayEquals(expected, result);
	}

}