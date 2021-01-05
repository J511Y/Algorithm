package baekjoon_tree;

import java.util.*;
class Tree {
	int val;
	Tree left, root, right;
	Tree (int val) {
		this.val = val;
	}
	void addChild(int child) {
		if(this.val > child) {
			// ¿ÞÂÊ
			if(left != null) left.addChild(child);
			else this.left = new Tree(child);
		} else {
			// ¿À¸¥ÂÊ
			if(right != null) right.addChild(child);
			else this.right = new Tree(child);
		}
	}
	void postOrder() {
		if(left != null) this.left.postOrder();
		if(right != null) this.right.postOrder();		
		System.out.println(this.val);
	}
}
class Main {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		Tree root = new Tree(n);
		try {
			while(true) {
				n = Integer.parseInt(sc.nextLine());
				root.addChild(n);				
			}
		} catch(Exception e) {
			root.postOrder();
		}
	}
}