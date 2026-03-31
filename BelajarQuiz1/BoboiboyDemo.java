package BelajarQuiz1;
import java.util.Scanner;

public class BoboiboyDemo {
    Scanner sc = new Scanner(System.in);

    void opening() {
        System.out.println("Welcome to Boboiboy Duel!\n");
        int playerCount = 2;

        for (int i = 0; i < playerCount; i++) {
            System.out.print("Enter P" + (i+1) + " name : ");
            String[] playerName
            
            System.out.print("Enter how much element did P" + (i+1) + " have : ");

            if (i == 0) {
                int P1ElementAmount = sc.nextInt();
            }
            else {
                int PElementAmount = sc.nextInt();
            }
            
            
        }
        
    }
    public static void main(String[] args) {

        System.out.println("");
        System.out.println("Enter how much element do you have?");
        Boboiboy[] element = new Boboiboy[2];
    }
}
