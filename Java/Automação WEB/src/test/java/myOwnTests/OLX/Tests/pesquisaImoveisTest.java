package myOwnTests.OLX.Tests;

import myOwnTests.OLX.Suporte.BaseTest;
import myOwnTests.OLX.Pages.olxPage;
import org.junit.Assert;
import org.junit.Test;

public class pesquisaImoveisTest extends BaseTest {

    olxPage page = new olxPage();

    @Test
    public void deveDefinirPrecoMinEMax() {
        // Definindo preço min/max do imóvel, validando e pesquisando
        page.escreverPrecoMin();
        page.escreverPrecoMax();
        Assert.assertEquals("0,00", page.obterTextoValorMin());
        Assert.assertEquals("200.000,00", page.obterTextoValorMax());
        page.clickPesquisaValores();
    }

    @Test
    public void deveInserirValorArea()  {
        // Definindo tamanho min/max da área do imovel, validando e pesquisando
        page.selecionarComboValorAreaMin();
        page.selecionarComboValorAreaMax();
        Assert.assertEquals("90", page.obterValorComboAreaMin());
        Assert.assertEquals("180", page.obterValorComboAreaMax());
        page.clickPesquisaArea();
    }

   /** @Test
    public void deveInserirQuantidadeQuartos() {
        // Selecionando quantidade min/max de quartos no combo, validando e pesquisando
        page.selecionarComboQuantidadeMinQuartos();
        page.selecionarComboQuantidadeMaxQuartos();
        Assert.assertEquals("2", page.obterValorComboQuantidadeMinQuartos());
        Assert.assertEquals("5 ou mais", page.obterValorComboQuantidadeMaxQuartos());
        page.clickPesquisaQuartos();
    }

    @Test
    public void deveInserirQuantidadeBanheiros() {
        // Selecionando quantidade min/max de banheiros no combo, validando e pesquisando
        page.selecionarComboQuantidadeMinBanheiros();
        page.selecionarComboQuantidadeMaxBanheiros();
        Assert.assertEquals("1", page.obterValorComboMinBanheiros());
        Assert.assertEquals("2", page.obterValorComboMaxBanheiros());
        page.clickPesquisaBanheiros();
    } **/
}
