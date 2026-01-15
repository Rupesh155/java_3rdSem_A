package lect17;

// import java.util.LinkedHashSet;


// import java.util.HashSet;

// public class hello {
//     public static void main(String[] args) {
//         HashSet<String> list=new HashSet<>();
//         list.add("hello");
//         list.add("hiii");
//         list.add("hiii");

//         System.out.println(list);
//     }
    
// }

// import java.util.HashSet;

// class   hello {
//     public static void main(String[] args) {
//         int arr[]={1,2,3,1};
//         int arr1[]={2,3,4,5};
//         HashSet<Integer> set=new HashSet<>();
//         for(int  x :arr){
//             if(set.contains(x)){
//                 System.out.println(true);
//             }
//             set.add(x);
//             System.out.println(false);
//         }

// //         set.add(10);
// //         set.add(20);
// //         set.add(30);
// // System.out.println(set);



   
//     }

// }

// import java.util.HashSet;

// class hello{
//     public static void main(String[] args) {
//         int arr[]={1,2,3,4,10};
//         int arr1[]={1,2,3,4};
//         HashSet<Integer> set1=new HashSet<>();
//         HashSet<Integer> result=new HashSet<>();

//         for(int x: arr){
//             set1.add(x);
//         }

//         for(int y: arr1){
//             if(set1.contains(y)){
//                 result.add(y);

//             }
//         }
//     }

// }

 
// [1,2,3,1]
// k=3;

// int arr[]={1,-3,2,5,5};
// k=3

// class hello{
//     public static void main(String[] args) {
//         LinkedHashSet<Integer> set=new LinkedHashSet<>();
//         set.add(20);
//         set.add(40);
//         // set.
   
//     }
// }

// import java.util.HashSet;
// class hello{
//     public static void main(String[] args) {
//     int arr1[]={1,2,4,5};
//     int arr2[]={1,2,4};
//         HashSet<Integer> set=new HashSet<>();
//         for(int x :arr1){
//             set.add(x);
//         }
//         System.out.println(set);
//         HashSet<Integer> result=new HashSet<>();
//         for(int Y :arr2){
//             if(set.contains(Y)){
//                 result.add(Y);

//             }
//         }
//         System.out.println(result);
//         set.remove(4);










//         // for(int x: arr){
//         //     set.add(x);
//         // }
//         // if(arr.length==set.size()){
//         //     System.out.println(true);

//         // }
//         // else{
//         //     System.out.println(false);
//         // }
       
//         // // set.add(5);
//         // // set.add(6);
//         // // set.add(10);
//         // // set.contains(10);
//         // System.out.println(set);
        
//     }

// }

import java.util.HashMap;

class hello{
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(1, 10);
        map.put(2, 20);
        System.out.println(map.getOrDefault(3, 0));
        12345678





        // LinkedHashSet<Integer> set=new LinkedHashSet<>();
        // set.add(7);
        // set.add(6);
        // set.add(8);
        // TreeSet<Integer> set=new TreeSet<>();
        // set.add(5);
        // set.add(3);
        // System.out.println(set);

    }
}