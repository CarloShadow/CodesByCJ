package testWebmotors.Testes;

import org.junit.*;
import org.junit.rules.TestName;
import org.openqa.selenium.WebDriver;
import testWebmotors.Pages.webmotorsPage;
import testWebmotors.Suporte.generatorWM;
import testWebmotors.Suporte.screenshotWM;
import testWebmotors.Suporte.webWebmotors;

import java.util.concurrent.TimeUnit;


public class testWebmotors {
    private WebDriver navegador;
    private webmotorsPage page;

    @Rule
    public TestName test = new TestName();

    @Before
    public void setUp() {
        navegador = webWebmotors.createEdge();
        page = new webmotorsPage(navegador);
    }

   // @After
    //public void teardown() {
     //   navegador.quit();
   // }

    @Test
    public void deveValidarBuscaHONDACITY15DX16VFLEX4PAUTOMATICO() {
        // Digitando "Honda city" no campo de busca e validando
        page.escreverHondaCity();
        Assert.assertEquals("Honda City", page.obterTextoCampoBusca());

        // Pesquisando "Honda City" e validando
        page.clicarCampoPesquisa();
        page.desmarcarLocalSP();
        Assert.assertEquals("HONDA CITY", page.obterTextoHondaCityNovosEUsados());

        // Navegando no combo com texto "Todas as versões" e validando
        page.clicarTodasVersoes();
        Assert.assertEquals("Versões", page.obterTextoVersoes());

        // Clicando na versão do Honda City
        page.clicarModeloCarro();
        Assert.assertEquals("HONDA CITY 1.5 DX 16V FLEX 4P AUTOMÁTICO", page.obterTextoHONDACITY15DX16VFLEX4PAUTOMATICO());

        String screenshotArquivo = ("/Users/CJ/Codes/Java/Automação WEB/src/test/ScreenShots/" +
                generatorWM.dataHoraParaArquivo() + test.getMethodName() + ".png");
        screenshotWM.tirar(navegador,screenshotArquivo);


    }

}
