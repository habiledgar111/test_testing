package com.example.test_unit.service;

import org.springframework.stereotype.Service;


@Service
public class TestService {
  
  public int testAdd(int a, int b){
    return a+b;
  }

  public String hello(String name){
    return "hello this is "+  name;
  }

  public double mathPow(double a, double b){
    double res = a;
    for(int i = 1; i< b;i++){
      res *= a;
    }
    return res;
  }
}
