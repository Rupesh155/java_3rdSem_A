package lect21;
// // // class MyThread extends Thread {
// // //     public void run() {
// // //         for (int i = 1; i <= 5; i++) {
// // //             System.out.println("Child Thread: " + i);
// // //             try { Thread.sleep(200); } catch (Exception e) {}
// // //         }
// // //     }
// // // }

// // // public class Main {
// // //     public static void main(String[] args) {

// // //         MyThread t = new MyThread();
// // //         t.start();

// // //         for (int i = 1; i <= 5; i++) {
// // //             System.out.println("Main Thread: " + i);
// // //             try { Thread.sleep(200); } catch (Exception e) {}
// // //         }
// // //     }
// // // }



// // // Background task (Download simulation)
// // class DownloadTask extends Thread {
// //     public void run() {
// //         for (int i = 1; i <= 5; i++) {
// //             System.out.println("Downloading file... " + (i * 20) + "%");
// //             try { Thread.sleep(500); } catch (Exception e) {}
// //         }
// //         System.out.println("Download Complete!");
// //     }
// // }

// // public class Main {
// //     public static void main(String[] args) {

// //         DownloadTask d = new DownloadTask();
// //         d.start();  // background work start

// //         // Meanwhile main thread timer chal raha hai
// //         for (int i = 1; i <= 5; i++) {
// //             System.out.println("Timer: " + i + " sec");
// //             try { Thread.sleep(1000); } catch (Exception e) {}
// //         }

// //         System.out.println("Main Thread Finished!");
// //     }
// // }

// // class child extends Thread{
// //     public void run() {
// //         for(int i = 1; i <= 5; i++) {
// //             System.out.println("Child: " + i);
// //             try { Thread.sleep(500); } 
// //             catch (Exception e) {}
// //         }
// //     }
// // }
// // public class Main {
// //     public static void main(String[] args) {
// //         System.out.println(Thread.currentThread().getName());
// //         child t1=new child();
// //         t1.start();
// //         try {
// //              t1.join();
            
// //         } catch (Exception e) {
// //         }
     
// //         for(int i = 1; i <= 5; i++) {
// //             System.out.println("Main: " + i);
// //         }
// //     }
// // }


    class Bank { 
     int balance = 100;
  synchronized   void withdraw(int amt) {
            System.out.println(Thread.currentThread().getName() + " checking balance...");
            if (balance >= amt) {
                System.out.println(Thread.currentThread().getName() + " proceeding withdraw...");
                balance = balance - amt;
                System.out.println("Balance left: " + balance);
            } else {
                System.out.println("Not enough balance");
            }
        }
    }

    class MyThread extends Thread {
        Bank b;
        MyThread(Bank b) { this.b = b; }

        public void run() {
            b.withdraw(100);
        }
    }

    public class Main {
        public static void main(String[] args) {
            Bank b = new Bank();
            MyThread t1 = new MyThread(b);
            MyThread t2 = new MyThread(b);
            t1.setName("om");
            t2.setName("Aman");
            t1.start();
            t2.start();
        }
    }


// //     class MyThread extends  Thread{
// //         public  void run(){
// //             System.out.println(Thread.currentThread().getName());
// //             for(int i=0;i<=5;i++){
// //                 System.out.println("downloading video..." + (i*20)+ "%");
// //                 try {
// //                     Thread.sleep(500);
// //                 } catch (Exception e) {
// //                 }
               
// //             }
// //         }
      
// //     }
// //     class Main{
// //         public static void main(String[] args) {
        
// //             MyThread t1=new MyThread();
// //             t1.start();
    
// //             for (int i = 1; i <= 5; i++) {
// //                             System.out.println("Timer: " + i + " sec");
// //                             try { Thread.sleep(1000); } catch (Exception e) {}
// //                         }
// //             System.out.println(Thread.currentThread().getName());  
// //         }
// //     }



// // class MyThread extends Thread{
// //     public  void run(){
// //         System.out.println("hello");
// //         System.out.println(Thread.currentThread().getName());
// //         for(int i=0;i<5;i++){
// //             System.out.println(i + "t1");
// //             try {
// //                 Thread.sleep(2000);
                
// //             } catch (Exception e) {
// //             }
// //         }
// //     }
// // }
// // class Main{
// //     public static void main(String[] args) {
// //         System.out.println(Thread.currentThread().getName());
// //         MyThread t1=new MyThread();
// //         // t1.setName("nameChange");
// //         t1.start();
// //         // try {
// //         //     t1.join();
            
// //         // } catch (Exception e) {
// //         // }
// //         for(int i=0;i<5;i++){
// //             System.out.println(i + "main");
// //         }
        
// //     }
// // }


// // class MyThread extends Thread {
// //     public  void run(){
// //         for(int i=1;i<=5;i++){
// //             System.out.println("downloading file...." + (i*20)+ "%");
// //             try {
// //                 Thread.sleep(4000);
// //             } catch (Exception e) {
// //             }
// //         }

// //     }
// // }
// // class Main{
// //     public static void main(String[] args) {
// //         MyThread t1=new MyThread();
// //         t1.start();
// //         for(int i=1;i<=5;i++){
// //             System.out.println("Timer"+" " +i);
// //             try {
// //                 Thread.sleep(2000);
// //             } catch (Exception e) {
// //             }

// //         }
       
        
// //     }
// // }

// class MyThread extends Thread{
//     public  void run(){
//         System.out.println(Thread.currentThread().getName());
//         for(int i=1;i<=5;i++){
//             System.out.println("downloading file..." +  (i*20)+ "%");
//             try {
//                 Thread.sleep(1000);
//             } catch (Exception e) {
//             }
           
//         }
//     }
// }
// class  Main{
//     public static void main(String[] args) {
//         MyThread t1=new MyThread();
//         // MyThread t2=new MyThread();
//         t1.start();
//         for(int i=1;i<=5;i++){
//             System.out.println("timer" + i);
//             try {
//                 Thread.sleep(2000);
//             } catch (Exception e) {
//             }
           
//         }
//         // try {
//         //     t1.join();
            
//         // } catch (Exception e) {
//         // }
       
//         // System.out.println("heheh");
//         // System.out.println("hiii");
   
//         // System.out.println(Thread.currentThread().getName());

//     }
// }








