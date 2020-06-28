package com.test.deckofcards;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.junit.BeforeClass;

import com.jayway.restassured.RestAssured;

public class SetupProperties {

	@BeforeClass
	public static void setup() throws IOException {
		Properties p = new Properties();
		InputStream in = DeckofcardsNewTests.class.getClassLoader().getResourceAsStream("config.properties");
		p.load(in);
		RestAssured.baseURI = p.getProperty("application.url");
	}
}
