package cursoF.Aquino.testesEstudo;

import cursoF.Aquino.DSL.dslPaginaComponentes;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class testePaginaComponentes {

    private dslPaginaComponentes dsl;

    @Test
    public void testAdicaoDeNome() {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\CJ\\webdrivers\\msedgedriver.exe");
        WebDriver navegador = new EdgeDriver();
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


        navegador.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");

        // Inserindo nome e verificando se ele realmente foi digitado no campo
        navegador.findElement(By.id("elementosForm:nome")).sendKeys("Jubliskleiton");

        // Validando nome (com variavel)
        navegador.findElement(By.id("elementosForm:nome")).getAttribute("value");

        Assert.assertEquals("Jubliskleiton", navegador.findElement(By.id("elementosForm:nome")).getAttribute("value"));

        navegador.quit();
    }

    @Test
    public void testDigitandoSugestoes() {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\CJ\\webdrivers\\msedgedriver.exe");
        WebDriver navegador = new EdgeDriver();
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navegador.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");

        // Inserindo e vericando sugestoes
        navegador.findElement(By.id("elementosForm:sugestoes")).sendKeys("Nada ver irmao\ntudo a ver irmao\nque dia foi isso");
        navegador.findElement(By.id("elementosForm:sugestoes")).getAttribute("value");
        Assert.assertEquals("Nada ver irmao\ntudo a ver irmao\nque dia foi isso", navegador.findElement(By.id("elementosForm:sugestoes")).getAttribute("value"));

        navegador.quit();
    }

    @Test
    public void testInteracaoComRadioButtom() {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\CJ\\webdrivers\\msedgedriver.exe");
        WebDriver navegador = new EdgeDriver();
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navegador.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");

        // Clicando e verificando radio button
        navegador.findElement(By.id("elementosForm:sexo:0")).click();
        Assert.assertTrue(navegador.findElement(By.id("elementosForm:sexo:0")).isSelected());

        navegador.quit();
    }

    @Test
    public void testInteracaoComCheckBox() {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\CJ\\webdrivers\\msedgedriver.exe");
        WebDriver navegador = new EdgeDriver();
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navegador.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");

        // Clicando e verificando radio button
        navegador.findElement(By.id("elementosForm:comidaFavorita:2")).click();
        Assert.assertTrue(navegador.findElement(By.id("elementosForm:comidaFavorita:2")).isSelected());

        navegador.quit();
    }

    @Test
    public void testInteracaoComCombo() {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\CJ\\webdrivers\\msedgedriver.exe");
        WebDriver navegador = new EdgeDriver();
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navegador.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");

        WebElement element = navegador.findElement(By.id("elementosForm:escolaridade"));

        Select combo = new Select(element);
        // selecionar pelo index
        //combo.selectByIndex(4);
        // Selecionando pelo valor
        //combo.selectByValue("doutorado");
        // Selecionando pelo valor visivel
        combo.selectByVisibleText("Mestrado");
        Assert.assertEquals("Mestrado", combo.getFirstSelectedOption().getText());

        navegador.quit();
    }

    @Test
    public void testVerificacaoValoresCombo() {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\CJ\\webdrivers\\msedgedriver.exe");
        WebDriver navegador = new EdgeDriver();
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navegador.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
        WebElement element = navegador.findElement(By.id("elementosForm:escolaridade"));
        Select combo = new Select(element);

        List<WebElement> options = combo.getOptions();
        Assert.assertEquals(8, options.size());

        boolean encontrou = false;
        for (WebElement option : options) {
            if (option.getText().equals("Mestrado")) {
                encontrou = true;
                break;
            }
        }
        Assert.assertTrue(encontrou);
    }

    @Test
    public void testVerificacaoValoresComboMultiplo() {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\CJ\\webdrivers\\msedgedriver.exe");
        WebDriver navegador = new EdgeDriver();
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navegador.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
        WebElement element = navegador.findElement(By.id("elementosForm:esportes"));

        // Selecionando algumas opções
        Select combo = new Select(element);
        combo.selectByValue("natacao");
        combo.selectByValue("Karate");
        combo.selectByValue("Corrida");

        // Verificando opções selecionadas
        List<WebElement> allSelectedOptions = combo.getAllSelectedOptions();
        Assert.assertEquals(3, allSelectedOptions.size());

        // Desmarcando uma opção e verificando em seguida
        combo.deselectByValue("Karate");
        allSelectedOptions = combo.getAllSelectedOptions();
        Assert.assertEquals(2, allSelectedOptions.size());

        navegador.quit();
    }

    @Test
    public void testDeveInteragirComBotoes() {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\CJ\\webdrivers\\msedgedriver.exe");
        WebDriver navegador = new EdgeDriver();
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navegador.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");

        // Clicando no botao e verificando se foi clicado
        WebElement botao = navegador.findElement(By.id("buttonSimple"));
        botao.click();
        Assert.assertEquals("Obrigado!", botao.getAttribute("value"));

        navegador.quit();
    }

    @Test
    public void testDeveInteragirComLinks() {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\CJ\\webdrivers\\msedgedriver.exe");
        WebDriver navegador = new EdgeDriver();
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navegador.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
        dsl = new dslPaginaComponentes(navegador);

        // Clicando no link e verificando
        dsl.ClicarNoLink("Voltar");
        Assert.assertEquals("Voltou!", dsl.obterValorDoLink("resultado"));
        navegador.quit();
    }

    @Test
    public void testDeveBuscarTextosNaTela() {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\CJ\\webdrivers\\msedgedriver.exe");
        WebDriver navegador = new EdgeDriver();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navegador.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
        dsl = new dslPaginaComponentes(navegador);

        // Buscando texto pela tag body (Não tem boa performance) e verificando
        // Assert.assertTrue(navegador.findElement(By.tagName("body")).getText().contains("Campo de Treinamento"));

        // Procurando por Elemento... No caso o h3 e verificando
        Assert.assertEquals("Campo de Treinamento", dsl.receberTextoPorTagName("h3"));

        // Procurando elemento pelo cssSelector span[class="facilAchar"] e ja verificando
        Assert.assertEquals("Cuidado onde clica, muitas armadilhas...",
                dsl.receberTextoPorCssSelector("span[class='facilAchar']"));

        navegador.quit();

    }

    @Test
    public void testDeveInteragirComAlertSimples() {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\CJ\\webdrivers\\msedgedriver.exe");
        WebDriver navegador = new EdgeDriver();
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navegador.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");

        // Clicando no alert e verificando e aceitando
        navegador.findElement(By.id("alert")).click();
        Alert alert = navegador.switchTo().alert();
        String texto = alert.getText();
        Assert.assertEquals("Alert Simples", texto);
        alert.accept();

        navegador.findElement(By.id("elementosForm:nome")).sendKeys(texto);

        navegador.quit();
    }

    @Test
    public void testDeveInteragirComAlertConfirm() {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\CJ\\webdrivers\\msedgedriver.exe");
        WebDriver navegador = new EdgeDriver();
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navegador.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");

        // Clicando no alert confirm, negando e verificando
        navegador.findElement(By.id("confirm")).click();
        Alert alertConfirm = navegador.switchTo().alert();
        Assert.assertEquals("Confirm Simples", alertConfirm.getText());
        alertConfirm.dismiss();
        Assert.assertEquals("Negado", alertConfirm.getText());
        alertConfirm.dismiss();

        navegador.quit();
    }

    @Test
    public void testDeveInteragirComAlertPrompt() {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\CJ\\webdrivers\\msedgedriver.exe");
        WebDriver navegador = new EdgeDriver();
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navegador.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");

        navegador.findElement(By.id("prompt")).click();
        Alert alertPrompt = navegador.switchTo().alert();
        Assert.assertEquals("Digite um numero", alertPrompt.getText());
        alertPrompt.sendKeys("25");
        alertPrompt.accept();
        Assert.assertEquals("Era 25?", alertPrompt.getText());
        alertPrompt.accept();
        Assert.assertEquals(":D", alertPrompt.getText());
        alertPrompt.accept();

        navegador.quit();
    }

    @Test
    public void testDeveInteragirComFrame() {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\CJ\\webdrivers\\msedgedriver.exe");
        WebDriver navegador = new EdgeDriver();
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navegador.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");

        navegador.switchTo().frame("frame1");
        navegador.findElement(By.id("frameButton")).click();
        Alert alert = navegador.switchTo().alert();
        String msg = alert.getText();
        Assert.assertEquals("Frame OK!", msg);
        alert.accept();

        navegador.switchTo().defaultContent();
        navegador.findElement(By.id("elementosForm:nome")).sendKeys(msg);

        navegador.quit();
    }

    @Test
    public void testDeveInteragirComPopUp() {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\CJ\\webdrivers\\msedgedriver.exe");
        WebDriver navegador = new EdgeDriver();
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navegador.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");

        navegador.findElement(By.id("buttonPopUpEasy")).click();
        navegador.switchTo().window("Popup");
        navegador.findElement(By.tagName("textarea")).sendKeys("Deu certo?");
        navegador.close();
        navegador.switchTo().window("");
        navegador.findElement(By.tagName("textarea")).sendKeys("e agora?");

        navegador.quit();

    }

    @Test
    public void testDeveInteragirComPopUpSemTitulo() {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\CJ\\webdrivers\\msedgedriver.exe");
        WebDriver navegador = new EdgeDriver();
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navegador.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");

        navegador.findElement(By.id("buttonPopUpHard")).click();
        System.out.println(navegador.getWindowHandle());
        System.out.println(navegador.getWindowHandles());
        navegador.switchTo().window((String) navegador.getWindowHandles().toArray()[1]);
        navegador.findElement(By.tagName("textarea")).sendKeys("Deu certo?");
        navegador.switchTo().window((String) navegador.getWindowHandles().toArray()[0]);
        navegador.findElement(By.tagName("textarea")).sendKeys("E agora?");

        navegador.quit();
    }
}