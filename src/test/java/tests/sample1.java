package tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import util.Config;
import util.Constants;

public class sample1 extends AbstractTest {
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
