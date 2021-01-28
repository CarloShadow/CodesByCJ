package myOwnTests.lojaPackageTests.Tests;

import myOwnTests.lojaPackageTests.Pages.LojaPage;
import myOwnTests.lojaPackageTests.Suporte.generator;
import myOwnTests.lojaPackageTests.Suporte.webLoja;
import myOwnTests.lojaPackageTests.Suporte.screenshot;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class testMouseover {
    private WebDriver navegador;
    private LojaPage page;

    @Rule
    public TestName test = new TestName();

    @Before
    public void setUp() {
        navegador = webLoja.createEdge2();
        page = new LojaPage(navegador);
    }

    @After
    public void teardown() {
        navegador.quit();
    }


    @Test
    public void testDeveInteragindoComMouseover() {

        //Deve clicar no botão "Sign in" e validar
        page.setSignIn();
        Assert.assertEquals("Email address", page.obterTextoEmailAddress());

        // Digitando email para login e validando
        page.setEmail("carlos.a.1995@outlook.com");
        Assert.assertEquals("carlos.a.1995@outlook.com", page.obterEmail());

        // Digitando senha e validando
        page.setSenha("senhaumdois");
        Assert.assertEquals("senhaumdois", page.obterSenha());

        // Clicando no botão de login e validando
        page.setBotaoLogin();
        Assert.assertEquals("MY ACCOUNT", page.obterTextoMyAccount());

        // Clicando em T-shirts e validando
        page.setHoverMenu();
        page.setOpcaoTshirt();
        Assert.assertEquals("T-SHIRTS ", page.obterTextoTshirt());

        String screenshotArquivo = ("/Users/CJ/IdeaProjects/webdriver.java/screenshotTests/" +
                generator.dataHoraParaArquivo() + test.getMethodName() + ".png");
        screenshot.tirar(navegador, screenshotArquivo);

    }
}
