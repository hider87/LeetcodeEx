package tree.solution590;

import java.util.ArrayList;
import java.util.List;

// 层序遍历
class Node{
    public int val;
    public List<Node> children;
    public Node(){}
    public Node(int _val){
        val = _val;
    }
    public Node(int _val,List<Node> _children){
        val = _val;
        children = _children;
    }
}
public class Solution1 {
    public List<Integer> postorder(Node root){
        List<Integer> list = new ArrayList<>();
        if (root == null){
            return list;
        }
        List<Node> queue = new ArrayList<Node>(){{add(root);}},temp;
        while (!queue.isEmpty()){
            temp = new ArrayList<>();
            for (Node node:queue){
                list.add(node.val);
                for (Node val:node.children){
                    temp.add(val);
                }
            }
            queue = temp;
        }
        return list;
    }
}
