package luogu.math;

import java.text.DecimalFormat;
import java.util.Scanner;
public class P1001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int b = sc.nextInt();
        String str = "abc";
        double v = sc.nextDouble();
        String s = String.valueOf(v);
        String reverse = new StringBuffer(s).reverse().toString();
        DecimalFormat df = new DecimalFormat("0.00");
    }
}
