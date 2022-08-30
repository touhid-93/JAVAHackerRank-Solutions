import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int q = scanner.nextInt(); //how many times we wanna solve the problem/how many queries

        int a, b, n = 0; //declaring variables for query values

        while (q != 0) { //loop for each query
            int s = 0, temp = 0; //for storing result

            a = scanner.nextInt();
            b = scanner.nextInt();
            n = scanner.nextInt();

            for (int i = 0; i <= n - 1; i++) { //loop for n
                temp = temp + (int) (Math.pow(2, i) * b);
                s = a + temp; //cz a is constant and only b is changing so b in temp result and a in final result

                System.out.print(s + " ");
            }
            System.out.println(); //new line 2nd query

            q--; //while loop count
        }
    }
}
