package com.tree;

public class BinarySearchInOrder {

	public static void main(String[] args) {

		Node root = new Node(5);
		root.left = new Node(3);
		root.right = new Node(7);
		root.left.left = new Node(2);
		root.left.right = new Node(6);

		System.out.println("Inorder");
		inOrder(root);
		System.out.println("\nPreorder");
		preOrder(root);
		System.out.println("\nPostorder");
		postOrder(root);

	}

	private static void postOrder(Node root) {
		
		if(root!=null) {
			
		System.out.print(root.data+" ");
			postOrder(root.left);
			postOrder(root.right);
		}
		
	}

	private static void preOrder(Node root) {
		if(root!=null) {
			preOrder(root.left);
			preOrder(root.right);
			System.out.print(root.data+ " ");
		}
		
	}

	private static void inOrder(Node root) {

		if (root != null) {
			inOrder(root.left);
			System.out.print(root.data + " ");
			inOrder(root.right);
		}

	}

}
