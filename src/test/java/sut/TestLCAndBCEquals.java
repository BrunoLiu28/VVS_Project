package sut;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TestLCAndBCEquals {
	
	//Line Coverage: 292
	//Branch Coverage: B292
//	@Test
//	public void testSameObject() {
//		List<Integer> list = Arrays.asList();  
//		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 4);
//		assertTrue(tree.equals(tree));
//		
//	}
//	
//	//Line Coverage: 292, 293
//	//Branch Coverage: !B292, B293
//	@Test
//	public void testDifferentInstances() {
//		List<Integer> list = Arrays.asList();  
//		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 4);
//		assertFalse(tree.equals(list));
//		
//	}
//	
//	//Line Coverage: 292, 293, 294, 300, 303, 304, 305, 307, 308, 311, 312
//	//Branch Coverage: !B292, !B293, B294, !B300, !B303(1), !B303(2),
//	//	!B307(1), !B307(2), B307(1), B307(2) !B308, B311(1), B311(2)
//	@Test
//	public void test2() {
//		List<Integer> list = Arrays.asList(1);  
//		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 4);
//		List<Integer> list2 = Arrays.asList(1);  
//		ArrayNTree<Integer> tree2 = new ArrayNTree<>(list2, 4);
//		assertTrue(tree.equals(tree2));
//	}
	
	//Line Coverage: 292, 293, 294
	//Branch Coverage: !B292, !B293, 
	@Test
	public void test4() {
		List<Integer> list = Arrays.asList(1,2);
		List<Integer> list2 = Arrays.asList(1,2);
		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 4);
		ArrayNTree<Integer> tree2 = new ArrayNTree<>(list2, 4);
		assertTrue(tree.equals(tree2));
	}
	
	//Line Coverage: 292, 293, 294
	//Branch Coverage: !B292, !B293, 
//	@Test
//	public void test3() {
//		List<Integer> list = Arrays.asList(1,2);  
//		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 4);
//		List<Integer> list2 = Arrays.asList(1);  
//		ArrayNTree<Integer> tree2 = new ArrayNTree<>(list2, 4);
//		assertFalse(tree.equals(tree2));
//	}
	
}