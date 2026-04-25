import java.sql.SQLOutput;

public class traversalApplication {
    public static <T>void inorder(TreeNode<T> root){
        if(root==null)return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }
    public static <T>void preorder(TreeNode<T> root){
        if(root==null)return;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static <T>void postorder(TreeNode<T> root){
        if(root==null)return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+" ");
    }
    public static <T> int countNodes(TreeNode<T> root) {
        if (root == null) return 0;

        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    public static void main(String[] args) {
        TreeNode<String> root = new TreeNode<>("root");
        TreeNode<String> a = new TreeNode<>("home");
        TreeNode<String> b = new TreeNode<>("var");
        TreeNode<String> c = new TreeNode<>("user");
        TreeNode<String> d = new TreeNode<>("docs");
        TreeNode<String> e = new TreeNode<>("log");
        TreeNode<String> f = new TreeNode<>("config");
        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.right = e;
        c.left = f;
        System.out.print("Alphabetical Order: ");
        inorder(root);
        System.out.println();
        System.out.print("Backup: ");
        preorder(root);
        System.out.println();
        System.out.println("Size: "+countNodes(root));
        System.out.print("Delete: ");
        postorder(root);
        /*Why postorder is used for safe deletion
        Answer: Postorder traversal ensures safe deletion of directories

        In postorder, children are deleted first
        Parent is deleted only after all its children are removed
        Prevents errors like “directory not empty”
        Deletion order:
        config → user → docs → home → log → var → root*/
    }
}
