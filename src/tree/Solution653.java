package tree;

import java.util.ArrayList;
import java.util.List;
public class Solution653 {
    List<Integer> res = new ArrayList<>();
    public boolean findTarget(TreeNode root, int k) {
        help(root);
        int[] arr = new int[res.size()];
        int index = 0;
        for(Integer val:res){
            arr[index++] = val;
        }
        int lo = 0,hi = arr.length-1;
        //小心
        while(lo<hi){
            int temp = arr[lo] + arr[hi];
            if(temp > k){
                hi--;
            }
            else if (temp < k){
                lo++;
            }else{
                return true;
            }
        }
        return false;
    }
    public void help(TreeNode root){
        if(root == null){
            return;
        }
        help(root.left);
        res.add(root.val);
        help(root.right);
    }
}
