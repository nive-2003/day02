package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class testings {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ChromeOptions co = new ChromeOptions();
     co.addArguments("--remote-allow-origins=*");
     System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
     WebDriver driver = new ChromeDriver(co);
    driver.get("https://demo.opencart.com/");
     System.out.print(driver.getTitle());
//     driver.navigate().to("https://www.mygreatlearning.com/blog/polymorphism-in-java/#:~:text=If%20two%20or%20more%20methods,superclass%20and%20the%20child%20class.");
//     driver.navigate().refresh();
//     WebElement fname= driver.findElement(By.id("input-firstname"));
//     fname.sendKeys("nive");
//     
//     WebElement lname = driver.findElement(By.id("input-lastname"));
//     lname.sendKeys("jeyaraman");
//     
//     WebElement email = driver.findElement(By.cssSelector("input[placeholder=\"E-Mail\"]"));
//     email.sendKeys("nivejeyaraman@gmail.com");
//     
//     WebElement pass = driver.findElement(By.cssSelector("input[id=\"input-password\"]"));
//     pass.sendKeys("nivejeya");
//
//     
//    driver.findElement(By.xpath("//input[@id=\"input-newsletter-no\"]")).click();
     WebElement search =   driver.findElement(By.xpath("//input[@name=\"search\"]"));
     search.sendKeys("sadsx");
     
     driver.findElement(By.xpath("/html/body/footer/div/div/div[2]/ul/li[2]/a")).click();
    driver.findElement(By.xpath("//*[@id=\"content\"]/h3"));
   
//    driver.navigate().to("https://demo.opencart.com/");
    
	}
}
