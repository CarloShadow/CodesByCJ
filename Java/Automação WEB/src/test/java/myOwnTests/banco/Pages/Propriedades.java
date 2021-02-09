package myOwnTests.banco.Pages;

public class Propriedades {

    public static boolean FECHAR_BROWSER = true;

    public static Browsers browser = Browsers.EDGE;

    public static String NOME_CONTA_ALTERADA = "Conta Alterada " + System.nanoTime();

    public static String NOME_CONTA_ADD = "Conta Adicionada " + System.nanoTime();

    public enum Browsers {
        CHROME,
        EDGE,
        FIREFOX
    }

}
