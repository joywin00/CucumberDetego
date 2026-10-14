package org.DetePojo;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;

import org.helper.BaseClassProj;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DetegoAboutUs extends BaseClassProj{
	
	@FindBy (xpath="//button[text()=' Accept ']")
	private WebElement acc;
	
	@FindBy (xpath="(//a[text()='About Us'])[1]")
	private WebElement aboutUs;
	
	@FindBy(xpath="//div[@data-id='74f77ce']")
	private WebElement scroll;
	

	public WebElement getAcc() {
		return acc;
	}

	public WebElement getAboutUs() {
		Actions a= new Actions(getDriver());
		a.doubleClick(aboutUs).perform();
		return aboutUs;
	}

	public WebElement getScroll() {
		jsScrollUp(scroll);
		return scroll;
	}
	 			
	
//	JavascriptExecutor js=(JavascriptExecutor)driver;
//	js.executeScript("arguments[0].scrollIntoView(true)", e);
//	System.out.println(e.getText());
	
	//driver.quit();

	
}