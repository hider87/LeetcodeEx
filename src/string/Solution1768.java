//package string;
//
//public class Solution1768 {
//    public String mergeAlternately(String word1,String word2){
//        char[] chars = word1.toCharArray();
//        char[] chars1 = word2.toCharArray();
//        int len = 0;
//        len = chars.length > chars1.length?chars1.length:chars.length;
//        String str = "";
//        for(int i = 0;i<len;i++){
//             str +=chars[i];
//             str +=chars1[i];
//        }
//        if(chars.length>chars1.length){
//            for(int i = len;i<chars.length;i++){
//                str += chars[i];
//            }
//        }else{
//            for (int i = len;i<chars1.length;i++){
//                str += chars1[i];
//            }
//        }
//        return str;
//    }
//}
