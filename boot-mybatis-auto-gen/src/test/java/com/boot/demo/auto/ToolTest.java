package com.boot.demo.auto;

import com.boot.demo.auto.entity.User;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * 类说明：
 *
 * @author janita
 * @since 2018/10/15 - 下午3:48
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ToolTest {

    @Test
    public void createUUID() {

        UUID uuid;
        for (int i = 0; i < 20; i++) {
            uuid = UUID.randomUUID();
            String ranUUid = uuid.toString();

            System.out.println("------" + i + "-------");
            System.out.println(ranUUid.replace("-", "") + i);
            System.out.println("******" + i + "*******");

        }
    }


    @Test
    public void undinMap() {
        List<User> list = Lists.newArrayList();
        User user1 = new User();
        user1.setGender(2);
        user1.setUserId("1");

        list.add(user1);

        User user2 = new User();
        user2.setUserId("2");
        user2.setGender(2);
        list.add(user2);

        Map<String, User> map = Maps.uniqueIndex(list, User::getUserId);
        System.out.println(map);
    }
}
