package myOwnTests.banco.Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DriverFactory {

    private static WebDriver navegador;

    private DriverFactory() {}

    public static WebDriver getDriver(){
        if(navegador == null) {
            switch (Propriedades.browser) {
                case EDGE: navegador = new EdgeDriver(); break;
                case FIREFOX: navegador = new FirefoxDriver(); break;
                case CHROME: navegador = new ChromeDriver(); break;
            }
            //navegador.manage().window().setSize(new Dimension(1200, 765));
        }
        return navegador;
    }

    public static void killDriver(){
        if(navegador != null) {
            navegador.quit();
            navegador = null;
        }
    }
}

