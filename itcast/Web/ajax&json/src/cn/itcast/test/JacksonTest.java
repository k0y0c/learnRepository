package cn.itcast.test;

import cn.itcast.domain.Person;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.util.*;

public class JacksonTest {
    //Java对象转为JSON字符串
    @Test
    public void test1() throws Exception {
        //1.创建Person对象
        Person p = new Person("张三",23,"男");
        //2.创建Jackson的核心对象  ObjectMapper
        ObjectMapper mapper = new ObjectMapper();
        //3.转换
        /*
            转换方法：
                writeValue(参数1,obj):
                    参数1：
                        File：将obj对象转换为JSON字符串，并保存到指定的文件中
                        Writer：将obj对象转换为JSON字符串，并将json数据填充到字符输出流中
                        OutputStream：将obj对象转换为JSON字符串，并将json数据填充到字节输出流中
                writeValueAsString(obj):将对象转为json字符串
         */
        String json = mapper.writeValueAsString(p);
        System.out.println(json);       //{"name":"张三","age":23,"gender":"男"}

        //writeValue,将数据写到 d://a.txt中
        mapper.writeValue(new File("d://a.txt"),p);

        //writeValue, 将数据关联到Writer中
        mapper.writeValue(new FileWriter("d://b.txt"),p);
    }

    @Test
    public void test2() throws Exception {
        //1.创建Person对象
        Person p = new Person();
        p.setName("张三");
        p.setAge(23);
        p.setGender("男");
        p.setBirthday(new Date());
        //2.创建Jackson的核心对象  ObjectMapper
        ObjectMapper mapper = new ObjectMapper();
        //3.转换
        String json = mapper.writeValueAsString(p);
        //System.out.println(json);           //{"name":"张三","age":23,"gender":"男","birthday":1636029488899}
        //System.out.println(json);           //在Person类中的birthday属性上添加@JsonIgnore注解    {"name":"张三","age":23,"gender":"男"}
        System.out.println(json);             //在Person类中的birthday属性上添加@JsonFormat(pattern = "yyyy-MM-dd")注解        {"name":"张三","age":23,"gender":"男","birthday":"2021-11-04"}
    }

    @Test
    public void test3() throws Exception {
        //1.创建Person对象
        Person p = new Person();
        p.setName("张三");
        p.setAge(23);
        p.setGender("男");
        p.setBirthday(new Date());

        Person p1 = new Person();
        p1.setName("张三");
        p1.setAge(23);
        p1.setGender("男");
        p1.setBirthday(new Date());
        Person p2 = new Person();
        p2.setName("张三");
        p2.setAge(23);
        p2.setGender("男");
        p2.setBirthday(new Date());
        //创建List集合
        List<Person> list = new ArrayList<Person>();
        list.add(p);
        list.add(p1);
        list.add(p2);

        //2.创建Jackson的核心对象  ObjectMapper
        ObjectMapper mapper = new ObjectMapper();
        //3.转换
        String json = mapper.writeValueAsString(list);
        System.out.println(json);           //[{},{},{}]
    }

    @Test
    public void test4() throws Exception {
        //1.创建map对象
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("name","张三");
        map.put("age",23);
        map.put("gender","男");

        //2.创建Jackson的核心对象  ObjectMapper
        ObjectMapper mapper = new ObjectMapper();
        //3.转换
        String json = mapper.writeValueAsString(map);
        System.out.println(json);           //{"gender":"男","name":"张三","age":23}
    }

    //演示JSON字符串转换为Java对象
    @Test
    public void test5() throws Exception {
        //1.初始化JSON字符串
        String json = "{\"gender\":\"男\",\"name\":\"张三\",\"age\":23}";
        //2.创建ObjectMapper对象
        ObjectMapper mapper = new ObjectMapper();
        //转化为Java对象  (person)
        Person person = mapper.readValue(json, Person.class);
        System.out.println(person);
    }
}
