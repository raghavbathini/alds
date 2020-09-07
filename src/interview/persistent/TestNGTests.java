package interview.persistent;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGTests {
	
	
	@Test
	public static void Test() {
		Node head = NthNodeFromLast_LL.createLL();
		Assert.assertTrue(NthNodeFromLast_LL.nthnodefromend(head, 3) == 11, "test is failed");
	}


	

}
