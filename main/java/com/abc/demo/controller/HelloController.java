package com.abc.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
public class HelloController {
	@RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
	
	@ApiOperation("API test")
    @PostMapping("/param")
    public String hello2(@RequestParam("name") String name){
        return "hello " + name;
    }
		
}
