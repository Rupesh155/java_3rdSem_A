// package lect4;

import java.util.Arrays;
// public class hello {
//     public static void main(String[] args) {
//         String str="hello";
//         String newStr="";
//         for(char ch : str.toCharArray()){
//             if(newStr.indexOf(ch)==-1){
//                 newStr+=ch;
//             }
//         }
//         System.out.println(newStr);
        
//     }
    
// }


//freq check of each char

// class Main{
//     public static void main(String[] args) {

//     //     int freq[]=new int[256];
//     //   // java is programing lang
//     //      String str="banana";
//     //      for(char ch :str.toCharArray()){
//     //         freq[ch]++;
//     //      }
//         //  for(int i=0;i<256;i++){
//         //     if(freq[i]>0){
//         //         System.out.println((char)i +"-> " + freq[i]);
//         //     }
//         //  }
//         // String str="hello";
//         // String newStr="";  
//         // for(char ch :str.toCharArray()){
//         //     if(newStr.indexOf(ch)==-1){
//         //         newStr+=ch;

//         //     }
//         // }
//         // System.out.println(newStr);

        
//     }
// }

    


//Anagram check

class Hello{
    public static void main(String[] args) {
        String  a="hello";
        String  b="lloeh";
        char ch1[]=a.toCharArray();
        char ch2[]=b.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
            String str1=new String(ch1);
            String str2=new String(ch2);
        if(str1.equals(str2)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }







        // String str="java is powerful";
        // String a[]=str.split(" ");
        // String lagest="";
        // for(String val : a){
        //     if(val.length()>lagest.length()){
        //         lagest=val;
        //     }
        // }
        // System.out.println(lagest);



        
    }
}