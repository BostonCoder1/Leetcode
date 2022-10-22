package binaryTree;
import java.util.*;

public class NodeBfs {
	char value;
	NodeBfs left;
	NodeBfs right;
	
	//Create the constructer
	NodeBfs(char val){
		this.value= val;
		this.left = null;
		this.right = null;
	}
	public void bfs(NodeBfs root) {
		if(root==null) return;
		Queue<NodeBfs> q = new LinkedList<NodeBfs>();
		// add the root node to the queue
		q.add(root);
		while(!(q.isEmpty())) {
			 NodeBfs current = q.poll();
			if(current.left!=null) q.add(current.left);
			if(current.right!=null) q.add(current.right);
			System.out.println(current.value);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create the object for the Node.
				NodeBfs a = new NodeBfs('a');
				NodeBfs b = new NodeBfs('b');
				NodeBfs c = new NodeBfs('c');
				NodeBfs d = new NodeBfs('d');
				NodeBfs e = new NodeBfs('e');
				NodeBfs f = new NodeBfs('f');
				
				a.left = b;
				b.left = d;
				c.right=f;
				b.right=e;
				a.right=c;
				
				NodeBfs obj = new NodeBfs('a');
				obj.bfs(a);

	}

}
