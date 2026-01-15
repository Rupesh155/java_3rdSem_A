// package lect20;

// import java.io.*;

// public class hello {
//      static    void   writeData(String data){
//         try {
//             FileWriter writer=new FileWriter("New.txt",true);
//             writer.write(data);
//             writer.close();
            
//         } catch (Exception e) {
//             System.out.println(e);
//         }
//      }
//        static   void   FileRead(){
//         try {
//             FileReader reader=new FileReader("New.txt");
//             int ch;
//             while ((ch=reader.read())!=-1) {
//                 System.out.print((char)ch);    
//             }
//         } catch (Exception e) {
//             System.out.println(e);
//         }
//        }

//          static   void   FileDelet(){
//             try {
//                 File file=new File("New.txt");
//                 if(file.delete()){
//                     System.out.println("file deletttt");
//                 }else{
//                     System.out.println("noooo");
//                 }
                
//             } catch (Exception e) {
//             }
           

//          }

//     // crud
//     public static void main(String[] args) {
//         writeData("hello old data  hiiiii");
//         FileRead();
//         // File file =new File("Data.java");
//         // try {             
//         //     if(file.createNewFile()){
//         //         System.out.println("file cretedddddd"+ file.getName()) ;
//         //         System.out.println("file cretedddddd"+ file.getAbsoluteFile()) ;

//         //     }else{
//         //         System.out.println("file already exitssssss");
//         //     }
            
//         // } catch (Exception e) {
//         //     System.out.println(e);
//         // }
      
        
//     }

    
// }
import  java.io.*;
class hello{
    public static void main(String[] args) {
        createData();
        // readFileData();
        // try {
        //     File file =new File("h.txt");
        //     if(file.delete()){
        //         System.out.println("doneeee" + file.getName());
        //     }else{
        //         System.out.println("already file created");
        //     }
            
        // } catch (Exception e) {
        //     System.out.println(e);
        // }
       
    }

        static   void   createData(){
            try {
                FileWriter writer=new FileWriter("abc/index.html",true);
                writer.write("hello   ");
                writer.close();
                
            } catch (Exception e) {
                System.out.println(e);
            }
          

        }

          static  void   readFileData(){
            try {
                FileReader reader=new FileReader("index.html");
                int ch;
                while ((ch=reader.read())!=-1) {
                    System.out.print((char)ch);    
                }
                
            } catch (Exception e) {
            }

    

         




          }
          static  void deleteFile(){
            try {
                File file=new File("index.html");
                if(file.delete()){
                    System.out.println("deleteddddd");
                }else{
                }
                
            } catch (Exception e) {
            }
       


          }
    }

