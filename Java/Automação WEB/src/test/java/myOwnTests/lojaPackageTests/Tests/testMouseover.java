package myOwnTests.lojaPackageTests.Tests;

import myOwnTests.lojaPackageTests.Pages.LojaPage;
import myOwnTests.lojaPackageTests.Suporte.generator;
import myOwnTests.lojaPackageTests.Suporte.screenshot;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.testng.Assert;

import static myOwnTests.globalSuporte.webNavegador.getNavegador;
import static myOwnTests.globalSuporte.webNavegador.killDriver;

public class testMouseover {
    private LojaPage page;

    @Rule
    public TestName test = new TestName();

    @Before
    public void setUp() {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\CJ\\webdrivers\\msedgedriver.exe");
        getNavegador().get("http://automationpractice.com/index.php");
        page = new LojaPage();
    }

    @After
    public void teardown() {
        String screenshotArquivo = ("/Users/CJ/Codes/Java/Automação WEB/screenshotTests/" +
                generator.dataHoraParaArquivo() + test.getMethodName() + ".png");
        screenshot.tirar(getNavegador(), screenshotArquivo);

        killDriver();
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


    }
}
