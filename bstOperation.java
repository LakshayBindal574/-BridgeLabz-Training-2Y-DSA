public class bstOperation {

    public static TreeNode<Integer> insert(TreeNode<Integer> root, int val) {
        if (root == null) return new TreeNode<>(val);

        if (val < root.val)
            root.left = insert(root.left, val);
        else
            root.right = insert(root.right, val);

        return root;
    }

    public static TreeNode<Integer> findMin(TreeNode<Integer> root) {
        while (root.left != null)
            root = root.left;
        return root;
    }

    public static TreeNode<Integer> delete(TreeNode<Integer> root, int key) {
        if (root == null) return null;

        if (key < root.val)
            root.left = delete(root.left, key);
        else if (key > root.val)
            root.right = delete(root.right, key);
        else {

            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            TreeNode<Integer> min = findMin(root.right);
            root.val = min.val;
            root.right = delete(root.right, min.val);
        }

        return root;
    }

    public static void inorder(TreeNode<Integer> root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        int[] values = {15, 10, 20, 8, 12, 17, 25};

        TreeNode<Integer> root = null;

        for (int v : values)
            root = insert(root, v);

        System.out.println("Original BST (Inorder):");
        inorder(root);

        root = delete(root, 10);
        System.out.println();
        System.out.println("After deleting 10:");
        inorder(root);

        root = insert(root, 14);
        System.out.println();
        System.out.println("After inserting 14:");
        inorder(root);

        root = insert(root, 9);
        System.out.println();
        System.out.println("After inserting 9:");
        inorder(root);
    }
}