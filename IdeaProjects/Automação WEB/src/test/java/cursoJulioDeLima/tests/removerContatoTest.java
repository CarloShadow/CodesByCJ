package cursoJulioDeLima.tests;

import cursoJulioDeLima.suporte.Generator;
import cursoJulioDeLima.suporte.ScreenShot;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class removerContatoTest {
    private WebDriver navegador;

    @Rule
    public TestName test = new TestName();

    @Before
    public void setUp() {
        //Abrindo navegador
        System.setProperty("webdriver.edge.driver", "C:\\Users\\CJ\\webdrivers\\msedgedriver.exe");
        navegador = new EdgeDriver();
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Navegando para a página "Task it"
        navegador.get("http://www.juliodelima.com.br/taskit/");

    }
    @Test
    public void removerUmContatoDeUmUsuari() {
        //Clicar no link que possuir o texto "Sign in"
        navegador.findElement(By.linkText("Sign in")).click();

        // Identificando o formulário de Login
        WebElement formularioSignInBox = navegador.findElement(By.id("signinbox"));

        //Digitar no campo com name "Login" que está dentro do formulário de id "signbox" e texto "julio0001"
        formularioSignInBox.findElement(By.name("login")).sendKeys("julio0001");

        //Clicar no campo com name "Password" que está dentro do formulário de id "signbox" e digitar "123456"
        formularioSignInBox.findElement(By.name("password")).sendKeys("123456");

        //Clicar no link com o texto "SIGN IN"
        formularioSignInBox.findElement(By.linkText("SIGN IN")).click();

        // Clicar em um link que posssui a class "me"
        navegador.findElement(By.className("me")).click();

        // Clicar em um link em que possui o texto "MORE DATA ABOUT YOU"
        navegador.findElement(By.linkText("MORE DATA ABOUT YOU")).click();

        // Clicar no elemento pelo seu xpath //span[text()="+551133334444"]/following-sibling::a
        navegador.findElement(By.xpath("//span[text()='+5511322441000']/following-sibling::a")).click();

        // Validar a janela JavaScript
        navegador.switchTo().alert().accept();

        // Validar que a mensagem apresentada foi Rest in peace, dear phone!
        WebElement mensagemPop = navegador.findElement(By.id("toast-container"));
        String mensagem = mensagemPop.getText();
        assertEquals("Rest in peace, dear phone!", mensagem);

        String screenshotArquivo = "C:/Users/CJ/IdeaProjects/webdriver.java/screenshotTests/Task It!/" + Generator.dataHoraParaArquivo() + test.getMethodName() + ".png";
        ScreenShot.tirar(navegador, screenshotArquivo);

        // Aguardar até 10 segundos para que a janela desapareça
        WebDriverWait aguardar = new WebDriverWait(navegador, 10);
        aguardar.until(ExpectedConditions.stalenessOf(mensagemPop));

        // Clicar no link com texto "log out"
        navegador.findElement(By.linkText("Logout")).click();
    }
    @After
    public void tearDown() {
        // Fechar o navegador
        navegador.quit();
    }
}
