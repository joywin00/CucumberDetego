package org.DetePojo;

import java.io.File;
import java.io.IOException;
import java.sql.DriverAction;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.helper.BaseClassProj;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DetegoMbrSrc extends BaseClassProj{
	

	public DetegoMbrSrc() {
		PageFactory.initElements(getDriver(), this);
	}
		
  @FindBy(xpath="//button[text()=' Accept ']")
  private WebElement accept;
  
  @FindBy(xpath="//p[contains(text(),'(PHI) is displayed.')]")
  private WebElement disp;
	
	
	@FindBy(xpath="//span[text()='Provider Portal']")
	private WebElement prov;
	
	@FindBy(xpath="//a[text()='Check Eligibility']")
	private WebElement elig;
	
//	WebElement element2 = driver.findElement(By.xpath("//h1[text()='Eligibility Check']"));
//	System.out.println(element2.getText());
	
	@FindBy(xpath = "//input[@name='Member Id']")
	private WebElement mbrId;
	
	@FindBy(xpath = "//input[@id='input-8']")
	private WebElement mbrDob;
	
	@FindBy(xpath = "//button[text()='Submit']")
	private WebElement submit;
	
	@FindBy(xpath = "//button[text()='Go Back']")
	private WebElement goBack;

	public WebElement getAccept() {
		accept.click();
		return accept;
	}

	public WebElement getDisp() {
		System.out.println(disp.getText());
		return disp;
	}

	public WebElement getProv() {
		prov.click();
		return prov;
	}

	public WebElement getElig() {
		elig.click();
		return elig;
	}

	public WebElement getMbrId(String val) {
		passTheValue(mbrId, val);
		return mbrId;
	}

	public WebElement getMbrDob(String dob) {
		passTheValue(mbrDob, dob);
		return mbrDob;
	}

	public WebElement getSubmit() {
		submit.click();
		return submit;
	}

	public WebElement getGoBack() {
		goBack.click();
		return goBack;
	}
	
	
//	TakesScreenshot ts= (TakesScreenshot)driver;
//	File temp = ts.getScreenshotAs(OutputType.FILE);
//	
//	File f= new File("D:\\Ecli pro\\SeleniumProject\\Snap\\detego.png");
//	FileUtils.copyFile(temp, f);
//	
//	driver.quit();
	


		
		
		
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

