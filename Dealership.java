import java.util.Scanner;

public class Dealership {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welsome to the JAva Dealership");
        System.out.println(" .Select option 'a' to buy a car");
        System.out.println(" .Select option 'b' to sell a car");
        String option = scan.nextLine(); 
        switch (option) {
            case "a": 
                System.out.println("What is your budget");
                int budget = scan.nextInt();
                if (budget >= 10000) {
                    System.out.println("Great! A NIssan Altima is avalible");
                    System.out.println("Do you have insurance? Write 'Yes' or 'No'");
                    scan.nextLine();
                    String insurance = scan.nextLine();
                    System.out.println("\nDo you have a license? Write 'Yes' or 'No'");
                    String license = scan.nextLine();
                    System.out.println("\nWhat is your credit score");
                    int creditScore = scan.nextInt();
                    if (insurance.equals("Yes") && license.equals("Yes") && creditScore > 660);
                        System.out.println("Sold! Pleasure doing business with you");
                } else{
                    System.out.println("We're sorry. You are not eligible");
                }
            break;

            case "b": 
                System.out.println("\nWhat is your car valued at?");
                int value = scan.nextInt();
                System.out.println("\nWhat is your selling price?");
                int price = scan.nextInt();

                if (value > price && price < 30000) {
                    System.out.println("\nWe will buy your car. Pleasure doing business with you");   
                } else {
                    System.out.println("\nSorry, we're not interested!");
                }

            break;

            default: System.out.println("invalid option");
        }
        scan.close(); //we need to close the scanner to avoide a memory leak
    }
}
