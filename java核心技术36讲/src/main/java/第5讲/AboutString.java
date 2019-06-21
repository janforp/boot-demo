package 第5讲;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-06-20 - 13:59
 */
public class AboutString {

    public static void main(String[] args) {
        System.out.println(Boolean.logicalXor(false, false));
    }

    private static void test1() {
        String a = "abcd";
        System.out.println(a.codePointAt(1));
        System.out.println(a.codePointAt(2));
        System.out.println(a.codePointAt(3));
        System.out.println(a.codePointBefore(3));
        System.out.println(a.contentEquals("abcd"));
        System.out.println(a.codePointCount(1, 3));
    }


    private void stringBuffer() {
        StringBuffer buffer = new StringBuffer();
        StringBuilder builder = new StringBuilder();
    }

    private void test2() {
        String strByBuilder = new StringBuilder().append("aa").append("bb").append("cc").append("dd").toString();
        String strByConcat = "aa" + "bb" + "cc" + "dd";
        System.out.println(strByBuilder);
        System.out.println(strByConcat);

    }
}
