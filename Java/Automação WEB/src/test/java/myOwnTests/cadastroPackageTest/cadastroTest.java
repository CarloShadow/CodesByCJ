package myOwnTests.cadastroPackageTest;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class cadastroTest {

    private dslCadastro dsl;
    private WebDriver navegador;

    @Before
    public void setUp() {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\CJ\\webdrivers\\msedgedriver.exe");
        navegador = new EdgeDriver();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navegador.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
        dsl = new dslCadastro(navegador);
    }

    @After
    public void teardown(){
       navegador.quit();
    }

    @Test
    public void testDevePreencherNome() {
        // Inserindo nome e o verificando
        dsl.escreve("elementosForm:nome", "Carlos");
        Assert.assertEquals("Carlos", dsl.receberValorDoCampo("elementosForm:nome"));

        // Inserindo sobrenome e o verificando
        dsl.escreve("elementosForm:sobrenome", "Junior");
        Assert.assertEquals("Junior", dsl.receberValorDoCampo("elementosForm:sobrenome"));

        // Clicando no radio e o verificando
        dsl.clicarRadio("elementosForm:sexo:0");
        Assert.assertTrue(dsl.receberValorRadio("elementosForm:sexo:0"));

        // Clicando no checkbox com texto "frango" e o verificando
        dsl.clicarRadio("elementosForm:comidaFavorita:1");
        Assert.assertTrue(dsl.receberValorRadio("elementosForm:comidaFavorita:1"));

        // Clicando no checkbox com texto "pizza" e o verificando
        dsl.clicarBotao("elementosForm:comidaFavorita:2");
        Assert.assertTrue(dsl.receberValorRadio("elementosForm:comidaFavorita:2"));

        // Selecionando opção do combo e verificando
        dsl.selecionarCombo("elementosForm:escolaridade", "2o grau completo");
        Assert.assertEquals("2o grau completo", dsl.receberValorCombo("elementosForm:escolaridade"));
        Assert.assertTrue(dsl.verificarOpcaoCombo("elementosForm:escolaridade", "2o grau completo"));


        // Selecionando uma opção do combo multiplo e verificando
        dsl.selecionarCombo("elementosForm:esportes", "Natacao");
        dsl.selecionarCombo("elementosForm:esportes", "Corrida");
        dsl.selecionarCombo("elementosForm:esportes", "Karate");

        List<String> opcoesMarcadas = dsl.obterValoresCombo("elementosForm:esportes");
        Assert.assertEquals(3, opcoesMarcadas.size());


        // Inserindo sugestões no campo e verificando
        dsl.escreve("elementosForm:sugestoes", "On the other hand, we denounce " +
                "with righteous indignation and dislike men who are " +
                "so beguiled and demoralized by the charms of pleasure of the moment, so blinded by desire, " +
                "that they cannot foresee the pain and trouble that are bound to ensue.");

        Assert.assertEquals("On the other hand, we denounce " +
                        "with righteous indignation and dislike men who are " +
                        "so beguiled and demoralized by the charms of pleasure of the moment, so blinded by desire, " +
                        "that they cannot foresee the pain and trouble that are bound to ensue.",
                dsl.receberValorDoCampo("elementosForm:sugestoes"));


        // Clicando no botão com texto "cadastrar" e verificando clique
        dsl.clicarBotao("elementosForm:cadastrar");
        Assert.assertEquals("Cadastrado!", dsl.receberValordoClickCadastroComnXpath("//div[@id='resultado']/span"));

        // Verificando dados do cadastro
        Assert.assertEquals("Nome: Carlos", dsl.receberValorDoCadastroConfirmado("descNome"));
        Assert.assertEquals("Sobrenome: Junior",dsl.receberValorDoCadastroConfirmado("descSobrenome"));
        Assert.assertEquals("Sexo: Masculino", dsl.receberValorDoCadastroConfirmado("descSexo"));
        Assert.assertEquals("Comida: Frango Pizza", dsl.receberValorDoCadastroConfirmado("descComida"));
        Assert.assertEquals("Escolaridade: 2graucomp", dsl.receberValorDoCadastroConfirmado("descEscolaridade"));
        Assert.assertEquals("Esportes: Natacao Corrida Karate", dsl.receberValorDoCadastroConfirmado("descEsportes"));
        Assert.assertEquals("Sugestoes: On the other hand, we denounce with righteous indignation and dislike men " +
                        "who are so beguiled and demoralized by the charms of pleasure of the moment, " +
                        "so blinded by desire, that they cannot foresee the pain and trouble that are bound to ensue.",
                        navegador.findElement(By.id("descSugestoes")).getText());
    }
}
