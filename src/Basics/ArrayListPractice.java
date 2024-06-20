package Basics;

import java.util.ArrayList;

public class ArrayListPractice {
   public static void main(String[] args) {
      System.out.println("ArrayList to store string values");
      ArrayList<String> carList = new ArrayList();
      carList.add("car1");
      carList.add("car2");
      carList.add("car3");
      carList.add("car4");
      System.out.println(carList.size());
      System.out.println(carList.get(0));
      System.out.println(carList.get(1));
      System.out.println(carList.get(2));
      System.out.println(carList.get(3));
      carList.set(0, "new car");
      System.out.println("after replacing....");
      System.out.println(carList.get(0));
      carList.remove(3);
      System.out.println(carList.size());
      System.out.println("ArrayList to store Integr values");
      ArrayList<Integer> markList = new ArrayList();
      markList.add(50);
      markList.add(60);
      markList.add(70);
      System.out.println(markList.size());
      System.out.println(markList.get(0));
      System.out.println(markList.get(1));
      System.out.println(markList.get(2));
      ArrayList<Object> empdata = new ArrayList();
      empdata.add("E001");
      empdata.add("Richards");
      empdata.add(25);
      empdata.add('m');
      empdata.add(50000.5D);
      empdata.add(true);
      System.out.println(empdata.size());
   }
}
