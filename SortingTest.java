import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SortTest {
	private Sorting sort;
	@Before
	public void setUp() throws Exception {
		sort = new Sorting();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testInsertionSort() {
		int[] a = {0,2,1,5,6,3};
		int[] expected = {0,1,2,3,5,6};
		sort.insertionSort(a);
		assertArrayEquals(expected, a);
	}

	@Test
	public void testIsSorted() {
		int[] a = {0,1,2};
		assertEquals(true, sort.isSorted(a));
		int[] b = {2,1,0};
		assertEquals(false,sort.isSorted(b));
		
	}

	@Test
	public void testQuicksort() {
		int[] a = {0,2,1,5,6,3,22,11,24,64,253,24535,23,54};
		int[] expected = {0,1,2,3,5,6,11,22,23,24,54,64,253,24535};
		sort.quicksort(a);
		assertArrayEquals(expected, a);
		
	}

	@Test
	public void testSwapReferences() {
		Object[] a = {0,2};
		Object[] expected = {2,0};
		Sorting.swapReferences(a, 0, 1);
		assertArrayEquals(expected, a);
	}

	@Test
	public void testSwap() {
		int[] a = {0,2};
		int[] expected = {2,0};
		Sorting.swap(a, 0, 1);
		assertArrayEquals(expected, a);
	}

}