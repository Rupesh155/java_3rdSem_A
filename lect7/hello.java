package lect7;



// class Car{
//      String str="hello";
//   static   void Sum(){
    
//         // System.out.println(str);
//     }
// }
// class Main{
//     public static void main(String[] args) {
//         Car obj=new Car();
//         obj.Sum()
//     }
// }
// class Car{
//     int a;
//     Car(int a){
//         //  a=b;
//         // a=a;
//         this.a=a;
//     } 
// }
// class Main{
//     public static void main(String[] args) {
//         Car obj=new Car(5);
//         // obj.a
      

        
//     }

// }

// class Student{
//     String name;
//     int rollNumber;
//     double marks;
//     void display(){
//         System.out.println( "Name"+ " "+ name);
//         System.out.println("rollNumber"+ " "+ rollNumber);
//         System.out.println("marks"+ " "+ marks);
//     }
// }

// class Main{
//     public static void main(String[] args) {
//         Student s1=new Student();
//         s1.name="om";
//         s1.rollNumber=155;
//         s1.marks=96.0;
//         Student s2=new Student();
//        s2.name="ram";
//        s2.rollNumber=101;
//        s2.marks=96.0;
//        s1.display();
//        s2.display();

        
//     }
// }

// class Car{
//     int a;
//     String name;
//     Car(int a,String name){
//         this.a=a;
//         this.name=name;
//         System.out.println("name"+ " "+name);
//         System.out.println("a"+ " "+a);

//     }
// }

// class Main{
//     public static void main(String[] args) {
//         Car s1=new Car(5,"jain");
//         Car s2=new Car(6,"shaifi");
//         Car s3=new Car(6,"mishraa");

    

        
//     }

// }


// class Student{
//     String name;
//     int rollNumber;
//     double marks;
//     void display(){
//         System.out.println("name" +"  "+name);
//         System.out.println("rollNumber" +"  "+rollNumber);
//         System.out.println("marks" +"  "+marks);


//     }

// }
// class Main{
//     public static void main(String[] args) {
//         Student s1=new Student();
//         s1.name="om";
//         s1.rollNumber=420;
//         s1.marks=96.0;
//         Student s2=new Student();
//         s2.name="shyam";
//         s2.rollNumber=155;
//         s2.marks=95.0;
//         Student s3=new Student();
//         s3.name="shyam";
//         s3.rollNumber=155;
//         s3.marks=95.0;
//         s1.display();
//         s2.display();
//         s3.display();


        
//     }
// }


class Parent {
    int x = 10;
    Parent() {
        System.out.println("Parent constructor: x = " + x);
    }
}

class Child extends Parent {
    int x = 20;

    Child() {
        // this.x refers to Child's x
        System.out.println("Child this.x = " + this.x);
        // super.x refers to Parent's x
        System.out.println("Child super.x = " + super.x);
    }

    void show() {
        int x = 30;
        System.out.println("local x = " + x);       // local variable
        System.out.println("this.x = " + this.x);   // child's field
        System.out.println("super.x = " + super.x); // parent's field
    }

    public static void main(String[] args) {
        Child c = new Child(); // calls Parent then Child constructor
        c.show();
    }
}

//   class Hello{

//     public Hello() {
//         this(5);
//         System.out.println("hiii");
//     }
//     public Hello(int a) {
//         this(5,6);
//         System.out.println(a);
//     }
//     public Hello(int a, int b) {
//         System.out.println(a);
//     }
    
//   }

// class Main{
//     public static void main(String[] args) {
//         Hello obj =new Hello();
  


        
//     }
// }


// class Animal{
//     void eat(){
//         System.out.println("pizza");
//     }
// }
// class Dog extends Animal{
//     void bark(){
//         System.out.println("hehe");

//     }
// }
// class cat  extends  Animal{

// }

// class Main{
//     public static void main(String[] args) {
//         Dog s1=new Dog();
//         s1.bark();
//         s1.eat();
        
//     }
// }