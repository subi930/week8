package com.example.week8.domain.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

  @GetMapping("/api/v1")
  public String v1() {
    return "Hello";
  }

}
