import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int integerNumber = scanner.nextInt();
        double doubleNumber = scanner.nextDouble();
        scanner.nextLine(); //bcz this nextLine() reads the newline character
        String string = scanner.nextLine();
        
        scanner.close();
        
        System.out.println("String: " + string);
        System.out.println("Double: " + doubleNumber);
        System.out.println("Int: " + integerNumber);
    }
}
