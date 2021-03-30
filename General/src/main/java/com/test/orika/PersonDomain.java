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
package com.test.orika;

import java.io.Serializable;

/**
 * PersonDomain.
 *
 * @author Tagit
 * @version $Id: PersonDomain.java Oct 11, 2020 2:29:21 AM
 *
 * @since 1.0
 */
public class PersonDomain implements Serializable{

   /**
    * 
    */
   private static final long serialVersionUID = 1L;

   private String name;
   private int age;
   /**
    * @return the name
    */
   public String getName() {
      return name;
   }
   /**
    * @param name the name to set
    */
   public void setName(String name) {
      this.name = name;
   }
   /**
    * @return the age
    */
   public int getAge() {
      return age;
   }
   /**
    * @param age the age to set
    */
   public void setAge(int age) {
      this.age = age;
   }
   @Override
   public String toString() {
      return "PersonDomain [name=" + name + ", age=" + age + "]";
   }
   
   
}
