package com.example.test_unit.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import lombok.AllArgsConstructor;

public class TestTestService {
  private final TestService testService = new TestService();

  @Test
  void testAdd(){
    int result = testService.testAdd(2, 3);
    assertEquals(5, result);
    result = testService.testAdd(-5, 2);
    assertEquals(-3, result);
  }

  @Test
  void testMathPow(){
    double result = testService.mathPow(2, 3);
    assertEquals(8, result);
  }
}
