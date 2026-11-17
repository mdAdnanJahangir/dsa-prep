package trees;

import java.util.*;

public class Traversals {
    public static void inorder(Tree.TreeNode node){
        if(node == null ) return;

        inorder(node.left); // leftnode ab node ban gaya .left right bus travel karne ke liye hai
        System.out.println(node.val);
        inorder(node.right);



    }





}
