import java.util.Scanner;

public class Solution {
    
    static int B, H;
    static boolean flag;
    
    static {
        Scanner scanner = new Scanner(System.in);
        
        B = scanner.nextInt();
        H = scanner.nextInt();
        
        if(B>0 && H>0)
            flag = true;
        else
            flag = false;
    }

    public static void main(String[] args) {
        
        if(flag == true) {
            int area = B*H;
            System.out.println(area);
        } else
            System.out.println("java.lang.Exception: Breadth and height must be positive");
    }
}
