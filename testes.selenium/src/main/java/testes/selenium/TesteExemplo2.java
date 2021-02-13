package testes.selenium;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Classe JUnit que cont�m os m�todos de teste
public class TesteExemplo2 {
	
	
	// Declarando um objeto do tipo webdriver utilizado pelo Selenium WebDriver
	private static WebDriver driver;
	
	// O que ser� feito antes de teste
	@BeforeClass
	public static void setUpTest() {
		System.setProperty("webdriver.chrome.driver", "C:/eclipse-sarah/workspace/testes.selenium/src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.somatematica.com.br/softOnline/ConversorMedidas/conversor.php");
	}
	
	// O que ser� feito depois do teste
	@AfterClass
	public static void tearDownTest() {
	//	driver.quit();
	
	}
	
	
	// Teste para verifica��o de t�tulo
	@Test
	public void testaTituloPagina() {
		
		assertEquals("Conversor de medidas - S� Matem�tica", driver.getTitle());
		
	}
	
	// teste para setar um campo e validar o c�lculo
	@Test
	public void testaMedidaComprimento() throws InterruptedException {
		WebElement campoMetro = driver.findElement(By.id("mco1"));
		campoMetro.clear();
		campoMetro.sendKeys("15");
		Thread.sleep(1000);
		WebElement campoCentimetro = driver.findElement(By.id("mco2"));
		String valorCentimetro = campoCentimetro.getText();
		
		assertEquals("1500", valorCentimetro);
	}
	

}
