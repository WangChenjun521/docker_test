package cn.wcj.demo.controller;

import cn.wcj.demo.DO.User;
import cn.wcj.demo.service.UserService;
import jakarta.annotation.Resource;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    @Resource
    private  UserService userService;

    @GetMapping("/get/{id}")
    @ResponseBody
    public User findOne(@PathVariable Integer id) {
        return userService.getById(id);
    }

    @GetMapping("/save/{id}")
    public void save(@PathVariable Integer id) {
        User user = new User();
        user.setId(id);
        user.setUsername(id+":哈哈哈哈");
        userService.save(user);
    }
}
