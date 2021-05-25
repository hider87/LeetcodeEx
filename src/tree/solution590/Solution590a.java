//package tree.solution590;
//
//import tree.Node;
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
//
//public class Solution590a {
//    public List<Integer> postorder(tree.Node root) {
//        List<Integer> list = new ArrayList();
//        if(root == null){
//            return list;
//        }
//        LinkedList<tree.Node> nodes = new LinkedList();
//        nodes.add(root);
//        while (!nodes.isEmpty()) {
//            root = nodes.removeLast();
//            list.add(0, root.val);
//            nodes.addAll(root.children);
//        }
//        return list;
//    }
//}
