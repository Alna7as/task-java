
import java.util.Scanner;

public class PrintNameIDAndEmail {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner k = new Scanner(System.in);
        
        // Ask for and read the name
        System.out.print("Please enter your name: ");
        String name = k.nextLine();
        
        // Ask for and read the ID
        System.out.print("Please enter your ID: ");
        int id = k.nextInt();
        k.nextLine(); // Clear the newline character from the buffer
        
        // Ask for and read the email address
        System.out.print("Please enter your email address: ");
        String email = k.nextLine();
        
        // Close the scanner
        k.close();
        
        // Display the collected information
        System.out.println("\nThank you! Here's the information you provided:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Email: " + email);
    }
}
```

