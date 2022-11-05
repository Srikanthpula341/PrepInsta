package com.tree;

public class BinarySearchkdistance {
	
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		root.left.left.left= new Node(-1);
		root.left.left.right= new Node(-11);
		
		int k=2;
		K_dis_node(root,k);
	
	
	}

	private static void K_dis_node(Node root,int k) {
		
		if (root == null)
            return ;
	//	System.out.print("k"+k+" ");
		if(k<=0) {
			System.out.print(root.data+" ");
			K_dis_node(root.left, k-1);
			K_dis_node(root.right, k-1);
		}
		
		else {
			K_dis_node(root.left, k-1);
			K_dis_node(root.right, k-1);
		}

		
			
					

		
	}





	}
