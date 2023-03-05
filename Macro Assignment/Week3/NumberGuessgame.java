//1. Number Guessing Game: Create a number guessing game where the user has to guess a randomly generated number within a certain range. Use loops to repeatedly prompt the user for a guess and conditional statements to check if the guess is correct.

import java.util.Scanner;
 
 class NumberGuessgame {
   public static void main (String args[]){
   Scanner sc = new Scanner(System.in);
    int number = 1 + (int)(10* Math.random());
    int K = 5;
    int i, guess;
    System.out.println("A number is chosen"+ " between 1 to 100."+ "Guess the number"+ " within 5 trials.");
            
     for (i = 0; i < K; i++) {
     System.out.println("Guess the number:");
     guess = sc.nextInt();
     if (number == guess) {
       System.out.println("Congratulations!"+ " You guessed the number.");
       break;
       }
       else if (number > guess && i != K - 1) {
          System.out.println("The number is "+ "greater than " + guess);
          }
          else if (number < guess && i != K - 1) {
          System.out.println("The number is"+ " less than " + guess);
                    
            }
        }
        if (i == K) {
            System.out.println("You have exhausted"+ " K trials.");
            System.out.println("The number was " + number);
               
        }
    }
 }
 
    
   