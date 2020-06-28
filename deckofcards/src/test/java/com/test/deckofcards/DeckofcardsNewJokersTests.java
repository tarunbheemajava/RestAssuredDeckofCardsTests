package com.test.deckofcards;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

public class DeckofcardsNewJokersTests extends SetupProperties {

	@Test
	public void newCardAPISucessStatusCode() {
		// As you requested in the email. I tried post request different ways of rest
		// assured code. But I am getting 301 so I am using get request.
		given().queryParam("jokers_enabled", true).when().get("api/deck/new").then().statusCode(200);

	}

	@Test
	public void newCardAPIResponse() {
		given().queryParam("jokers_enabled", true).when().get("api/deck/new").then().body("remaining", equalTo(54));
	}

}
