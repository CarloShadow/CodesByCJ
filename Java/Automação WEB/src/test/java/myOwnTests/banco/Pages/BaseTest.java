package myOwnTests.banco.Pages;

import myOwnTests.banco.Suporte.generator;
import myOwnTests.banco.Suporte.screenshot;
import org.junit.After;
import org.junit.Rule;
import org.junit.rules.TestName;
import java.io.IOException;
import static myOwnTests.banco.Pages.DriverFactory.getDriver;
import static myOwnTests.banco.Pages.DriverFactory.killDriver;

public class BaseTest {

    @Rule
    public TestName test = new TestName();

    @After
    public void finaliza() throws IOException {
        String screenshotArquivo = ("/Users/CJ/Codes/Java/Automação WEB/src/main/java/Sr_Barriga/screeshot/" +
                generator.dataHoraParaArquivo() + test.getMethodName() + ".png");
        screenshot.tirar(getDriver(), screenshotArquivo);
        if(Propriedades.FECHAR_BROWSER) {
            killDriver();
        }
    }
}
