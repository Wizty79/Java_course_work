public class FunctionsParameters {
    public static void main(String[] args) {
        measureRectangle(2.2, 4.3);
    }

    public static void measureRectangle(double length, double width) { //note the 2 parameters length and width
        double area = length * width;
        System.out.println("The area of the rectangle is " + area + "\n");
        
    }
}


/* Parameters are values that the function expects to receive, 
   when you call your functions, arguments are values that you are actually passing in,
   so your arguments must match your parameters   
*/
