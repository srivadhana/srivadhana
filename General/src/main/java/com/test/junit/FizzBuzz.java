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
package com.test.junit;

/**
 * FizzBuzz.
 *
 * @author Tagit
 * @version $Id: FizzBuzz.java Oct 10, 2020 7:11:15 PM
 *
 * @since 1.0
 */
public class FizzBuzz {
   public String play(int number) {
      
      if(number==0) {
         throw new IllegalArgumentException("Number must not be zero");
      }
      if (number % 3 == 0) {
         return "fizz";
      }
      if (number % 5 == 0) {
         return "buzz";
      }
      return String.valueOf(number);
   }

}
