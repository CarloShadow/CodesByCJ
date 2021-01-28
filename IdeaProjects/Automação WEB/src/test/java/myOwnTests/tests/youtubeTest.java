package myOwnTests.tests;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class youtubeTest {
    private WebDriver navegador;

    @Before
    public void setUp() {
        // Abrindo navegador
        System.setProperty("webdriver.edge.driver", "C:\\Users\\CJ\\webdrivers\\msedgedriver.exe");
        navegador = new EdgeDriver();
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        // Entrando na página do Youtube
        navegador.get("https://www.youtube.com/");
    }

    @Test
    public void testBuscandoVideoEReproduzindo() {
        // Pesquisando video chamado "Black - Pearl Jam"
        navegador.findElement(By.xpath("//input[@id='search']")).sendKeys("Black - Pearl Jam");

        // Clicando na lupa de pesquisa
        navegador.findElement(By.xpath("//button[@class='style-scope ytd-searchbox']")).click();

        // Reproduzindo video
        navegador.findElement(By.xpath("//a[@id=\"video-title\"]//yt-formatted-string")).click();

    }
    @After
    public void tearDown() {
        //Fechar o navegador
        navegador.quit();
    }
}
