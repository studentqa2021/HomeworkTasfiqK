package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pageFactory1.MasterPF;
import com.utilli.ConfigProperty;
import com.utilli.HighLighter;
import com.utilli.Screenshot;

public class BaseLogin {

	public static void getLogin() {
		System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
		WebDriver driver = new ChromeDriver();// up casting//getting help from class its call
		// driver.get(null)
		driver.navigate().to(ConfigProperty.getConfigFile("URL"));
		driver.manage().window().maximize();
		MasterPF obj = new MasterPF(driver);
		Screenshot.getpics(driver, "Before Sign In");
		HighLighter.getColor(driver, obj.getSignIn());
		obj.getSignIn().click();
		HighLighter.getColor(driver, obj.getEmail());
		obj.getEmail().sendKeys(ConfigProperty.getConfigFile("username"));
		HighLighter.getColor(driver, obj.getPassword());
		obj.getPassword().sendKeys(ConfigProperty.getConfigFile("password"));
		HighLighter.getColor(driver, obj.getSubmit());
		obj.getSubmit().click();
		Screenshot.getpics(driver, "Before signout");
		HighLighter.getColor(driver, obj.getSignOut());
		obj.getSignOut().click();
	}
}
