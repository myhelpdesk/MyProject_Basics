package Basics;

public class Split {
   public static void main(String[] args) {
      String dob = "24-10-2000";
      String[] temp = dob.split("-");
      String dt = temp[0];
      String month = temp[1];
      String year = temp[2];
      System.out.println(dt);
      System.out.println(month);
      System.out.println(year);
   }
}
