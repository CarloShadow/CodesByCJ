package testWebmotors.Suporte;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class screenshotWM {

    public static void tirar(WebDriver navegador, String arquivo) {
        File screenshotWM = ((TakesScreenshot)navegador).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshotWM, new File(arquivo));
        } catch (Exception e) {
            System.out.println("Houveram problemas ao copiar o aruivo para a pasta: " + e.getMessage());

        }
    }
}
