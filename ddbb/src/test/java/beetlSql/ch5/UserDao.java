package beetlSql.ch5;

import com.sys.User;
import org.beetl.sql.core.annotatoin.Param;
import org.beetl.sql.core.mapper.BaseMapper;

import java.util.List;

public interface UserDao extends BaseMapper<User> {

    List<User> selectUserByName(@Param("userName") String userName);
}
