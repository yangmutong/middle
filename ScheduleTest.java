import static org.junit.Assert.*;

import java.util.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ScheduleTest {
	private Schedule schedule = null;
	private List<Work> works1;
	private List<Work> works2;
	private List<Work> works3;
	@Before
	public void setUp() throws Exception {
		schedule = new Schedule();
		works1 = new ArrayList<Work>();
		works1.add(new Work("first",2,5));
		works1.add(new Work("second",2,5));
		
		works2 = new ArrayList<Work>();
		works2.add(new Work("first",2,5));
		works2.add(new Work("second",2,5));
		
		works3 = new ArrayList<Work>();
		works3.add(new Work("first",2,5));
		works3.add(new Work("second",2,3));
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFCFS() {
		Double[] expectedFCFS = {7.5,1.5};
		Double[] result = {0.0,0.0};
		List<Double> lst = new ArrayList<Double>();
		lst = schedule.FCFS(works1);
		result[0] = lst.get(0);
		result[1] = lst.get(1);	
		assertArrayEquals(expectedFCFS,result);
	}

	@Test
	public void testSJF() {
		Double[] expectedFCFS = {7.5,1.5};
		Double[] result = {0.0,0.0};
		List<Double> lst = new ArrayList<Double>();
		lst = schedule.SJF(works2);
		result[0] = lst.get(0);
		result[1] = lst.get(1);	
		assertArrayEquals(expectedFCFS,result);
		
	}

	@Test
	public void testSortByServiceTime() {
		Work[] expectedFCFS = {new Work("second",2,3),new Work("second",2,5)};
		Work[] result = null;
		List<Work> lst = new ArrayList<Work>();
		lst = Schedule.sortByServiceTime(works3);
		result[0] = lst.get(0);
		result[1] = lst.get(1);	
		assertArrayEquals(expectedFCFS,result);
	}

}