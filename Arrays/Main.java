public class Main {
    public static void main(String[] args){

        SinglyLinkedList s = new SinglyLinkedList();

        s.createSinglyLinkedList(10);
        
        s.insert(20, 1);
        s.insert(30, 2);
        s.insert(5, 0);

        s.traversal();

        s.searching(30);
        System.out.println(s.head.value);

        s.deletionOfNode(0);
        s.traversal();
        
        
    }
}
