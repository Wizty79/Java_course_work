import java.util.Scanner;

public class RockParchmentSheers {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rock Parchment Sheers.");
        System.out.println("When I say 'shoot', Choose: rock, parchment, or sheers");
        System.out.println("Are you ready? Write 'yes' if you are.");

        String ready = scan.next();

        if (ready.equals("yes")) {
            System.out.println("\nGreat!");
            System.out.println("rock - parchment - sheers, shoot! ");
            String choice = scan.nextLine();
        } else {
            System.out.println("Darn, we'll play some other time.");
        }

        scan.close();

       public static String computerChoice () {
       double randomNumber = Math.random() * 3; 
       int integer = (int)randomNumber; 

       switch (integer) {
                case 0: return "rock";
                case 1: return "parchment";
                case 2: return "Sheers";
                default: return "";
        }
    }

    }
}
