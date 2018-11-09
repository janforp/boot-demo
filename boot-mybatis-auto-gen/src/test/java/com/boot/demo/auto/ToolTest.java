package com.boot.demo.auto;

import com.boot.demo.auto.entity.User;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 类说明：
 *
 * @author janita
 * @since 2018/10/15 - 下午3:48
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ToolTest {

    /**
     * 该方法主要使用正则表达式来判断字符串中是否包含字母
     * @author fenggaopan 2015年7月21日 上午9:49:40
     * @param cardNum 待检验的原始卡号
     * @return 返回是否包含
     */
    public boolean judgeContainsStr(String cardNum) {
        String regex=".*[a-zA-Z]+.*";
        Matcher m=Pattern.compile(regex).matcher(cardNum);
        return m.matches();
    }

    /**
     * 正则表达式：判断是否包含字母的正则表达式
     */
    private static final String PATTERN_ENGLISH_NAME_EXP = ".*[a-zA-Z]+.*";

    /**
     * 判断是否包含字母
     *
     * @param value 待判断待字符串
     * @return 是否包含字母
     */
    public static boolean judgeContainsLetter(String value) {
        Matcher m = Pattern.compile(PATTERN_ENGLISH_NAME_EXP).matcher(value);
        return m.matches();
    }

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


    @Test
    public void pattern() {
        System.out.println("****" + judgeContainsLetter("佛。。。a。....."));
    }

    @Test
    public void byteLen() {
        System.out.println("****" + len("你好啊"));
    }

    private static int len(String str) {
        if (StringUtils.isEmpty(str)) {
            return 0;
        }
        byte[] bytes = str.getBytes();
        return bytes.length;
    }


    private static final String REG = ".*[~?!@#$%^&*\u007F\\/{}+=、;:\"|｜][～`＊︿！＠＆＃￥％…—×－＿＋＝［］｛｝【】＼：；“‘《》。？／']+.*";

    @Test
    public void con() {
        Pattern pattern = Pattern.compile(REG);
        System.out.println("****" + pattern.matcher("~").matches());
    }
}
