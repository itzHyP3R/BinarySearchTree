package com.BST;

import java.util.Stack;

public class BST {
	private Node root;

	public BST() {
		this.root = null;
	}

	@SuppressWarnings("unused")
	public boolean addNewNode(int data) {
		Node n1 = new Node(data);
		if (n1 == null) {
			return false;
		}

		if (root == null) {
			root = n1;
			return true;
		}

		Node temp = root;

		while (true) {

			if (data == temp.getData()) {
				return false;
			}
			if (data < temp.getData()) {
				if (temp.getLeft() == null) {
					temp.setLeft(n1);
					return true;
				}

				temp = temp.getLeft();
			} else {
				if (temp.getRight() == null) {
					temp.setRight(n1);
					return true;
				}
				temp = temp.getRight();
			}

		}

	}

	public void Preorder() {
		Node temp = root;
		Stack<Node> stack = new Stack<>();

		while (temp != null || !stack.empty()) {
			while (temp != null) {
				stack.push(temp);
				System.out.print(temp.getData() + " ");
				temp = temp.getLeft();

			}
			temp = stack.pop().getRight();
		}

	}

	public void Inorder() {
		Node temp = root;

		Stack<Node> stack = new Stack<>();
		while (temp != null || !stack.empty()) {
			while (temp != null) {
				stack.push(temp);
				temp = temp.getLeft();
			}
			temp = stack.pop();
			System.out.print(temp.getData() + " ");
			temp = temp.getRight();

		}

	}

	public void Postorder() {
		Node temp = root;
		class Pair {
			Node node;
			char pos;

			public Pair(Node node, char pos) {
				this.node = node;
				this.pos = pos;
			}

			public Node getNode() {
				return node;
			}

			public void setNode(Node node) {
				this.node = node;
			}

			public char getPos() {
				return pos;
			}

			public void setPos(char pos) {
				this.pos = pos;
			}

//			public String getData() {
//				// TODO Auto-generated method stub
//				return null;
//			}
			
			
		}

		Stack<Pair> stack = new Stack<>();

		while (temp != null || !stack.empty()) {
			while (temp != null) {
				stack.push(new Pair(temp,'l'));
				temp = temp.getLeft();
			}
			 
			Pair temp2 = stack.pop();
			if(temp2.getPos()=='l') {
				temp = temp2.node.getRight();
				temp2.setPos('r');
				stack.push(temp2);
				
			}
			else {
				System.out.print(temp2.node.getData() + " ");
			}
			
			
			

		}

	}

}
