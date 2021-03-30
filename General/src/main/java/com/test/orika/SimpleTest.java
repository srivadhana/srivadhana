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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.ConfigurableMapper;

@Component
public class SimpleTest  {
   @Autowired
   MapperFacade mapperFacade;
   @Autowired
   MapperFactory factory;

 
   @SuppressWarnings("resource")
   public static void main(String[] args) throws Exception {
      System.out.println("inside orika mapper");
      ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//      System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaa");
//      SimpleTest st = context.getBean(SimpleTest.class);
//      System.out.println("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
//      st.mapPesonDomainToPersonDto();
//      System.out.println("cccccccccccccccccccccccccccccc");
   }

   

}
