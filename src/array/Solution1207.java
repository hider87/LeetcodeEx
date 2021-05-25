package array;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;

public class Solution1207  {
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i =0;i<arr.length;i++){
            map.put(arr[i],map.get(arr[i])==null?1:map.get(arr[i])+1);
        }
        int[] arr1 = new int[map.size()];
        int m = 0;
        for (Integer val:map.values()){
            arr1[m++] = val;
        }
        Arrays.sort(arr1);
        for (int i = 1;i<arr1.length;i++){
            if (arr1[i-1] == arr1[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,3};
        uniqueOccurrences(arr);
    }
}
