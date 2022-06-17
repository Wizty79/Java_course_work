import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nHello! What's your name?");
        String name = scan.nextLine();

        System.out.println("\nHi " + name + " Where are you from?");
        String place = scan.nextLine();

        System.out.println("\n I hear it's beautiful in " + place + " I'm from a place called Viborg" + "\n How old are you?");
        double age = scan.nextDouble();

        System.out.println("\nSo your're " + age + " I'm 400 years old!" + "\nThis means I'm " + (400/age) + " times older then you");
        
        System.out.println("\nEnough about me. What's your favorite language?");
        String languageChoice = scan.nextLine();

        System.out.println(languageChoice + " that's great! Nice chatting with you" + name + "I have to log off now. See ya!");
        
    }
}
