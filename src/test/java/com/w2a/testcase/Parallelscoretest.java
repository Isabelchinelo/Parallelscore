package com.w2a.testcase;



import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class Parallelscoretest extends TestBase{
	
	@Test
	public void navigation () throws InterruptedException {
		
		      

	    //Close Popup
		 driver.findElement(By.className(OR.getProperty("popup_className"))).click();
		 log.debug("Close Popup Click");
		 
		//Navigate to Career Page
		 driver.findElement(By.xpath(OR.getProperty("Careermodule_XPATH"))).click();
		 log.debug("Click Career Module");
		
		//Select Category
		driver.findElement(By.cssSelector(OR.getProperty("Category_cssSelector"))).click();
		driver.findElement(By.xpath(OR.getProperty("Fulltime_XPATH"))).click();
		log.debug("Select Full Time");
	
		//Select Location
		driver.findElement(By.xpath(OR.getProperty("Location_XPATH"))).click();
		driver.findElement(By.xpath(OR.getProperty("Lagos_XPATH"))).click();
		log.debug("Select Lagos");
		
		//Search
		driver.findElement(By.xpath(OR.getProperty("Searchbutton_XPATH"))).click();
		log.debug("Click Search button");
		
        //Validate Search
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("Keywords_XPATH"))), "keywords");
		log.debug("Assert Page");
}

	}
