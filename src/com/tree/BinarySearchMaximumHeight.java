package com.tree;

public class BinarySearchMaximumHeight {
	
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		root.left.left.left= new Node(-1);
		root.left.left.left.left= new Node(-1);
		
		int h=0;
		System.out.println(MaxHeight(root,h));
		System.out.println("dfg");
		System.out.println(maxheightPrep(root));
	
	}

	private static int maxheightPrep(Node root) {
		if(root==null)
            return Integer.MIN_VALUE;
		else
			return Math.max(root.data, Math.max(maxheightPrep(root.left), maxheightPrep(root.right)));
		
		
	}

	private static int MaxHeight(Node root,int h) {
	
		// TODO Auto-generated method stub
		//System.out.print(h);
		if(root==null)
			return 0;
		else 
			return 1+Math.max(MaxHeight(root.left,h++), MaxHeight(root.right,h++));
			
//			if(lh>rh)
//				return lh+1;
//			else
//				return rh+1;
		
		
			
			
		
	
	}

}
