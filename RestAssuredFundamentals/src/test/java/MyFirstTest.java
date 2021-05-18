import config.VIdeoGameConfig;
import config.VideoGamesEndPoints;
import org.junit.Test;
import static io.restassured.RestAssured.*;

public class MyFirstTest extends VIdeoGameConfig {
    //Given when and then
    //GIven -> scenario setup aka Headers parameters
    //When Get an endpoint, and post an endpoint
    //Assertions aka check response code, extract data

    @Test
    public void myFirstTest(){
        given()
                .log().all().
        when().
                get("videogames").
        then().
            log().all();
    }

    @Test
    public void myFirstTestWithEndPoint(){
        get(VideoGamesEndPoints.allVideoGames)
            .then()
                .log()
                    .all();
    }
}
