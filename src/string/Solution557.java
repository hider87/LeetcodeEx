package string;

public class Solution557 {
    public String reverseWords(String s) {
        String[] s1 = s.split(" ");
        String temp = "";
        for(int i = 0;i<s1.length;i++){
            temp = s1[i];
            s1[i] = new StringBuffer(temp).reverse().toString();
        }
        temp = "";
        for (int i =  0;i<s1.length;i++){
            temp += temp +" ";
        }
        return temp.trim();
    }
}
