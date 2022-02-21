package com.adm.alaigal;

import java.awt.AWTException; 
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MemberProfilef {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");//chromedriver path
		WebDriver driver=new ChromeDriver();	

		driver.get("https://myvideoscript.com/aligal/index.php/user/signin");

		driver.manage().window().maximize();


		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Actions action=new Actions(driver);

		WebElement advanced=driver.findElement(By.id("details-button"));
		advanced.click();

		WebElement proceed=driver.findElement(By.id("proceed-link"));
		proceed.click();

		//Member login
		WebElement memberlogin=driver.findElement(By.xpath("//input[@id='login-email']"));
		memberlogin.sendKeys("dineshkumarbe27@gmail.com");

		WebElement memberpassword=driver.findElement(By.xpath("//input[@id='login-password']"));
		memberpassword.sendKeys("mafkei",Keys.ENTER);

		WebElement memberprofile=driver.findElement(By.xpath("//*[@id=\"main-menu-navigation\"]/li[3]/a/span"));
		memberprofile.click();


		WebElement personaldetails=driver.findElement(By.xpath("//*[@id=\"main-menu-navigation\"]/li[3]/ul/li[1]/a/span"));
		personaldetails.click();

		WebElement dob = driver.findElement(By.xpath("//*[@id=\"inv_create\"]/div/div[5]/div/div[2]/input"));
		dob.sendKeys("07/27/1993");

		WebElement address = driver.findElement(By.xpath("//*[@id=\"inv_create\"]/div/div[6]/div/div[2]/input"));
		address.sendKeys("10,Besants road,Icehouse");


		WebElement city = driver.findElement(By.name("city"));		
		Select select= new Select(city);
		select.selectByValue("chennai");


		WebElement state = driver.findElement(By.name("state"));		
		Select selects = new Select(state);
		selects.selectByValue("Tamilnadu");

		WebElement pincode = driver.findElement(By.name("pincode"));
		pincode.sendKeys("601101");

		WebElement Dateofjoin = driver.findElement(By.xpath("//*[@id=\"inv_create\"]/div/div[12]/div/div[2]/input"));
		Dateofjoin.sendKeys("06/25/2015");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Actions action1 = new Actions(driver);

		WebElement memberpic = driver.findElement(By.xpath("//*[@id=\"inv_create\"]/div/div[13]/div/div[2]/input[1]"));
		action1.moveToElement(memberpic).click().perform();
		String file = "C:\\Users\\dines\\Desktop\\memberpic.jpg";
		Thread.sleep(2000);
		StringSelection selection = new StringSelection (file);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		//WebElement submitbutton1 = driver.findElement(By.xpath("//*[@id=\"inv_create\"]/div/div[14]/button"));
		//submitbutton1.click();
		
		//businessdetail
		
				WebElement memberprofile1=driver.findElement(By.xpath("//*[@id=\"main-menu-navigation\"]/li[3]/a/span"));
				memberprofile1.click();
				
				WebElement Businessdet = driver.findElement(By.xpath("//*[@id=\"main-menu-navigation\"]/li[3]/ul/li[2]/a/span"));
				Businessdet.click();
				
				WebElement website = driver.findElement(By.name("company_website"));
				website.sendKeys("www.vsagencies.com");
						
				WebElement compaddress = driver.findElement(By.name("company_address"));
				compaddress.sendKeys("101,besantroad,icehouse,chennai");
				
				WebElement city1 = driver.findElement(By.name("company_city"));		
				Select selection1= new Select(city1);
				selection1.selectByValue("chennai");
				
				WebElement state1 = driver.findElement(By.name("company_state"));		
				Select selections1= new Select(state1);
				selections1.selectByValue("Tamilnadu");
				
				WebElement industry = driver.findElement(By.name("industry"));
				Select selectioon = new Select(industry);
				selectioon.selectByValue("Drugs_Pharmaceuticals");
				
				WebElement pincode1 = driver.findElement(By.name("company_pincode"));
				pincode1.sendKeys("601101");
				
				WebElement designatiion = driver.findElement(By.name("designation"));
				designatiion.sendKeys("MD");
				
				WebElement certificate = driver.findElement(By.name("certifications"));
				certificate.sendKeys("ISO");
				
				WebElement officell = driver.findElement(By.name("company_landline"));
				officell.sendKeys("0442236181");
				
				WebElement yearofexp = driver.findElement(By.name("exp_year"));
				yearofexp.sendKeys("05/12/12");
				
				WebElement offmobno = driver.findElement(By.name("company_mobile"));
				offmobno.sendKeys("9486914949");
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				Actions action11 = new Actions(driver);

				WebElement companylogo = driver.findElement(By.name("company_logo"));
				action11.moveToElement(companylogo).click().perform();
				
				String file1= "C:\\Users\\dines\\Desktop\\logo";
				Thread.sleep(2000);
				StringSelection selections= new StringSelection(file1);
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selections, null);
				Robot robot1 = new Robot();
				robot1.keyPress(KeyEvent.VK_CONTROL);
				robot1.keyPress(KeyEvent.VK_V);
				robot1.keyRelease(KeyEvent.VK_V);
				robot1.keyRelease(KeyEvent.VK_CONTROL);
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				robot1.keyPress(KeyEvent.VK_ENTER);
				robot1.keyRelease(KeyEvent.VK_ENTER);
							
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				Actions action3 = new Actions(driver);

				WebElement companyphoto = driver.findElement(By.name("company_photo"));
				action3.moveToElement(companyphoto).click().perform();
				String file2 = "C:\\Users\\dines\\Desktop\\companyname.jpg";
				Thread.sleep(2000);
				StringSelection selections11 = new StringSelection (file2);
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selections11,null);
				Robot robot2 = new Robot();
				robot2.keyPress(KeyEvent.VK_CONTROL);
				robot2.keyPress(KeyEvent.VK_V);
				robot2.keyRelease(KeyEvent.VK_V);
				robot2.keyRelease(KeyEvent.VK_CONTROL);

				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
				robot2.keyPress(KeyEvent.VK_ENTER);
				robot2.keyRelease(KeyEvent.VK_ENTER);
				
				//WebElement submitbutton2 = driver.findElement(By.xpath("//*[@id=\"inv_create\"]/div/div[15]/button"));
				//submitbutton2.click();
	
