package cn.itcast.jdbctemplate;
import cn.itcast.druidutil.JDBCUtils;
import org.springframework.jdbc.core.JdbcTemplate;
/**
 * JDBCTemplate入门
 */
public class Demo01JDBCTemplate {
    public static void main(String[] args) {
        //1.导入jar包
        //2.创建JDBCTemplate对象
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
        //3.调用方法
        String sql = "update account set balance = 5000 where id = ?";
        int count = template.update(sql, 3);
        System.out.println(count);
    }
}
