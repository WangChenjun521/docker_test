package cn.wcj.demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class TestController {
    @RequestMapping("/helloworld")
    public String printHelloWorld() {
        return "Hello World";
    }
}
