class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(){
		
	}
	TreeNode(int val){
		this.val = val;
	}
	TreeNode(int val,TreeNode left,TreeNode right){
		this.val=val;
		this.left=left;
		this.right = right;
	}
}
public class BinaryTreeTraversals {
	
	public static void main(String[] args) {
			TreeNode root = new TreeNode(5);
			root.left = new TreeNode(4);
			root.right = new TreeNode(6);
			System.err.println("Inorder Traversal");
			inorderTraversal(root);
			System.err.println();
			System.err.println("Preorder Traversal");
			preorderTraversal(root);
			System.err.println();
			System.err.println("Postorder Traversal");
			postorderTraversal(root);
			System.err.println();

	}

	private static void postorderTraversal(TreeNode root) {
		if(root == null)
				return;
		postorderTraversal(root.left);
		postorderTraversal(root.right);
		System.out.print(root.val+" ");

	}

	private static void preorderTraversal(TreeNode root) {
		if(root == null)
			return;
		System.out.print(root.val+" ");
		preorderTraversal(root.left);
		preorderTraversal(root.right);
	}

	private static void inorderTraversal(TreeNode root) {
		if(root ==null) {
			return; 
		}
		inorderTraversal(root.left);
		System.out.print(root.val+" ");
		inorderTraversal(root.right);

	}

}
