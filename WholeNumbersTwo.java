public class WholeNumbersTwo {
    public static void main(String[] args) {
        int numberOfFans = 5000;
        System.out.println("There are " + numberOfFans + " fans at the Quidditch games");

        long globalPopulation = 7000000000L; //if stored as normal int it fails, it can't store that large a number, but the long and L make this possible
        System.out.println("There are " + globalPopulation + " poeple on earth");
    }
}
