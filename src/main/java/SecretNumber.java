import java.sql.SQLOutput;
import java.util.Scanner;

public class SecretNumber {

    public static void main(String[] args) {
//        put code in here...
        int secretNumber = 4;

        // Prompt a user to input their decision
        System.out.println("Do You Want To Play A Game? (y/n)");

        // Collect user input
        Scanner myReader = new Scanner(System.in);
        String userChoice = myReader.nextLine();

        // if user choice is n, print 'Maybe Later Then :)'
        if (userChoice.equals("n")) {
            System.out.println("Maybe Later Then:)");
        }

        //if user input is y, begin game
        if (userChoice.equals("y")) {
            System.out.println("Lets Begin! Press \"Enter\"");
            myReader.nextLine();
        }
//        Output the question
        System.out.println("I'm Thinking of a Number 1 - 10. WHAT IS IT?🤔:");
        int userGuess = Integer.parseInt(myReader.nextLine());   // user gives you a string, you want to be able to compare it with your secret number

        if (userGuess==secretNumber) {
            System.out.println("✨Well Done!✨(END)");
        } else if( userGuess > secretNumber) {
            System.out.println("too high");
        } else System.out.println("too low");

    }
}
