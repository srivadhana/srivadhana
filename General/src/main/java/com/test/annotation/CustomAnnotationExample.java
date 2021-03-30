
package com.test.annotation;

//@CustomAnnotation(name="Jakob",value=37,arr={"Jenkov", "Peterson"})

@CustomAnnotation
public class CustomAnnotationExample {

   @CustomAnnotation                               //global field
   String place = "";

   @CustomAnnotation  
   public CustomAnnotationExample(){               //constructor
      
   }
   
   @CustomAnnotation                               // method
   public void get(@CustomAnnotation String val) { // param
      @CustomAnnotation                            
                                                     
      String place = "";                           //local field
   }

   @CustomAnnotation  
   public static void run( @CustomAnnotation int no) {
      
   }
}
