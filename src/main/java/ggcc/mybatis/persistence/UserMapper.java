package ggcc.mybatis.persistence;

import org.apache.ibatis.annotations.Param;

import ggcc.mybatis.domain.User;

public interface UserMapper {

    User getUser(@Param("userId")long userId);

    int addUser(User user);
}
