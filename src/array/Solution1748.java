package array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Solution1748 {
    public int sumOfUnique(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            set.add(nums[i]);
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            map.put(nums[i],map.get(nums[i])==null?1:(map.get(nums[i])+1));
        }
        int res = 0;
        for (Integer val:set){
            if(map.get(val)==1){
                res +=val;
            }
        }
        return res;
    }
}
