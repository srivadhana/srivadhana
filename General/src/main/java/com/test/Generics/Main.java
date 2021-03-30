package com.test.Generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
   public static void main(String[] args) {
      Pair<String, Integer> op = new OrderedPair<String, Integer>("vadhana", 3114);
      System.out.println(op);
      System.out.println(op.getKey() + "\t" + op.getValue());

      Pair<String, String> op1 = new OrderedPair<String, String>("vadhana", "mukeshsri");
      System.out.println(op1.getKey() + "\t" + op1.getValue());
      
      List<String> names=new ArrayList<>();
      names.add("A");
      names.add("B");
      names.add("C");
      OrderedPair<String, List<String>> op2 = new OrderedPair<String, List<String>>("names", names);
      System.out.println(op2.getKey()+"\t"+op2.getValue());
      
      String str[]=new String[5];
      str[0]="peppy";
      str[1]="tommy";
      str[2]="Jammy";
      Pair<Integer, String[]> op3 = new OrderedPair<Integer, String[]>(101, (str));
      System.out.println(op3.getKey() +"\t"+ op.getValue());

   }

}
