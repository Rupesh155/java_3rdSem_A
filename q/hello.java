package q;


// // public class Main {
// //     public static void main(String[] args) {
// //         ArrayList<Integer> list=new ArrayList<>();
// //         list.add(5);
// //         list.add(6);
// //         list.add(7);
// //         list.add(8);
// //         list.add(8);
// //         List<Integer> result=list.stream().distinct().toList();
// //         System.out.println(result);
// //         // List<Integer> nums = List.of(1, 2, 3, 4, 5, 6);
// //         // List<Integer> evens = nums.stream()
// //         // .filter(n -> n % 2 == 0).toList();
// //         // System.out.println(evens);
// //         // // MAP
// //         // System.out.println("Squares: " +
// //         //         Arrays.stream(nums).map(n -> n * n).boxed().toList());

// //         // // REDUCE (sum)
// //         // int sum = Arrays.stream(nums).reduce(0, (a,b) -> a + b);
// //         // System.out.println("Sum: " + sum);

// //         // // DISTINCT + SORT
// //         // System.out.println("Unique Sorted: " +
// //         //         Arrays.stream(nums).distinct().sorted().boxed().toList());

// //         // COMPLETE PIPELINE
// //         // int ans = Arrays.stream(nums)
// //         //         .filter(n -> n % 2 == 0)
// //         //         .map(n -> n * n)
// //         //         .distinct()
// //         //         .boxed()
// //         //         .sorted((a,b) -> b - a)
// //         //         .mapToInt(i -> i)
// //         //         .reduce(0, (a,b) -> a + b);

// //         // System.out.println("Final Result: " + ans);
// //     }
// // // }

// // // class myThread implements Runnable{
// // //     public  void run(){
// // //       for(int i =0;i<5;i++){
// // //         System.out.println(i);   
// // //         try {
// // //             Thread.sleep(2000);
// // //         } catch (Exception e) {
// // //         }
// // //       }

// // //     }  
// // // }
// // // class Main{
// // //     public static void main(String[] args) {
// // //         myThread task=new myThread();
// // //         Thread t1=new Thread(task);
// // //         Thread t2=new Thread(task);
// // //         t1.start();
// // //         t2.start();
        
// // //     }
    
// // // }



// // class Main{
// //     public static void main(String[] args) {
// //         ArrayList<Integer> list=new ArrayList<>();
// //         list.add(5);
// //         list.add(6);
// //         list.add(7);
// //         list.add(8);
// //         list.add(10);
// //         list.add(12);
// //         List<Integer> res=    list.stream().filter(n->n>60 ).toList();
// //         List<Integer> mapRes=    list.stream().map(n->n*2 ).toList();
// //         int data=    list.stream().reduce(0,(a,b)->a+b );
// //         List<Integer> skip=    list.stream().skip(2).toList();
// //         List<Integer>  limit=    list.stream().limit(2).toList();
// //         List<Integer>  sort=    list.stream().sorted((a,b)->a-b).toList();
// //         System.out.println(data);
// //         // System.out.println(res);
// //         // System.out.println(mapRes);
// //     }
// // }

// // // import java.util.*;

// // // class Main{
// // //     public static void main(String[] args) {
// // //         ArrayList<Integer> list=new ArrayList<>();
// // //         list.add(5);
// // //         list.add(6);
// // //         list.add(7);
// // //         list.add(8);
// // //      List<Integer> res=    list.stream().filter(n-> n%2!=0).toList();
// // //      List<Integer> mapData=    list.stream().map(n-> n*2).toList();
// // //         int data=   list.stream().reduce(0,(a,b)->a+b);
// // //      System.out.println(res);
// // //      System.out.println(mapData);
// // //      System.out.println(data);



        
            
// // //     }

// // // }















// // public class BinaryMultiplication {
// //     public static void main(String[] args) {

// //         String b1 = "1010";
// //         String b2 = "110";

// //         int num1 = Integer.parseInt(b1, 2);
// //         int num2 = Integer.parseInt(b2, 2);

// //         int product = num1 * num2;

// //         String result = Integer.toBinaryString(product);

// //         System.out.println( b1);
// //         System.out.println(b2);
// //         System.out.println("Product in Binary: " + result);
// //     }
// // }



// public class NQueens {

//     static void solveNQueens(int n) {
//         char[][] board = new char[n][n];

//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 board[i][j] = '.';
//             }
//         }

//         placeQueens(board, 0, n);
//     }

//     static void placeQueens(char[][] board, int row, int n) {
//         if (row == n) {
//             printBoard(board);
//             System.out.println();
//             return;
//         }

//         for (int col = 0; col < n; col++) {
//             if (isSafe(board, row, col)) {
//                 board[row][col] = 'Q';
//                 placeQueens(board, row + 1, n);
//                 board[row][col] = '.';
//             }
//         }
//     }

