package com.test.deckofcards;

import static com.jayway.restassured.RestAssured.given;

import org.junit.Test;

public class DeckofCardsDeckIdTests extends SetupProperties {

	@Test
	public void newCardAPISucessStatusCode() {

		String deckId = given().when().get("api/deck/new/").then().extract().jsonPath().get("deck_id");
		given().when().pathParam("deck_Id", deckId).get("api/deck/{deck_Id}/draw/").then().statusCode(200);
	}

	@Test
	public void newCardAPIdeckNotFound() {

		given().when().pathParam("deck_Id", "pnyn4gi99hrp").get("api/deck/{deck_Id}/draw/").then().statusCode(500);
	}
}
