package lect19;
// // public class hello {
// //     public static void main(String[] args) {
// //         System.out.println("Program Start");
// //         // int arr[]=new int[5];
// //         // System.out.println(arr[6]);
      
// //         try {
// //             String str=null;
// //             System.out.println(str.length());
            
// //         } catch (ArithmeticExceptio e) {
// //             System.out.println(e);
// //         }

    

// //         // int a = 10;
// //         // int b = 0;

// //         // int result = a / b;  
// //         // System.out.println("Result: " + result);
// //         System.out.println("Program End");
    
// //     }
// // }

// class hello{
//     public static void main(String[] args) {
//         System.out.println("hello ");
//         try {
//             // int a=5;
//             // int b=0;
//             // int c=a/b;
//             // int arr[]={1,23};   
//             String str=null;
//             System.out.println(str);
//         } catch (NullPointerException e) {
//             System.out.println(e);
//         }finally{
//             System.out.println("hameshaaa chalengeee hammmm.....");
//         }
//         System.out.println("byee!!");
//         // int arr[]={1,2,3};
//         // String str=null;
//         // System.out.println(str.length());
//         // System.out.println(arr[5]);
//         // int a=5;
//         // int b=0;
//         // int c=a/b;
//         // System.out.println(c);    
//     }
// }

public class hello {
    public static void main(String[] args) {
        try {
            riskyMethod();   
        } catch (Exception e) {
            System.out.println("Main me handle hua: " + e);
        }     
        System.out.println("Program continue...");
    }       
    static void riskyMethod() throws ArithmeticException {
        System.out.println("riskyMethod start");
        int result = 10 / 0; 
        System.out.println("Result: " + result);
        System.out.println("riskyMethod end");
    }
}
// class hello{
//     public static void main(String[] args) {
//       try {
//         voteAge(15); 
          
//       } catch (Exception e) {
//         System.out.println(e);
//       }
//       try {
//           voteAge(19);
//       } catch (Exception e) {
//       }
//     }
//     static  void voteAge(int age){
//         System.out.println("check for vote");
//         if(age<18){
//             throw  new IllegalArgumentException("aap vote nhi kr sakte");
//         }



//     }


// }


// [5,-3,0,6,3,7];
// k=3