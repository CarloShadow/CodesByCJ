package myOwnTests.lojaPackageTests.Tests;

import myOwnTests.lojaPackageTests.DSL.dslCadastro;
import myOwnTests.lojaPackageTests.Pages.cadastroPage;
import myOwnTests.lojaPackageTests.Suporte.webLoja;
import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

@RunWith(DataDrivenTestRunner.class)
@DataLoader(filePaths = "testCadastroLoja.csv")
public class testCadastroLoja {
    private WebDriver navegador;
    private dslCadastro dsl;
    private cadastroPage page;

    @Before
    public void setUp() {
        navegador = webLoja.createEdge2();
        dsl = new dslCadastro(navegador);
        page = new cadastroPage(navegador);
    }

    @After
    public void teardown() {
        navegador.quit();
    }

    @Test
    public void testdeveFazerOCadastro() {

        //Deve clicar no botão "Sign in" e validar
        dsl.clicar(By.linkText("Sign in"));
        Assert.assertEquals("Email address", page.obterTextoEmailAddress());

        // Digtando e-mail, clicando no botao de cadastro e validando
        dsl.escreverCssSelector("input[id='email_create']", "fabiana9444@uorak.com");
        dsl.clicar(By.id("SubmitCreate"));
        Assert.assertEquals("CREATE AN ACCOUNT", dsl.receberTexto(By.tagName("h3")));

        // Clicando radio
        dsl.clicar(By.id("id_gender1"));
        Assert.assertTrue(dsl.receberValorRadio("id_gender1"));

        // Digitando primeiro nome e validando
        dsl.escreverById("customer_firstname", "Carl");
        Assert.assertEquals("Carl", dsl.receberValorDoCampo("customer_firstname"));

        // Digitando ultimo nome e validando
        dsl.escreverById("customer_lastname", "Johnson");
        Assert.assertEquals("Johnson", dsl.receberValorDoCampo("customer_lastname"));

        // Digitando senha e validando
        dsl.escreverById("passwd", "senhaumdois");
        Assert.assertEquals("senhaumdois", dsl.receberValorDoCampo("passwd"));

        // Selecionar opção do "dia" no combo e validar
        dsl.selecionarCombo("days","7");
        Assert.assertEquals("7  " , dsl.receberValorCombo("days"));

        // Selecionar opção do "mês" no combo e validar
        dsl.selecionarCombo("months", "10");
        Assert.assertEquals("October ", dsl.receberValorCombo("months"));

        // Selecionar opção do "ano" no como e validar
        dsl.selecionarCombo("years", "35");
        Assert.assertEquals("1987  ", dsl.receberValorCombo("years"));

        // Digitar empresa e validar
        dsl.escreverById("company", "Burguer Shot");
        Assert.assertEquals("Burguer Shot", dsl.receberValorDoCampo("company"));

        // Digitando endereço e validar
        dsl.escreverById("address1", "Grove St");
        Assert.assertEquals("Grove St", dsl.receberValorDoCampo("address1"));

        // Digitar cidade e validar
        dsl.escreverById("city", "East Los Santos");
        Assert.assertEquals("East Los Santos", dsl.receberValorDoCampo("city"));

        // Selecionar opção do estado no combo e validar
        dsl.selecionarCombo("id_state", "5");
        Assert.assertEquals("California", dsl.receberValorCombo("id_state"));

        // Digitar cep e validar 90017
        dsl.escreverById("postcode", "90017");
        Assert.assertEquals("90017", dsl.receberValorDoCampo("postcode"));

        // Digitar informações adicionais e as validar
        dsl.escreverById("other", "Ah sh*t, here we go again");
        Assert.assertEquals("Ah sh*t, here we go again", dsl.receberValorDoCampo("other"));

        // Digitar telefone e validar
        dsl.escreverById("phone_mobile", "213-555-0113");
        Assert.assertEquals("213-555-0113", dsl.receberValorDoCampo("phone_mobile"));

        // Clicar no botão, cadastrar e validar
        //dsl.clicar(By.id("submitAccount"));
    }
}
