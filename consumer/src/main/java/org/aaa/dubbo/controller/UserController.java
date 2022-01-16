package org.aaa.dubbo.controller;

import org.aaa.dubbo.entity.User;
import org.aaa.dubbo.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @DubboReference(version = "2.0")
    private UserService userService;

    @GetMapping("/user/{userId}")
    public ResponseEntity<User> getByUserId(@PathVariable("userId") Integer userId) {
        System.out.println("userId = " + userId);
        User user = userService.getByUserId(userId);
        System.out.println("user = " + user);
        return ResponseEntity.ok(userService.getByUserId(userId));
    }

}