//     static boolean isSafe(char[][] board, int row, int col) {
//         for (int i = 0; i < row; i++) {
//             if (board[i][col] == 'Q') return false;
//         }

//         for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
//             if (board[i][j] == 'Q') return false;
//         }

//         for (int i = row, j = col; i >= 0 && j < board.length; i--, j++) {
//             if (board[i][j] == 'Q') return false;
//         }

//         return true;
//     }

//     static void printBoard(char[][] board) {
//         for (char[] row : board) {
//             for (char c : row) {
//                 System.out.print(c + " ");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         int n = 4;
//         solveNQueens(n);
//     }
// }

// for(int i=0;i<1000000;i++){
//     print(i)
// }
// int x=5;
// o()  Big oh 

// 


// for(int i=5;i<n;i++){
//     for(int j=0;j<n;j++){
//         print("hii")
//     }
//     // priint(i)
// }


// class hello{
//     public static void main(String[] args) {
//         // int x=1000;
//         // int n;
        // int n=5;
        // int i=0;
        // while (i<n) {
        //     for(int j=0;j<n;j++){
        //         System.out.println(i+j);
        //     }
          
        //     i++;
        // }
        // while (i<n) { //n
        //     for(int j=i;j<i+1;j++){//1
        //         System.out.println(j);
        //     }
        //     i++;
        // }
//         // int arr[];



//   1 2 4 8 16

// for(int i=0;i<n;i++){
//     for(int j=0;j<n;j=j*3){
        
//     }
// }


// for(int i =0;i<n;i++){
//     for(int j=0;j<i;j++){
//     }
// }



//         // int x=1000;
//         // int n;
//         // int arr[]=new int[n];


//         // int x=10;
//         // int arr[];
//         // int y=10;
//         // int sum =x+y;
//         // int n;
//         // int arr[]=new int[n]
// //         // for(int i=0;i<n;i++){
// //         //     int x=i;
// //         // }
// //         // for(int i=1;i<n;i++){
// //         //     for(int j=1;j<=i;j++){
             
// //         //     }
      
            
// //         // }
        
// //     }
// // }


// // // [1,2,3,4];
// // // {
// // //     0-> 1,1-> 2 





// // mongodb+srv://Myvillage:<db_password>@cluster0.mhuau8i.mongodb.net/?appName=Cluster0
// // }


// // class hello{
// //     public static void main(String[] args) {
// //         int arr[]={1,0,2,0,1};
// //         int low=0;
// //         int mid=0;
// //         int h=arr.length-1;
// //         while (mid<=h) {
// //             if(arr[mid]==0){
// //                 swap(arr,low,mid);
// //                 low++;
// //                 mid++;

// //             }else if(arr[mid]==1){
// //                 mid++;

// //             }else{
// //                 swap(arr,mid,h);
// //                 h--;

// //             }
        
            
// //         }
// //     }
// // // }


// // class hello{
// //    static   public void fun(int a) {
// //         if(a>0){
// //             fun(--a);
// //             System.out.println(a);
// //             fun(--a);
// //         }    
// //     }
// //     public static void main(String[] args) {
// //         fun(5);
// //     }
// // }
// // [2,1,1,4]

// // []
// // [1,0,1,2,2,0];
// // [0,0,1,1,2,2] -> o{nlogn};
// // time comlex-> o(n);
// // space-> o(1);
// // sc -> o(n) 
// // int c1=0;
// // int c


// // class hello{
// //     public static void main(String[] args) {
// //         int arr[]={1,0,1,0,2,0};
// //         int c1=0;
// //         int c2=0;
// //         int c3=0;
// //         for(int i=0;i<arr.length;i++){
// //             if(arr[i]==0){
// //                 c1++;
// //             }else if(arr[i]==1){
// //                 c2++;
// //             }else{
// //                 c3++;
// //             }
// //         }
// //         int idx=0;
// //         for(int i=0;i<c1;i++){
// //             arr[idx]=0;
// //             idx++;

// //         }

// //     }
// // }



// // import java.util.ArrayList;

// // class MergeSortTempArrayList {


// //     static void mergeSort(int[] arr, int l, int r) {
// //         if (l >= r) return;

// //         int mid = (l + r) / 2;
// //         mergeSort(arr, l, mid);
// //         mergeSort(arr, mid + 1, r);
// //         merge(arr, l, mid, r);
// //     }


// //     static void merge(int[] arr, int l, int mid, int r) {
// //         ArrayList<Integer> temp = new ArrayList<>();
// //         int i = l;       
// //         int j = mid + 1; 
// //         while (i <= mid && j <= r) {
// //             if (arr[i] <= arr[j]) {
// //                 temp.add(arr[i]);
// //                 i++;
// //             } else {
// //                 temp.add(arr[j]);
// //                 j++;
// //             }
// //         }

// //         while (i <= mid) {
// //             temp.add(arr[i]);
// //             i++;
// //         }


