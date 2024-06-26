public class ThreadedBST {

    private Node root;

    public ThreadedBST() {
        root = null;
    }

    public boolean insert(int data) {
        Node newNode = new Node(data);
        if(newNode == null) {
            return false;
        }

        if(root == null) {
            root = newNode;
            return true;
        }

        Node parent = root;
        while(true) {
            if(parent.getData() == data) {
                return false;
            }

            if(data < parent.getData()) {
                //to left
                if(parent.getlFlag() == 'T') {
                    //parent does not have a left child, so newnode will become the left child of the parent
                    newNode.setRight(parent);
                    newNode.setLeft(parent.getLeft());
                    parent.setLeft(newNode);
                    parent.setlFlag('L');
                    return true;

                }
                parent = parent.getLeft();
            }
            else {
                //right
                if(parent.getrFlag() == 'T') {
                    //new node become the right child of parent
                      newNode.setLeft(parent);
                      newNode.setRight(parent.getRight());
                      parent.setRight(newNode);
                      parent.setrFlag('L');
                      return true;
                }
                parent = parent.getRight();
            }
        }
    }

    public void inOrder() {
        System.out.println("Inorder: ");
        Node temp = root;
        char flag = 'L';

        while(temp != null) {
            while(temp.getlFlag() == 'L' && flag == 'L') {
                temp = temp.getLeft();
            }

            System.out.print(temp.getData() + " ");
            flag = temp.getrFlag();
            temp = temp.getRight();
        }
        System.out.println();
    }
}
