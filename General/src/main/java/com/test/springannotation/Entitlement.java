/** 
 * Copyright 2020 by Tagit Ltd. (http://www.tagitmobile.com)
 *
 * This source code is the exclusive property of Tagit Pte and is protected 
 * by Singapore. and international copyright laws. Any other use, including the 
 * reproduction, modification, distribution, transmission, republication, 
 * display, or performance, of the source code is strictly prohibited.
 *
 * Developed by Tagit Pte (http://www.tagitmobile.com)
 */
package com.test.springannotation;

public class Entitlement {
   private String name;
   private int time;

   /**
    * @return the name
    */
   public String getName() {
      return name;
   }

   /**
    * @param name
    *           the name to set
    */
   public void setName(String name) {
      this.name = name;
   }

   /**
    * @return the time
    */
   public int getTime() {
      return time;
   }

   /**
    * @param time
    *           the time to set
    */
   public void setTime(int time) {
      this.time = time;
   }

   @Override
   public String toString() {
      return "Entitlement [name=" + name + ", time=" + time + "]";
   }

}
