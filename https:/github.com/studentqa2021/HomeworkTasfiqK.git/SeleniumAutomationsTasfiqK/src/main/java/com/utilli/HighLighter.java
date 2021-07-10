package com.utilli;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HighLighter {

	public static void getColor(WebDriver driver, WebElement element){
		JavascriptExecutor js = (JavascriptExecutor) driver;//type casting 
        
	js.executeScript("arguments[0].setAttribute('style', 'background: light blue; border: 3px solid red;');", element);
	}
}