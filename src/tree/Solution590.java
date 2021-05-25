//package tree;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Node{
//    public int val;
//    public List<Node> children;
//    public Node(){}
//    public Node(int _val){
//        val = _val;
//    }
//    public Node(int _val,List<Node> _children){
//        val = _val;
//        children = _children;
//    }
//}
//// 递归
//public class Solution590 {
//    // 看清题目在写，注意条件
//    List<Integer> list = new ArrayList<>();
//    public List<Integer> postorder(Node root){
//        if(root == null){
//            return list;
//        }
//        for (Node node:root.children){
//            postorder(node);
//        }
//        list.add(root.val);
//        return list;
//    }
//}
