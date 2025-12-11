package lect18;

import java.util.*;
public class hello {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        int t=8;
        //    int a=   list.size();
        //    int m=a/2;
        ListIterator<Integer> it=list.listIterator();
        while (it.hasNext()) {
            Integer a =  it.next();
            if(a==t){
                break;   
            }
        }
        while (it.hasPrevious()) {
            Integer Y =  it.previous();
           if(Y<t){
            it.remove();
           }
              
          }
          System.out.println(list);
          



  
     
    
   
     
    }
 
}

//[1,2,3,4,5,6,7]



// import java.util.*;

// public class hello {
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>(List.of(5, 6, 7, 8));

//         ListIterator<Integer> it = list.listIterator();

//         // Forward iteration
//         while (it.hasNext()) {
//             int x = it.next();
//             System.out.println("Forward: " + x);

//             if (x == 6) {
//                 it.set(60);        // replace 6 → 60
//             }
//             if (x == 7) {
//                 it.add(700);       // insert new element after 7
//             }
//         }

//         // Backward iteration
//         System.out.println("\nBackward:");
//         while (it.hasPrevious()) {
//             int x = it.previous();
//             System.out.println(x);
//         }

//         System.out.println("\nFinal List: " + list);
//     }
// }

