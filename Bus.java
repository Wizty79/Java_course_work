public class Bus {
    public static void main(String[] args) {
        String sentence = "Number of passengers: ";
        int passengers = 0;
        passengers += 9; //passsengers = passengers + 9 is the same result
        System.out.println(sentence + passengers);
        passengers -= 5;
        System.out.println(sentence + passengers);
        passengers -= 4;
        System.out.println(sentence + passengers);
    }
    
}

// Tip: You can run the comman clear to clear the terminal 

// =+ operator updates by adding the value on the right
