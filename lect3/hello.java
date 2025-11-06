package lect3;
// class Main{
//     public static void main(String[] args) {
//         String str="abc";
//         boolean a=false;

//         for(int i=0;i<str.length()/2;i++){
//             System.out.println("hii");
//         }
//     }
// }

// class Main {
//     public static void main(String[] args) {
//         String str = "abcba";  // You can change this string
//         boolean isPalindrome = true;

//         for (int i = 0; i < str.length() / 2; i++) {
//             if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
//                 isPalindrome = false;
//                 break;  // no need to check further
//             }
//         }

//         if (isPalindrome) {
//             System.out.println(str + " is a palindrome");
//         } else {
//             System.out.println(str + " is not a palindrome");
//         }
//     }
// }

// class Main {
//     public static void main(String[] args) {
//         String str = "level";
//         String rev = "";
//         for (int i = str.length() - 1; i >= 0; i--) {
//             rev += str.charAt(i);
//         }
//         System.out.println(str.equals(rev) ? "Palindrome" : "Not Palindrome");
//     }
// }


// class StringMethodsDemo {
//     public static void main(String[] args) {
//         String str = "  Java Programming  ";

//         // 1️⃣ length()
//         System.out.println("1. Length: " + str.length());

//         // 2️⃣ trim()
//         String trimmed = str.trim();
//         System.out.println("2. After trim: '" + trimmed + "'");

//         // 3️⃣ toLowerCase() and toUpperCase()
//         System.out.println("3. Lowercase: " + trimmed.toLowerCase());
//         System.out.println("   Uppercase: " + trimmed.toUpperCase());

//         // 4️⃣ charAt()
//         System.out.println("4. Character at index 2: " + trimmed.charAt(2));

//         // 5️⃣ substring()
//         System.out.println("5. Substring (0,4): " + trimmed.substring(0, 4));
   // Example 1: Only digits
//    String str1 = "12345";
//    System.out.println(str1.matches("[0-9]+"));  // Output: true

//    // Example 2: Mixed characters
//    String str2 = "12a45";
//    System.out.println(str2.matches("[0-9]+"));  // Output: false

//    // Example 3: Empty string
//    String str3 = "";
//    System.out.println(str3.matches("[0-9]+"));  // Output: false
//         // 6️⃣ equals() and equalsIgnoreCase()
//         String s1 = "Java";
//         String s2 = "java";
//         System.out.println("6. equals(): " + s1.equals(s2));
//         System.out.println("   equalsIgnoreCase(): " + s1.equalsIgnoreCase(s2));

//         // 7️⃣ contains()
//         System.out.println("7. Contains 'Pro': " + trimmed.contains("Pro"));

//         // 8️⃣ indexOf()
//         System.out.println("8. Index of 'a': " + trimmed.indexOf('a'));

//         // 9️⃣ replace()
//         System.out.println("9. Replace 'Java' with 'Python': " + trimmed.replace("Java", "Python"));

//         // 🔟 split()
//         String[] words = trimmed.split(" ");
//         System.out.println("10. Split words:");
//         for (String word : words) {
//             if (!word.isEmpty())  // to avoid empty spaces
//                 System.out.println("   " + word);
//         }

//         // 💡 Bonus: Reverse String using StringBuilder
//         String reversed = new StringBuilder(trimmed).reverse().toString();
//         System.out.println("\nBonus → Reversed String: " + reversed);
//     }
// }


// class  Main{

//     public static void main(String[] args) {
//         String str = "Java";
//         String str1 = "Java";

//         System.out.println( str.equals(str1));
//         System.out.println( str==str1);

//         // System.out.println("hello");

//     }

//     class Main {
//         public static void main(String[] args) {
//             String s1 = "Java";
//             String s2 = "Ja" + "va";  // compiler optimization
//             String s3 = "Ja";
//             String s4 = s3 + "va";    // runtime concat
    
//             System.out.println(s1 == s2);
//             System.out.println(s1 == s4);
//             System.out.println(s1.equals(s4));
//         }
//     }
    
// }

// class Main {
//     public static void main(String[] args) {
//         String str = "Java is fun";
//         String[] parts = str.split(" ");

//         for (String word : parts) {
//             System.out.println(word);
//         }
//     }
// }

// class Main{
//     public static void main(String[] args) {














//         // String str="hello java cpp";
//         // String a[]=str.split(" ");
//         // //["hello","java","cpp"]

//         // for(String str1 : a){
//         //     System.out.println(str1);
//         // }













    










          

//         // String a="abc";
//         // String b="";
//         // for(int i=a.length()-1;i>=0;i--){
//         //     b+=a.charAt(i);
//         // }
//         // if(a.equals(b)){
//         //     System.out.println("ji haii");
//         // }else{
//         //     System.out.println("nhi hai");
//         // }




//         // String str=new String("hello");
//         // String str1=new String("hello");
//         // System.out.println(str==str1);
//         // System.out.println(str.equals(str1));


//         // System.out.println("heii");
//         // String str="hello java";
//         // String str1="   hello java   ";
//         // System.out.println(str==str1);
//         // System.out.println(str.equals(str1));




//         // System.out.println(str.length());
//         // System.out.println(str.charAt(1));
//         // System.out.println(str.toUpperCase());
//         // System.out.println(str.toUpperCase());
//         // System.out.println(str.indexOf("z"));
//         // System.out.println(str.substring(2));
//         // System.out.println(str.substring(1,2));
//         // System.out.println(str.length());
//         // System.out.println(str.trim());


//         // System.out.println(str.split(" "));











        
//     }
// }


// char c='h';
// 'aieu'.in


class Main{
    public static void main(String[] args) {

        String str="java";
        int v=0;
        for(char ch : str.toCharArray()){
            if("aeiou".indexOf(ch)!=-1){
                v++;
            }
        }



        // String a[]=str.split("");
        // for(String val : a){
        //     System.out.println(val);
        // }
        // System.out.println(a[0]);


        // String a="aba";
        // String b="";

        // for(int i=a.length()-1;i>=0;i--){
        //     b+=a.charAt(i);
        // }
        // if(a.equals(b)){
        //     System.out.println("hai jii");
        // }else{
        //     System.out.println("nahi hai jii");

        // }






        // String str="hello";
        // String str1="hello";
        // String str=new String("hello");
        // String str1=new String("hello");

        // System.out.println(str==str1);
        // System.out.println(str.equals(str1));






        // System.out.println(str.length());
        // System.out.println(str.charAt(1));
        // System.out.println(str.toUpperCase());
        // System.out.println(str.toLowerCase());
        // System.out.println(str.toLowerCase());
        // System.out.println(str.trim());
        // System.out.println(str.substring(2));
        // System.out.println(str.substring(2,3));
        // System.out.println(str.indexOf(str));








        
    }



}

