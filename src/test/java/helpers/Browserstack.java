package helpers;

import static io.restassured.RestAssured.given;


public class Browserstack {

    // curl -u "maksima_Shj56H:nkpywRYVjMaM6QqQ2trN" -X GET "https://api.browserstack.com/app-automate/sessions/8e3de510d688ef9ade1527edca4faaeed9858d67.json"
    // automation_session.video_url

    public static String videoUrl(String sessionId) {
        String url = String.format("https://api.browserstack.com/app-automate/sessions/%s.json", sessionId);

        return given()
                .auth().basic("maksima_Shj56H", "nkpywRYVjMaM6QqQ2trN")
                .get(url)
                .then()
                .log().status()
                .log().body()
                .statusCode(200)
                .extract().path("automation_session.video_url");
    }
}
