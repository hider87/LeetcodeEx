package luogu.math;

import java.util.Scanner;

public class PTest {
    static int res1 = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        PTest p1028 = new PTest();
        p1028.help(i);
        System.out.println(res1);
    }
    public void help(int res){
        res1++;
        for (int i = 1;i<=res/2;i++){
            help(i);
        }
    }
}
