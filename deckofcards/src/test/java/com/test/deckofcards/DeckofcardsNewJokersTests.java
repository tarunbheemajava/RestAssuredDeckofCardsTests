package com.test.deckofcards;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.jayway.restassured.response.Response;

public class DeckofcardsNewJokersTests extends SetupProperties {

	@Test
	public void newCardAPISucessStatusCode() {

		Response response = restAssuredQueryPostRequest("api/deck/new", "jokers_enabled", true);
		assertEquals(response.statusCode(), 200);
	}

	@Test
	public void newCardAPIResponse() {
		
		Response response = restAssuredQueryPostRequest("api/deck/new", "jokers_enabled", true);
		int remaining = response.jsonPath().getInt("remaining");
		assertEquals(remaining, 54);
	}

}
