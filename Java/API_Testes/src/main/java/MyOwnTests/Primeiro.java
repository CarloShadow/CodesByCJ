package MyOwnTests;

import org.junit.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.Is.is;

public class Primeiro {

    @Test
    public void deveFazerTestesAleatorios() {
        given()
        .when()
            .get("https://gorest.co.in/public-api/comments/34")
        .then()
            .statusCode(200)
            .body("id", is(34))
            .body("name", containsString("Sweta Reddy"))

        ;
    }
}
