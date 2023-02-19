import java.util.Scanner;
class RockPaperScissors{
  public static void main(String args[]){
    System.out.println("Choose option Rock Paper Scissors");
    Scanner sc=new Scanner(System.in);
    String userChoice;
    String computerChoice;
    System.out.println("Enter userChoice");
    userChoice=sc.next();
    System.out.println("Enter computerChoice");
    computerChoice=sc.next();
    if (userChoice.equals("computerChoice")){
      System.out.println("Tie");
       }
    else if ((userChoice.equals("Rock") && computerChoice.equals("Paper")) ||
             (userChoice.equals("Scissor") && computerChoice.equals("Rock"))||
             (userChoice.equals("Paper") && computerChoice.equals("Scissors")))                                                               {
      System.out.println("Computer wins");
             }
    else if((computerChoice.equals("Rock")&&userChoice.equals("Paper")) ||
         (computerChoice.equals("Paper")&&userChoice.equals("Scissors")) ||
          (computerChoice.equals("Scissor")&&userChoice.equals("Rock"))){
      System.out.println("User wins");
          }
    else{
      System.out.println("lossers");
    }
  }
}