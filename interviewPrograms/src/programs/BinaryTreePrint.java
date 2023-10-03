package programs;

public class BinaryTreePrint {
	// Node class to represent each node in the binary tree

	// Method to print the binary tree in inorder
	public static void inorder(Node root) {
		if (root != null) {
			inorder(root.left);
			System.out.print(root.data + " ");
			inorder(root.right);
		}
	}

	// Method to print the binary tree in preorder
	public static void preorder(Node root) {
		if (root != null) {
			System.out.print(root.data + " ");
			preorder(root.left);
			preorder(root.right);
		}
	}

	// Method to print the binary tree in postorder
	public static void postorder(Node root) {
		if (root != null) {
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.data + " ");
		}
	}

	// Main method to test the above methods
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		System.out.println("Inorder traversal of binary tree is:");
		inorder(root);
		System.out.println("\nPreorder traversal of binary tree is:");
		preorder(root);
		System.out.println("\nPostorder traversal of binary tree is:");
		postorder(root);

	}
}