//products
				
				WebElement memberprofile2=driver.findElement(By.xpath("//*[@id=\"main-menu-navigation\"]/li[3]/a/span"));
				memberprofile2.click();
				
				WebElement product = driver.findElement(By.xpath("//*[@id=\"main-menu-navigation\"]/li[3]/ul/li[3]/a/span"));
				product.click();
				
				WebElement productname = driver.findElement(By.name("name[]"));
				productname.sendKeys("n95mask");
				
				WebElement description = driver.findElement(By.name("description[]"));
				description.sendKeys("N95 mask is helpful to protect from moisture,pollution,germs");
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				Actions action31 = new Actions(driver);
				WebElement productphoto = driver.findElement(By.name("photo[]"));
				action31.moveToElement(productphoto).click().perform();
				
				String file5= "C:\\Users\\dines\\Desktop\\n95mask";
				Thread.sleep(2000);
				StringSelection selections5 = new StringSelection(file5);
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selections5, null);
				Robot robot21 = new Robot();
				robot21.keyPress(KeyEvent.VK_CONTROL);
				robot21.keyPress(KeyEvent.VK_V);
				robot21.keyRelease(KeyEvent.VK_V);
				robot21.keyRelease(KeyEvent.VK_CONTROL);

				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
				robot21.keyPress(KeyEvent.VK_ENTER);
				robot21.keyRelease(KeyEvent.VK_ENTER);
				
				//WebElement submitbutton3 = driver.findElement(By.xpath("//*[@id=\"basic-horizontal-layouts\"]/div/div[1]/div/div/form/div[3]/div[2]/button"));
				//submitbutton3.click();

	}
}
