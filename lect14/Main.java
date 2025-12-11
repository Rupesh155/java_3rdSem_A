package lect14;

// // //     public static void main(String[] args) {
// // //         ArrayList<Integer> list = new ArrayList<>();
// // //         ArrayList<Integer> list2 = new ArrayList<>();
// // //         list2.add(100);
// // //         list2.add(200);
// // //         list.add(5);
// // //         list.add(6);
// // //         list.addAll(list2);

// // //         System.out.println(list);
        

// //     // }
    
// // // }

// import java.util.*;
// public class Main {
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(20);
//         list.add(30);
//         list.add(1, 15);      

//         ArrayList<Integer> list2 = new ArrayList<>();
//         list2.add(100);
//         list2.add(200);
//         list.addAll(list2);     // dusri list poori add
//         // ---------------------------------------------
//         // 3. Access elements
//         // ---------------------------------------------
//         int first = list.get(0);                   // first element
//         int last = list.get(list.size() - 1);      // last element
//         // ---------------------------------------------
//         // 4. Update / Modify element
//         // ---------------------------------------------
//         list.set(2, 99);        // index 2 ki value update
//         // ---------------------------------------------
//         // 5. Remove operations
//         // ---------------------------------------------
//         list.remove(0);                         // index 0 remove
//         list.remove(Integer.valueOf(20));       // value se remove
//         // list.clear();                        // poori list empty
//         // ---------------------------------------------
//         // 6. Search operations
//         // ---------------------------------------------
//         boolean exist = list.contains(30);      // element exist?
//         int idx1 = list.indexOf(100);           // first index
//         int idx2 = list.lastIndexOf(100);       // last index
//         // ---------------------------------------------
//         // 7. Size & Empty  
//         // ---------------------------------------------
//         int size = list.size();                 // kitne elements?
//         boolean isEmpty = list.isEmpty();       // khaali?
//         // ---------------------------------------------
//         // 8. Loop / Iterate
//         // ---------------------------------------------
//         // a) normal for loop
//         for(int i = 0; i < list.size(); i++){
//             System.out.println(list.get(i));
//         }
//         // b) enhanced for loop
//         for(int num : list){
//             System.out.println(num);
//         }
//         // c) iterator
//         Iterator<Integer> it = list.iterator();
//         while(it.hasNext()){
//             System.out.println(it.next());
//         }

//         // ---------------------------------------------
//         // 9. Sort operations
//         // ---------------------------------------------
//         Collections.sort(list);                                 // ascending
//         Collections.sort(list, Collections.reverseOrder());     // descending

//         // ---------------------------------------------
//         // 10. Convert ArrayList to Array
//         // ---------------------------------------------
//         Integer[] arr = list.toArray(new Integer[0]);

//         // ---------------------------------------------
//         // 11. Copy ArrayList
//         // ---------------------------------------------
//         ArrayList<Integer> copyList = new ArrayList<>(list);

//         // ---------------------------------------------
//         // 12. Remove If (Condition)
//         // ---------------------------------------------
//         list.removeIf(n -> n < 50);        // 50 se chhota remove

//         // ---------------------------------------------
//         // 13. ForEach (Java 8)
//         // ---------------------------------------------
//         list.forEach(n -> System.out.println(n));

//         // ---------------------------------------------
//         // 14. Reverse / Shuffle
//         // ---------------------------------------------
//         Collections.reverse(list);         // reverse list
//         Collections.shuffle(list);         // random shuffle

//         // ---------------------------------------------
//         // Print final list
//         // ---------------------------------------------
//         System.out.println("Final List: " + list);
//     }
// }


// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
     
//         // ---------------------------------------------
//         // 1. Create LinkedList
//         // ---------------------------------------------
        // LinkedList<Integer> list = new LinkedList<>();

//         // ---------------------------------------------
//         // 2. Add elements
//         // ---------------------------------------------
//         list.add(10);            // end par add
//         list.add(20);
//         list.add(30);

//         list.add(1, 15);         // index par add
//         list.addFirst(5);        // head (first) me add
//         list.addLast(40);        // tail (last) me add
//         // ---------------------------------------------
//         // 3. Access elements
//         // ---------------------------------------------
//         int first = list.getFirst();  // first element
//         int last = list.getLast();    // last element
//         int byIndex = list.get(2);    // index se access
//         // ---------------------------------------------
//         // 4. Update / Modify
//         // ---------------------------------------------
//         list.set(2, 99);              // index update

