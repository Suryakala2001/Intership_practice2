// Number Guesser: Create a number guessing game where the computer generates a random number and the user has to guess it. if user Guess is incorrect, then give hints (weather the actual number is less than/ greater than guess number).

import java.util.Random; 
import java.util.Scanner;
class NumberGuess{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    Random random = new Random(); 
    int randomnumber=random.nextInt(100);
    System.out.println(randomnumber);
    int Guess=0;
    int count=0;
    do{
      System.out.println("Guess Number:");
      Guess=sc.nextInt();
      if(randomnumber==Guess)
        System.out.println(" Correct Guess!!Congrats");
      else{
        if(randomnumber>Guess)
        System.out.println("Guess number is less than random number");
        else
        System.out.println("Guess number is grater than random number");  
    }
    count++;
    if(count>=3){
      System.out.println("Chances exceeded");
      break;
      }
     
  }
      while(randomnumber!=Guess);
}
}