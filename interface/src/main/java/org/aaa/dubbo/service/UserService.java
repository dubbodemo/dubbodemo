package org.aaa.dubbo.service;

import org.aaa.dubbo.entity.User;

public interface UserService {
    User getByUserId(Integer userId);
}
