import java.util.*;

public class LinkedListJavaFramework {
    public static void main(String[] args){
        LinkedList<Integer> LL = new LinkedList<Integer>();
        
        System.out.println("Linked List: " + LL);

        LL.addFirst(2); //adds element to the first position
        LL.addLast(3); //adds element to the last position
        
        System.out.println("Linked List: " + LL);
        
        LL.addFirst(1); //adds element to the first position
        LL.add(4);  //adds element to the last position
        LL.add(5); //adds element to the last position

        System.out.println("Linked List: " + LL);
        
        LL.addFirst(6); //adds element to the first position
        System.out.println("Linked List: " + LL);
        LL.removeFirst(); //removes element from the first position
        System.out.println("Linked List: " + LL);

        LL.add(6); //adds element to the last position
        LL.add(7); //adds element to the last position
        System.out.println("Linked List: " + LL);

        LL.remove(); //removes element from the first position
        System.out.println("Linked List: " + LL);
        LL.removeLast(); //removes element from the last position
        System.out.println("Linked List: " + LL);
    }
}
