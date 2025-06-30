package cn.wcj.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.net.SocketException;
import java.net.UnknownHostException;

@Controller
@RequestMapping("/")
public class HomeController {
    @RequestMapping("/")
    public String printHelloWorld() throws SocketException, UnknownHostException {
        return "index.html";
    }
}