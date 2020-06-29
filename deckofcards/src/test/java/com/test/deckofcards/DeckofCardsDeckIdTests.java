package com.test.deckofcards;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.jayway.restassured.response.Response;

public class DeckofCardsDeckIdTests extends SetupProperties {

	/**
	 * @author Tarun Bheema
	 * This method validates the response code
	 */
	@Test
	public void newCardAPISucessStatusCode() {
		Response response = restAssuredGetRequest("api/deck/new/");
		String deckId = response.jsonPath().getString("deck_id");
		Response response1 = restAssuredGetRequest("api/deck/" + deckId + "/draw/");
		assertEquals(response1.statusCode(), 200);
	}

	/**
	 * @author Tarun Bheema
	 * This method validates the response code for the incorrect deck id
	 */
	@Test
	public void newCardAPIdeckNotFound() {
		Response response1 = restAssuredGetRequest("api/deck/pnyn4gi99hrp/draw/");
		assertEquals(response1.statusCode(), 500);
	}
}
