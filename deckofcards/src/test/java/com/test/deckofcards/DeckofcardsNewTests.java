package com.test.deckofcards;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.jayway.restassured.response.Response;

public class DeckofcardsNewTests extends SetupProperties {

	@Test
	public void newCardAPISucessStatusCode() {

		Response response = restAssuredGetRequest("api/deck/new/");
		assertEquals(response.statusCode(), 200);
	}

	@Test
	public void testSucessStatusRemainingResponse() {

		Response response = restAssuredGetRequest("api/deck/new/");
		int remaining = response.jsonPath().getInt("remaining");
		assertEquals(remaining, 52);

	}

	@Test
	public void testSucessStatusResponse() {

		Response response = restAssuredGetRequest("api/deck/new/");
		boolean success = response.jsonPath().getBoolean("success");
		assertEquals(success, true);

	}

	@Test
	public void testSucessShuffleResponse() {

		Response response = restAssuredGetRequest("api/deck/new/");
		boolean shuffled = response.jsonPath().getBoolean("shuffled");
		assertEquals(shuffled, false);

	}

}
