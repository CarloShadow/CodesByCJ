package myOwnTests.OLX.Tests;

import myOwnTests.OLX.Pages.BasePage;
import myOwnTests.OLX.Suporte.web;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class pesquisaImoveisTest {

    public void setNavegador(WebDriver navegador) {
        this.navegador = navegador;
    }
    private WebDriver navegador;
    private BasePage page;

    @Before
    public void setUp() {
        navegador = web.createEdge();
        page = new BasePage(navegador);
    }

    @Test
    public void deveNavegagarPorImoveis() {
        // Pesquisando por "Imóveis" e validando
        Assert.assertEquals("Imóveis", page.obterTextoImoveis());
        page.clickImoveis();
        Assert.assertEquals("Imóveis", page.obterTextoImoveis1());

        // Clicando em opção "Casas e Aps a venda" e escolhendo opção "Casas" e validando
        page.clickCasasEAps();
        page.clickCheckCasas();
        Assert.assertTrue(page.obterValorCheckCasas());

        // Definindo preço minimo e máximo do imóvel e validando
        page.escreverPrecoMin();
        page.escreverPrecoMax();
        Assert.assertEquals("0,00", page.obterTextoValorMin());
        Assert.assertEquals("200.000,00", page.obterTextoValorMax());
        page.clickPesquisaValores();

        // Definindo tamanho da área do imovel e validando
        page.selecionarComboValorAreaMin();
        page.selecionarComboValorAreaMax();
        Assert.assertEquals("90", page.obterValorComboAreaMin());
        Assert.assertEquals("180", page.obterValorComboAreaMax());
        page.clickPesquisaArea();
    }
}
