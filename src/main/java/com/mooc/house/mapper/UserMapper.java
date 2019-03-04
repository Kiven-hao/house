package com.mooc.house.mapper;

import com.mooc.house.common.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @auther BH
 * @Date 2019/3/4 17:15
 */
@Mapper
public interface UserMapper {

    public List<User> selectUsers();
}
