package com.heling;

import com.heling.mapper.UserMapper;
import com.heling.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShardingSpherePractiseApplicationTests {

    @Test
    public void contextLoads() {
    }


    @Resource
    private UserMapper userMapper;

    @Test
    @Rollback(false)
    public void testSharding() {
        User user = new User();
        user.setName("12月");
        user.setCreateTime(System.currentTimeMillis());
        userMapper.insert(user);


        User user2 = new User();
        user2.setName("11月");
        user2.setCreateTime(1574577634000l);
        userMapper.insert(user2);
    }

    @Test
    @Rollback(false)
    public void testSelect() {
        List<User> users = userMapper.selectByCreateTime(1574577634000l);

        System.out.println(users.size());

    }

    @Test
    @Rollback(false)
    public void testSelectRange() {
        List<User> users = userMapper.selectByCreateTimeRange(1577169753819l,System.currentTimeMillis());

        System.out.println(users.size());

    }

}
