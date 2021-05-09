package tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class TreeNode{
    int val;
    TreeNode left,right;
    TreeNode(int val){
        this.val = val;
    }
}
public class Solution32 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        List<Integer> list;
        List<TreeNode> queue = new ArrayList<TreeNode>(){{add(root);}},temp;
        boolean flag = false;
        while(!queue.isEmpty()){
            list = new ArrayList<>();
            temp = new ArrayList<>();
            for(TreeNode node:queue){
                list.add(node.val);
                if(node.left!=null){
                    temp.add(node.left);
                }
                if(node.right!=null){
                    temp.add(node.right);
                }
            }
            if(flag){
                Collections.reverse(list);
            }
            flag =!flag;
            res.add(list);
            queue = temp;
        }
        return res;
    }
}
