package myOwnTests.lojaPackageTests.Tests;

import myOwnTests.lojaPackageTests.DSL.dslLoja;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.testng.Assert;

import static myOwnTests.globalSuporte.webNavegador.getNavegador;

public class testProcurarRoupas {

    private dslLoja dsl;

    @Before
    public void setUp() {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\CJ\\webdrivers\\msedgedriver.exe");
        getNavegador().get("http://automationpractice.com/index.php");
        dsl = new dslLoja();
    }
    @Test
    public void deveProcurarPorRoupas() {

        //Deve clicar no botão "Sign in" e validar
        dsl.clicar(By.linkText("Sign in"));
        Assert.assertEquals("Email address", dsl.obterTexto("label[for='email_create']"));

        // Digitando email para login e validando
        dsl.escreverById("email", "carlos.a.1995@outlook.com");
        Assert.assertEquals("carlos.a.1995@outlook.com", dsl.receberValorDoCampo("email"));

        // Digitando senha e validando
        dsl.escreverById("passwd", "senhaumdois");
        Assert.assertEquals("senhaumdois", dsl.receberValorDoCampo("passwd"));

        // Clicando no botão de login e validando
        dsl.clicar(By.id("SubmitLogin"));
        Assert.assertEquals("MY ACCOUNT", dsl.receberTexto(By.tagName("h1")));

        // Clicando no botão "WOMEN" e validando
        dsl.clicar(By.xpath("//div[@id='block_top_menu']//a[@title='Women']"));
    }
}
