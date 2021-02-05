package myOwnTests.banco.Tests;

import myOwnTests.banco.Pages.BasePage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static myOwnTests.banco.Pages.DriverFactory.getDriver;

public class testsBanco {

    private BasePage page;

    @Before
    public void setUp() {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\CJ\\webdrivers\\msedgedriver.exe");
        getDriver().get("https://seubarriga.wcaquino.me/logout");
        page = new BasePage();
    }

    @Test
    public void deveInserirConta() {

        // Fazendo Login e Validando pagina seguinte
        page.setEmail();
        page.setSenha();
        Assert.assertEquals("sikac36062@jentrix.com", page.obterEmail());
        Assert.assertEquals("123456", page.obterSenha());
        page.setClickBotaoLogin();
        Assert.assertEquals("Bem vindo, Jubileu!", page.obterTextoBemVindo());

        // Navegando até página de adição de contas
        page.setClickContas();
        page.setClickAdcionar();
        Assert.assertEquals("Nome", page.obterTextoNome());

        // Inserindo conta
        page.setEscreverConta1();
        Assert.assertEquals("conta1", page.obterTextoCampoAddConta());
        page.setClickSalvarConta();
        Assert.assertEquals("Conta adicionada com sucesso!", page.obterTextoContaAdicionadaSucesso());

    }

    @Test
    public void deveAlterarConta() {

        // Fazendo Login e Validando pagina seguinte
        page.setEmail();
        page.setSenha();
        Assert.assertEquals("sikac36062@jentrix.com", page.obterEmail());
        Assert.assertEquals("123456", page.obterSenha());
        page.setClickBotaoLogin();
        Assert.assertEquals("Bem vindo, Jubileu!", page.obterTextoBemVindo());

        // Navegando até lista de contas
        page.setClickContas();
        page.setClickListar();
        Assert.assertEquals("Conta", page.obterTextoConta());

        // Editando Conta
        page.setClickEditarContaMoscando();
        Assert.assertEquals("Nome", page.obterTextoNome());
        page.setEscrevendoNovoNome();
        page.obterTextoNovoNome();
        page.setClickSalvarConta();
        Assert.assertEquals("Conta alterada com sucesso!", page.obterTextoContaAlteradaSucesso());

    }

    @Test
    public void deveInserirContaExistente() {

        // Fazendo Login e Validando pagina seguinte
        page.setEmail();
        page.setSenha();
        Assert.assertEquals("sikac36062@jentrix.com", page.obterEmail());
        Assert.assertEquals("123456", page.obterSenha());
        page.setClickBotaoLogin();
        Assert.assertEquals("Bem vindo, Jubileu!", page.obterTextoBemVindo());

        // Navegando até página de adição de contas
        page.setClickContas();
        page.setClickAdcionar();
        Assert.assertEquals("Nome", page.obterTextoNome());

        // Inserindo conta ja existente
        page.setEscreverContaExistente();
        Assert.assertEquals("Conta Existente", page.obterTextoCampoAddConta());
        page.setClickSalvarConta();
        Assert.assertEquals("Já existe uma conta com esse nome!", page.obterTextoJaExisteConta());
    }

    @Test
    public void deveFazerMovimentacao() {

        // Fazendo Login e Validando pagina seguinte
        page.setEmail();
        page.setSenha();
        Assert.assertEquals("sikac36062@jentrix.com", page.obterEmail());
        Assert.assertEquals("123456", page.obterSenha());
        page.setClickBotaoLogin();
        Assert.assertEquals("Bem vindo, Jubileu!", page.obterTextoBemVindo());

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
    public void deveTestarCamposObrigatorios() {

        // Fazendo Login e Validando pagina seguinte
        page.setEmail();
        page.setSenha();
        Assert.assertEquals("sikac36062@jentrix.com", page.obterEmail());
        Assert.assertEquals("123456", page.obterSenha());
        page.setClickBotaoLogin();
        Assert.assertEquals("Bem vindo, Jubileu!", page.obterTextoBemVindo());

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
    public void deveFazerMovimentacaoFutura() {

        // Fazendo Login e Validando pagina seguinte
        page.setEmail();
        page.setSenha();
        Assert.assertEquals("sikac36062@jentrix.com", page.obterEmail());
        Assert.assertEquals("123456", page.obterSenha());
        page.setClickBotaoLogin();
        Assert.assertEquals("Bem vindo, Jubileu!", page.obterTextoBemVindo());

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

    @Test
    public void deveExcluirMovimentacao() {

        // Fazendo Login e Validando pagina seguinte
        page.setEmail();
        page.setSenha();
        Assert.assertEquals("sikac36062@jentrix.com", page.obterEmail());
        Assert.assertEquals("123456", page.obterSenha());
        page.setClickBotaoLogin();
        Assert.assertEquals("Bem vindo, Jubileu!", page.obterTextoBemVindo());

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
}
