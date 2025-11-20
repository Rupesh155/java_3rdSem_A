package lect10;


// class Parent {
//     static void staticMethod() { System.out.println("Parent static"); }
//     void instanceMethod() { System.out.println("Parent instance"); }
//     String name = "ParentName";
// }

// class Child extends Parent {
//     static void staticMethod() { System.out.println("Child static"); } // hides
//     void instanceMethod() { System.out.println("Child instance"); }   // overrides
//     String name = "hello";

// }

// public class Main {
//     public static void main(String[] args) {
//         Parent p = new Child();
//         p.instanceMethod();    // Child instance -> "Child instance"
//         p.staticMethod();      // Parent static -> "Parent static"  (compile-time)
//         System.out.println(p.name); // "ParentName" (field resolved by reference type)
//     }
// }

// // class Animal{
// //     void eat(){
// //         System.out.println("pizza");
// //     }
// //     // void sleep(){

//     // }
// // }

// // class Dog extends Animal{
// //     void eat(){
// //         System.out.println("biryanii");
// //     }
// //     void data(){
// //         System.out.println("hello");
// //     }

// // }

// // class Main{
// //     public static void main(String[] args) {
// //         // Dog s1=new  Dog();
// //         // s1.eat();
// //         Animal s1=new Dog();
// //         s1.eat();
// //            Dog s2=(Dog)s1;
// //         // //    s2.  
// //     }
// // }


// abstract  class Animal{
//      abstract   void eat();
// }
// class Dog extends  Animal{
//     void eat(){
//         System.out.println("hello");

//     }
// }

// class Main{
//     public static void main(String[] args) {
//         Dog s1=new Dog();
//         s1.eat();
        
//     }
// }


// class Animal{
//     void eat(){
//         System.out.println("pizza");
//     }
//     void data(){
//         System.out.println("hiii");
//     }
// }
// class Dog extends  Animal{
//     void eat(){
//         System.out.println("biryanii");

//     }
//     void sleep(){
//         System.out.println("hello");
//     }
// }

// class Main{
// public static void main(String[] args) {
//     Dog s1=new Dog();
//     s1.eat();
//     // Animal s1 =new Dog();
//     // s1.eat();

//          Dog s2=(Dog)s1; 
// }
// }

   //abstractions

   abstract  class Animal{
   abstract  void eat();
   }
   class Cat extends Animal{
    void eat(){
        System.out.println("kitkat");
    }
   }
   class Main{
    public static void main(String[] args) {
        Cat s1=new Cat();
        s1.eat();
        
    }
   }






      

 


























