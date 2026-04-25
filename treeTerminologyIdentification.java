class TreeNode<T> {
    TreeNode<T> right;
    TreeNode<T> left;
    T val;

    TreeNode(T val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
public class treeTerminologyIdentification {
    public static <T>void findLeaves(TreeNode<T> root){
        if(root==null)return;
        if(root.left==null && root.right==null){
            System.out.print(root.val+" ");
            return;
        }
        findLeaves(root.left);
        findLeaves(root.right);
    }
    public static <T>int height(TreeNode<T> root){
        if(root==null)return -1;
        return 1+Math.max(height(root.left), height(root.right));
    }
    public static <T>int findDepth(TreeNode<T>root, String target, int depth){
        if(root==null)return -1;
        if(root.val.equals(target))return depth;
        return Math.max(findDepth(root.left, target, depth+1), findDepth(root.right, target, depth+1));
    }
    public static <T> boolean findAnncestors(TreeNode<T> root, String target){
        if(root==null)return false;
        if(root.val.equals(target))return true;
        if(findAnncestors(root.left, target) || findAnncestors(root.right, target)){
            System.out.print(target+" "+root.val+" ");
            return true;
        }
        return false;
    }
    public static <T> int findDegree(TreeNode<T> root, String target){
        if(root==null)return -1;
        else{
            int count=0;
            if(root.left!=null)count=count+1;
            else count=count+0;
            if(root.left!=null)count=count+1;
            else count=count+0;
            return count;
        }
    }

    public static void main(String[] args){
        TreeNode<String> root=new TreeNode<>("CEO");
        TreeNode<String> a=new TreeNode<>("CTO");
        TreeNode<String> b=new TreeNode<>("CFO");
        TreeNode<String> c=new TreeNode<>("Dev");
        TreeNode<String> d=new TreeNode<>("Lead");
        TreeNode<String> e=new TreeNode<>("HR");
        TreeNode<String> f=new TreeNode<>("Dev1");
        TreeNode<String> g=new TreeNode<>("Dev2");
        root.left=a; root.right=b;
        a.left=c; a.right=d;
        b.right=e;
        c.left=f; c.right=g;
        System.out.print("leaf Nodes: ");
        findLeaves(root);
        System.out.println();
        System.out.print("Height of tree: "+height(root));
        System.out.println();
        System.out.println("Depth of Dev "+findDepth(root, "Dev", 0));
        System.out.println("Depth of Lead :"+findDepth(root, "Lead", 0));
        System.out.print("Ancestor of Dev1: ");
        findAnncestors(root, "Dev1");
        System.out.println();
        System.out.println("Degree of CTO: "+findDegree(root, "CTO"));
    }
}
