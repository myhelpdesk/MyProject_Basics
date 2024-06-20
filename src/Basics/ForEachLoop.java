package Basics;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop {
   public static void main(String[] args) {
      int[] marks = new int[]{60, 70, 80, 90, 100};
      int[] var5 = marks;
      int var4 = marks.length;

      for(int var3 = 0; var3 < var4; ++var3) {
         int data = var5[var3];
         System.out.println(data);
      }

      List<String> carlist = new ArrayList();
      carlist.add("car1");
      carlist.add("car2");
      carlist.add("car3");
      carlist.add("car4");
      for (String car : carlist) {
         System.out.println(car);
      }

      List<String> carlist1 = new ArrayList();
      carlist1.add("BMW");
      carlist1.add("Volvo");
      carlist1.add("Audi");
      carlist1.add("Honda");
      String car_tobe_check = "audi";
      for (String car : carlist1) {
         System.out.println(car);
         if (car.equalsIgnoreCase(car_tobe_check)) {
            System.out.println(car_tobe_check + " present in the list , test pass");
            break;
         }
      }

   }
}
