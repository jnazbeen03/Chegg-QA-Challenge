package com.base;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public 	WebDriver driver;
public void getDriver() {
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
	driver.get("https://chegg-qa-challenge.herokuapp.com/");

	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
}
}
