import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            
            int n = 1;
            while(scanner.hasNext()){
                String line = scanner.nextLine();
                System.out.println(n + " " + line);
                n++;
            }            
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
