import java.util.*;
public class NumberGuessingGame {
static final int MAX_ATTEMPTS = 5;
static final int MAX_NUMBER = 100;
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    char choice;
    do{
        Playgame(sc);
        System.out.println("Do u want to play again? (y/n): ");
        choice=sc.next().charAt(0);
    }while(choice=='y'||choice=='Y');
    sc.close();
}
private static void Playgame(Scanner sc) {
   Random rand=new Random();
   int numbertoguess=rand.nextInt(MAX_NUMBER)+1;
   int guessnumber=0;
   int attempts=0;
   System.out.println("Welcome to number guessing game!");
   System.out.println("I have selected a number between 1 and "+MAX_NUMBER+". You have "+MAX_ATTEMPTS+" attempts to guess it.");
   while(attempts<MAX_ATTEMPTS){
    System.out.print("Enter the number:");
    guessnumber=sc.nextInt();
    attempts++;
    if(guessnumber==numbertoguess){
        System.out.println("Congratulations! You guessed the number "+numbertoguess+" in "+attempts+" attempts.");
        break;
    }
    else if(guessnumber>numbertoguess){
        System.out.println("Too high! Try again.");
    }else if(guessnumber<numbertoguess){
        System.out.println("Too Low! Try again.");
    }
    if(attempts==MAX_ATTEMPTS){
        System.out.println("sorry You have used all your attempts.The number was "+numbertoguess+".");
        }
    
   }

}  

}