package Basics;

public class Contains {
   public static void main(String[] args) {
      String pgurl = "http://primusbank.qedgetech.com/aboutus.html";
      boolean res = pgurl.contains("aboutus");
      System.out.println(res);
      String pgtitle = "Sign In - Google Accounts";
      String value_tobe_check = "google";
      boolean result = pgtitle.contains(value_tobe_check);
      System.out.println(result);
      boolean result1 = pgtitle.toLowerCase().contains(value_tobe_check);
      System.out.println(result1);
      boolean result2 = pgtitle.toUpperCase().contains(value_tobe_check);
      System.out.println(result2);
      boolean result3 = pgtitle.toLowerCase().contains(value_tobe_check.toLowerCase());
      System.out.println(result3);
   }
}
