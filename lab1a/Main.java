public class Main {
    static class Node {
        Node next = null;
        int data;
        public Node(int d) {
            data = d;
        }
    }

    static class LinkedList {
        Node head = null;
        Node tail = null;
        public LinkedList(int d) {
            head = new Node(d);
            tail = new Node(d);
        }

        public void PrintLinkedList() {
            Node aux = head;
            while(aux!=null) {
                System.out.println(aux.data);
                aux = aux.next;
            }
        }

        public void InsertLast(int d){
          Node aux = head;
          while(aux!=null){
            if(aux.next==null){
              aux.next = new Node(d);
              return;
            }
            aux=aux.next;
          }
        }

        public void InsertLast2(int d){
          if(head==null){
            head = new Node(d);
            tail = new Node(d);
          }
          tail.next = new Node(d);
          tail = tail.next;
        }

        public void RemoveFirst(){
          if (head == null) {
            return;
          }
          if(head.next == null) {
            head = null;
            return;
          }
          head = head.next;
        }
        //enqueue
        //dequeue
    }

    public static void main(String[] args){
        LinkedList ll = new LinkedList(5);
        ll.InsertLast2(30);
        ll.InsertLast2(50);
        ll.PrintLinkedList();
    }
}
