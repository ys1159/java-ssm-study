import mapper.MohuSQLMapper;
import mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.TUser;
import utils.SqlSessionUtils;

import java.util.List;
import java.util.Map;

public class MohuSQLTest {
    @Test
    public void getmohuSQLname(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        MohuSQLMapper mapper = sqlSession.getMapper(MohuSQLMapper.class);
        List<TUser> tUsers = mapper.getuserByname("憨");
        for (TUser user:tUsers){
            System.out.println(user);
        }

        sqlSession.close();
    }
}
