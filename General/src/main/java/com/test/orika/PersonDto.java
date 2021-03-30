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

public class PersonDto implements Serializable {

   /**
    * 
    */
   private static final long serialVersionUID = 1L;
   private String nameFull;
   private int ageThisYear;

   /**
    * @return the nameFull
    */
   public String getNameFull() {
      return nameFull;
   }

   /**
    * @param nameFull
    *           the nameFull to set
    */
   public void setNameFull(String nameFull) {
      this.nameFull = nameFull;
   }

   /**
    * @return the ageThisYear
    */
   public int getAgeThisYear() {
      return ageThisYear;
   }

   /**
    * @param ageThisYear
    *           the ageThisYear to set
    */
   public void setAgeThisYear(int ageThisYear) {
      this.ageThisYear = ageThisYear;
   }

   @Override
   public String toString() {
      return "PersonDto [nameFull=" + nameFull + ", ageThisYear=" + ageThisYear + "]";
   }

}
