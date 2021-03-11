package Basico;

import static io.restassured.RestAssured.*;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.StringContains.containsString;

import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.junit.Assert;
import org.junit.Test;

public class OlaMundo {

    @Test
    public void testOlaMundo() {
        Response response = request(Method.GET, "http://restapi.wcaquino.me/ola");
        Assert.assertEquals("Ola Mundo!", response.getBody().asString());
        Assert.assertEquals(200, response.statusCode());

    }

    @Test
    public void devoConhecerOutrasFormasRestAssured() {
        Response response = request(Method.GET, "http://restapi.wcaquino.me/ola");
        ValidatableResponse validacao = response.then();
        validacao.statusCode(200);

        get("http://restapi.wcaquino.me/ola").then().statusCode(200);

        // given() = Pré condições / When() = Ação / then() = oque eu irei testar depois (assertivas)
        given()
        .when()
                .get("http://restapi.wcaquino.me/ola")
        .then()
                .statusCode(200);
    }

    @Test
    public void devoValidarOBody() {
        given()
        .when()
                .get("http://restapi.wcaquino.me/ola")
        .then()
                .statusCode(200)
                .body(is("Ola Mundo!"))
                .body(containsString("Mundo"))
                .body(is(not(nullValue())));
    }

}
