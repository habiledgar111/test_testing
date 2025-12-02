package com.example.test_unit.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test_unit.service.TestService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/hello")
public class TestController {
  
  private TestService testService;

  @GetMapping
  public ResponseEntity<String> sayHello(){
    return ResponseEntity.ok(testService.hello("habil"));
  }
}
