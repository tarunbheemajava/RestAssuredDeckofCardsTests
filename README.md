# RestAssuredDeckofCardsTests
Implement automation to test the following APIs in Java  o   Create a new deck of cards  §  GET https://deckofcardsapi.com/api/deck/new/  §  Support adding Jokers with a POST  o   Draw one or more cards from a deck  §  GET https://deckofcardsapi.com/api/deck/&lt;&lt;deck_id>>/draw/  -          Consider Object Oriented principles and code organization. Assume the code you are creating will be the foundation for testing all of the http://deckofcardsapi.com/ APIs.

#Install Java
1.Download Java SDK 1.8 https://www.oracle.com/java/technologies/javase-jdk8-downloads.html
2.Install Java
3.Set environment variable with JAVA_HOME with jdk Location and Add also JAVA_HOME/bin to the $PATH

#How to setup Environment
1. Download Eclipse jee oxygen https://www.eclipse.org/downloads/download.php?file=/oomph/epp/2020-06/R/eclipse-inst-win64.exe
2. Extract the setup file and run the eclipse application
3. Please check out the code from Github.
4. Go to Command Prompt to the location project is located and run 'mvn clean'

Below is the output for command 'mvn clean'
[INFO] Scanning for projects...
[INFO]
[INFO] ------------------< com.test.deckofcards:deckofcards >------------------
[INFO] Building deckofcards 0.0.1-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ deckofcards ---
[INFO] Deleting C:\Users\tarun\OneDrive\Documents\github\RestAssuredDeckofCardsTests\deckofcards\target
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  0.571 s
[INFO] Finished at: 2020-06-29T00:07:16-04:00
[INFO] ------------------------------------------------------------------------

# How to run Test cases

1.By using command prompt run 'mvn clean install'.

2.Please run the 'mvn test'

Below is the result of above command 'mvn test'

#Results

[INFO] Scanning for projects...
[INFO]
[INFO] ------------------< com.test.deckofcards:deckofcards >------------------
[INFO] Building deckofcards 0.0.1-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ deckofcards ---
[WARNING] Using platform encoding (Cp1252 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] Copying 0 resource
[INFO]
[INFO] --- maven-compiler-plugin:3.8.0:compile (default-compile) @ deckofcards ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ deckofcards ---
[WARNING] Using platform encoding (Cp1252 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] Copying 1 resource
[INFO]
[INFO] --- maven-compiler-plugin:3.8.0:testCompile (default-testCompile) @ deckofcards ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- maven-surefire-plugin:2.22.1:test (default-test) @ deckofcards ---
[INFO]
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running com.test.deckofcards.DeckofCardsDeckIdTests
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 3.708 s - in com.test.deckofcards.DeckofCardsDeckIdTests
[INFO] Running com.test.deckofcards.DeckofcardsNewJokersTests
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 1.268 s - in com.test.deckofcards.DeckofcardsNewJokersTests
[INFO] Running com.test.deckofcards.DeckofcardsNewTests
[INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 1.144 s - in com.test.deckofcards.DeckofcardsNewTests
[INFO]
[INFO] Results:
[INFO]
[INFO] Tests run: 8, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  9.437 s
[INFO] Finished at: 2020-06-29T00:23:40-04:00
[INFO] ------------------------------------------------------------------------





