import java.util.Random;
import java.util.Scanner;

public class WordGuessingGame {
        String wordsList [] = {"java","class","method","object","constructor","inheritance","polymorphism","abstraction","encapsulation","interface","package","thread","process","light weight","heavy weight","exception","array","string",
        "variable","local","global","instance","static","non static","final","this","private","public","protected","default",
        "void","super","try","catch","throw","throws","finally","generics","awt","swing","applet","list","set","map","hashmap","linked list","array list","string buffer","string builder","synchronized","asynchronized","enumeration","iterator","list iterator","for each","platform independent"}; 

        //Random Guess 
        Random rand = new Random();
        
        // System.out.println(randomWord);
        
        Scanner sc = new Scanner(System.in);        
        String userGuess;
        String continueGuessing = "";
    public void  playWords(){
        do{
            //Generte a random index 
            int randomIndex = rand.nextInt(wordsList.length);
            //Random word 
            String randomWord = wordsList[randomIndex];
            char firstLetter = randomWord.charAt(0);
            char lastLetter = randomWord.charAt(randomWord.length() - 1);

            System.out.println("Hint: The word starts with '" + firstLetter + "' and ends with '" + lastLetter + "'.");
            
            System.out.println("Guess the word or keyword that are in java");
            userGuess = sc.nextLine();
            //checking if the input is valid or not
            if(userGuess.equals("")){
                System.out.println("Please enter only words space is invalid");
                
            }

             //checking whether the random word and user guess is correct or not
       
            if(userGuess.equals(randomWord)){
                System.out.println("Your guess was correct!");
            
            }
            else{
                System.out.println("That was incorrect!");
                System.out.println("correct word was "+ randomWord);
            }

            System.out.println("Do you want to guess again? (yes/no): ");
            continueGuessing = sc.nextLine().toLowerCase();
        }
        while(continueGuessing.equals("yes"));

        if (!continueGuessing.equals("yes")) {
            System.out.println("=============================================================================================");
            System.out.println("============================== Thank You for Guessing the Words =============================");
            System.out.println("=============================================================================================");
        }
        

    }

    
}