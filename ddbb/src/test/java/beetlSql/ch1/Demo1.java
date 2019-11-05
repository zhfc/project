package beetlSql.ch1;


import beetlSql.SQLManagerFactory;
import com.sys.User;
import org.beetl.sql.core.SQLManager;
import org.beetl.sql.core.query.Query;

import java.util.List;

public class Demo1 {

    public static final String driver="com.mysql.jdbc.Driver";
    public static final String url="jdbc:mysql://localhost:3306/ddbb";
    public static final String userName="root";
    public static final String password="root";

    /**
     * 新增
     * @param args
     */
    public static void main1(String[] args) {
        SQLManager sqlManager = SQLManagerFactory.getManager(driver,url,userName,password);
        User user = new User();
        user.setUserAge(13);
        user.setUserName("zhanasihan");
        int result = sqlManager.insert(user);
        System.out.println(result);
        System.out.println(user);
    }

    /**
     * 唯一查询
     * @param args
     */
    public static void main2(String[] args) {
        SQLManager sqlManager = SQLManagerFactory.getManager(driver,url,userName,password);
        User user = sqlManager.unique(User.class,3);
        System.out.println(user);
    }

    /**
     * 模板更新
     * 更新的实体数据需要指明ID，否则框架怎么知道你要更新那一条数据呢
     * @param args
     */
    public static void main3(String[] args) {
        SQLManager sqlManager = SQLManagerFactory.getManager(driver,url,userName,password);
        User user = new User();
        user.setUserId(1);
        user.setUserAge(21);
        sqlManager.updateTemplateById(user);
        System.out.println(user);
    }

    /**
     * 模板查询
     * @param args
     */
    public static void main4(String[] args) {
        SQLManager sqlManager = SQLManagerFactory.getManager(driver,url,userName,password);
        User query = new User();
        query.setUserSex((byte) 0);
        List<User> list = sqlManager.template(query);
        System.out.println(list);
    }


    /**
     * 代码&sql生成
     * @param args
     */
    public static void main(String[] args) throws Exception {
        SQLManager sqlManager = SQLManagerFactory.getManager(driver,url,userName,password);
        sqlManager.genPojoCodeToConsole("user");
        sqlManager.genSQLTemplateToConsole("user");
    }

}
