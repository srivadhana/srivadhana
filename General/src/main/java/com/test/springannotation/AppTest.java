package com.test.springannotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppTest {

   /**
    * @param args
    */
   public static void main(String[] args) {
      System.out.println("inside Spring annotation");
      AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

      ctx.register(AppConfig.class);
      ctx.refresh();

      Entitlement ent = (Entitlement) ctx.getBean("entitlement");
      System.out.println(ent.getName());
      System.out.println(ent.getTime());
   }

}
