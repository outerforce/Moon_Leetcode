
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Queue;


public class TreeTraverseExercise {
    //in order traverse
    public List<Integer> inOrder(TreeNode root) {

        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root == null) return res;
        TreeNode cur = root;
        while (cur != null || !stack.empty()) {
            while (cur != null) {
                stack.add(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            res.add(cur.value);
            cur = cur.right;
        }
        return res;
    }

    // recursive
    public void inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.value + " ");
            inorderTraversal(root.right);
        }
    }

    //pre order traverse
    public List<Integer> preOrder(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        TreeNode cur = root;
        while (!stack.empty()) {
            // Pop the top item from stack and print it_
            cur = stack.pop();
            res.add(cur.value);
            //Push right and left children of the popped node to stack
            if (cur.right != null) {
                stack.push(cur.right);
            }
            if (cur.left != null) {
                stack.push(cur.left);
            }
        }
        return res;
    }

    // recursive preorder
    public void preorderTraversal(TreeNode root) {
        if (root != null) {
            System.out.print(root.value + " ");
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
    }

    // post order traverse
    public List<Integer> postOrder(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Stack<TreeNode> stack = new Stack<>();
        TreeNode lastVisited = null;
        TreeNode current = root;

        while (!stack.isEmpty() || current != null) {
            if (current != null) {
                stack.push(current);
                current = current.left;  // go as left as possible
            } else {
                TreeNode peekNode = stack.peek();
                // if right child exists and it wasn't just visited
                if (peekNode.right != null && lastVisited != peekNode.right) {
                    current = peekNode.right;
                } else {
                    result.add(peekNode.value);
                    lastVisited = stack.pop();
                }
            }
        }
        return result;
    }

    //recursive post order
    public void postorderTraversal(TreeNode root) {
        if (root != null) {
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            System.out.print(root.value + " ");
        }
    }

    //level order or BFS
    public void levelorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();
            System.out.print(node.value + " ");

            if (node.left != null) {
                queue.add(node.left);
            }

            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }

    //BFS
    public List<TreeNode> BFS(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<TreeNode> list = new ArrayList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            /* poll() removes the present head.*/
            TreeNode tempNode = queue.poll();
            list.add(tempNode);
            /*Enqueue left child */
            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
        return list;
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        TreeTraverseExercise tree = new TreeTraverseExercise();
        System.out.println("inorder:");
        tree.inorderTraversal(root);
        System.out.println();
        System.out.println(tree.inOrder(root));
        System.out.println("preorder:");
        tree.preorderTraversal(root);
        System.out.println();
        System.out.println(tree.preOrder(root));
        System.out.println("postorder:");
        tree.postorderTraversal(root);
        System.out.println();
        System.out.println(tree.postOrder(root));
        System.out.println("level order:");
        tree.levelorderTraversal(root);
        System.out.println("BFS order:");
        List<TreeNode> result = tree.BFS(root);
        for (TreeNode node : result) {
            System.out.print(node.value + " ");
        }
    }
}

