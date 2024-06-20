package Basics;

public class EqualsIgnoreCase {
   public static void main(String[] args) {
      String exptitle = "Google";
      String acttitle = "google";
      boolean status = exptitle.equalsIgnoreCase(acttitle);
      System.out.println(status);
   }
}
