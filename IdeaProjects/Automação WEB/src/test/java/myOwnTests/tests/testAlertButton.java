package myOwnTests.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class testAlertButton {

    @Test
    public void testDeveFazerAparecerOsBotoesAlert() {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\CJ\\webdrivers\\msedgedriver.exe");
        WebDriver navegador = new EdgeDriver();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navegador.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");

        // Clicando em cadastrar
        navegador.findElement(By.id("elementosForm:cadastrar")).click();

        // Acessando o primeiro alert, validar e aceitar
        Alert alertnome = navegador.switchTo().alert();
        String texto0 = alertnome.getText();
        Assert.assertEquals("Nome eh obrigatorio", texto0);
        alertnome.accept();


        // Digitando o nome e validando
        navegador.findElement(By.id("elementosForm:nome")).sendKeys("Carlos");
        navegador.findElement(By.id("elementosForm:nome")).getAttribute("value");
        Assert.assertEquals("Carlos", navegador.findElement(By.id("elementosForm:nome")).getAttribute("value"));
        navegador.findElement(By.id("elementosForm:cadastrar")).click();

        // Acessando o segundo alert, validar e aceitar
        Alert alertSobrenome = navegador.switchTo().alert();
        String texto = alertSobrenome.getText();
        Assert.assertEquals("Sobrenome eh obrigatorio", texto);
        alertSobrenome.accept();

        // Digitando o sobrenome e validando
        navegador.findElement(By.id("elementosForm:sobrenome")).sendKeys("Alberto");
        navegador.findElement(By.id("elementosForm:sobrenome")).getAttribute("value");
        Assert.assertEquals("Alberto", navegador.findElement(By.id("elementosForm:sobrenome")).getAttribute("value"));
        navegador.findElement(By.id("elementosForm:cadastrar")).click();

        // Acessando o terceiro alert, validar e aceitar
        Alert alertSexualidade = navegador.switchTo().alert();
        String texto1 = alertSexualidade.getText();
        Assert.assertEquals("Sexo eh obrigatorio", texto1);
        alertSexualidade.accept();

        // Clicando e verificando radio button
        navegador.findElement(By.id("elementosForm:sexo:0")).click();
        Assert.assertTrue(navegador.findElement(By.id("elementosForm:sexo:0")).isSelected());

        // Clicando e verificando radio button com text "carne" e "pizza"
        navegador.findElement(By.id("elementosForm:comidaFavorita:0")).click();
        Assert.assertTrue(navegador.findElement(By.id("elementosForm:comidaFavorita:0")).isSelected());
        navegador.findElement(By.id("elementosForm:comidaFavorita:3")).click();
        Assert.assertTrue(navegador.findElement(By.id("elementosForm:comidaFavorita:3")).isSelected());
        navegador.findElement(By.id("elementosForm:cadastrar")).click();

        // Acessando o quarto alert, validar e aceitar
        Alert alertComida = navegador.switchTo().alert();
        String texto2 = alertComida.getText();
        Assert.assertEquals("Tem certeza que voce eh vegetariano?", texto2);
        alertComida.accept();
        navegador.findElement(By.id("elementosForm:comidaFavorita:3")).click();

        // Acessando combo multiplo, selecionando algumas opções e clicando em cadastrar
        WebElement element = navegador.findElement(By.id("elementosForm:esportes"));
        Select combo = new Select(element);
        combo.selectByValue("Corrida");
        combo.selectByValue("nada");
        navegador.findElement(By.id("elementosForm:cadastrar")).click();

        // Acessando o quinto alert, validar e aceitar
        Alert alertEsporte = navegador.switchTo().alert();
        String texto3 = alertEsporte.getText();
        Assert.assertEquals("Voce faz esporte ou nao?", texto3);
        alertEsporte.accept();

        navegador.quit();
    }
}