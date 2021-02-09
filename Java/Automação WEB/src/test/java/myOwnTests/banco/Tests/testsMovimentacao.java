package myOwnTests.banco.Tests;

import myOwnTests.banco.Pages.BasePage;
import myOwnTests.banco.Pages.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class testsMovimentacao extends BaseTest {


    private BasePage page;

    @Before
    public void setUp() {
        page = new BasePage();
    }

    @Test
    public void test1FazerMovimentacao() {

        // Navegando até movimentação e validando página
        page.setClickMovimentacao();
        Assert.assertEquals("Tipo da Movimentação", page.obterTextoTipoDeMovimentacao());

        // Preenchendo campos de movimentação, validandar e clicar em salvar
        page.setEsreverDataMovimentacao03102016();
        page.setEsreverDataPagamento04102016();
        page.setEsreverDescricao();
        page.setEsreverInteressado();
        page.setEsreverValor();
        page.setEscolherOpcaoDaConta();

        Assert.assertEquals("03/10/2016", page.obterTextoDataMovimentacao());
        Assert.assertEquals("04/10/2016", page.obterTextoDataPagaemento());
        Assert.assertEquals("Prestação do carro", page.obterTextoDescricao());
        Assert.assertEquals("Toretto", page.obterTextoInteressado());
        Assert.assertEquals("800", page.obterTextoValor());
        Assert.assertEquals("Conta Bill Gates", page.obterValorComboContas());

        page.setClickSalvarMovimentacao();
        Assert.assertEquals("Movimentação adicionada com sucesso!", page.obterTextoMovimentacaoAddSucesso());
    }

    @Test
    public void test2CamposObrigatorios() {

        // Navegando até movimentação e validando página
        page.setClickMovimentacao();
        Assert.assertEquals("Tipo da Movimentação", page.obterTextoTipoDeMovimentacao());

        // Clicando em salvar sem preencher campos obrigatórios e validando mensagem
        page.setClickSalvarMovimentacao();

        Assert.assertEquals("Data da Movimentação é obrigatório\n" +
                "Data do pagamento é obrigatório\n" +
                "Descrição é obrigatório\n" +
                "Interessado é obrigatório\n" +
                "Valor é obrigatório\n" +
                "Valor deve ser um número", page.obterTextoCamposObrigatorios());
    }

    @Test
    public void test3MovimentacaoFutura() {

        // Navegando até movimentação e validando página
        page.setClickMovimentacao();
        Assert.assertEquals("Tipo da Movimentação", page.obterTextoTipoDeMovimentacao());

        // Preenchendo campo da data da movimentação com erro
        page.setEsreverDataMovimentacao12052022();
        page.setEsreverDataPagamento04102016();
        page.setEsreverDescricao();
        page.setEsreverInteressado();
        page.setEsreverValor();
        page.setEscolherOpcaoDaConta();

        Assert.assertEquals("12/05/2022", page.obterTextoDataMovimentacao());
        Assert.assertEquals("04/10/2016", page.obterTextoDataPagaemento());
        Assert.assertEquals("Prestação do carro", page.obterTextoDescricao());
        Assert.assertEquals("Toretto", page.obterTextoInteressado());
        Assert.assertEquals("800", page.obterTextoValor());
        Assert.assertEquals("Conta Bill Gates", page.obterValorComboContas());

        // Clicando em salvar movimentação e validando mensagem de erro
        page.setClickSalvarMovimentacao();
        Assert.assertEquals("Data da Movimentação deve ser menor ou igual à data atual",
                page.obterTextoErroMovimentacaoFutura());
    }
}
