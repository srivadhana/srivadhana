package com.test.Generics;

public class OrderedPair<k, v> implements Pair<k, v> {
   
   //constructors
   public k key;
   public v value;
   public OrderedPair(k key,v value) {
      this.key=key;
      this.value=value;
   }
   @Override
   public k getKey() {
      // TODO Auto-generated method stub
      return key;
   }
   @Override
   public v getValue() {
      // TODO Auto-generated method stub
      return value;
   }
   @Override
   public String toString() {
      return "OrderedPair [key=" + key + ", value=" + value + "]";
   }

   

}
