package Basics;

import java.util.ArrayList;
import java.util.List;

public class ForLoop {
   public static void main(String[] args) {
      int i;
      for(i = 1; i <= 100; ++i) {
         System.out.println(i);
      }

      for(i = 1; i <= 100; i += 2) {
         System.out.println(i);
      }

      for(i = 100; i >= 1; --i) {
         System.out.println(i);
      }

      int[] marks = new int[]{60, 70, 80, 90, 100};

      for (int mark : marks) {
         System.out.println(mark);
      }

      int[] marks1 = new int[]{60, 70, 80, 90, 100};

      for(int i1 = 0; i1 <= 2; ++i1) {
         System.out.println(marks1[i1]);
      }

      List<String> carlist = new ArrayList();
      carlist.add("car1");
      carlist.add("car2");
      carlist.add("car3");
      carlist.add("car4");

      for (String element : carlist) {
         System.out.println(element);
      }

   }
}
