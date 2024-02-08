package tests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import util.Config;
import util.Constants;

public class sample extends AbstractTest{
	
	@Test
	public void cricbuzz() throws InterruptedException {		
		driver.get(Config.get(Constants.CRICBUZZ_URL));
		Assert.assertTrue(false);
		Thread.sleep(2000);
		
		System.out.println(Config.get(Constants.VARIABLE)+ driver.getTitle() +Thread.currentThread().getId());
	}
	
	@Test
	public void google() throws InterruptedException {		
		driver.get(Config.get(Constants.GOOGLE_URL));
		Thread.sleep(2000);
		System.out.println(Config.get(Constants.VARIABLE)+ driver.getTitle()+Thread.currentThread().getId());
	}
	
	@Test
	public void facebook() throws InterruptedException {		
		driver.get(Config.get(Constants.FACEBOOK_URL));
		Thread.sleep(2000);
		System.out.println(Config.get(Constants.VARIABLE)+ driver.getTitle()+Thread.currentThread().getId());
	}
	
	@Test
	public void instagram() throws InterruptedException {		
		driver.get(Config.get(Constants.INSTAGRAM_URL));
		Thread.sleep(2000);
		System.out.println(Config.get(Constants.VARIABLE)+ driver.getTitle()+Thread.currentThread().getId());
	}
	
	@Test
	public void twitter() throws InterruptedException {		
		driver.get(Config.get(Constants.TWITTER_URL));
		Thread.sleep(2000);
		System.out.println(Config.get(Constants.VARIABLE)+ driver.getTitle()+Thread.currentThread().getId());
	}
	
	@AfterTest
	public void tearDown() throws InterruptedException {
		driver.quit();
		Thread.sleep(2000);
	}

}
