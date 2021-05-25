package luogu.math;

import java.math.BigInteger;
import java.util.Scanner;

public class P1255a {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int res = sc.nextInt();
        if(res == 1){
            System.out.println(1);
            return;
        }
        if(res == 2){
            System.out.println(2);
            return;
        }
        BigInteger b1 = new BigInteger("1");
        BigInteger b2 = new BigInteger("1");
        BigInteger ans = new BigInteger("0");
        for(int i = 1;i<res;i++){
            ans = b1.add(b2);
            b1 = b2;
            b2 = ans;
        }
        System.out.println(ans);
    }
}
