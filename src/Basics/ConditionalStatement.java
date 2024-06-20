package Basics;

public class ConditionalStatement {
   public static void main(String[] args) {
      int a = 10;
      int b = 5;
      if (a > b) {
         System.out.println("a is big");
      }

      a = 5;
      b = 10;
      System.out.println("Here condition not satisfied because of that not get output ");
      if (a > b) {
         System.out.println("a is big");
      }

      a = 10;
      b = 5;
      if (a > b) {
         System.out.println("if...else condition: a is big");
      } else {
         System.out.println("a is not big");
      }

      a = 5;
      b = 5;
      if (a > b) {
         System.out.println("a is big");
      } else if (b > a) {
         System.out.println("b is big");
      } else {
         System.out.println("Nested If: both are equal");
      }

      String exptitle = "Google Images";
      String acttitle = "google images";
      if (exptitle.equalsIgnoreCase(acttitle)) {
         System.out.println("Comparing  Two Strings: Test Pass");
      } else {
         System.out.println("Test Fail");
      }

      int expval = 100;
      int actval = 100;
      if (expval == actval) {
         System.out.println("Comparing Two Numbers: test pass");
      } else {
         System.out.println("test fail");
      }

      a = 109;
      b = 77;
      if (a == b) {
         System.out.println("test pass");
      } else {
         System.out.println("Comparing Two Characters: test fail");
      }

      char ccode = 120;
      if (ccode != 106 && ccode != 74) {
         if (ccode != 112 && ccode != 80) {
            if (ccode != 116 && ccode != 84) {
               System.out.println("Course doesn't exist!");
            } else {
               System.out.println("Testing");
            }
         } else {
            System.out.println("Python");
         }
      } else {
         System.out.println("Java");
      }

      String ccode1 = "x";
      if (ccode1.equalsIgnoreCase("j")) {
         System.out.println("Java");
      } else if (ccode1.equalsIgnoreCase("P")) {
         System.out.println("Python");
      } else if (ccode1.equalsIgnoreCase("t")) {
         System.out.println("Testing");
      } else {
         System.out.println("Course doesn't exist!");
      }

      label115: {
         String ccode2 = "x";
         String var10;
         switch((var10 = ccode2.toLowerCase()).hashCode()) {
         case 106:
            if (var10.equals("j")) {
               System.out.println("Java");
               break label115;
            }
            break;
         case 112:
            if (var10.equals("p")) {
               System.out.println("Python");
               break label115;
            }
            break;
         case 116:
            if (var10.equals("t")) {
               System.out.println("Testing");
               break label115;
            }
         }

         System.out.println("Course doesn't exist!");
      }

      label106: {
         String ccode3 = "P";
         String var12;
         switch((var12 = ccode3.toLowerCase()).hashCode()) {
         case 80:
            if (var12.equals("P")) {
               System.out.println("Python");
               break label106;
            }
            break;
         case 106:
            if (var12.equals("j")) {
               System.out.println("Java");
               break label106;
            }
            break;
         case 116:
            if (var12.equals("t")) {
               System.out.println("Testing");
               break label106;
            }
         }

         System.out.println("Course doesn't exist!");
      }

      String ccode4 = "P";
      String var14;
      switch((var14 = ccode4.toLowerCase()).hashCode()) {
      case 106:
         if (var14.equals("j")) {
            System.out.println("Java");
            return;
         }
         break;
      case 112:
         if (var14.equals("p")) {
            System.out.println("Python");
            return;
         }
         break;
      case 116:
         if (var14.equals("t")) {
            System.out.println("Testing");
            return;
         }
      }

      System.out.println("Course doesn't exist!");
   }
}
