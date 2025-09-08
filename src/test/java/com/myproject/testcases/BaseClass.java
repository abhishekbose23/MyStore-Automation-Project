package com.myproject.testcases;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import com.mystore.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
ReadConfig readconfig = new ReadConfig();
String url = readconfig.getBaseURL();
String browser = readconfig.getBrowser();

public static WebDriver driver;
public static Logger logger;

@BeforeClass
public void setup() {
	
	switch(browser.toLowerCase())
	{
	case "chrome" :
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		break;
	
		case "msedge" :
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
			
		case "firefox" :
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
			
			default :
				System.out.println("Invalid browser name specified in config file");
			driver = null;
			break;
	}
	
	if (driver != null) {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get(url);
	}
	
	//for logging
	logger = LogManager.getLogger("MyStore");
}
@AfterClass
public void tearDown() {
	if (driver != null) {
	driver.quit();
	}
}
}
