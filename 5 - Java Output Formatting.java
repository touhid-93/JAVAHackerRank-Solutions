import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        String splitLine [];
        String characters[] = new String[3];
        int digits [] = new int[3];
        
        int loop = 0;
        while(loop < 3) {
            splitLine = scanner.nextLine().split(" ");
            characters[loop] = splitLine[0];
            digits[loop] = Integer.parseInt(splitLine[1]);
            
            loop++;
        }
        
        System.out.println("================================");
        
        for(int i=0; i<3; i++) {
            System.out.printf("%-15s%03d\n", characters[i], digits[i]);
        }
        
        System.out.println("================================");
    }

}
