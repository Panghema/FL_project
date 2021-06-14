package fl.coverageunit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
//import fl.tcas.*;
public class JunitTest2 {
	demo3 s = new demo3();
	
	@Test
	public void t0() {
		assertEquals(s.mid(1,2,3),2);
	}
	@Test
	public void t1() {
		assertEquals(s.mid(3,2,1),2);
	}
	@Test
	public void t2() {
		assertEquals(s.mid(2,3,1),2);
	}
	@Test
	public void t3() {
		assertEquals(s.mid(1,3,2),2);
	}
	@Test
	public void t4() {
		assertEquals(s.mid(1,1,2),1);
	}
	@Test
	public void t5() {
		assertEquals(s.mid(1,2,1),1);
	}
	@Test
	public void t6() {
		assertEquals(s.mid(2,1,1),1);
	}
	@Test
	public void t7() {
		assertEquals(s.mid(3,2,4),3);
	}
	@Test
	public void t8() {
		assertEquals(s.mid(2,1,3),2);
	}
	@Test
	public void t9() {
		assertEquals(s.mid(2,1,5),2);
	}
	@Test
	public void t10() {
		assertEquals(s.mid(4,2,6),4);
	}
	@Test
	public void t11() {
		assertEquals(s.mid(5,3,1),3);
	}
	@Test
	public void t12() {
		assertEquals(s.mid(6,3,2),3);
	}
	@Test
	public void t13() {
		assertEquals(s.mid(5,2,1),2);
	}
	
}
//s.mid(1,2,3),2
//s.mid(3,2,1),2
//s.mid(2,3,1),2
//s.mid(1,3,2),2
//s.mid(1,1,2),1
//s.mid(1,2,1),1
//s.mid(2,1,1),1
//s.mid(2,1,3),2