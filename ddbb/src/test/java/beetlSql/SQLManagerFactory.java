package beetlSql;

import org.beetl.sql.core.*;
import org.beetl.sql.core.db.DBStyle;
import org.beetl.sql.core.db.MySqlStyle;
import org.beetl.sql.ext.DebugInterceptor;

public class SQLManagerFactory {

    static SQLManager sqlManager = null;

    private SQLManagerFactory(){}

    /**
     * 当sqlManager未空时，并且首次有两个县城同时调用此方法就会产生县城安全问题
     * @param driver
     * @param url
     * @param userName
     * @param password
     * @return
     */
    public static SQLManager getManager(String driver, String url, String userName, String password) {

        if(sqlManager==null){
            ConnectionSource source = ConnectionSourceHelper.getSimple(driver, url, userName, password);
            DBStyle mysql = new MySqlStyle();
            // sql语句放在classpagth的/sql 目录下
            SQLLoader loader = new ClasspathLoader("/sql");
            // 数据库命名跟java命名一样，所以采用DefaultNameConversion，还有一个是UnderlinedNameConversion，下划线风格的，
            UnderlinedNameConversion nc = new  UnderlinedNameConversion();
            // 最后，创建一个SQLManager,DebugInterceptor 不是必须的，但可以通过它查看sql执行情况
            sqlManager = new SQLManager(mysql,loader,source,nc,new Interceptor[]{new DebugInterceptor()});
        }
        return sqlManager;

    }
}
