package Basics;

public class ArrayIndex {
   public static void main(String[] args) {
      int[] marks = new int[]{50, 60, 70, 80};
      System.out.println(marks[0]);
      System.out.println(marks[1]);
      System.out.println(marks[2]);
      System.out.println(marks[3]);
      int[] marksReplace = new int[]{50, 60, 70, 80};
      System.out.println("before replacing :" + marksReplace[0]);
      marksReplace[0] = 90;
      System.out.println("after replacing ....");
      System.out.println(marksReplace[0]);
      String[] courses = new String[]{"Java", "Python", "Testing"};
      System.out.println(courses.length);
      System.out.println(courses[0]);
      System.out.println(courses[1]);
      System.out.println(courses[2]);
      courses[2] = "Testing & Selenium";
      System.out.println("After replacing : " + courses[2]);
      Object[] empdata = new Object[]{"E001", "Richards", 25, 50000.5D, 'm', true};
      System.out.println(empdata.length);
      System.out.println(empdata[0]);
      System.out.println(empdata[1]);
      System.out.println(empdata[2]);
      System.out.println(empdata[3]);
      System.out.println(empdata[4]);
      System.out.println(empdata[5]);
   }
}
