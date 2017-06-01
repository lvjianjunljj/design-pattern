package com.composite;

public class Tree {
	private TreeNode root;
	
	public Tree(String name) {
		root = new TreeNode(name);
	}
	
	public void add(TreeNode node) {
		root.add(node);
	}
}
