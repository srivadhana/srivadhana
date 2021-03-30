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
package com.test.sample;

/**
 * SampleModel.
 *
 * @author Tagit
 * @version $Id: SampleModel.java Oct 15, 2020 11:52:54 AM
 *
 * @since 1.0
 */

public class SampleModel {
   private String name;
   private String dept;
   private String clg;

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
    * @return the dept
    */
   public String getDept() {
      return dept;
   }

   /**
    * @param dept
    *           the dept to set
    */
   public void setDept(String dept) {
      this.dept = dept;
   }

   /**
    * @return the clg
    */
   public String getClg() {
      return clg;
   }

   /**
    * @param clg
    *           the clg to set
    */
   public void setClg(String clg) {
      this.clg = clg;
   }

   @Override
   public String toString() {
      return "SampleModel [name=" + name + ", dept=" + dept + ", clg=" + clg + "]";
   }
   

}