//         // ---------------------------------------------
//         // 5. Remove operations
//         // ---------------------------------------------
//         list.remove();                // first element remove
//         list.remove(1);               // index remove
//         list.remove(Integer.valueOf(20));   // value remove

//         list.removeFirst();           // first remove
//         list.removeLast();            // last remove
//         // ---------------------------------------------
//         // 6. Search operations
//         // ---------------------------------------------
//         boolean exist = list.contains(30);
//         int idx1 = list.indexOf(30);
//         int idx2 = list.lastIndexOf(30);

//         // ---------------------------------------------
//         // 7. Size & Empty
//         // ---------------------------------------------
//         int size = list.size();
//         boolean isEmpty = list.isEmpty();

//         // ---------------------------------------------
//         // 8. Loop / Iterate
//         // ---------------------------------------------
//         // a) normal for loop
//         for(int i = 0; i < list.size(); i++){
//             System.out.println(list.get(i));
//         }

//         // b) enhanced for
//         for(int num : list){
//             System.out.println(num);
//         }

//         // c) iterator
//         Iterator<Integer> it = list.iterator();
//         while(it.hasNext()){
//             System.out.println(it.next());
//         }

//         // ---------------------------------------------
//         // 9. Add / Remove like a Queue (FIFO)
//         // ---------------------------------------------
//         list.offer(100);        // add last
//         list.offerFirst(200);   // add first
//         list.offerLast(300);

//         list.poll();            // remove first & return
//         list.pollFirst();       // remove first
//         list.pollLast();        // remove last

//         // ---------------------------------------------
//         // 10. Peek elements (without removing)
//         // ---------------------------------------------
//         list.peek();            // first element
//         list.peekFirst();       
//         list.peekLast();

//         // ---------------------------------------------
//         // 11. Reverse iteration
//         // ---------------------------------------------
//         Iterator<Integer> rev = list.descendingIterator();
//         while(rev.hasNext()){
//             System.out.println(rev.next());
//         }

//         // ---------------------------------------------
//         // Print final LinkedList
//         // ---------------------------------------------
//         System.out.println("Final LinkedList: " + list);
//     }
// }
// heheheh


// class Node{
//     int data;
//     Node next;

//     public Node(int data) {
//         this.data=data;
//         this.next=null;
//     }
    
// }
// class MyLink{
//     Node head;
//     Node curr;
//     public  void addToLast(int data){
//         Node newNode =new Node(data);
//         if(head==null){
//             head=curr=newNode;
//         }else{
//             curr.next=newNode;
//             curr=newNode;
//         }


//     }


// }


// class Main{
//     public static void main(String[] args) {
//         // LinkedList<Integer> list=new LinkedList<>();
//         // list.addFirst(5);
//         // list.addFirst(10);

//         // ArrayList<Integer> list=new ArrayList<>();
//         // list.add(5);

//         // list.add(10);
//         // list.add(1,30);
//         // System.out.println(list.get(1));
        
//     }

// }



// Collections 
// class Node{
//     int data;
//     Node next;

//     public Node(int data) {
//         this.data=data;
//         this.next=null;
//     }
    
// }
// class MyLink{
//     Node head;
//     Node currNode;
//     void addToLast(int data){
//         Node newNode=new Node(data);
//         if(head==null){
//             head=currNode=newNode;
//         }
    //     else{
    //         currNode.next=newNode;
    //         currNode=newNode;
    //     }


    // }

//     void addTFirst(int data){
//         Node newNode=new Node(data);
//         if(head==null){
//             head=currNode=newNode;
//         }
//     }

// }

import java.util.*;
class Main{
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.addFirst(10);
        list.addLast(20);
        list.set(1, 40);
        // ArrayList<Integer> list=new ArrayList<>();
        // // ArrayList<Integer> list1=new ArrayList<>();
        // // list1.add(50);
        // list.add(5);
        // list.add(10);
        // list.add(1,30);
        // System.out.println(list);
        // list.addAll(list1);
        // System.out.println(list);
        // System.out.println(list.get(1));

        
    }
}







