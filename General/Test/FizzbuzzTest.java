import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.test.junit.FizzBuzz;

public class FizzbuzzTest {

   public FizzBuzz fbObject;

   @BeforeEach
   // instance of FizzBuzz class instance will be created before each test cases
   // and is commonly coded
   public void setUp() {
      fbObject = new FizzBuzz();
   }

   @DisplayName("play FizzBuzz with number =1")
   @Test
   public void TestNumber() {
      String sample = fbObject.play(1);
      // returned value==assertion 1 value
      Assertions.assertEquals(sample, "1");
   }

   @DisplayName("play fizz with number=3")
   @Test
   public void TestFizz() {
      String fizz = fbObject.play(3);
      // returned fizz value==assertion fizz value
      Assertions.assertEquals(fizz, "fizz");
   }

   @Disabled
   @DisplayName("play buzz with number=5")
   @Test
   public void TestBuzz() {
      String buzz = fbObject.play(5);
      // returned buzz value==assertion buzz value
      Assertions.assertEquals(buzz, "buzz");
   }

   @DisplayName("Don't play with number zero")
   @Test
   public void TestZero() {
     Assertions.assertThrows(IllegalArgumentException.class, ()->fbObject.play(0));
   }

   @AfterEach
   public void tearDown() {
      fbObject = null;
   }

}
