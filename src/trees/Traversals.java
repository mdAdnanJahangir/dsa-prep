package trees;

import java.util.*;

public class Traversals {
    public static void inorder(Tree.TreeNode node){
        if(node == null ) return;

        inorder(node.left); // leftnode ab node ban gaya .left right bus travel karne ke liye hai
        System.out.println(node.val);
        inorder(node.right);



    }


    public static void preorder(Tree.TreeNode node){
        if(node == null ) return;

        System.out.println(node.val);
        inorder(node.left); // leftnode ab node ban gaya .left right bus travel karne ke liye hai
        inorder(node.right);



    }


    public static void postorder(Tree.TreeNode node){
        if(node == null ) return;

        inorder(node.left); // leftnode ab node ban gaya .left right bus travel karne ke liye hai
        inorder(node.right);
        System.out.println(node.val);



    }



    public static List<List<Integer>> levelorder(Tree.TreeNode root){
        List<List<Integer>> resultArr = new ArrayList<>();
        if (root == null) return resultArr;

        Queue<Tree.TreeNode> queue = new LinkedList<>();

        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size(); // Number of nodes at the current level
            List<Integer> currentLevelArr = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                Tree.TreeNode currentNode = queue.poll();
                currentLevelArr.add(currentNode.val);

                // Add children for the next level
                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }

            // Add the completed level list to our final result
            resultArr.add(currentLevelArr);
        }

        return resultArr;

    }


    public static  List<List<Integer>> zigzag (Tree.TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<Tree.TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        boolean leftToRight = true; // Flag to track direction

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                Tree.TreeNode currentNode = queue.poll();

                // Always add normally during the queue extraction
                currentLevel.add(currentNode.val);

                // Standard child additions
                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }

            // If we are going right-to-left, reverse the list for this level
            if (!leftToRight) {
                Collections.reverse(currentLevel);
            }

            result.add(currentLevel);

            // Flip the flag for the next level
            leftToRight = !leftToRight;
        }

        return result;
    }











}
