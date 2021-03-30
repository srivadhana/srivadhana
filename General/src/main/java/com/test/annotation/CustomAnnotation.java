package com.test.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import javax.lang.model.element.Element;

//@Target({ ElementType.METHOD })

//@Target({ ElementType.FIELD })
//@Target({ ElementType.CONSTRUCTOR })
//@Target({ ElementType.PARAMETER })
//@Target({ ElementType.ANNOTATION_TYPE })

//@Documented
//@Inherited
//@Target({ ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)

public @interface CustomAnnotation {
   
//   int value();
//
//   String name();
//   String[] arr() ;
   
   //default elements
   int value() default 0;

   String name() default "";
   String[] arr() default {"aa","bb","cc"};
   
}
