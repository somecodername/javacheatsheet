// Java Cheat Sheet

// 1. Basic Syntax and Structure
public class JavaCheatSheet {

    // Main Method
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
    }

    // 2. Variables and Data Types
    int number = 10;
    double doubleNumber = 3.14;
    char character = 'A';
    String text = "Hello, World!";
    boolean isTrue = true;

    // 3. Control Flow Statements
    if (number > 5) {
        System.out.println("Number is greater than 5");
    } else {
        System.out.println("Number is less than or equal to 5");
    }

    // For Loop
    for (int i = 0; i < 5; i++) {
        System.out.println(i);
    }

    // 4. Methods
    void greet() {
        System.out.println("Hello, World!");
    }

    // 5. Object-Oriented Programming
    class Vehicle {
        // Class body
    }

    class Car extends Vehicle {
        // Class body
    }

    // 6. Exception Handling
    try {
        // Code that might throw an exception
    } catch (Exception e) {
        // Handle exception
    } finally {
        // Cleanup code
    }

    // 7. Collections Framework
    List<String> list = new ArrayList<>();
    Set<String> set = new HashSet<>();
    Map<String, Integer> map = new HashMap<>();

    // 8. File I/O
    try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}
