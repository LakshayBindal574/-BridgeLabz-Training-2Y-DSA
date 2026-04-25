import java.util.*;
public class expressionTreeEvaluation {

    public static void inorder(TreeNode<String> root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void preorder(TreeNode<String> root) {
        if (root == null) return;

        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void postorder(TreeNode<String> root) {
        if (root == null) return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
    }

    public static int evaluate(TreeNode<String> root) {
        Stack<Integer> st = new Stack<>();
        eval(root, st);
        return st.pop();
    }

    public static void eval(TreeNode<String> root, Stack<Integer> st) {
        if (root == null) return;

        eval(root.left, st);
        eval(root.right, st);

        String v = root.val;

        if (v.equals("+") || v.equals("-") || v.equals("*") || v.equals("/")) {
            int b = st.pop();
            int a = st.pop();

            switch (v) {
                case "+": st.push(a + b); break;
                case "-": st.push(a - b); break;
                case "*": st.push(a * b); break;
                case "/": st.push(a / b); break;
            }
        } else {
            st.push(Integer.parseInt(v));
        }
    }

    public static void main(String[] args) {

        TreeNode<String> root = new TreeNode<>("*");

        root.left = new TreeNode<>("+");
        root.right = new TreeNode<>("-");

        root.left.left = new TreeNode<>("3");
        root.left.right = new TreeNode<>("5");

        root.right.left = new TreeNode<>("8");
        root.right.right = new TreeNode<>("2");

        System.out.println("Inorder:");
        inorder(root);

        System.out.println("\nPreorder:");
        preorder(root);

        System.out.println("\nPostorder:");
        postorder(root);

        System.out.println("\nResult: " + evaluate(root));
    }
}