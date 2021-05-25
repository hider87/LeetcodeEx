package luogu.math;

import java.util.Scanner;

public class P1421 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double sum = a + b * 0.1;
        System.out.println((int)Math.floor(sum/1.9));
    }
}
