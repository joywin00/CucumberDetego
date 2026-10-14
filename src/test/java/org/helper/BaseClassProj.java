package org.helper;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClassProj {

		private static ThreadLocal<WebDriver> tlDriver= new ThreadLocal<WebDriver>();
		public static Actions a;
		public static JavascriptExecutor js;
		//public static Select s;
		public static File f;
		static //public static String data;
		WebElement ref;
		
		public static WebDriver getDriver() {
			
			return tlDriver.get();
		}
		
		public static void setDriver(WebDriver driver) {
			
	   tlDriver.set(driver);
		}

		public static void openEdgeBrowser() { 
			
			WebDriver edgeDriver = new EdgeDriver();
			setDriver(edgeDriver);
			
	}
	    public static void openChromeBrowser() { 
			
	    	WebDriver chDriver = new ChromeDriver();
	    	setDriver(chDriver);
	}
	    public static void openFirefoxBrowser() { 
			
	    	WebDriver ffDriver = new FirefoxDriver();	
	    	setDriver(ffDriver);
	   }
		
		public static void getUrl(String url) {
			
		getDriver().get(url);
	}
		
		public static void maxWin () {
			
			getDriver().manage().window().maximize();
	}
		
		public static String getCurrUrl() {

	     String currentUrl = getDriver().getCurrentUrl();
	     System.out.println(currentUrl);
	     return currentUrl;
	}
		
		public static void getTitle() {
			
			getDriver().getTitle();
	}
		
		public static void quit() {
			
			getDriver().quit();	
	}
		
		public static void closeTab() {
			
			getDriver().close();	
	}
		
		public static void passTheValue(WebElement ref, String values) {
			
		ref.sendKeys(values);
	}
		
		
		public static void rightClk(WebElement ref) {
			
	    a.contextClick(ref).perform();		
		}
		
		public static void scroll(WebElement ref) {
			
	    a.scrollToElement(ref).perform();
		}
		
		public static void moveToEle(WebElement ref) {
			
				
	       a.moveToElement(ref).click().perform();
		}
		
		public static void copy() throws AWTException {
			
			Robot r = new Robot();
			
	   r.keyPress(KeyEvent.VK_CONTROL);
	   r.keyPress(KeyEvent.VK_C);
	   
	   r.keyRelease(KeyEvent.VK_CONTROL);
	   r.keyRelease(KeyEvent.VK_C);
		}
		
		public static void paste() throws AWTException {
			
			Robot r = new Robot();
			
	   r.keyPress(KeyEvent.VK_CONTROL);
	   r.keyPress(KeyEvent.VK_V);
			   
	   r.keyRelease(KeyEvent.VK_CONTROL);
	   r.keyRelease(KeyEvent.VK_V);
				}
		
		public static void enter() throws AWTException {
			
			Robot r = new Robot();	
			
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		}
		
		public static void esc() throws AWTException {
			
			Robot r = new Robot();	
			
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		}
		
	   public static void downArrow() throws AWTException {
			
			Robot r = new Robot();	
			
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		}
		
		public static void DragAndDrop(WebElement drag, WebElement drop) {

	    a.dragAndDrop(drag, drop).perform();

		}
		
		public static void getTheText(WebElement ref) {
			
	    ref.getText();
		}
		
		
		public static void impWait(int sec) {
		
			getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
	}
		
		
		public static void screenShot(String fileName) throws IOException {
			
	  TakesScreenshot ts= (TakesScreenshot)getDriver();
	  
	  File temp = ts.getScreenshotAs(OutputType.FILE);
	  
	   f = new File("D:\\Ecli pro\\MavenTeting\\target"+fileName+".png");
	  
	 FileUtils.copyFile(temp, f);
	  
		}
		
		public static void alertAccept() {
			
	    Alert alert = getDriver().switchTo().alert();
	    alert.accept();
		}
		
		public static void alertDismiss() {
			
		    Alert alert = getDriver().switchTo().alert();
		    alert.dismiss();
			}
		
		public static void Sleep(int ms) throws InterruptedException {
			
			Thread.sleep(ms);
		}
		
		public static void jsScrollUp(WebElement ref) {
			
	     js = (JavascriptExecutor)getDriver();
	    
	    js.executeScript("arguments[0].scrollIntoView(true)", ref);
	    
		}
		
		public static void jsScrollDown(WebElement ref) {
			
		     js = (JavascriptExecutor)getDriver();
		    
		    js.executeScript("arguments[0].scrollIntoView(false)", ref);
		    
		}
		
		public static void jsSetAttr(WebElement element, String value) {

	        js = (JavascriptExecutor) getDriver();

	        js.executeScript("arguments[0].setAttribute('value', arguments[1]);",element, value);	
		} 	
		
	    public static void jsGetOutput(WebElement ref) {
			
		     js = (JavascriptExecutor)getDriver();
		    
		    js.executeScript("return arguments[0].getAttribute('value')", ref);
		    
		}		
		
	    public static void jsClk(WebElement ref) {
			
		     js = (JavascriptExecutor)getDriver();
		    
		    js.executeScript("arguments[0].click()", ref);
		    
		}

	   public static void frame(int index) {
		   
		   getDriver().switchTo().frame(index);
	   }

	    public static void parFrm() {
		   
	    	getDriver().switchTo().parentFrame();
	   }

	    public static void defaultFrm() {
	 	   
	    	getDriver().switchTo().defaultContent();
	    }

	    public static void nextWindow() {
		
	    	String parent = getDriver().getWindowHandle();
			Set<String> all = getDriver().getWindowHandles();
			
			for (String eachId : all) {
				if(!parent.equals(eachId)) {
					getDriver().switchTo().window(eachId);
				}
			}
			
	}

	    public static void switchToWindow(int index) {
	    	
	        Set<String> winHandles = getDriver().getWindowHandles();
	        List<String> li = new ArrayList<String>();
	        li.addAll(winHandles);
	        
	        getDriver().switchTo().window(li.get(index));
	        
	        
	       
	 }

	  public static void selByIndex(int i) {
		Select s= new Select(ref);
	 s.selectByIndex(i);
	}

	  public static void selByVisibleText( String name) {
		  Select s= new Select(ref);
	s.selectByVisibleText(name);

	}

	  public static void selVal(String reff) {
		  Select s= new Select(ref);
		  s.selectByValue(reff);
	  }
	  
	  
	  public static void deSelAll() {
		  Select s= new Select(ref);
		  s.deselectAll();
	  }

	  public static void getAllSelOp() {
		  Select s= new Select(ref);
		  s.getAllSelectedOptions();
	}

	  public static void firstSelOp() {
		  Select s= new Select(ref);
		s.getFirstSelectedOption();
	}

	  public static void deSelInd(int i) {
		  Select s= new Select(ref);
		s.deselectByIndex(i);
	}


	  public static void delSelVal(String reff) {
		  Select s= new Select(ref);
		 s.deselectByValue(reff);
	}

	  public static void readFile(String file, String sheet, int row, int clm) throws IOException {
		
		 f= new File (file);
		 FileInputStream fis= new FileInputStream(f);
		 Workbook book= new XSSFWorkbook(fis);
		 Sheet sh = book.getSheet(sheet);
			Row r = sh.getRow(row);
			Cell c = r.getCell(clm);
			System.out.println(c);
	  }		
	  
		public static String getDataFromXl(String file, String sheet,int row, int clm) throws IOException {
			
			f= new File(file);
			FileInputStream fis = new FileInputStream(f);
			Workbook book= new XSSFWorkbook(fis);
			Sheet sh = book.getSheet(sheet);
			Row r = sh.getRow(row);
			Cell c = r.getCell(clm);
			
			String data;
			
			if(c.getCellType()==1) {       //cell to string
				data= c.getStringCellValue();
				System.out.println(data);
			}
			else if(DateUtil.isCellDateFormatted(c)) { //cell to date--->date to string
				
				Date d = c.getDateCellValue();
				SimpleDateFormat sim= new SimpleDateFormat("MMM/dd/yyyy");
				 data = sim.format(d);
				 System.out.println(data);
			}
			else {    //cell to double-----> double to long--->long to string
				double d = c.getNumericCellValue();
				long l= (long)d;
				 data = String.valueOf(l);
				 System.out.println(data);
						
			}
			return data;
			
		}
			
		public static void dateCal() {

	  Date d = new Date();
	  System.out.println(d);

		}
		
		
		
		
		
		
			
		
		
	}		


