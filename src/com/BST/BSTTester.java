package com.BST;

public class BSTTester {

	public static void main(String[] args) {
		BST b1 = new BST();
		b1.addNewNode(10);
		b1.addNewNode(5);
		b1.addNewNode(4);
		b1.addNewNode(7);
		b1.addNewNode(11);
		b1.addNewNode(12);
		System.out.println(b1.addNewNode(10));

		b1.Preorder();
		System.out.println();

		System.out.println("-------------------");

		b1.Inorder();

		System.out.println();

		System.out.println("-------------------");
		b1.Postorder();

	}

}
