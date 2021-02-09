package myOwnTests.banco.Tests;

import myOwnTests.banco.Pages.BasePage;
import myOwnTests.banco.Pages.BaseTest;
import myOwnTests.banco.Pages.DriverFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class testResumo extends BaseTest {

    private BasePage page;

    @Before
    public void setUp() {
        page = new BasePage();
    }
    @Test
    public void test1ExcluirMovimentacao() {

        // Navegando até o resumo mensal e validando
        page.setClickResumoMensal();
        Assert.assertEquals("Dt Pagamento", page.obterTextoDtPagamento());

        // Selecionando ano e mês da movimentação a ser excluida e validando
        page.setMesMovimentacao();
        page.serAnoMovimentacao();
        Assert.assertEquals("Outubro", page.obterValorMesMovimentacao());
        Assert.assertEquals("2016", page.obterValorAnoMovimentacao());

        // Pesquisando movimentações, excluindo e validando mensagem
        page.setClickBuscarMovimentacao();
        page.setClickExcluirMovimentacao();
        Assert.assertEquals("Movimentação removida com sucesso!", page.obterTextoMovimentacaoExlcuidaSucesso());

    }

    @Test
    public void test2VerificarOResumoMensal() {

        // Navegando até o resumo mensal e validando
        page.setClickResumoMensal();

        Assert.assertEquals("Seu Barriga - Extrato", DriverFactory.getDriver().getTitle());
    }
}
