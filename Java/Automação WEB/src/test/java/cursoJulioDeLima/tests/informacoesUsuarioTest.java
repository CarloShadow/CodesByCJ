package cursoJulioDeLima.tests;

import static org.junit.Assert.*;

import cursoJulioDeLima.suporte.Web;
import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

@RunWith(DataDrivenTestRunner.class)
@DataLoader(filePaths = "informacoesUsuarioTest.csv")
public class informacoesUsuarioTest {
    private WebDriver navegador;

    @Before
    public void setUp() {
        navegador = Web.createEdge();
    }

    @Test
    public void testAdicionarUmaInformacaoDoUsuario(@Param(name="tipo")String tipo, @Param(name="contato")String contato,
                                                    @Param(name="mensagem")String mensagemEsperada) {
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

        // Clicar no botão através do seu xpath //button[@data-target="addmoredata"]
        navegador.findElement(By.xpath("//button[@data-target='addmoredata']")).click();

        // Identificar a popup onde está o formulário de id addmoredata
        WebElement popupAddMoreData = navegador.findElement(By.id("addmoredata"));

        // Na combobox de name "type" escolhe a opção "phone"
        WebElement campoType = popupAddMoreData.findElement(By.name("type"));
        new Select(campoType).selectByVisibleText(tipo);

        // No campo de name "contatc" digitar "+5511999999999"
        popupAddMoreData.findElement(By.name("contact")).sendKeys(contato);


        // Clicar no link text "SAVE' que está na popup
        popupAddMoreData.findElement(By.linkText("SAVE")).click();

        // Na mensagem de id "toast-container" validar que o texto é "Your contact has been added!"
        WebElement mensagemPop = navegador.findElement(By.id("toast-container"));
        String mensagem = mensagemPop.getText();
        assertEquals(mensagemEsperada, mensagem);

    }

    @After
    public void tearDown() {
        //Fechar o navegador
        navegador.quit();
    }
}
