package Basics;

import java.util.Scanner;

public class WhileLoop {
   public static void main(String[] args) {
      int i;
      for(i = 1; i <= 100; ++i) {
         System.out.println(i);
      }

      System.out.println("End of the while loop");

      while(i <= 100) {
         System.out.println(i);
         i += 2;
      }

      System.out.println("End of the while loop");
      System.out.println("Enter your name");
      Scanner sc = new Scanner(System.in);
      String myname = sc.nextLine();
      System.out.println("You entered " + myname);
      System.out.println("Enter your age");
      Scanner sc1 = new Scanner(System.in);
      int age = sc1.nextInt();
      System.out.println("your age is " + age);
      System.out.println("is working");
      Scanner sc2 = new Scanner(System.in);
      boolean status = sc2.nextBoolean();
      System.out.println("is working " + status);
      System.out.println("Do you want to continue...");
      Scanner sc3 = new Scanner(System.in);

      for(boolean choice = sc3.nextBoolean(); choice; choice = sc3.nextBoolean()) {
         System.out.println("you decided to continue...");
         System.out.println("Do you want to continue...");
      }

      System.out.println("You decided not to continue...");
      boolean res = false;

      do {
         System.out.println("Do you want to continue...");
         Scanner sc4 = new Scanner(System.in);
         res = sc4.nextBoolean();
      } while(res);

      System.out.println("you decided not to continue...");
   }
}
