/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment4;

/**
 *
 * @author adwal 
 * int[] testscores;
        testscores = new int[10];  //means that test scores is now an array with 10 spaces
        
        String[] disney = new String[50];
        testscores[2] = 78;
        int total;
        double average;
 */

 
public class BetterHangman {
    public static void main(String[] args) {
        String answer, displayanswer = "";
        int rand, triesCount = 1, howlong, counter=1, spot;
        char guess;
        boolean wordIsGuessed;

        wordIsGuessed = false;

        rand = (int) (Math.random() * 5);
        switch (rand) {
            case 0:
                answer = "doodle";
                break;
            case 1:
                answer = "contract";
                break;
            case 2:
                answer = "bond";
                break;
            case 3:
                answer = "capacity";
                break;
            case 4:
                answer = "campgrounds";
                break;
            default:
                answer = "whatever";
        }

        howlong = answer.length();
        System.out.println("Welcome to Hangman ");
        System.out.println();
        System.out.print("Here's the word to guess: ");
        System.out.println();
        System.out.println();


        do 
        {
            displayanswer = displayanswer + "*";
            counter++;
        }
        while (counter<=howlong);

        System.out.print(displayanswer);
        System.out.println();
        System.out.println();


        while (!wordIsGuessed && triesCount<=10)
        { //begin while

            System.out.println();
            System.out.print("Guess a letter ($ to end program and reveal word): ");
            guess = TextIO.getlnChar();

            if (guess == '$')
            {
                System.out.println("The word is: " + answer);
                wordIsGuessed = true;
                break;
            }

            triesCount++;

            spot = answer.indexOf(guess);

            if (spot == -1) // means it is not found
                {System.out.println(guess + " is not found in the word. ");}
            else
            {
                char[] diArray = displayanswer.toCharArray(); // with ****etc.. is now and array
                while (spot >= 0) { // while the guess is found, use while so it searches more than once
                    diArray[spot] = guess;   // the array with **** will replace index of guess found with letter for guess
                    spot = answer.indexOf(guess, spot + 1); // spot + 1 means start search from index of letter guessed plus one so it doesnt go back to same old index again
                }
                displayanswer = new String(diArray); //turn the array into a string
                
                if (!displayanswer.contains("*")) // all letters guessed correctly
                {
                    System.out.println("Correct! The word is: " + answer);
                    wordIsGuessed = true;
                }
                else
                {
                    System.out.println("Found that. So far you have: ");
                    System.out.println(displayanswer);
                }
            }

        } //end while        

        if (!wordIsGuessed)
        {
            System.out.print("Sorry you only get 10 guesses. The word was \"");
            System.out.println(answer + "\". Better luck next time.");
        }

    } //end main method  
           
}
