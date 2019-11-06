package beetlSql.ch5;

import beetlSql.SQLManagerFactory;
import com.sys.User;
import org.beetl.sql.core.SQLManager;

import java.util.List;

public class Demo1 {
    public static final String driver="com.mysql.jdbc.Driver";
    public static final String url="jdbc:mysql://localhost:3306/ddbb";
    public static final String userName="root";
    public static final String password="root";

    public static void main(String[] args) {
        SQLManager sqlManager = SQLManagerFactory.getManager(driver,url,userName,password);
        UserDao dao = sqlManager.getMapper(UserDao.class);
        List<User> list = dao.selectUserByName("lisihang");
        System.out.println(list);
    }
}
