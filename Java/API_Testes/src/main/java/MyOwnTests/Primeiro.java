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
            .get("https://jsonplaceholder.typicode.com/users/8")
        .then()
            .statusCode(200)
            .body("id", is(8))
            .body("name", containsString("Nicholas"))
            .body("username", containsString("Maxime_Nienow"))
            .body("email", containsString("Sherwood@rosamond.me"))
            .body("address.street",is("Ellsworth Summit"))
            .body("address.city", is("Aliyaview"))
            .body("company.name", is("Abernathy Group"))

        ;
    }
}
