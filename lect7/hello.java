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
class Student{
    String name;
    int rollNumber;
    double marks;
    void display(){
        System.out.println( "Name"+ " "+ name);
        System.out.println("rollNumber"+ " "+ rollNumber);
        System.out.println("marks"+ " "+ marks);
    }
}

class Main{
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="om";
        s1.rollNumber=155;
        s1.marks=96.0;
        Student s2=new Student();
       s2.name="ram";
       s2.rollNumber=101;
       s2.marks=96.0;
       s1.display();
       s2.display();

        
    }
}