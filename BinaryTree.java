package com.hubberspot.algos.tree;

import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree{
	private TreeNode root;
	
	private class TreeNode{
	private TreeNode left;
	private TreeNode right;
	private int data;

	public TreeNode(int data){
	this.data = data;
	}
	}

	public void createBinaryTree(){      // creating Binary tree 
	TreeNode first = new TreeNode(1);
	TreeNode second = new TreeNode(2);
	TreeNode third = new TreeNode(3);
	TreeNode fourth = new TreeNode(4);
	TreeNode fifth = new TreeNode(5);

	root = first;	//first (root)
	first.left = second;
	first.right = third;

	second.left = fourth; //second
	second.right = fifth;
	}

	public void levelOrder(){   //logic for level order traversing
	if(root==null){
	return;
	}
	Queue<TreeNode> queue = new LinkedList<>();  //creating a list 
	queue.offer(root);

	while(!queue.isEmpty()){
	TreeNode temp = queue.poll();							
	System.out.print(temp.data + " ");
	if(temp.left !=null){
	queue.offer(temp.left);
	}
	if(temp.right != null){
	queue.offer(temp.right);
	}
	}
	}






public static void main(String[] args){
	BinaryTree bt = new BinaryTree();
	bt.createBinaryTree();
	bt.levelOrder();
}
}