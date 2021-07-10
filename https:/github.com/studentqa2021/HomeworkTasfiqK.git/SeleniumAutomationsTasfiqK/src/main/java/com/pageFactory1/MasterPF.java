package com.pageFactory1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPF {
 
	public MasterPF(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	
		
	}
	@FindBy(xpath="//*[contains(text(),'Sign in')]")
	private WebElement SignIn;
	
	@FindBy(xpath="(//*[contains(@id,'email')])[2]")//email
	private WebElement email;
	
	@FindBy(xpath="//*[@name='passwd']")
	private WebElement password;
	
	@FindBy(xpath="//*[@name='SubmitLogin']")//signin 
	private WebElement Submit;
	
	@FindBy(xpath="(//*[contains(text(),'Sign out')])[1]")
	private WebElement signOut;
	
	public WebElement getSignIn() {
		return SignIn;
	}
	public void setSignIn(WebElement signIn) {
		SignIn = signIn;
	}
	public WebElement getEmail() {
		return email;
	}
	public void setEmail(WebElement email) {
		this.email = email;
	}
	public WebElement getPassword() {
		return password;
	}
	public void setPassword(WebElement password) {
		this.password = password;
	}
	public WebElement getSubmit() {
		return Submit;
	}
	public void setSubmit(WebElement submit) {
		Submit = submit;
	}
	public WebElement getSignOut() {
		return signOut;
	}
	public void setSignOut(WebElement signOut) {
		this.signOut = signOut;
	}
	
}
					
