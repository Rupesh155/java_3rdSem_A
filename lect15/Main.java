
// import java.util.HashMap;
// class Main{
//     public static void main(String[] args) {
//     //    String str="abdcbaba";

//         HashMap<Integer,Integer> map=new HashMap<>();
//         int arr[]={2,7,11,15};
//         int target=9;
//         for(int i=0;i<arr.length;i++){
//             int diff=target-arr[i];
//             if(map.containsKey(diff)){
//                 System.out.println(map.get(diff) + " "+i);
//                 break;
//             }
//             map.put(arr[i], i);
//         }
//         // for(char ch : str.toCharArray()){
//         //     map.put(ch, map.getOrDefault(ch, 0)+1);

//         // }
//         // System.out.println(map);
//         // for(char ch :str.toCharArray()){
//         //     if(map.get(ch)==1){
//         //         System.out.println(ch);
//         //         break;
//         //     }
//         // }

//         // int arr[]={1,1,3,4,5,5,6};
//         // for(int x: arr){
//         //     map.put(x, map.getOrDefault(x, 0)+1);
//         // }
//         // System.out.println(map);

//         // map.put(1, 10);
//         // map.put(2, 20);
//         // System.out.println(map.get(3));
//         // System.out.println(map.getOrDefault(3, 2000));
//         // System.out.println(map.containsKey(3));

//         // for(int x :map.keySet()){
//         //     System.out.println(map.get(x));

//         // }



        
//     }
// }





//class B
import  java.util.*;
class Main{
    public static void main(String[] args) {
        int arr[]={2,7,5,4};
             HashMap<Integer,Integer> map =new HashMap<>();
        int target=9;
        for(int i=0;i<arr.length;i++){
            int diff=target-arr[i];
            if(map.containsKey(diff)){
                System.out.println(map.get(diff) + " "+i);
                break;
            }
            map.put(arr[i], i);
        }






        // String str="aabcad";
        // HashMap<Character,Integer> map =new HashMap<>();
        // for(char ch :str.toCharArray()){
        //     map.put(ch, map.getOrDefault(ch, 0)+1);
        // }
        // System.out.println(map);
        // for(char ch :str.toCharArray()){
        //     if(map.get(ch)==1){
        //         System.out.println(ch);
        //         break;
        //     }
        // }


    //     HashMap<Integer,Integer> map =new HashMap<>();
    //    int ar[]={2,2,3,4,2,4,2};
    //    for(int x :ar){
    //     map.put(x, map.getOrDefault(x, 0)+1);

    //    }
    //    System.out.println(map);










        // map.put(1, 10);
        // map.put(2, 50);
        // System.out.println(map);
        // System.out.println(map.get(1));
        // System.out.println(map.getOrDefault(11, 0));
        // for(int x :map.keySet() ){
        //     System.out.println(map.get(x));

        // }



    }
}