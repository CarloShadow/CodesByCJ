package myOwnTests.lojaPackageTests.Tests;

import myOwnTests.lojaPackageTests.DSL.dslLoja;
import myOwnTests.lojaPackageTests.Suporte.webLoja;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class testProcurarRoupas {

    private WebDriver navegador;
    private dslLoja dsl;

    @Before
    public void setUp() {
        navegador = webLoja.createEdge2();
        dsl = new dslLoja(navegador);
    }

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
