package com.test.deckofcards;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

public class DeckofcardsNewTests extends SetupProperties {

	@Test
	public void newCardAPISucessStatusCode() {

		given().when().get("api/deck/new/").then().statusCode(200);
	}

	@Test
	public void testSucessStatusRemainingResponse() {

		given().when().get("api/deck/new/").then().body("remaining", equalTo(52));

	}

	@Test
	public void testSucessStatusResponse() {

		given().when().get("api/deck/new/").then().body("success", equalTo(true));

	}

	@Test
	public void testSucessShuffleResponse() {

		given().when().get("api/deck/new/").then().body("shuffled", equalTo(false));

	}

}
