package com.tree;



public class BinaryTree {

	public static void main(String[] args) {

		Node root = new Node(100);
		root.left = new Node(90);
		root.right = new Node(110);
		root.left.left = new Node(85);
		root.left.right = new Node(95);
		root.right.left = new Node(105);
		root.right.right = new Node(110);

		inOrder(root);
		System.out.println("postOrder");
		postOrder(root);

	}

	private static void postOrder(Node root) {
		
		if (root != null) {
			postOrder(root.left);
			
			postOrder(root.right);
			System.out.println(root.data + " ");
		}
		
	}

	public static void inOrder(Node root) {
		if (root != null) {
			inOrder(root.left);
			System.out.println(root.data + " ");
			inOrder(root.right);
		}
	}

}
