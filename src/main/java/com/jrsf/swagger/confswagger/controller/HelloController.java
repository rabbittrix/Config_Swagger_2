package com.jrsf.swagger.confswagger.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/hello")
public class HelloController {

  @ApiOperation(value = "Returns Hello everyone")
  @GetMapping
  public String hello(){
    return "Hi everyone?";
  }

  @ApiOperation(value = "Returns Hello everyone")
  @PostMapping("/post")
  public String helloPost(@RequestBody final String hello){
    return hello;
  }

  @ApiOperation(value = "Returns Hello everyone")
  @PutMapping("/put")
  public String helloPut(@RequestBody final String hello){
    return hello;
  }

}
