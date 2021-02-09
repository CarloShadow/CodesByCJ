package myOwnTests.banco.Tests;

import myOwnTests.banco.Pages.BasePage;
import myOwnTests.banco.Pages.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class testsContas extends BaseTest {

    private BasePage page;

    @Before
    public void setUp() {
        page = new BasePage();
    }

    @Test
    public void test1InserirConta() {

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
    public void test2AlterarConta() {

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
    public void test3InserirContaExistente() {

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



}
