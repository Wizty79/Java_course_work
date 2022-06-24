public class DocComments {
    public static void main(String[] args) {
        
    }

    /**
     * Function name: greet
     * 
     * Inside the function: 
     * 1. prints: 'Hey'
     */

    public void greet() {
        System.out.println("Hey");
    }

    /**
     * Function: printText
     * @param name (string)
     * @param age (string)
     * Inside the function: 
     * 1. print the name and age as part of a text
     */
    public static void printText(String name, String age) {
        System.out.print("Hey, I'm " + name + " and I'm " + age + " years old.");
    }
    
    /**
     * Function: calculateArea
     * 
     * @param length (double)
     * @param width (double)
     * @return (double)
     * 
     * Inside the function: 
     * 1. calculate the area and returns it. 
     */
    public static double calculateArea(double length, double width) {
        double area = length * width;
        return area;
    }
}

/**
 * make sure your curser sits direclt above the function
 * the press /** and it will create a template with 
 * the parameters and so on in it  
 */