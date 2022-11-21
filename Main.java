import java.util.Scanner;

public class Main {


        public static void main(String[] args) {
            int win = 0;
            int loss = 0;
            String repeat = "y";
            int d;


            while (repeat.equals("y")) {
                Scanner scan = new Scanner(System.in);
                System.out.println("Choose your difficulty: enter 1 for easy (0-10), 2 for hard (0-100), 3 for difficult (0-1000)");
                d = scan.nextInt();
                //object created, constructor used "new" keyword
                Levels l = new Levels();
                int target = l.difficulty(d);


                // number of guesses
                int n = 1;


                // asks the user for a guess
                int guess;
                Scanner s = new Scanner(System.in);
                System.out.print("Enter a guess: ");
                guess = s.nextInt();

                // loop for guessing multiple times


                while (guess !=target) {

                    n++;
                    if (guess > target) {
                        System.out.print("Too high. Enter a guess: ");
                    }
                    else if (n > 10) {
                        System.out.println("You took more than 10 guesses. You Lost!");
                        loss++;
                        break;
                    }
                     else if (guess < target){
                        System.out.print("Too low. Enter a guess: ");
                    }
                    else if ( guess < 0) {
                        System.out.println("That guess is out of range!");
                        System.out.print("Enter a guess: ");
                    }
                    guess = scan.nextInt();
                }
                if (guess==target){
                    System.out.println("Congratulations! It took you " + n + " guesses!");
                    win++;
                }


                System.out.println("Your number of wins is " + win + " and your number of losses is " + loss + ".");

                // asks user if they want to play again
                System.out.print("Enter y to play again");
                // reads user's input on whether they want to play again
                repeat = scan.next();

            } // while loop ends here

            // outputs the goodbye message when user enters anything other than "y"
            System.out.println("Good-bye.");

        }

    }



