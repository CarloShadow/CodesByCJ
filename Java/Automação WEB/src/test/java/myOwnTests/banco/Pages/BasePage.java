package myOwnTests.banco.Pages;

import org.openqa.selenium.By;

import static myOwnTests.banco.Pages.Propriedades.NOME_CONTA_ADD;
import static myOwnTests.banco.Pages.Propriedades.NOME_CONTA_ALTERADA;

public class BasePage {

    private final DSL dsl;

    public BasePage() {
        dsl = new DSL();
    }

    public void setEmail() {
        dsl.escrever(By.id("email"), "sikac36062@jentrix.com");
    }

    public void setSenha() {
        dsl.escrever(By.id("senha"), "123456");
    }

    public String obterEmail() {
        return dsl.obterValorCampo("email");
    }

    public String obterSenha() {
        return dsl.obterValorCampo("senha");
    }

    public void setClickBotaoLogin() {
        dsl.clicarBotaoBy(By.cssSelector("button[class='btn btn-primary']"));
    }

    public String obterTextoBemVindo() {
        return dsl.obterTexto(By.cssSelector("div[class='alert alert-success']"));
    }

    public void setClickContas() {
        dsl.clicarBotaoBy(By.xpath("//a[@class='dropdown-toggle']"));
    }

    public void setClickAdcionar() {
        dsl.clicarBotaoBy(By.linkText("Adicionar"));
    }

    public String obterTextoNome() {
        return dsl.obterTexto(By.xpath("//label[@for='nome']"));
    }

    public void setEscreverContaNova() {
        dsl.escrever(By.id("nome"), NOME_CONTA_ADD);
    }

    public String obterTextoCampoAddConta() {
        return dsl.obterValorCampo("nome");
    }

    public void setClickSalvarConta() {
        dsl.clicarBotaoBy(By.xpath("//button[@type='submit']"));
    }

    public String obterTextoContaAdicionadaSucesso() {
        return dsl.obterTexto(By.xpath("//div[@class='alert alert-success']"));
    }

    public void setClickListar() {
        dsl.clicarBotaoBy(By.linkText("Listar"));
    }

    public String obterTextoConta() {
        return dsl.obterTexto(By.xpath("//th[.='Conta']"));
    }

    public void setClickEditarConta() {
        dsl.clicarBotaoBy(By.className("glyphicon glyphicon-edit"));
    }

    public void setEscrevendoNovoNome() {
        dsl.escrever(By.id("nome"), NOME_CONTA_ALTERADA);
    }

    public void obterTextoNovoNome() {
        dsl.obterValorCampo("nome");
    }

    public String obterTextoContaAlteradaSucesso() {
        return dsl.obterTexto(By.xpath("//div[@class='alert alert-success']"));
    }

    public void setEscreverContaExistente() {
        dsl.escrever(By.id("nome"), NOME_CONTA_ALTERADA);
    }

    public String obterTextoJaExisteConta() {
        return dsl.obterTexto(By.xpath("//div[@class='alert alert-danger']"));
    }

    public void setClickMovimentacao() {
        dsl.clicarBotaoBy(By.linkText("Criar Movimentação"));
    }

    public String obterTextoTipoDeMovimentacao() {
        return dsl.obterTexto(By.xpath("//label[.='Tipo da Movimentação']"));
    }

    public void setEsreverDataMovimentacao03102016() {
        dsl.escrever(By.id("data_transacao"), "03/10/2016");
    }

    public void setEsreverDataPagamento04102016() {
        dsl.escrever(By.id("data_pagamento"), "04/10/2016");
    }

    public void setEsreverDescricao() {
        dsl.escrever(By.id("descricao"), "Prestação do carro");
    }

    public void setEsreverInteressado() {
        dsl.escrever(By.id("interessado"), "Toretto");
    }

    public void setEsreverValor() {
        dsl.escrever(By.id("valor"), "800");
    }

    public void setEscolherOpcaoDaConta() {
        dsl.selecionarCombo("conta", NOME_CONTA_ALTERADA);
    }

    public String obterTextoDataPagaemento() {
        return dsl.obterValorCampo("data_pagamento");
    }

    public String obterTextoDescricao() {
        return dsl.obterValorCampo("descricao");
    }

    public String obterTextoInteressado() {
        return dsl.obterValorCampo("interessado");
    }

    public String obterTextoValor() {
        return dsl.obterValorCampo("valor");
    }

    public String obterTextoDataMovimentacao() {
        return dsl.obterValorCampo("data_transacao");
    }

    public String obterValorComboContas() {
        return dsl.obterValorCombo("conta");
    }

    public void setClickSalvarMovimentacao() {
        dsl.clicarBotaoBy(By.xpath("//button[@type='submit']"));
    }

    public String obterTextoMovimentacaoAddSucesso() {
        return dsl.obterTexto(By.xpath("//div[@class='alert alert-success']"));
    }

    public String obterTextoCamposObrigatorios() {
        return dsl.obterTexto(By.xpath("//div[@class='alert alert-danger']"));
    }

    public void setEsreverDataMovimentacao12052022() {
        dsl.escrever(By.id("data_transacao"),"12/05/2022");
    }

    public String obterTextoErroMovimentacaoFutura() {
        return dsl.obterTexto(By.xpath("//li[.='Data da Movimentação deve ser menor ou igual à data atual']"));
    }

    public void setClickResumoMensal() {
        dsl.clicarBotaoBy(By.linkText("Resumo Mensal"));
    }

    public String obterTextoDtPagamento() {
        return dsl.obterTexto(By.xpath("//th[.='Dt Pagamento']"));
    }

    public void setMesMovimentacao() {
        dsl.selecionarCombo("mes","Outubro");
    }

    public void serAnoMovimentacao() {
        dsl.selecionarCombo("ano","2016");
    }

    public String obterValorMesMovimentacao() {
        return dsl.obterValorCombo("mes");
    }

    public String obterValorAnoMovimentacao() {
        return dsl.obterValorCombo("ano");
    }

    public void setClickBuscarMovimentacao() {
        dsl.clicarBotaoBy(By.xpath("//input[@type='submit']"));
    }

    public void setClickExcluirMovimentacao() {
        dsl.clicarBotaoBy(By.xpath("//tbody/tr[1]/td[6]/a[1]/span[1]"));
    }

    public String obterTextoMovimentacaoExlcuidaSucesso() {
        return dsl.obterTexto(By.xpath("//div[@class='alert alert-success']"));
    }


    public String obterTextoContaEmUso() {
        return dsl.obterTexto(By.xpath("//div[@class='alert alert-danger']"));
    }

    public String obterSaldoConta(String nome) {
        return dsl.obterCelula("Conta", nome, "Saldo", "tabelaSaldo").getText();
    }

    public void setClicarExcluirConta(String string) {
        dsl.obterCelula("Conta", string, "Ações", "tabelaContas")
                .findElement(By.xpath(".//span[@class='glyphicon glyphicon-remove-circle']")).click();
    }

    public void setClicarAlterarConta(String string) {
        dsl.obterCelula("Conta", string, "Ações", "tabelaContas")
                .findElement(By.xpath(".//span[@class='glyphicon glyphicon-edit']")).click();
    }
}
