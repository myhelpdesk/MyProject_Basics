package Basics;

public class Car {
   String name;
   String color;
   double price;
   static int wheels = 4;

   public static void main(String[] args) {
   }

   public static void start() {
      System.out.println("Start Car....");
   }

   public static void stop() {
      System.out.println("Stop Car...");
   }

   public void invokeSportDrive() {
      System.out.println("Enable Sport Drive");
   }
}
