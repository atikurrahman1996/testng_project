package GroupingTest;

import org.testng.annotations.Test;

public class GroupTest {
	
	@Test(groups = { "sanity" })
	void test1() {
		System.out.println("This is Test1");
	}

	@Test(groups = { "sanity" })
	void test2() {
		System.out.println("This is Test2");
	}

	@Test(groups = { "regression" })
	void test3() {
		System.out.println("This is Test3");
	}

	@Test(groups = { "regression" })
	void test4() {
		System.out.println("This is Test4");
	}
	
	
	@Test(groups = { "smoke" })
	void test5() {
		System.out.println("This is Test5");
	}
	
	@Test(groups = { "smoke" })
	void test6() {
		System.out.println("This is Test6");
	}
	
	
	@Test(groups = { "sanity", "smoke" })
	void test7() {
		System.out.println("This is Test7");
	}
	
	

	@Test(groups = { "sanity", "regression" })
	void test8() {
		System.out.println("This is Test8");
	}
	
	

	@Test(groups = {"functional"})
	void test9() {
		System.out.println("This is Test8");
	}
	

}
