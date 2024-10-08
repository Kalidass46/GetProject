package org.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Rerun {

	@Test(retryAnalyzer = RerunClass.class)
	private void tc1() {
		System.out.println("tc1");
		Assert.assertTrue(true);
		System.out.println("test1");
	}
	
	@Test(retryAnalyzer = RerunClass.class)
	private void tc3() {
		System.out.println("tc3");
		Assert.assertTrue(false);
		System.out.println("Test3");
	}
	
	@Test(retryAnalyzer = RerunClass.class)
	private void tc2() {
		System.out.println("tc2");
		Assert.assertTrue(false);
		System.out.println("test2");
		
	}
}