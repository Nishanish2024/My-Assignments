package assignments.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		// launch the browser
		ChromeDriver driver = new ChromeDriver();
		// maximize the window
		driver.manage().window().maximize();
		// to load url
		driver.get("http://leaftaps.com/opentaps/control/main");

		// locate userName field
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");

		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		//driver.findElement(By.className("decorativeSubmit")).click();
		
		System.out.println("Login successfully.....");
		// when v use the hyperlink
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		//enter the mandatory fields
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nisha");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Anish");
		
		driver.findElement(By.xpath("//input[@name='firstNameLocal']")).sendKeys("Nishapc");
		driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("Testing");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Creating Lead for testing purpose");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("pcnisha@gmail.com");
		WebElement state = driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));
		Select dropdwnState= new Select(state);
		dropdwnState.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@value='Create Lead']")).submit();
		System.out.println("Lead is created successfully...");
		
		//Edit lead
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		//clear the description field
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).clear();
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("the newly created record is updated");
		driver.findElement(By.xpath("//input[@value='Update']")).submit();
		System.out.println("Updated successfully...");
		
		String title = driver.getTitle();
		System.out.println("Title of the Page is: "+ title);
		//driver.close();
	}

}
