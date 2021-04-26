package com.jrsf.swagger.confswagger.controller;

import com.jrsf.swagger.confswagger.model.User;
import io.swagger.annotations.ApiOperation;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/user")
public class UserController {

  @ApiOperation(value = "Returns User")
  @GetMapping
  public List<User> getUsers(){
    return Arrays.asList(
        new User("Roberto", 3000L),
        new User("Jessica", 1500L)
    );
  }

  @ApiOperation(value = "Returns User")
  @GetMapping("/{userName}")
  public User getUser(@PathVariable("userName") final String userName, Long salary){
    return new User(userName, salary);
  }

}
