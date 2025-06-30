package cn.wcj.demo;

import cn.wcj.demo.controller.TestController;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.SocketException;
import java.net.UnknownHostException;

@SpringBootTest
class DemoApplicationTests {

    @Resource
    TestController testController;


    @Test
    void contextLoads() throws SocketException, UnknownHostException {
        System.out.println(testController.printHelloWorld());
    }

    @Test
    void testIp() throws SocketException, UnknownHostException {
        testController.getIP();
    }

}
