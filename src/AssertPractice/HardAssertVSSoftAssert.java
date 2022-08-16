package AssertPractice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssertVSSoftAssert {

	//HardAssert
//	@Test
//	public void demo() {
//		String str1="Hello";
//		Assert.assertEquals(str1,"Hi");       //Validation will fail ==> terminate Program
//	
//		String str2="Hello";
//		Assert.assertEquals(str1,"Hello");    //Validation will not get chance to execute
//	}
	
	//SoftAssert
//	@Test
//	public void demo1() {
//		
//		SoftAssert soft=new SoftAssert();     //Object Creation ==> Non Static Methods
//		
//		String str1="Hello";
//		soft.assertEquals(str1,"Hi");         //Validation will fail ==> not terminate the Program ==> move to next method
//	    //Objectname.Methodname
//		
//		String str2="Hello";
//		soft.assertEquals(str1,"Hello");	  //Will get Chance to validate
//		
//	}	
	
//	@Test
//	public void demo2() {
//		
//		SoftAssert soft=new SoftAssert();     //Object Creation ==> Non Static Methods
//		
//		String str1="Hello";
//		soft.assertEquals(str1,"Hi");         //Validation will fail ==> not terminate the Program ==> move to next method
//	    //Objectname.Methodname
//		System.out.println("Hello");
//		
//		String str2="Hi";
//		soft.assertEquals(str2,"Hi");	    //Will get Chance to validate
//		System.out.println("Hi");
//		soft.assertAll();                 //It Consider all SoftAsserts used
//		
//	}	
	
	
	//Prorams From Daily Notes
	
//	@Test  // hard assert.             
//	public void sample1() {    //Sample1 Will Fail
//		
//		String str1 = "Hello";
//		Assert.assertEquals(str1, "Hi");      // fail
//		System.out.println(str1);
//		
//		String str2 = "Hi";
//		Assert.assertEquals(str2, "Hi");      // pass
//		System.out.println(str2);
//	}
//	
//	@Test
//	public void sample2() {    //Sample2 Will Pass
//		System.out.println("Automation");
//	}
	
//	@Test
//	public void sample3() {
//		SoftAssert soft = new SoftAssert();
//		
//		String str1 = "Hello";
//		soft.assertEquals(str1, "Hi");        // fail
//		System.out.println(str1);
//		
//		String str2 = "Hi";
//		soft.assertEquals(str2, "Hi");       // pass
//		System.out.println(str2);
//		soft.assertAll();
//	}
//	
//	
//	@Test
//	public void sample4() {
//		System.out.println("Automation");
//	}
	
//	@Test
//	public void sample3() {
//		SoftAssert soft = new SoftAssert();
//		
//		String str1 = "Hello";
//		soft.assertEquals(str1, "Hi");        // fail
//		System.out.println(str1);
//		
//		String str2 = "Hi";
//		soft.assertEquals(str2, "Hi");       // pass
//		System.out.println(str2);
//		soft.assertAll();
//	}
//	
//	
//	@Test
//	public void sample4() {
//		System.out.println("Automation");
//	}
	
	@Test  // hard assert.
	public void sample1() {
		
		String str1 = "Hello";
		Assert.assertEquals(str1, "Hi");      // fail
		System.out.println(str1);
		
		String str2 = "Hi";
		Assert.assertEquals(str2, "Hi");      // pass
		System.out.println(str2);
	}
	
	@Test
	public void sample2() {
		System.out.println("Automation");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
