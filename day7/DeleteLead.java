package assignments.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		System.out.println("Login successfully.....");
		// when v use the hyperlink
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		System.out.println("finding Leads.....");
		
		Thread.sleep(5000);
		WebElement leadID = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
		String leadIDtxt =leadID.getText();
		System.out.println("Lead Id: "+ leadIDtxt);
		leadID.click();
		
		//delete button
		driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
		System.out.println("Lead Id "+ leadIDtxt +" deleted succesfully");
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		//Lead ID input field
		WebElement leadID2 = driver.findElement(By.xpath("//div[@class='x-form-element']/input[@name='id']"));
		leadID2.sendKeys(leadIDtxt);
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(3000);
		WebElement noRecordWE = driver.findElement(By.xpath("//div[text()='No records to display']"));
		String msg = noRecordWE.getText();
		if (msg.contains("No records to display")) {
			System.out.println("Lead "+leadIDtxt  +" is deleted already...");
		}
		else {
			System.out.println("Lead "+leadIDtxt  +" is available...");
		}
	}

}
