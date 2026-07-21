
public class SinglyLinkedList {

    public class Node{
        public int value;
        public Node next;
    }
        public Node head;
        public Node tail;
        public int size;

        public Node createSinglyLinkedList(int nodeValue){

            Node node = new Node();
            node.value = nodeValue;
            node.next = null;
            head = node;
            tail = node;
            size = 1;

            return head;
        }

    public void insert(int nodeValue , int location){

        if(head == null){
            createSinglyLinkedList(nodeValue);
            return;
        }
        Node node = new Node();
        node.value = nodeValue;

        if(location == 0){
            node.next = head;
            head = node;

        }else if(location >= size){
            node.next = null;
            tail.next = node;
            tail = node;
            System.out.println("insertion is done at the ending :");
        }
        else{
            Node tempNode = head;
            int index = 0;

            while(index < location-1){
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;

            System.out.println(("insertion is done at the middle:"));
        }
        size++;
    }
    public void traversal(){
        if(head != null){
            Node tempNode = head;

            for(int i=0; i<size; i++){
                System.out.print(tempNode.value+" ");
                tempNode = tempNode.next;
            }
            System.out.println();
        }
        else{
            System.out.println("Singlr linked lsit doesnt exist");
        }
    }

    public boolean searching(int nodeValue){
        if(head!=null){
            Node tempNode = head;

            for(int i=0; i<size; i++){
                if(tempNode.value == nodeValue){
                    System.out.println("element is found at position is:"+i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("element not found");
        return false;
    }

    public void deletionOfNode(int location){
        if(head == null){
            System.out.println("the sl doesnt exist");
            return;
        }else if(location == 0){
            if(size == 0){
                head = tail = null;
                size--;
                return;
            }
            head = head.next;
            size--;
        }
        else if(location >= size){
            Node tempNode = head;
            for(int i=0;i<size-1;i++){
                tempNode = tempNode.next;
            }
            if(tempNode == head){
                head = tail = null;
                size--;
                return;
            }
            tempNode.next = null;
            tail = tempNode;
            size--;
        }else{
            Node tempNode = head;
            for(int i=0; i<location; i++){
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next;
            size--;
        }
        
    }
    public void deleteEntireSLL(){
        head = null;
        tail = null;
        traversal();
        System.out.println("single linked list has been deleted");
    }

    public static void main(String[] args){

        SinglyLinkedList s = new SinglyLinkedList();

        s.createSinglyLinkedList(10);
        System.out.println(s.head.value);

        System.out.println("this is insertion method");
        s.insert(20,1);

        System.out.println("this is traversal method");
        s.traversal();

        System.out.println("this is searching method");
        s.searching(10);

        s.deleteEntireSLL();
        
        
    }
}

