
QUESTION ONE:

public class Methods {
    
    // Method to find largest and smallest numbers
    public static void findLargestAndSmallest() {
        Scanner scanner = new Scanner(System.in);
        
        // Ask user to enter three numbers
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();
        
        // Initialize largest and smallest numbers
        int largest = num1;
        int smallest = num1;
        
        // Find the largest and smallest using if statements
        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }
        
        if (num2 < smallest) {
            smallest = num2;
        }
        if (num3 < smallest) {
            smallest = num3;
        }
        
        // Display results
        System.out.println("The smallest number: " + smallest);
        System.out.println("The largest number: " + largest);
        System.out.println(smallest + " is your smallest and " + largest + " is your largest number.");
    }

    public static void main(String[] args) {
        // Call method
        findLargestAndSmallest();
    }
}

QUESTION TWO:

public class Methods {
    
    // Method to calculate average marks
    public static void calculateAverageMarks() {
        Scanner scanner = new Scanner(System.in);
        
        // Ask for marks for three units
        System.out.print("Enter marks for Java Programming: ");
        double javaMarks = scanner.nextDouble();
        
        System.out.print("Enter marks for Networking: ");
        double networkingMarks = scanner.nextDouble();
        
        System.out.print("Enter marks for Maths: ");
        double mathsMarks = scanner.nextDouble();
        
        // Calculate the average
        double average = (javaMarks + networkingMarks + mathsMarks) / 3;
        
        // Output the data
        System.out.println("Marks for Java Programming: " + javaMarks);
        System.out.println("Marks for Networking: " + networkingMarks);
        System.out.println("Marks for Maths: " + mathsMarks);
        System.out.println("The average is: " + average);
    }

    public static void main(String[] args) {
        // Call method
        calculateAverageMarks();
    }
}

QUESTION THREE:

public class Methods {
    
    // Method to check if a year is a leap year
    public static void checkLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("The year " + year + " is a leap year.");
        } else {
            System.out.println("The year " + year + " is not a leap year.");
        }
    }
    
    // Method to get the base and height of a triangle
    public void getBaseAndHeight() {
        Scanner scanner = new Scanner(System.in);
        
        // Get the base and height
        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();
        
        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();
        
        // Call method to calculate area
        double area = calculateArea(base, height);
        
        // Call method to display area
        displayArea(area);
    }
    
    // Method to calculate the area of the triangle
    public double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }
    
    // Method to display the area
    public void displayArea(double area) {
        System.out.println("The area of the triangle is: " + area);
    }

    public static void main(String[] args) {
        // Check leap year
        checkLeapYear(2024);
        
        // Create an instance to call non-static methods
        Methods methods = new Methods();
        methods.getBaseAndHeight();
    }
}

QUESTION FOUR:

public class Methods {

    // Constructor
    public Methods() {
        System.out.println("Constructor called: Instance of Methods created.");
    }
    
    // Non-static method
    public void nonStaticMethod() {
        System.out.println("This is a non-static method.");
    }
    
    // Static method 1
    public static void staticMethod1() {
        System.out.println("This is static method 1.");
    }
    
    // Static method 2
    public static void staticMethod2() {
        System.out.println("This is static method 2.");
    }

    public static void main(String[] args) {
        // Call static methods
        staticMethod1();
        staticMethod2();
        
        // Create an instance of Methods to call non-static method
        Methods methods = new Methods();
        methods.nonStaticMethod();
    }
}


