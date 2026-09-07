package githubrestassuredproject;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GitHubRestAssuredTest {

    private RequestSpecification requestSpec;

    // Replace with your valid SSH public key
    private String sshKey =
            "ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQDxxxxxxxxxxxxxxxxxxxxxxxxxx";

    private int keyId;

    @BeforeClass
    public void setup() {

        String accessToken = "YOUR_GITHUB_ACCESS_TOKEN";

        requestSpec = new RequestSpecBuilder()
                .setBaseUri("https://api.github.com")
                .setContentType(ContentType.JSON)
                .addHeader("Authorization", "token " + accessToken)
                .build();
    }

    @Test(priority = 1)
    public void addSSHKey() {

        String requestBody = "{\n" +
                "\"title\":\"TestAPIKey\",\n" +
                "\"key\":\"" + sshKey + "\"\n" +
                "}";

        Response response =
                given()
                        .spec(requestSpec)
                        .body(requestBody)
                .when()
                        .post("/user/keys")
                .then()
                        .extract()
                        .response();

        response.prettyPrint();

        keyId = response.jsonPath().getInt("id");

        Assert.assertEquals(response.getStatusCode(), 201,
                "SSH Key creation failed");

        Assert.assertTrue(keyId > 0,
                "Key ID was not generated");

        Reporter.log("Created SSH Key ID : " + keyId, true);
    }

    @Test(priority = 2, dependsOnMethods = "addSSHKey")
    public void getSSHKey() {

        Response response =
                given()
                        .spec(requestSpec)
                        .pathParam("keyId", keyId)
                .when()
                        .get("/user/keys/{keyId}")
                .then()
                        .extract()
                        .response();

        response.prettyPrint();

        Reporter.log("GET Response : " + response.asPrettyString(), true);

        Assert.assertEquals(response.getStatusCode(), 200,
                "Unable to retrieve SSH key");

        Assert.assertEquals(response.jsonPath().getInt("id"), keyId);
    }

    @Test(priority = 3, dependsOnMethods = "getSSHKey")
    public void deleteSSHKey() {

        Response response =
                given()
                        .spec(requestSpec)
                        .pathParam("keyId", keyId)
                .when()
                        .delete("/user/keys/{keyId}")
                .then()
                        .extract()
                        .response();

        Reporter.log("DELETE Status : " + response.getStatusCode(), true);

        Assert.assertEquals(response.getStatusCode(), 204,
                "SSH Key deletion failed");
    }
}