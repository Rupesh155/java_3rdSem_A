package lect9;

// class Main{
//     void add(int a){
//         System.out.println(a);
//     }

//     void add(int a,int b){
//         System.out.println(a+b);

//     }
//     void add(int a,int b,int c){
//         System.out.println(a+b);

//     }
//     public static void main(String[] args) {
//         Main s1=new Main();
//         s1.add(5,5,5);
        
//     }

// }


// class Animal{
//     void eat(){
//         System.out.println("pizza");
//     }
// }
// class Dog extends  Animal{
//     void eat(){
//         System.out.println("roti");
//     }
// }

// class hello{
//     public static void main(String[] args) {
//         Animal s1=new Dog();
//         s1.eat();
        
//     }
// }


// class hello{
//     void sum(){
//         System.out.println("hello");
//     }
//     void sum(int a){
//         System.out.println(a);
//     }
//     void sum(int a,int b){
//         System.out.println(a+b);
//     }
//     public static void main(String[] args) {
//         hello obj=new hello();
//         obj.sum(5,5);
        
//     }
// }




class hello{
    int Sum(int arr[][]){
        int data=0;
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                data+=arr[i][j];
            }
        }
        return data;
    }
    public static void main(String[] args) {
        // int arr[][]=new int[3][3];
        int arr[][]={{1,2},{3,4}};
        hello s1=new hello();
        int val= s1.Sum(arr);
        System.out.println(val);



    }

}