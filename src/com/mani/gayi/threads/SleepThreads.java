package com.mani.gayi.threads;

/*
 * Example of Thread Sleep method in Java
 */
public class SleepThreads {
      
       public static void main(String... args){
              System.out.println(Thread.currentThread().getName() + " is going to sleep for 1 Second");
              try {
                     Thread.currentThread().sleep(1000);
              } catch (InterruptedException e) {
                     // TODO Auto-generated catch block
                     e.printStackTrace();
              }
              System.out.println("Main Thread is woken now");
       }

}