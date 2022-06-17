import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\nHello! What's your name?");
        String name = scan.nextLine();

        System.out.println("\nHi " + name + " Where are you from?");
        String place = scan.nextLine();

        System.out.println("\n I hear it's beautiful in " + place + ". I'm from a place called Viborg"); 
        
        System.out.println("\n How old are you?");
        int age = scan.nextInt();

        System.out.println("\nSo your're " + age + " I'm 400 years old!"); 
        
        System.out.println("\nThis means I'm " + (400/age) + " times older then you");
        
        System.out.println("Enough about me. What's your favorite language?");
        scan.nextLine();
        String languageChoice = scan.nextLine();

        System.out.println(languageChoice + " that's great! Nice chatting with you " + name + ". I have to log off now. See ya!");
        
    }
}
