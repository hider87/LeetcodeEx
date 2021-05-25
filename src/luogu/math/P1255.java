package luogu.math;

import java.util.Scanner;

public class P1255 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        P1255 p1255 = new P1255();
        System.out.println(p1255.help(sc.nextInt()));
    }
    public int help(int res){
        if(res ==1){
            return 1;
        }
        if(res == 2){
            return 2;
        }
        return help(res-1)+help(res-2);
    }
}
