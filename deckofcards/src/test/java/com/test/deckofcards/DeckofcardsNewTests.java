package com.test.deckofcards;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.jayway.restassured.response.Response;

public class DeckofcardsNewTests extends SetupProperties {

	/**
	 * @author Tarun bheema
	 * This method validates the response status code for the GET service call
	 */
	@Test
	public void newCardAPISucessStatusCode() {

		Response response = restAssuredGetRequest("api/deck/new/");
		assertEquals(response.statusCode(), 200);
	}
	
	/**
	 * @author Tarun Bheema
	 * This method validates the response body parameters for the GET service call
	 */
	@Test
	public void testSucessStatusRemainingResponse() {

		Response response = restAssuredGetRequest("api/deck/new/");
		int remaining = response.jsonPath().getInt("remaining");
		assertEquals(remaining, 52);

	}
	
	/**
	 * @author Tarun Bheema
	 * This method validates the response body parameters for the GET service call
	 */
	@Test
	public void testSucessStatusResponse() {

		Response response = restAssuredGetRequest("api/deck/new/");
		boolean success = response.jsonPath().getBoolean("success");
		assertEquals(success, true);

	}
	
	/**
	 * @author Tarun Bheema
	 * This method validates the response body parameters for the GET service call
	 */
	@Test
	public void testSucessShuffleResponse() {

		Response response = restAssuredGetRequest("api/deck/new/");
		boolean shuffled = response.jsonPath().getBoolean("shuffled");
		assertEquals(shuffled, false);

	}

}
