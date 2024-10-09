package com.example.junitspringboot.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleMathTest {

  SimpleMath math = new SimpleMath();

  @Test
  void sum_Success() {
    Double n1 = 5.0;
    Double n2 = 10.0;
    Double sum = math.sum(n1, n2);
    Assertions.assertEquals(15.0, sum);
  }

  @Test
  void sum_OrderDoesntMatter() {
    Double n1 = 5.0;
    Double n2 = 10.0;
    Double sum1 = math.sum(n1, n2);
    Double sum2 = math.sum(n2, n1);
    Assertions.assertEquals(sum1, sum2);
  }

  @Test
  void sum_NegativeNumber() {
    Double n1 = -3.0;
    Double n2 = 2.0;
    Double sum = math.sum(n1, n2);
    Assertions.assertEquals(-1, sum);
  }

  @Test
  void subtraction_Success() {
    Double n1 = 10.0;
    Double n2 = 5.0;
    Double sub = math.subtraction(n1, n2);
    Assertions.assertEquals(5.0, sub);
  }

  @Test
  void subtraction_NegativeResult() {
    Double n1 = 5.0;
    Double n2 = 10.0;
    Double sub = math.subtraction(n1, n2);
    Assertions.assertEquals(-5.0, sub);
  }

  @Test
  void subtraction_OrderMatters() {
    Double n1 = 10.0;
    Double n2 = 5.0;
    Double sub1 = math.subtraction(n1, n2);
    Double sub2 = math.subtraction(n2, n1);
    Assertions.assertNotEquals(sub1, sub2);
  }

  @Test
  void multiplication_Success() {
    Double n1 = 10.0;
    Double n2 = 5.0;
    Double mult = math.multiplication(n1, n2);
    Assertions.assertEquals(50.0, mult);
  }

  @Test
  void multiplication_OrderDoesntMatter() {
    Double n1 = 10.0;
    Double n2 = 5.0;
    Double mult1 = math.multiplication(n1, n2);
    Double mult2 = math.multiplication(n2, n1);
    Assertions.assertEquals(mult1, mult2);
  }
  
  @Test
  void multiplication_PositiveNumberWithNegativeNumber_NegativeResult() {
    Double n1 = 10.0;
    Double n2 = -5.0;
    Double mult = math.multiplication(n1, n2);
    Assertions.assertEquals(-50.0, mult);
  }

  @Test
  void multiplication_NegativeNumberWithNegativeNumber_PositiveResult() {
    Double n1 = -10.0;
    Double n2 = -5.0;
    Double mult = math.multiplication(n1, n2);
    Assertions.assertEquals(50.0, mult);
  }

  @Test
  void division_Success() {
    Double n1 = 10.0;
    Double n2 = 5.0;
    Double division = math.division(n1, n2);
    Assertions.assertEquals(2.0, division);
  }

  @Test
  void division_PositiveNumberWithNegativeNumber_NegativeResult() {
    Double n1 = 10.0;
    Double n2 = -5.0;
    Double division = math.division(n1, n2);
    Assertions.assertEquals(-2.0, division);
  }

  @Test
  void division_NegativeNumberWithNegativeNumber_PositiveResult() {
    Double n1 = -10.0;
    Double n2 = -5.0;
    Double division = math.division(n1, n2);
    Assertions.assertEquals(2.0, division);
  }

  @Test
  void division_ArithmeticException() {
    Double n1 = 10.0;
    Double n2 = 0.0;
    Double result = math.division(n1, n2);
    Assertions.assertEquals(0.0, result);
  }
}