// //         while (j <= r) {
// //             temp.add(arr[j]);
// //             j++;
// //         }

 
// //         for (int k = 0; k < temp.size(); k++) {
// //             arr[l + k] = temp.get(k);
// //         }
// //     }


// //     public static void main(String[] args) {
// //         int[] arr = {5, 3, 8, 2, 1};
// //         mergeSort(arr, 0, arr.length - 1);

    
// //     }
// // }

// // class Hello {

// //     static int N = 4;

// //     // Board print karne ka function
// //     static void printBoard(char[][] board) {
// //         for (int i = 0; i < N; i++) {
// //             for (int j = 0; j < N; j++) {
// //                 System.out.print(board[i][j] + " ");
// //             }
// //             System.out.println();
// //         }
// //         System.out.println();
// //     }

// //     // Check kare ki queen safe hai ya nahi
// //     static boolean isSafe(char[][] board, int row, int col) {

// //         // same column check
// //         for (int i = 0; i < row; i++) {
// //             if (board[i][col] == 'Q')
// //                 return false;
// //         }

// //         // left diagonal check
// //         for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
// //             if (board[i][j] == 'Q')
// //                 return false;
// //         }

// //         // right diagonal check
// //         for (int i = row - 1, j = col + 1; i >= 0 && j < N; i--, j++) {
// //             if (board[i][j] == 'Q')
// //                 return false;
// //         }

// //         return true;
// //     }

// //     // Backtracking function
// //     static void solve(char[][] board, int row) {

// //         // base case: sab queens place ho gayi
// //         if (row == N) {
// //             printBoard(board);
// //             return;
// //         }

// //         // har column try karo
// //         for (int col = 0; col < N; col++) {

// //             if (isSafe(board, row, col)) {

// //                 board[row][col] = 'Q'; // queen place

// //                 solve(board, row + 1); // next row

// //                 board[row][col] = '.'; // backtrack
// //             }
// //         }
// //     }

// //     static void draw() {

// //         char[][] board = new char[N][N];

// //         // board initialize with '.'
// //         for (int i = 0; i < N; i++) {
// //             for (int j = 0; j < N; j++) {
// //                 board[i][j] = '.';
// //             }
// //         }

// //         solve(board, 0);
// //     }

// //     public static void main(String[] args) {
// //         draw();
// //     }
// // }


// class hello{
//     static  int N=4;
//      static  void print(char arr[][]){
//         for(int i=0;i<N;i++){
//             for(int j=0;j<N;j++){
//                 System.out.print(arr[i][j]);
//             }
//             System.out.println();
//         }
//         System.out.println();


//      }
//      static void    draw(){
//      char arr[][]=new char[N][N];
//         for(int i=0;i<N;i++){
//             for(int j=0;j<N;j++){
//                 arr[i][j]='.';

//             }
//         }

//         solve(arr,0);


//      }

//      static  void solve(char arr[][], int row){
//         if(row==N){
//             print(arr);
//             return;
//         }
//         for(int col=0;col<N;col++){
//             if(isSafe(arr,row,col)){
//                 arr[row][col]='Q';
//                 solve(arr, row+1);
//                 arr[row][col]='.';

//             }
//         }

//      }
//      static  boolean  isSafe(char arr[][],int row,int col){
//         for(int i=0;i<row;i++){
//             if(arr[i][col]=='Q'){
//                 return false;
//             }

//         }
//         for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
//             if(arr[i][j]=='Q'){
//                 return  false;
//             }

//         }
//         for(int i=row-1,j=col+1; i>=0 && j<N;i--,j++){
//             if(arr[i][j]=='Q'){
//                 return  false;
//             }
//         }
//         return  true;

//      }


//     public static void main(String[] args) {
//         draw();
        
//     }
// }


class hello{
   static   int N=5;
     static void  draw(){
        char arr[][]=new char[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                arr[i][j]='.';
            }

        }
        solve(arr,0);

    }

    static void print(char arr[][]){
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print(arr[i][j] );
            }
            System.out.println();
        }
        System.out.println();


    }
    static  void    solve(char arr[][],int row){
        if(N==row){
            print(arr);
            return;
        }
        for(int col=0;col<N;col++){
            if(isSafe(arr,row,col)){
                arr[row][col]='Q';
                solve(arr, row+1);
                arr[row][col]='.';
                
            }
        }

    }
     static  boolean  isSafe(char arr[][],int row,int col){
        for(int i=0;i<row;i++){
            if(arr[i][col]=='Q'){
                return  false;
            }
        }
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(arr[i][j]=='Q'){
                return  false;
            }
        }
        for(int i=row-1,j=col+1; i>=0 && j<N;i--,j++){
            if(arr[i][j]=='Q'){
                return  false;
            }
        }
        return  true;
     }


    public static void main(String[] args) {
        draw();
        
    }
}