package com.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_class {
	public static WebDriver driver;
	static Actions ac;
	public static WebDriver launchbrowser(String browsername)
	{
		if(browsername.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		if(browsername.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		return driver;
		}
	public static void launchUrl(String url)
	{
		driver.get(url);
	}
	public static void  MouseActions(WebElement element)
	{
		ac=new Actions(driver);
		ac.moveToElement(element).build().perform();
	}
	public static void browserclose()
	{
		driver.quit();
	}
	}


