package com.heling.mapper;

import com.heling.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> selectByCreateTime(Long createTime);

    List<User> selectByCreateTimeRange(@Param("start") Long start,@Param("end") Long end);
}