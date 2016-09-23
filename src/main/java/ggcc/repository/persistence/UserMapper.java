package ggcc.repository.persistence;

import org.apache.ibatis.annotations.Param;
import ggcc.domain.User;

public interface UserMapper {

    User getUser(@Param("userId")long userId);

    int addUser(User user);
}
