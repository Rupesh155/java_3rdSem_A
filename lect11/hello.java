package lect11;



// }
// class Child implements Parent{
//     public     void sleep(){
//         System.out.println("hello hiii");

//     }
//     void deep(){
//         System.out.println("hiii");
//     }
    
  
// }


// public class hello {
//     public static void main(String[] args) {
//         Child s1=new Child();
//         s1.sleep();
//         s1.deep();
//         s1.dee();

        

        
//     }
    
// }

// class A{
//     void data(){
//         System.out.println("hello");
//     }

// }
// class B{
//     void data(){
//         System.out.println("hiii");
//     }
// }
// class C extends A,B{

// }
// class hello{
//     public static void main(String[] args) {
        
//     }
// }

// interface A {
//     void show();
// }

// interface B {
//     void show();
// }

// class C implements A, B {
//     public void show() {
//         System.out.println("C show()");
//     }
// }

//  abstract  class Shape{
//     abstract  void  area();

// }
// class circle extends Shape{
//     int r;

//     public circle(int r) {
//         this.r=r;
//     }
    
//     void area(){
//         double result=3.14*r*r;
//         System.out.println(result);

//     }
// }           
// class Rectangle extends  Shape{
//     int length;
//     int b;
//     public Rectangle(int length,int b) {
//         this.length=length;
//         this.b=b;
//     }
//     void area(){
        
//         double result=length*b;
//         System.out.println(result);
        
//     }

// }
// class hello{
//     public static void main(String[] args) {
//         circle s1=new circle(4);
//         s1.area();
//         Rectangle s2=new Rectangle(4, 5);
//         s2.area();
        
//     }
// }

// class A{
//     void sleep(){

//     }
// }
// class B{
//     void sleep(){

//     }
// }
// class C extends A,B{

// }

// class hello{

// }
// interface 

// interface  A{
//     abstract  void login();
// }
// class B implements A{
//     public  void login(){
//         System.out.println("hello");

//     }
// }

// class hello{
//     public static void main(String[] args) {
//         B s1=new B();
//         s1.login();
        
//     }
// }

// interface  A{
//     void sleep();
//     // void data();
//     default void data(){
//         System.out.println("hehe");

//     }
// }
// class  B implements A{
//   public   void sleep(){
//     System.out.println("byee");

//     }
// }
// class C implements  A{
//     public  void sleep(){
//         System.out.println("hello");
//     }

// }



// class hello{
//     public static void main(String[] args) {
        
//     }
// }

// abstract  class Shape{
//     abstract  void area();

// }
// class circle extends Shape{
//     int r;

//     public circle(int r) {
//         this.r=r;
//     }
    
//      void area(){
//      double  result=3.14*r*r;
//      System.out.println(result);

//      }
   
// }
// class hello{
//     public static void main(String[] args) {
        
//     }

// }

// class A{
//     void eat(){
//         System.out.println("hello");
//     }
// }
// class B{
//     void eat(){
//         System.out.println("HIII");
//     }
// }
// class C extends A,B{

// }

// class hello{
//     public static void main(String[] args) {
        
//     }
// }

interface A{
  abstract   void login();
  // void read();
  default void read(){

  }
;
}
class B implements A{
  public  void login(){
      System.out.println("hello");
  }
}
class hello{
  public static void main(String[] args) {
      B s1=new B();
      s1.login();
      
  }
}



// interface  B{
//   abstract void login();
// }

// class C implements A,B{
//   public void login(){
//     System.out.println("");
  
     
//   }
// }




