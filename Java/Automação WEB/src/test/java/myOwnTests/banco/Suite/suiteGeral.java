package myOwnTests.banco.Suite;

import myOwnTests.banco.Tests.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        testsContas.class,
        testsMovimentacao.class,
        testExlcuirContaComMovimentacao.class,
        testsSaldo.class,
        testResumo.class
})

public class suiteGeral {
}
