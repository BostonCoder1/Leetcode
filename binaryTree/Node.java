package binaryTree;

import java.util.*;
//
//public class Node{
//	// instance variable
//	char value;
//	Node left;
//	Node right;
//	
//	// create a constructer
//	Node(char value)
//	{
//		this.value= value;
//		this.left = null;
//		this.right = null;
//		
//	}
//	
//	// step
//	/*create the stack
//	if root is not empty insert it to the stack
//	
//	next
//	(a) if stack is not empty pop that node and update with current node
//	if child of the current node is not null, insert those to the stack
//	print the current.value.
//	repeat the process (a);
//	// create the level order traversal.
//	 * */
//	 
//	public void dfs(Node root) {
//		
//		if (root == null) return;
//		// create the stack for the level order traversal
//		
//		Stack<Node> stack= new Stack();
//		// we insert the root value at the begining in the stack
//		stack.push(root);
//		
//		
//		while(!(stack.isEmpty())) {
//			Node current = stack.pop();
//			
//			
//			if(current.right!=null) stack.push(current.right);
//			if(current.left!=null) stack.push(current.left);
//			System.out.println(current.value);
//		}
//	
//	
//	
//}
//	public static void main(String[] args) {
//	
//	// create the object for the Node.
//	Node a = new Node('a');
//	Node b = new Node('b');
//	Node c = new Node('c');
//	Node d = new Node('d');
//	Node e = new Node('e');
//	Node f = new Node('f');
//	a.left = b;
//	b.left = d;
//	c.right=f;
//	b.right=e;
//	a.right=c;
//	
//	Node obj = new Node('a');
//	obj.dfs(a);
//	
//	}
//}

// following is the recursive method
public class Node{
	char value;
	Node left;
	Node right;
	Node(char val){
		this.value = val;
		this.left = null;
		this.right = null;
	}
	
	public Node dfs(Node root) {
		if(root == null)return null;
		Node current = root;
		Node left = dfs(root.right);
		Node right = dfs(root.left);
		System.out.println(root.value );
		return root;
	}

	
	
	public static void main(String[] args) {
	
		// create the object for the Node.
		Node a = new Node('a');
		Node b = new Node('b');
		Node c = new Node('c');
		Node d = new Node('d');
		Node e = new Node('e');
		Node f = new Node('f');
		a.left = b;
		b.left = d;
		c.right=f;
		b.right=e;
		a.right=c;
		
		Node obj = new Node('a');
		Node k = obj.dfs(a);
		
		}
	}

	