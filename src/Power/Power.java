package Power;

import java.util.Scanner;

public class Power {

    static long calculatePower(int x, int n){
        if (n == 0)
            return 1;

        long tempVal = calculatePower(x, n / 2); //since we divide by 2, helps achieve O(logn)!

        if (n % 2 == 0)
            return tempVal * tempVal;
        else
            return x * tempVal * tempVal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of x");
        int x = Integer.parseInt(sc.nextLine());
        System.out.println("Enter value of n [power]");
        int n = Integer.parseInt(sc.nextLine());;
        System.out.println(calculatePower(x,n));
    }
}
