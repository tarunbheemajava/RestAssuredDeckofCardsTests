package com.test.deckofcards;

import static com.jayway.restassured.RestAssured.given;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.LaxRedirectStrategy;
import org.junit.BeforeClass;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.config.HttpClientConfig;
import com.jayway.restassured.response.Response;

public class SetupProperties {

	@BeforeClass
	public static void setup() throws IOException {
		Properties p = new Properties();
		InputStream in = DeckofcardsNewTests.class.getClassLoader().getResourceAsStream("config.properties");
		p.load(in);
		RestAssured.baseURI = p.getProperty("application.url");
	}

	public Response restAssuredQueryPostRequest(String URI, String queryName, Object queryValue) {

		restAssuredConfig();
		return given().queryParam(queryName, queryValue).when().post(URI).then().extract().response();
	}

	public Response restAssuredGetRequest(String URI) {
		restAssuredConfig();
		return given().when().get(URI).then().extract().response();
	}

	private void restAssuredConfig() {
		RestAssured.config = RestAssured.config()
				.httpClient(HttpClientConfig.httpClientConfig().httpClientFactory(() -> {
					DefaultHttpClient httpClient = new DefaultHttpClient();
					httpClient.setRedirectStrategy(new LaxRedirectStrategy());
					return httpClient;
				}));
	}
}
