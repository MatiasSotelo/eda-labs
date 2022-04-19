import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;
public class Main {
    public static void main(String[] args) {
        List<Integer> ll = new List<Integer>(1);
        ll.push(2);
        ll.push(3);
        ll.print();

        List<Person> lPerson = new List<Person>(new Person("foo", "bar", 3));
        lPerson.push(new Person("faa", "bor", 1));
        lPerson.print();

        Set<Person> treeSet = new TreeSet<Person>(new personComparator());
        treeSet.add(new Person("name1", "lastname", 5));
        treeSet.add(new Person("name2", "lastname", 3));
        treeSet.add(new Person("name3", "lastname", 7));
        for(Person p: treeSet) {
            System.out.println(p.number);
        }
    }
}

class personComparator implements Comparator<Person> {
    public int compare(Person s1, Person s2){
        return s1.number - s2.number;
    }
}

class Person{
    String name;
    String lastname;
    int number;
    Person(String name, String lastname, int number) {
        this.name = name;
        this.lastname = lastname;
        this.number = number;
    }
}
class Node<T> {
    T data;
    Node<T> next;
    Node(T data) {
        this.data = data;
        this.next = null;
    }
}
class List<T>{
    Node<T> head;
    List(T data) {
        this.head = new Node<T>(data);
    }
    void push(T data){
        if(head == null) {
            head = new Node<T>(data);
            return;
        }
        Node<T> aux = new Node<T>(data);
        aux.next = head;
        head = aux;
    }

    void print(){
        Node<T> aux = head;
        while(aux != null){
            System.out.println(aux.data);
            if(aux.data instanceof Person) {
                System.out.println("hola");
            }
            aux = aux.next;
        }
    }
}