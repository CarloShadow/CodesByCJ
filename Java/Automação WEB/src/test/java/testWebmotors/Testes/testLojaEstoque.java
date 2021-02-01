package testWebmotors.Testes;

import org.junit.*;
import org.junit.rules.TestName;
import org.openqa.selenium.WebDriver;
import testWebmotors.Pages.webmotorsPage;
import testWebmotors.Suporte.generatorWM;
import testWebmotors.Suporte.screenshotWM;
import testWebmotors.Suporte.webWebmotors;

public class testLojaEstoque {

    private WebDriver navegador;
    private webmotorsPage page;

    @Rule
    public TestName test = new TestName();

    @Before
    public void setUp() {
        navegador = webWebmotors.createEdge1();
        page = new webmotorsPage(navegador);
    }

    @After
    public void teardown() {
        navegador.quit();
    }

    @Test
    public void deveValidarOEstoqueLoja() {
        Assert.assertEquals("78carros encontrados", page.obterTextoEstoque());

        String screenshotArquivo = ("/Users/CJ/Codes/Java/Automação WEB/src/test/ScreenShots/" +
                generatorWM.dataHoraParaArquivo() + test.getMethodName() + ".png");
        screenshotWM.tirar(navegador,screenshotArquivo);

    }
}
