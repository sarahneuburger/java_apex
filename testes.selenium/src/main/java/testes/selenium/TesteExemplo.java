package testes.selenium;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Classe JUnit que contém os métodos de teste
public class TesteExemplo {
	
	// Declarando um objeto do tipo webdriver utilizado pelo Selenium WebDriver
	private static WebDriver driver;
	
	// O que será feito antes de teste
	@BeforeClass
	public static void setUpTest() {
		System.setProperty("webdriver.chrome.driver", "C:/eclipse-sarah/workspace/testes.selenium/src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://g1.globo.com/");
	}
	
	// O que será feito depois do teste
	@AfterClass
	public static void tearDownTest() {
		driver.quit();
	
	}
	
	
	// Teste para verificação de título
	@Test
	public void TestaTituloPagina() {
		
		assertEquals("G1 - O portal de notícias da Globo", driver.getTitle());
		
	}
	
	
	

}
