package tunisanetsite;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

@SuppressWarnings("unused")
public class Achat extends Mere {
WebDriver driver;
	
	@Test 
	public void Runtunisianet() throws InterruptedException{
		
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // open site web tunisianet 
        driver.get("https://www.tunisianet.com.tn/");

        Thread.sleep(2000);
        
      //mouseover sur informatique
        WebElement elemebnt = driver.findElement(By.xpath("//span[contains(text(),'Informatique')]"));
        Actions actionProvider = new Actions(driver);
        actionProvider.moveToElement(elemebnt).build().perform();
        
        Thread.sleep(2000);
        
       
      //Click on button sous type pc portable
        WebElement pc = driver.findElement(By.xpath("//a[contains(text () , 'Pc Portable')]"));
        JavascriptExecutor pc_button = (JavascriptExecutor) driver;  
        pc_button.executeScript("arguments[0].click();", pc);
        
        
      //Click on button chariot
        WebElement chariot = driver.findElement(By.xpath("//button[@class=\"cartb  btn-product add-to-cart wb-bt-cart wb-bt-cart_50111 wb-enable\"]"));
        JavascriptExecutor CH = (JavascriptExecutor) driver;  
        CH.executeScript("arguments[0].click();", chariot);
        
        Thread.sleep(2000);
        
        //Click on button commander 1
        WebElement commander = driver.findElement(By.xpath("//a[contains(text () ,'Commander')]"));
        JavascriptExecutor CM = (JavascriptExecutor) driver;  
        CM.executeScript("arguments[0].click();", commander);
        
        Thread.sleep(2000);
        
        //Click on button commander 2
        WebElement commande = driver.findElement(By.xpath("//a[contains(text () , 'Commander')]"));
        JavascriptExecutor C = (JavascriptExecutor) driver;  
        C.executeScript("arguments[0].click();", commande);
       
        Thread.sleep(2000);
        
        //remplir le champ d'email
        WebElement email = driver.findElement(By.xpath("//*[@id=\"login-form\"]/section/div[1]/div[1]/input"));
        JavascriptExecutor E = (JavascriptExecutor) driver;  
        E.executeScript("arguments[0].value='nada.neolians@gmail.com';" ,email);
       
        
        Thread.sleep(2000);
        
        //remplir le champ de mot de passe
        WebElement mp = driver.findElement(By.xpath("//*[@id=\"login-form\"]/section/div[2]/div[1]/div/input"));
        JavascriptExecutor M = (JavascriptExecutor) driver;  
        M.executeScript("arguments[0].value='nbvcxn';" ,mp);
        
        Thread.sleep(2000);
        //cliquer sur  le bouton continuer
        
        WebElement continuer = driver.findElement(By.xpath("//*[@id=\"login-form\"]/footer/button"));
        JavascriptExecutor CNT_button = (JavascriptExecutor) driver;  
        CNT_button.executeScript("arguments[0].click();", continuer);
        
        
}
}