package lect16;

import java.util.ArrayList;
import java.util.Collections;


// import java.util.Collections;
// import java.util.Comparator;



// // // public class hello {
// // //     public static void main(String[] args) {

// // //         HashSet<Integer> set = new HashSet<>();

// // //         set.add(10);
// // //         set.add(20);
// // //         set.add(10);   // duplicate
// // //         set.add(30);
// // //         set.add(null);
// // //         set.add(null); // duplicate null

// // //         System.out.println(set);
// // //     }
// // // }

// // import java.util.LinkedHashSet;

// // public class hello {
// //     public static void main(String[] args) {

// //         LinkedHashSet<Integer> set = new LinkedHashSet<>();

// //         set.add(10);
// //         set.add(20);
// //         set.add(10);  // duplicate
// //         set.add(30);
// //         set.add(null);

// //         System.out.println(set);
// //     }
// // }
// // // add()          // insert element
// // // remove()       // delete element
// // // contains()     // check exist or not
// // // size()         // total unique elements
// // // isEmpty()      // empty or not
// // // clear()        // delete all

// // import java.util.ArrayList;
// // import java.util.Collections;




// // class hello{
// //     public static void main(String[] args) {
// //         ArrayList<Integer> list=new ArrayList<>();
// // //         list.add(1);
// // //         list.add(0);
// // //         list.add(5);
// // //         Collections.sort(list);
// // //         System.out.println(list);
    
// // //     }
// // // }







// // class Student implements Comparable<Student>{
// //     String name;
// //     int RollN;

// //     public Student(int RollN,String name) {
// //         this.name=name;
// //         this.RollN=RollN;
// //     }
// //     public  int compareTo(Student s1){
// //         return  this.RollN-s1.RollN;

// //     }
// //     public String toString(){
// //         return RollN + " " + name;
// //     }
    
// // }

// // class hello{
// //     public static void main(String[] args) {
// //         ArrayList<Student> list=new ArrayList<>();
// //         list.add(new Student(10, "om"));
// //         list.add(new Student(1, "ankit"));
// //         Collections.sort(list);
// //         System.out.println(list.toString());


        
// //     }
// // }


// class  hello{
//     static  void fun(int a){
//         if(a>0){
//             fun(--a);
//             System.out.println(a);
//             fun(--a);
//         }
//     }
//     public static void main(String[] args) {
//         fun(5);
        
//     }
// }



// class Student{
//     String name;
//     int RollN;
//     public  Student(int RollN,String name){
//         this.name=name;
//         this.RollN=RollN;

//     }
//         public String toString(){
//         return RollN + " " + name;
//     }
// }
// class NameSorted  implements Comparator<Student>{
//     public  int compare(Student s1,Student s2){
//         return  s1.name.compareTo(s2.name);
        
//     }

// }
// class hello{
//     public static void main(String[] args) {
//         ArrayList<Student> list= new ArrayList<>();
//         list.add(new Student(1, "om"));
//         list.add(new Student(1, "Ankit"));
//         Collections.sort(list,new NameSorted());
//         for(Student s: list){
//             System.out.println(s.RollN +  " "+s.name);
//         }

//     }

// }

// class hello{
//     public static void main(String[] args) {
//         ArrayList<Integer> list=new ArrayList<>();
//         list.add(5);
//         list.add(3);
//         System.out.println(list);
//         Collections.sort(list);
//         System.out.println(list);

//     }

// }


// class Student  implements Comparable<Student>{
//     String name;
//     int RollN;

//     public Student(int RollN,String name) {
//         this.name=name;
//         this.RollN=RollN;
//     }
//     public int compareTo(Student s1){
//         return  this.RollN-s1.RollN;
//     }
//             public String toString(){
//         return RollN + " " + name;
//     }
    
// }

// class hello{
//     public static void main(String[] args) {
//         ArrayList<Student> list=new ArrayList<>();
//         list.add(new Student(1, "om"));
//         list.add(new Student(2, "ankit"));
//         Collections.sort(list);
//         System.out.println(list);   
//     }
// }





















