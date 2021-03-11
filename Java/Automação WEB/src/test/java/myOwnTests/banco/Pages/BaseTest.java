package myOwnTests.banco.Pages;

import myOwnTests.banco.Suporte.generator;
import myOwnTests.banco.Suporte.screenshot;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import java.io.IOException;
import static myOwnTests.banco.Pages.DriverFactory.getDriver;
import static myOwnTests.banco.Pages.DriverFactory.killDriver;

public class BaseTest {

    @Rule
    public TestName test = new TestName();

    @Before
    public void login() {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\CJ\\WebDrivers1\\msedgedriver.exe");
        getDriver().get("https://seubarriga.wcaquino.me/logout");
        BasePage page = new BasePage();

        // Fazendo Login e Validando pagina seguinte
        page.setEmail();
        page.setSenha();
        Assert.assertEquals("sikac36062@jentrix.com", page.obterEmail());
        Assert.assertEquals("123456", page.obterSenha());
        page.setClickBotaoLogin();
        Assert.assertEquals("Bem vindo, Jubileu!", page.obterTextoBemVindo());
    }

    @After
    public void finaliza() throws IOException {
        String screenshotArquivo = ("/Users/CJ/Codes/Java/Automação WEB/src/test/java/myOwnTests/banco/screenshot/" +
                generator.dataHoraParaArquivo() + test.getMethodName() + ".png");
        screenshot.tirar(getDriver(), screenshotArquivo);
        if(Propriedades.FECHAR_BROWSER) {
            killDriver();
        }
    }
}

