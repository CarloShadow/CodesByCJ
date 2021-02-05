package myOwnTests.lojaPackageTests.Tests;

import myOwnTests.lojaPackageTests.DSL.dslCadastro;
import myOwnTests.lojaPackageTests.Pages.cadastroPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.testng.Assert;
import static myOwnTests.globalSuporte.webNavegador.getNavegador;
import static myOwnTests.globalSuporte.webNavegador.killDriver;

public class testCadastroLoja {

    private dslCadastro dsl;
    private cadastroPage page;

    @Before
    public void setUp() {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\CJ\\webdrivers\\msedgedriver.exe");
        getNavegador().get("http://automationpractice.com/index.php");
        dsl = new dslCadastro();
        page = new cadastroPage();
    }

    @After
    public void teardown() {
        killDriver();
    }

    @Test
    public void testdeveFazerOCadastro() {

        //Deve clicar no botão "Sign in" e validar
        page.setSignIn();
        Assert.assertEquals("Email address", page.obterTextoEmailAddress());

        // Digtando e-mail, clicando no botao de cadastro e validando
        page.setEmailCadastro();
        page.setCliqueBotaoCadastro();
        Assert.assertEquals("CREATE AN ACCOUNT", page.setObterTextoCreatAnAnccount());

        // Clicando radio
        dsl.clicar(By.id("id_gender1"));
        Assert.assertTrue(page.setObterCliqueRadio());

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

        // Clicar no botão e cadastrar
        //dsl.clicar(By.id("submitAccount"));
    }
}
