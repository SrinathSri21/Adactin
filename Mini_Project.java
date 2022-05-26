package com.miniproject.com;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project {
public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Srinath\\eclipse-workspace\\Maven_Project_New_1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/index.php");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement Username = driver.findElement(By.name("username"));
		Username.sendKeys("Srinath1993");
		
		WebElement Password = driver.findElement(By.name("password"));
		Password.sendKeys("Srinath@123");
		
		WebElement Login = driver.findElement(By.name("login"));
		Login.click();
		
		
		WebElement Location = driver.findElement(By.name("location"));
		Select s = new Select(Location);
		s.selectByVisibleText("London");
		Thread.sleep(2000);
		
		WebElement Hotels = driver.findElement(By.name("hotels"));
		Select s1 = new Select(Hotels);
		s1.selectByVisibleText("Hotel Sunshine");
		
		WebElement RoomType = driver.findElement(By.name("room_type"));
		Select s2 = new Select(RoomType);
		s2.selectByVisibleText("Deluxe");
		
		WebElement Roomnos = driver.findElement(By.name("room_nos"));
		Select s3 = new Select(Roomnos);
		s3.selectByVisibleText("3 - Three");
		
		WebElement CheckIn = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		CheckIn.clear();
		CheckIn.sendKeys("07/04/2022");
		
		WebElement CheckOut = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		CheckOut.clear();
		CheckOut.sendKeys("10/04/2022");
		
		WebElement AdultRoom = driver.findElement(By.name("adult_room"));
		Select s4 = new Select(AdultRoom);
		s4.selectByVisibleText("2 - Two");
		
		WebElement ChildRoom = driver.findElement(By.name("child_room"));
		Select s5 = new Select(ChildRoom);
		s5.selectByVisibleText("1 - One");
		
		WebElement Search = driver.findElement(By.name("Submit"));
		Search.click();
	
		WebElement Select = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
		Select.click();
		
		WebElement Continue = driver.findElement(By.name("continue"));
		Continue.click();
		
		WebElement FirstName = driver.findElement(By.name("first_name"));
		FirstName.sendKeys("Srinath");
		
		WebElement LastName = driver.findElement(By.name("last_name"));
		LastName.sendKeys("S");
		
		WebElement Address = driver.findElement(By.name("address"));
		Address.sendKeys("afnasfasfasofoashfg");
		
		WebElement CardNo = driver.findElement(By.name("cc_num"));
		CardNo.sendKeys("1364646456414586");
		
		WebElement CardType = driver.findElement(By.name("cc_type"));
		Select s6 = new Select(CardType);
		s6.selectByVisibleText("Master Card");
		
		WebElement Month = driver.findElement(By.name("cc_exp_month"));
		Select s7 = new Select(Month);
		s7.selectByVisibleText("April");
		
		WebElement Year = driver.findElement(By.name("cc_exp_year"));
		Select s8 = new Select(Year);
		s8.selectByVisibleText("2013");
		
		WebElement CCV = driver.findElement(By.name("cc_cvv"));
		CCV.sendKeys("2656");
		
		WebElement BookNow = driver.findElement(By.name("book_now"));
		BookNow.click();
			
	}

}

