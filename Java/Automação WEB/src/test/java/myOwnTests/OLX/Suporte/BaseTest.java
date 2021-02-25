package myOwnTests.OLX.Suporte;

import org.junit.Assert;
import org.junit.Before;

import java.util.concurrent.TimeUnit;

import static myOwnTests.OLX.Suporte.DriverFactory.getDriver;


public class BaseTest {
    ImoveisPage page = new ImoveisPage();

    @Before
    public void PesquisaImoveis() {
        //Abrindo navegador
        System.setProperty("webdriver.edge.driver", "C:\\Users\\CJ\\webdrivers\\msedgedriver.exe");
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        page.acessarTelaInicial();

        // Pesquisando por "Imóveis" e validando
        Assert.assertEquals("Imóveis", page.obterTextoImoveis());
        page.clickImoveis();
        Assert.assertEquals("Imóveis", page.obterTextoImoveis1());

        // Clicando em opção "Casas e Aps a venda" e escolhendo opção "Casas" e validando
        page.clickCasasEAps();
        page.clickCheckCasas();
        Assert.assertTrue(page.obterValorCheckCasas());
    }
}
