# Word Guessing Game - Java Program

## Description

The **Word Guessing Game** is a fun console-based game built in Java where the player guesses a randomly selected Java-related keyword. The game provides the player with a hint, showing the first and last letter of the word. The player then guesses the word, and the program checks whether the guess is correct or not. The game continues until the player chooses to stop.

## Features

- **Random Word Selection**: A random word from a predefined list of Java-related keywords is selected each round.
- **Hint System**: The game provides a hint, showing the first and last letter of the selected word.
- **Guessing Mechanics**: The player guesses the word, and the program checks if the guess is correct or incorrect.
- **Replay Option**: After each round, the player is asked if they want to continue guessing. If they choose to stop, the game ends.
- **Valid Input Check**: Ensures that the user does not enter empty guesses.

## Requirements

- Java 8 or higher.
  
## How to Play

1. Compile and run the Java program:
   ```bash
   javac App.java WordGuessingGame.java
   java App
2. The game will provide a hint with the first and last letter of a randomly selected Java keyword.

3. The player types their guess and the program checks if it matches the correct word.

4. If the guess is incorrect, the correct word is revealed, and the player is asked whether they would like to guess again.

5. If the player wants to keep playing, they can enter yes. To stop, they can type no.

## Example Output
==========================================================================================
================================== WORD GUESSING GAME ====================================
==========================================================================================
Hint: The word starts with 'j' and ends with 'a'.
Guess the word or keyword that are in java
java
Your guess was correct!
Do you want to guess again? (yes/no): yes
Hint: The word starts with 'p' and ends with 'e'.
Guess the word or keyword that are in java
package
Your guess was correct!
Do you want to guess again? (yes/no): no
=============================================================================================
============================== Thank You for Guessing the Words =============================
=============================================================================================

## How It Works
WordGuessingGame Class
The WordGuessingGame class is responsible for managing the entire gameplay. It randomly selects a word from the wordsList array and provides the player with a hint based on the first and last letters of the word. The player's guess is compared to the randomly selected word, and the result is displayed accordingly.

## Attributes:

wordsList[]: Array containing a list of Java-related keywords.
rand: An instance of Random used to randomly select words from the list.
sc: A Scanner instance for reading user input.
userGuess: Stores the guess entered by the user.
continueGuessing: Stores the user's response to whether they want to continue playing.
## Methods:

playWords(): Main method to run the game loop. It generates a random word, provides hints, takes the user's guess, and checks the correctness of the guess. It also handles the replay option.

## App Class
The App class serves as the entry point for the application. It initializes the game and starts the guessing process by calling the playWords() method from the WordGuessingGame class.

## Error Handling
The program checks if the user enters an empty guess, and it will prompt them to provide a valid guess.
If the guess is incorrect, the correct word is revealed, and the user is asked if they want to continue.

## Acknowledgments
This project was created to demonstrate the usage of basic Java concepts, including random number generation, user input handling, and conditional logic.

This `README.md` file provides a detailed explanation of how the Word Guessing Game works, how to play it, and what to expect in terms of output and functionality. It also includes suggestions for future enhancements and is structured in a way that is easy to understand for anyone who might want to try or modify the game.

