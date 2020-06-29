# RestAssuredDeckofCardsTests
Implement automation to test the following APIs in Java  
       Create a new deck of cards    GET https://deckofcardsapi.com/api/deck/new/  
       Support adding Jokers with a POST  
       Draw one or more cards from a deck  §  GET https://deckofcardsapi.com/api/deck/&lt;&lt;deck_id>>/draw/           
       Assume the code you are creating will be the foundation for testing all of the http://deckofcardsapi.com/ APIs.

#Install Java

1.Download Java SDK 1.8 https://www.oracle.com/java/technologies/javase-jdk8-downloads.html
2.Install Java
3.Set environment variable with JAVA_HOME with jdk Location and Add also JAVA_HOME/bin to the $PATH

#How to setup Environment

1. Download Eclipse jee oxygen https://www.eclipse.org/downloads/download.php?file=/oomph/epp/2020-06/R/eclipse-inst-win64.exe
2. Extract the setup file and run the eclipse application
3. Please check out the code from Github.
4. Go to Command Prompt to the location project is located and run 'mvn clean'


# How to run Test cases

1.By using command prompt run 'mvn clean install'.
2.Please run the 'mvn test'







