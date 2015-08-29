package ggcc.mybatis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ggcc.mybatis.domain.User;
import ggcc.mybatis.persistence.UserMapper;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public int addUser(User userToAdd) {
        return userMapper.addUser(userToAdd);
    }

    public User getUser(int userId) {
        return userMapper.getUser(userId);
    }
}
