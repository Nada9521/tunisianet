package tunisanetsite;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;



public class Compte extends Mere {
	
	@Test 
	
	public void St() throws InterruptedException {
	
 // open site web tunisianet 
driver.get("https://www.tunisianet.com.tn/connexion?create_account=1");

Thread.sleep(2000);
//Click on button titre 

WebElement titre = driver.findElement(By.xpath("//input[@value=\"2\"]"));
JavascriptExecutor T = (JavascriptExecutor) driver;
T.executeScript("arguments[0].click();", titre);
//remplir le champ de prénom
WebElement firstName = driver.findElement(By.xpath("//input[@name=\"firstname\"]")); 
JavascriptExecutor F_Name = (JavascriptExecutor) driver;
F_Name.executeScript("arguments[0].value='Nada';", firstName);

//remplir le champ de nom

WebElement lastName = driver.findElement(By.xpath("//input[@name=\"lastname\"]")); 
JavascriptExecutor L_Name = (JavascriptExecutor) driver;
L_Name.executeScript("arguments[0].value='Farah';", lastName);

//remplir le champ d'email

WebElement Email = driver.findElement(By.xpath("//input[@name=\"email\"]")); 
JavascriptExecutor E_Mail = (JavascriptExecutor) driver;
E_Mail.executeScript("arguments[0].value='nada.neolians@gmail.com';", Email);

//remplir le champ de mot de passe

WebElement Password = driver.findElement(By.xpath("//input[@name=\"password\"]")); 
JavascriptExecutor P_Word = (JavascriptExecutor) driver;
P_Word.executeScript("arguments[0].value='password';", Password);


//remplir le champ de date de naissance

WebElement Date = driver.findElement(By.xpath("//input[@name=\"birthday\"]")); 
JavascriptExecutor D_Naissance = (JavascriptExecutor) driver;
D_Naissance.executeScript("arguments[0].value='20/05/1996';", Date);

//Click on button Enregistrer
WebElement Enregistrer = driver.findElement(By.xpath("//button[@class=\"btn btn-primary form-control-submit float-xs-right\"]"));
JavascriptExecutor E = (JavascriptExecutor) driver;
E.executeScript("arguments[0].click();", Enregistrer);

Thread.sleep(3000);
//Quit Driver
driver.quit();
	}
	
}


