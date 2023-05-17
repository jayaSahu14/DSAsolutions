package DataStructures.Tree;

public class TreeTraversal {
	
	static void inOrder(Node root) {
		
		if(root!=null) {
			inOrder(root.left);
			System.out.println(root.key + "-");
			inOrder(root.right);
		}
		
	}
	
		static void preOrder(Node root) {
				
				if(root!=null) {
					System.out.println(root.key + "-");
					preOrder(root.left);				
					preOrder(root.right);
				}
				
			}
		
		static void postOrder(Node root) {
			
			if(root!=null) {
				postOrder(root.left);
				postOrder(root.right);
				System.out.println(root.key + "-");
			}
			
		}

}

/*Tree Traversal is basically going through every node(key) exactly once.
In this video we briefly discuss:
Types of Tree Traversal i.e. Breadth-First Search(BFS) and Depth First Search(DFS).
Inorder, preorder and postorder traversals.*/