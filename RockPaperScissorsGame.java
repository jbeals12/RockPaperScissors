import java.util.Scanner;
import java.util.Random;
public class RockPaperScissorsGame
{
   public static void main (String[] args)
   {
      Scanner in = new Scanner (System.in);
      Random r = new Random ();
      
      String rock, paper, scissors;
      String userThrow= "";
      String cpuThrow = "";
      int numGames = 0;
      int userWins = 0;
      int cpuWins = 0;
      int cpuRandomNumber = 0;
      
      //Welcome statement & set number of games
      System.out.println("Welcome to Rock, Paper, Scissors! Please enter the number of rounds you");
      System.out.print("would like to play: ");
      numGames = in.nextInt();
      //Check for valid entry
      while (numGames % 2 == 0) //Even number
      {
         System.out.print("Sorry, you need to enter an odd number. Please try again: ");
         numGames = in.nextInt();
      }
      
      //Flush the buffer
      in.nextLine();
      
      //Play the number of games assigned
      for (int i = 1; i <= numGames; i++)
      {
         System.out.print("Rock, Paper, or Scissors?: ");
         userThrow = in.nextLine();
         if (userThrow.equalsIgnoreCase("Spock"))
         {
            System.out.println("Spock is the ultimate, but maintains an unfair advantage and is, therefore, not allowed.");
            System.out.print("Rock, Paper, or Scissors?: ");
            userThrow = in.nextLine();
         }
         //Check for valid entry
         while (!userThrow.equalsIgnoreCase("Rock") && !userThrow.equalsIgnoreCase("Paper") && !userThrow.equalsIgnoreCase ("Scissors"))
         {
            System.out.println("Sorry, " + "\""+userThrow+"\"" + " is not a valid entry.");
            System.out.print("Rock, Paper, or Scissors?: ");
            userThrow = in.nextLine();
         }
         //Make a random choice for computer
         cpuRandomNumber = r.nextInt(3) +1;
         if (cpuRandomNumber == 1)
         {
            cpuThrow = "Rock";
         }
         if (cpuRandomNumber == 2)
         {
            cpuThrow = "Paper";
         }
         if (cpuRandomNumber == 3)
         {
            cpuThrow = "Scissors";
         }
         //Decide who wins the game
         if (userThrow.equalsIgnoreCase("Rock") && cpuThrow.equalsIgnoreCase("Rock"))
         {
            System.out.print("Computer chooses Rock. It's a tie!");
            numGames++;
         }
         if (userThrow.equalsIgnoreCase("Rock") && cpuThrow.equalsIgnoreCase("Paper"))
         {
            System.out.print("Computer chooses Paper. You lose.");
            cpuWins++;
         }
         if (userThrow.equalsIgnoreCase("Rock") && cpuThrow.equalsIgnoreCase("Scissors"))
         {
            System.out.print("Computer chooses Scissors. You win!");
            userWins++;
         }
         if (userThrow.equalsIgnoreCase("Paper") && cpuThrow.equalsIgnoreCase("Paper"))
         {
            System.out.print("Computer chooses Paper. It's a tie!");
            numGames++;
         }
         if (userThrow.equalsIgnoreCase("Paper") && cpuThrow.equalsIgnoreCase("Rock"))
         {
            System.out.print("Computer chooses Rock. You win!");
            userWins++;
         }
         if (userThrow.equalsIgnoreCase("Paper") && cpuThrow.equalsIgnoreCase("Scissors"))
         {
            System.out.print("Computer chooses Scissors. You lose.");
            cpuWins++;
         }
         if (userThrow.equalsIgnoreCase("Scissors") && cpuThrow.equalsIgnoreCase("Scissors"))
         {
            System.out.print("Computer chooses Scissors. It's a tie!");
            numGames++;
         }
         if (userThrow.equalsIgnoreCase("Scissors") && cpuThrow.equalsIgnoreCase("Rock"))
         {
            System.out.print("Computer chooses Rock. You lose.");
            cpuWins++;
         }
         if (userThrow.equalsIgnoreCase("Scissors") && cpuThrow.equalsIgnoreCase("Paper"))
         {
            System.out.print("Computer chooses Paper. You win!");
            userWins++;
         } 
         
         System.out.println();
          
      }// End For
      //print number of wins by user & computer
      System.out.println("");
      System.out.println("User wins: " + userWins);
      System.out.println("");
      System.out.println("Computer wins: " + cpuWins);
      //print winner of game
      if (userWins > cpuWins)
      {
        System.out.println("");
        System.out.println("User wins the game!");
      }
      if (cpuWins > userWins)
      {
         System.out.println("");
         System.out.println("Computer wins the game!");
      }
   }//end main
}//end ckass

