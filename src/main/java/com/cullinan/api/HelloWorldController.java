package com.cullinan.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.cullinan.service.HelloService;

@RestController
@RequestMapping("test")
@Slf4j
public class HelloWorldController {
    @Autowired
    private HelloService helloService;

    @GetMapping("/hello")
    @ResponseBody
    public String hello(@RequestParam String name) {
        helloService.hello(name);
        log.info("hello: " + name);
        return "hello : " + name;
    }
}
