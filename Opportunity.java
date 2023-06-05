package Final;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Opportunity {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://demo.vtiger.com/vtigercrm/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		
		driver.findElement(By.xpath("(//div[@class='row app-navigator'])[1]")).click();
		Thread.sleep(1000);
		
		Actions a = new Actions(driver);
		
		WebElement sys = driver.findElement(By.xpath("//span[text()=' SALES']"));
		a.moveToElement(sys).perform();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()=' Opportunities']")).click();
		
		driver.findElement(By.id("Potentials_listView_basicAction_LBL_ADD_RECORD")).click();
		
		driver.findElement(By.id("Potentials_editView_fieldName_potentialname")).sendKeys("Organisation");
		
		driver.findElement(By.id("Potentials_editView_fieldName_amount")).sendKeys("100000");
		
		driver.findElement(By.id("s2id_autogen1")).click();
		
		driver.findElement(By.xpath("//div[text()='New Business']")).click();
		
		driver.findElement(By.name("closingdate")).click();
		
		driver.findElement(By.xpath("(//th[text()='Today'])[1]")).click();
		
		driver.findElement(By.id("s2id_autogen3")).click();
		
		driver.findElement(By.xpath("//div[text()='Existing Customer']")).click();
		
		driver.findElement(By.id("Potentials_editView_fieldName_nextstep")).sendKeys("ABCDE");
		
		driver.findElement(By.id("s2id_autogen5")).click();
		
		driver.findElement(By.xpath("//div[text()='Team Selling']")).click();
		
		driver.findElement(By.id("s2id_autogen7")).click();
		
		driver.findElement(By.xpath("//div[text()='Needs Analysis']")).click();
		
		driver.findElement(By.id("Potentials_editView_fieldName_probability")).sendKeys("77.20");
		
		driver.findElement(By.id("Potentials_editView_fieldName_forecast_amount")).sendKeys("200000");
		
		driver.findElement(By.id("Potentials_editView_fieldName_description")).sendKeys("Thank You");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@class='fa fa-user']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Sign Out")).click();
		
		}

}
