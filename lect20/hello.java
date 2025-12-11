package lect20;

import java.io.FileWriter;

public class hello {
     static    void   writeData(String data){
        try {
            FileWriter writer=new FileWriter("New.txt",true);
            writer.write(data);
            writer.close();
            
        } catch (Exception e) {
        }
   
     }
    // crud
    public static void main(String[] args) {
        writeData("hello old data  hiiiii");
        // File file =new File("Data.java");
        // try {             
        //     if(file.createNewFile()){
        //         System.out.println("file cretedddddd"+ file.getName()) ;
        //         System.out.println("file cretedddddd"+ file.getAbsoluteFile()) ;

        //     }else{
        //         System.out.println("file already exitssssss");
        //     }
            
        // } catch (Exception e) {
        //     System.out.println(e);
        // }
      
        
    }

    
}
