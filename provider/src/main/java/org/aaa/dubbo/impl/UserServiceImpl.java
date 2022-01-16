package org.aaa.dubbo.impl;

import org.aaa.dubbo.entity.User;
import org.aaa.dubbo.service.UserService;
import org.apache.dubbo.config.annotation.DubboService;

import java.util.Arrays;
import java.util.List;
@DubboService(version = "2.0")
public class UserServiceImpl implements UserService {
    // 模拟数据
    private static final List<User> USERS = Arrays.asList(
            new User(1, "张三"),
            new User(2, "李四")
    );

    @Override
    public User getByUserId(Integer userId) {
        for (User user : USERS) {
            if (user.getUserId().equals(userId)) {
                return user;
            }
        }
        return null;
}
}
