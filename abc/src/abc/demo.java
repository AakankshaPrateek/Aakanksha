package abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
	public static void main(String[] args) throws InterruptedException {
//
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver.exe");	
	WebDriver driver= new ChromeDriver();
	driver.get("http://www.gmail.com");
	driver.manage().window().maximize();
	Thread.sleep(10000);
	WebElement email=driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
	email.sendKeys("aakankshashambhu19");
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/span")).click();
	Thread.sleep(10000);
	WebElement password=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[1]/div/div/div/div/div[1]/div/div[1]/input"));
	password.sendKeys("bachababu19");
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/span/span")).click();
	Thread.sleep(10000);
    driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[1]/div[4]/header/div[2]/div[3]/div/div[2]/div/a/span")).click();
    Thread.sleep(10000);
    driver.findElement(By.xpath("//*[@id=\"gb_71\"]")).click();
    Thread.sleep(60000);
	
	}

	
	}
