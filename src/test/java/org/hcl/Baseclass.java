package org.hcl;

import java.io.File;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
 
public class Baseclass {
	static WebDriver driver;
	static WebElement elemt;
	public WebDriver launchBrowser() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Jebarani\\eclipse-workspace\\Framework\\Driver\\chromedriver.exe");
	     driver  = new ChromeDriver();
		return driver;
		
	}
	public void launchUrl(String url) {
		  driver.get(url);
		  driver.manage().window().maximize();
		}
	public void type(String data) {
	       elemt.sendKeys(data);
			}
	public void btnclick() {
		   elemt.click();
		  
			}
	public void quitBrowser() {
			driver.quit();
			}
	public String getPageurl() {
		String url = driver.getCurrentUrl();
		return url;
		}
	public String getPagetitle() {
		String title = driver.getTitle();
		return title;
		}
	public String  getDatafromexcel(String loc,String sname,int rno,int cno) {
		
		return sname;
		
	}
	public String getTitle() {
	String title = driver.getTitle();
	return title;
	}
	public String getText() {
	String text = elemt.getText();
	return text;
	}
	public void btnCreate() {
		elemt.click();
		}
	public String getAttribute(String data) {
		String attribute = elemt.getAttribute(data);
		return attribute;
		}
	public Select selct() {
		Select s = new Select(elemt);
		return s;

	}
	
	public Select ByVisibletext(Select s,String name) {
	 s.selectByVisibleText(name);
	return s;

	}
	public void Byselectvalue(Select s,String data) {
		s.selectByValue(data);

	}
	public void Selectbyindex(Select s,int value) {
		s.selectByIndex(value);

	}
	public List<WebElement> getoptions(Select s) {
	List<WebElement> options = s.getOptions();
	return options;
	}
	public List<WebElement> getAllselectedOption(Select s) {
    List<WebElement> all = s.getAllSelectedOptions();
     return all;
     }
	public void deSelectedbyvalue(Select s,String name) {
		s.deselectByValue(name);
		}
	public void deSelectedbyvisibletext(Select s,String name) {
		s.deselectByVisibleText(name);
		}
	public void deSelectAll(Select s) {
		s.deselectAll();
		}
	public boolean isMultiple(Select s) {
		boolean multiple = s.isMultiple();
		return multiple;
		}
	public List<WebElement> getFirstSelectedOption(Select s) {
		List<WebElement> all = s.getAllSelectedOptions();
		return all;
	}
	public Actions perform() {
		Actions a = new Actions(driver);
		return a;
		}
	public void moveToElement(Actions a) {
		 a.moveToElement(elemt).perform();
		 }

	public void dragAndDrop(WebElement elemtsrc,WebElement elemtdest,Actions a) {
		a.dragAndDrop(elemtsrc, elemtdest).perform();
	}
	public String getWindowhandle() {
		String win = driver.getWindowHandle();
		return win;
		}
	public Set<String> getWindowHandles() {
		Set<String> handles = driver.getWindowHandles();
		return handles;
		}
	public void navigateTo(String url) {
		driver.navigate().to(url);
		}
	public void navigateBack() {
		driver.navigate().back();
		}
	public void navigateForword() {
		driver.navigate().forward();
		}
	public void navigateRefresh() {
		driver.navigate().refresh();
		}
	public boolean isDisplayed() {
	 boolean displayed = elemt.isDisplayed();
	return displayed;
	}
	public boolean isEnable() {
		 boolean enabled = elemt.isEnabled();
		return enabled;
	}
	public boolean isSelected() {
		 boolean Selected = elemt.isSelected();
		return Selected;
	}
	public void frameName(int name) {
		  driver.switchTo().frame(name);
		  }
	public void frameElement() {
		  driver.switchTo().frame(elemt);
		  }
	public void frameIndex(int index) {
		  driver.switchTo().frame(index);
	}
	public Alert popup() {
	 Alert a = driver.switchTo().alert();
	return a;
		
		}
	public void accept(Alert a) {
		a.accept();
		}
	public void dismiss(Alert a) {
		a.dismiss();
		}
	public TakesScreenshot  screenshot() {
		TakesScreenshot tk = (TakesScreenshot)driver;
		return tk;

	}
	public File Screenshot(TakesScreenshot tk,String type) {
		File screenshotAs = tk.getScreenshotAs(OutputType.FILE);
		return screenshotAs;
		}
	
	}
    	
    
		
	
		


