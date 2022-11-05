package com.tree;


 public class BinaryTreeTrans {
	Node root;



	BinaryTreeTrans() { 
	    root = null;
	}


	void postorder(Node ptr)
	{
		if (ptr == null)
			return;

		// first recur on left subtree
		postorder(ptr.left);

		// then recur on right subtree
		postorder(ptr.right);

		// now deal with the node
		System.out.print(ptr.data + " ");
	}

	/* Given a binary tree, print its nodes in inorder*/
	void inorder(Node ptr)
	{
		if (ptr == null)
			return;

		/* first recur on left child */
		inorder(ptr.left);

		/* then print the data of node */
		System.out.print(ptr.data + " ");

		/* now recur on right child */
		inorder(ptr.right);
	}

	void preorder(Node ptr)
	{
		if (ptr == null)
			return;

		/* first print data of node */
		System.out.print(ptr.data + " ");

		/* then recur on left subtree */
		preorder(ptr.left);

		/* now recur on right subtree */
		preorder(ptr.right);
	}

    public static void main(String[] args)
	{
		BinaryTreeTrans tree = new BinaryTreeTrans();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

		System.out.println("Preorder traversal");
		tree.preorder(tree.root);

		System.out.println("\nInorder traversal");
		tree.inorder(tree.root);

		System.out.println("\nPostorder traversal");
		tree.postorder(tree.root);
	}

}
