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

import java.sql.Timestamp;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;

/**
 * Check.
 *
 * @author Tagit
 * @version $Id: Check.java Oct 9, 2020 7:50:34 PM
 *
 * @since 1.0
 */
public class Check {

   /**
    * @param args
    */

   public void getDay() {
      ZonedDateTime dateTime = ZonedDateTime.now();
      ZonedDateTime nextDayDateTime = dateTime.plusDays(1);
      System.out.println(dateTime.getDayOfWeek().toString());
      String dayOfWeek = dateTime.getDayOfWeek().toString();

      boolean holiday = false;
      if (dayOfWeek.equalsIgnoreCase("saturday") || dayOfWeek.equalsIgnoreCase("sunday")) {
         System.out.println("It is a holiday");
         holiday = true;
      }
      if (holiday) {
         String nextDayOfWeek = nextDayDateTime.getDayOfWeek().toString();
         if (nextDayOfWeek.equalsIgnoreCase("saturday") || nextDayOfWeek.equalsIgnoreCase("sunday")) {
            System.out.println("It is a holiday");
            // throws the exception
            System.out.println("Invalid transaction");
         }

      }

   }

   public void getDateCheck() {
      ZonedDateTime dateTime = ZonedDateTime.now();
      ZonedDateTime dateTime1 = ZonedDateTime.now();
      System.out.println(dateTime.toLocalDate());
      if (dateTime.toLocalDate().equals(dateTime1.toLocalDate())) {
         System.out.println("time equals>>>>>>>>>>>>>>>>>");
      }
      Timestamp ts = new Timestamp(System.currentTimeMillis());

   }

   public void optionalExample() {
      List<SampleModel> items = new ArrayList<>();
      SampleModel SM;
      SM = new SampleModel();
      SM.setName("aaa");
      SM.setDept("cse");
      SM.setClg("MCE");
      items.add(SM);

      SM = new SampleModel();
      SM.setName("bbb");
      SM.setDept("it");
      SM.setClg("TCE");
      items.add(SM);

      SM = new SampleModel();
      SM.setName("ccc");
      SM.setDept("ece");
      SM.setClg("SCE");
      items.add(SM);

      String name = "ccc";

      Optional<SampleModel> result = items.stream().filter(obj -> name.equalsIgnoreCase(obj.getName())).findFirst();

      System.out.println("result==>" + result.get());

   }

   public void dateConversionString() {
      ZonedDateTime date = ZonedDateTime.now();
      System.out.println("zone date ==>" + date);
      System.out.println("date fron zone to string==>" + date.toString());
      System.out.println("again String to zone==>" + ZonedDateTime.parse(date.toString()));
   }

   public void formatLoanAccountNumber() {
      String x = "1234560987644570";
      x = x.substring(0, 3) + "_" + x.substring(3, x.length() - 10) + " " + x.substring(6, x.length() - 5) + "_" + x.substring(11, x.length());
      // +x.substring(17, 18);
      // + x.substring(0, 7) + " " + x.substring(7, x.length() - 13) + x.substring(0, 13) + "_" + x.substring(13, x.length());
      System.out.println("x==>" + x);

   }

   public static void main(String[] args) {
      Check ch = new Check();
      // ch.getDay();
      // ch.getDateCheck();
      // ch.optionalExample();
      ch.dateConversionString();
      ch.formatLoanAccountNumber();
   }

}
