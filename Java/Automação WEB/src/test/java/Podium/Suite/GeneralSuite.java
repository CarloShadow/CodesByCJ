package Podium.Suite;

import org.junit.runners.Suite;
import Podium.Test.ProductsTest;
import org.junit.runners.Suite.SuiteClasses;
import org.junit.runner.RunWith;

@RunWith(Suite.class)
@SuiteClasses({
        ProductsTest.class
})

public class GeneralSuite {

}
