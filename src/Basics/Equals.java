package Basics;

public class Equals {
   public static void main(String[] args) {
      String newpwd = "Qedge";
      String confirmpwd = "Qedge";
      boolean status = newpwd.equals(confirmpwd);
      System.out.println(status);
      newpwd = "Qedge";
      confirmpwd = "qedge";
      boolean statusSmall = newpwd.equals(confirmpwd);
      System.out.println(statusSmall);
   }
}
