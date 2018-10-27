package com.boot.demo.auto;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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
}
