package com.ppl.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.ppl.qa.util.TestUtil;
import com.ppl.qa.util.WebEventListener;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	public static FileInputStream input;
	public static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	protected TestBase(){
		try {
			prop=new Properties();
			input = new FileInputStream("../PPL/src/main/java/com/ppl/qa/config/config.properties");
			try {
				prop.load(input);
			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void intialization() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Driver\\chromedriver.exe");
		driver=new ChromeDriver();  
		e_driver=new EventFiringWebDriver(driver);
		eventListener=new WebEventListener();
		e_driver.register(eventListener);
		driver=e_driver;

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		driver.get(prop.getProperty("URL"));
	}
}
