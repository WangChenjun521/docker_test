package cn.wcj.demo;

import cn.wcj.demo.controller.TestController;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Resource
    TestController testController;

    @Test
    void contextLoads() {
        System.out.println(testController.printHelloWorld());
    }

}
