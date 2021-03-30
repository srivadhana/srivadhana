
package com.test.orika;

import org.springframework.stereotype.Component;

import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.ConfigurableMapper;

@Component
public class MyCustomMapper extends ConfigurableMapper {

   protected void configure(MapperFactory factory) {
      factory.classMap(PersonDomain.class, PersonDto.class).field("name", "nameFull").field("age", "ageThisYear").byDefault().register();
   }

}