package com.test.deckofcards;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.jayway.restassured.response.Response;

public class DeckofcardsNewJokersTests extends SetupProperties {

	/**
	 * @author Tarun Bheema
	 * This method validates the response for the POST request call 
	 */
	@Test
	public void newCardAPISucessStatusCode() {

		Response response = restAssuredQueryPostRequest("api/deck/new", "jokers_enabled", true);
		assertEquals(response.statusCode(), 200);
	}

	/**
	 * @author Tarun Bheema
	 * This method valdiates the response body parameters for the POST request call
	 */
	@Test
	public void newCardAPIResponse() {
		
		Response response = restAssuredQueryPostRequest("api/deck/new", "jokers_enabled", true);
		int remaining = response.jsonPath().getInt("remaining");
		assertEquals(remaining, 54);
	}

}
