import javax.swing.plaf.nimbus.State;
import java.util.Stack;

public class BinarySearchTree {
    private Node root;

    public BinarySearchTree() {
        root = null;
    }

    public boolean insert(int data) {
        Node newNode = new Node(data);
        if(newNode == null) {
            return false;
        }

        //check if root is null i.e. the tree is empty
        if(root == null) {
            root = newNode;
            return true;
        }

        Node temp = root;

        while(true) {

            if(data == temp.getData()) {
                return false;
            }

            if (data < temp.getData()) {
                //insert to left
                //check if temp has a left child or not
                if (temp.getLeft() == null) {
                    //temp does not have a left child, so newnode will become left child of temp node
                    temp.setLeft(newNode);
                    return true;
                }

                //if temp has a left child, then shift temp to it's left and continue
                temp = temp.getLeft();
            } else {
                //insert to right
                //check if temp has a right child
                if (temp.getRight() == null) {
                    //temp does not have a right child, so newnode becomes the right child of temp node
                    temp.setRight(newNode);
                    return true;
                }
                //temp has a right child, so shift to the right of temp and continue
                temp = temp.getRight();
            }
        }


    }

    public void preOrder() {

        System.out.println("Preorder: ");

        Node temp = root;
        Stack<Node> stack = new Stack<>();

        while(temp != null || !stack.empty()) {
            while(temp != null) {
                System.out.print(temp.getData() + " ");
                stack.push(temp);
                temp = temp.getLeft();
            }
            temp = stack.pop().getRight();
        }
        System.out.println();
    }

    public void inOrder() {
        Node temp = root;
        Stack<Node> stack = new Stack<>();

        System.out.println("Inorder: ");

        while(temp != null || !stack.empty()) {
            while(temp != null) {
                stack.push(temp);
                temp = temp.getLeft();
            }
            temp = stack.pop();
            System.out.print(temp.getData() + " ");
            temp = temp.getRight();
        }
        System.out.println();
    }

    public void postOrder() {

        System.out.println("Postorder: ");
        class Pair {
            Node node;
            char flag;

            public Pair(Node node, char flag) {
                this.node = node;
                this.flag = flag;
            }
        }
        Stack<Pair> stack = new Stack<>();
        Node temp = root;

        while(temp != null || !stack.empty()) {

            while(temp != null) {
                stack.push( new Pair(temp, 'L'));
                temp = temp.getLeft();
            }

            Pair pair = stack.pop();
            if(pair.flag == 'L') {
                temp = pair.node.getRight();
                pair.flag = 'R';
                stack.push(pair);
            }
            else {
                System.out.print(pair.node.getData() + " ");
            }
        }
        System.out.println();
    }
}
