package restAssuredTest;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;


public class restAssuredDemo {

    public static HashMap map = new HashMap();

    @BeforeClass
    public void postdata() {
        map.put("s", restUtils.getTitle());
        map.put("y", restUtils.getYear());

        RestAssured.baseURI = "http://www.omdbapi.com";
        RestAssured.basePath = "/?t=Harry+Potter+and+the+Sorcerer's+Stone&y=2001";
    }

    @Test
    public void statusCodeTest() {
        given()
                .contentType("application/json")
                .body(map)
                .when()
                .post()
                .then()
                .statusCode(201)
                .log().all();

    }

}
