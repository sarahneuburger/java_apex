package testes.selenium;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import conexao.Conexao;

public class TesteExemplo3 {

	// Declarando um objeto do tipo webdriver utilizado pelo Selenium WebDriver
	private static WebDriver driver;

	// O que será feito antes de teste
	@BeforeClass
	public static void setUpTest() {
		System.setProperty("webdriver.chrome.driver",
				"C:/eclipse-sarah/workspace/testes.selenium/src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.4devs.com.br/");
	}

	// O que será feito depois do teste
	@AfterClass
	public static void tearDownTest() {
		// fecha o navagador
		// driver.quit();

	}

	// buscamos dados do site 4devs e gravamos no banco
	@Test
	public void testeGeraPessoas() throws InterruptedException, SQLException {

		WebElement linkGerarPessoa = driver.findElement(By.cssSelector("#top-nav > li:nth-child(23) > a"));
		linkGerarPessoa.click();

		for (int i = 0; i < 30; i++) {
			WebElement btnGerarPessoa = driver.findElement(By.id("bt_gerar_pessoa"));
			btnGerarPessoa.click();

			Thread.sleep(1500);

			WebElement campoNome = driver.findElement(By.id("nome"));
			String nome = campoNome.getText();

			WebElement campoCPF = driver.findElement(By.id("cpf"));
			String cpf = campoCPF.getText();

			WebElement campoRG = driver.findElement(By.id("rg"));
			String rg = campoRG.getText();

			WebElement campoDataNasc = driver.findElement(By.id("data_nasc"));
			String dataNasc = campoDataNasc.getText();

			WebElement campoSexo = driver.findElement(By.id("sexo"));
			String sexo = campoSexo.getText();

			WebElement campoSigno = driver.findElement(By.id("signo"));
			String signo = campoSigno.getText();

			String sql = "insert into pessoas (nome, cpf, rg, data_nascimento, sexo, signo) values (?, ?, ?, ?, ?, ?)";
			Conexao conexao = new Conexao();
			PreparedStatement pstmt = conexao.conectar().prepareStatement(sql);
			pstmt.setString(1, nome);
			pstmt.setString(2, cpf);
			pstmt.setString(3, rg);
			pstmt.setString(4, dataNasc);
			pstmt.setString(5, sexo);
			pstmt.setString(6, signo);
			pstmt.execute();

		}

	}

}
