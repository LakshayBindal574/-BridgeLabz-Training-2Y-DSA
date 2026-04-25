
public class bstConstructionAndValidation {

    public static TreeNode<Integer> insert(TreeNode<Integer> root, int val) {
        if (root == null) {
            return new TreeNode<>(val);
        }

        if (val < root.val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static void inorder(TreeNode<Integer> root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void search(TreeNode<Integer> root, int key) {
        System.out.print("\nSearch path: ");

        while (root != null) {
            System.out.print(root.val + " ");

            if (key == root.val) {
                System.out.println("\nFound " + key);
                return;
            } else if (key < root.val) {
                root = root.left;
            } else {
                root = root.right;
            }
        }

        System.out.println("\nNot found");
    }

    public static int height(TreeNode<Integer> root) {
        if (root == null) return 0;

        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static void main(String[] args) {

        int[] values = {50, 30, 70, 20, 40, 60, 80, 10, 25};

        TreeNode<Integer> root = null;

        for (int v : values) {
            root = insert(root, v);
        }

        System.out.print("Inorder Traversal:");
        inorder(root);

        search(root, 25);
        System.out.println();
        System.out.println("Height: " + height(root));
    }
}