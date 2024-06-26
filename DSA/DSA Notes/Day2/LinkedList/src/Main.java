public class Main {
    public static void main(String[] args) {

        LinkedList l1 = new LinkedList();

        l1.insert(10);
        l1.insert(20);
        l1.insert(30);
        l1.insert(40);
        l1.insert(50);
        l1.display();

        l1.insert(60, 1);
        l1.display();
        l1.insert(70, 4);
        l1.display();
        l1.insert(80, 8);
        l1.display();
        boolean isInserted =l1.insert(90, 10);
        System.out.println(isInserted);
        l1.display();

        l1.displayReverse();
        l1.displayReverse(l1.getHead());

        System.out.println();
        l1.display();
        l1.reverse();
        l1.display();

        l1.deleteByPosition(1);
        l1.display();
        l1.deleteByPosition(4);
        l1.display();
        l1.deleteByPosition(6);
        l1.display();
        l1.deleteByPosition(6);
        l1.display();

        /*l1.deleteByVal(80);
        l1.display();
        l1.deleteByVal(70);
        l1.display();
        l1.deleteByVal(60);
        l1.display();
        l1.deleteByVal(80);
        l1.display();*/

        /*l1.insert(80, 4);
        l1.insert(80, 6);
        l1.display();

        while( l1.deleteByVal(80) )
            ;

        l1.display();*/



    }
}
