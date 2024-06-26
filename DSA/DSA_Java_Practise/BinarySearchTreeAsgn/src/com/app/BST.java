package com.app;

public class BST {

	private Node root;

	public Node getRoot() {
		return root;
	}

	public BST() {
		root = null;
	}

	public boolean insert(int data) {
		Node newNode = new Node(data);

		if (newNode == null) {
			return false;
		}

		if (root == null) {
			root = newNode;
			return true;
		}
		Node temp = root;

		while (true) {
			// to avoid duplicates
			if (data == temp.getData()) {
				return false;
			}
			if (data < temp.getData()) {
				if (temp.getLeft() == null) {
					temp.setLeft(newNode);
					return true;
				}
				temp = temp.getLeft();
			} else {
				if (temp.getRight() == null) {
					temp.setRight(newNode);
					return true;
				}
				temp = temp.getRight();
			}
		}
	}

	public void display() {
		Node temp1 = root;
		Node temp2 = root;
		while (temp1 != null || temp2 != null) {
			if (temp1!= null) {
				System.out.println(temp1.getData() + " ");
			}
			temp1 = temp1.getLeft();

			if (temp2 != null) {
				System.out.println(temp2.getData());
			}
			temp2 = temp2.getRight();
		}
	}

	public void inOrder(Node temp) {
//		Node temp = root;
		if(temp == null) {
			return ;
		}
		inOrder(temp.getLeft());
		System.out.print(temp.getData()+" ");
		inOrder(temp.getRight());
	}
	
	public int getMin(Node root) {
//		
//		System.out.print("root = "+root);
		if (root == null) {
			return -92;
		}
		Node temp = root;
		while (temp.getLeft() != null) {
			temp = temp.getLeft();
		}
		return temp.getData();
	}
	
    public int getMax(Node root) {
        if(root == null) {
            return 0;
        }
        Node temp = root;
        while(temp.getRight() != null) {
            temp = temp.getRight();
        }

        return temp.getData();
    }
    
    public int secondMax() {
    	if(root == null) {
    		return 0;
    	}
    	Node temp = root;
    	while(temp.getRight().getRight() != null) {
    		temp = temp.getRight();
    	}
    	return temp.getData();
    }
    
//   Find k-th smallest element in BST and also perform Sum of k smallest elements in BST

    public int getCount(Node root) {
    	Node temp = root;
    	if(temp == null) {
    		return 0;
    	}
    	return 1+getCount(root.getLeft())+getCount(root.getRight());
    }
    
    public int getSum(Node root) {
    	Node temp = root;
    	int sum = 0;
    	if(temp ==  null) {
    		return 0;
    	}
    	
    	while(temp.getLeft() != null) {
    		sum = sum + root.getLeft().getData(); 
    		temp = temp.getLeft();
//    		temp 
    	}
    	return sum;
    }
    
    public boolean isBST(Node root,Node left,Node right) {
    	if(root == null) {
    		return true;
    	}
    	//left child should be less than root
    	if(root.getLeft() != null && getMin(root.getLeft()) > root.getData()) {
    		System.out.println(root.getData());
//    		System.out.println("left child");
    		return false;
    	}
    	//right child should be greater than root
    	if(root.getRight() != null && getMax(root.getRight()) <  root.getData()) {
//    		System.out.println("right child");
    		return false;
    	}
//    	if(isBST(root.getLeft(),root.getLeft(),root) == true && isBST(root.getRight(),root,root.getRight()) == true){
//    		System.out.println("left & right child");
//    		return true;
//    	}
//    	return true;
    	return isBST(root.getLeft(),left,root) && isBST(root.getRight(),root,right);
    }
    
}
