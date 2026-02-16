// smallest part of program that can run automatically

// how to create thread in java
// -- there are two ways
// 1. By extending thread class

// This is class that extends Thread class
// class MyThread extends Thread {
//     public void run(){
//         System.out.println("Thread is running");
//     }
// }

// class Test {
//     public static void main(String[] args) {
//         MyThread t = new MyThread();
//         t.start(); // start method will call run method.
//     }
// }   

class MyThread extends Thread {
    public void run(){
        System.out.println("Thread is running");
    }
}   