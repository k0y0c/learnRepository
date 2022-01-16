package cn.itcast.xml.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * Jsoup对象功能
 */
public class JsoupDemo02 {
    public static void main(String[] args) throws IOException {
        /*//parse第一种重载
        //2.获取Document对象
        //2.1获取student.xml的path
        String path = JsoupDemo02.class.getClassLoader().getResource("student.xml").getPath();
        //2.2解析xml文档，加载文档进内存，获取dom树  ——>Document
        Document document = Jsoup.parse(new File(path), "utf-8");*/

        /*//parse第二种重载
        //parse(String html)：解析xml或html字符串
        String str = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
                "<students>\n" +
                "    <student number=\"heima_0001\">\n" +
                "        <name>zhangsan</name>\n" +
                "        <age>24</age>\n" +
                "        <sex>male</sex>\n" +
                "    </student>\n" +
                "\n" +
                "    <student number=\"heima_0002\">\n" +
                "        <name>lisi</name>\n" +
                "        <age>22</age>\n" +
                "        <sex>female</sex>\n" +
                "    </student>\n" +
                "</students>";
        Document document1 = Jsoup.parse(str);
        System.out.println(document1);*/

        //parse第三种重载
        //parse(URL url, int timeoutMillis)：通过网络路径获取指定的html或xml的文档对象
        URL url = new URL("https://www.baidu.com");
        Document document3 = Jsoup.parse(url, 10000);
        System.out.println(document3);


    }
}
