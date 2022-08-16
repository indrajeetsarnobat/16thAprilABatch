package AssertPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertsPractice {  //In HardAssert We always use Static methods & in SoftAssert(Verify) we use non static method

	String str1="Hi";
	String str2="hi";
	
	//1.assertEquals 
//	@Test
//	public void Test1() {
//		Assert.assertEquals(str1,str2);         //Expected = Actual ==>Test Case Pass otherwise TC will Fail
//	}
	
	//2.assertNotEquals 
//	@Test
//	public void Test2() {
//		Assert.assertNotEquals(str1,str2);      //Expected != Actual ==>Test Case Pass otherwise TC will Fail
//	}
	
	//3.assertNull
//	@Test
//	public void Test3() {
//		Assert.assertNull(str1);                //Expected = null ==>check Test Case for null value ==>If present then TC Pass otherwise TC will Fail
//	}
	
	//4.assertNotNull
//	@Test
//	public void Test4() {
//		Assert.assertNotNull(str1);
//	}
	
	//5.AssertFail
	@Test
	public void Test5() {
		System.out.println("Assert Fail is used to fail the TC Purposefully");
		Assert.fail();                //Classname.Methodname ==> Assert is class & Fail is methodname 
	}	
	
	
}
