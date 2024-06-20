package Basics;

public class CompareTo {
   public static void main(String[] args) {
      String str1 = "A";
      String str2 = "A";
      System.out.println(str2.compareTo(str1));
      str1 = "A";
      str2 = "B";
      System.out.println(str2.compareTo(str1));
      str1 = "B";
      str2 = "A";
      System.out.println(str2.compareTo(str1));
   }
}
