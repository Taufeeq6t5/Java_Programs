import java.util.Random;
import java.util.Scanner;

public class DemoClass{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rdm = new Random();

        String[] choices = {"rock","paper","scissors"};
        String plyrChoice;
        String computerChoice;
        String playAgain = "yes";

        do{
            System.out.print("Enter your move (rock , paper, scissors): ");
            plyrChoice = sc.nextLine().toLowerCase();

            if(!plyrChoice.equals("rock") &&
                    !plyrChoice.equals("paper") &&
                    !plyrChoice.equals("scissors")){
                System.out.println("Invalid Choice!!");
                continue;
            }

            computerChoice = choices[rdm.nextInt(3)];
            System.out.println("Computer choice: " +computerChoice);

            if(plyrChoice.equals(computerChoice)){
                System.out.println("Its a TIE!");
            }
            else if((plyrChoice.equals("rock") && computerChoice.equals("scissors")) ||
                    (plyrChoice.equals("paper") && computerChoice.equals("rock")) ||
                    (plyrChoice.equals("scissors") && computerChoice.equals("paper"))){
                System.out.println("You Win!!");
            }
            else{
                System.out.println("You Lose!!");
            }

            System.out.println("Play Again (yes/no): ");
            playAgain = sc.nextLine().toLowerCase();

        }while(playAgain.equals("yes"));

        System.out.println("Thanks for playing!!");

        sc.close();
    }
}
