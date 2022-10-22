import mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import pojo.TUser;
import utils.SqlSessionUtils;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

public class MybatisTest {

    @Test
    public void TestInsert() {
        try {
            //读取MyBatis的核心配置文件
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
//创建SqlSessionFactoryBuilder对象
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
//通过核心配置文件所对应的字节输入流创建工厂类SqlSessionFactory，生产SqlSession对象
            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
//创建SqlSession对象，此时通过SqlSession对象所操作的sql都必须手动提交或回滚事务
//SqlSession sqlSession = sqlSessionFactory.openSession();
//创建SqlSession对象，此时通过SqlSession对象所操作的sql都会自动提交
            SqlSession sqlSession = sqlSessionFactory.openSession(true);
//通过代理模式创建UserMapper接口的代理实现类对象
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//调用UserMapper接口中的方法，就可以根据UserMapper的全类名匹配元素文件，通过调用的方法名匹配
            //    映射文件中的SQL标签，并执行标签中的SQL语句
            //int result = userMapper.insertUser();
//sqlSession.commit();
           // System.out.println("结果：" + result);

            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void updateUser(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.updateUser();
        sqlSession.close();


    }
    @Test
    public void deleteUser(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.deleteUser();
        sqlSession.close();
    }
    @Test
    public void selectUserById(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        TUser tUser = mapper.selectUserById();
        System.out.println(tUser.toString());

        sqlSession.close();
    }
    @Test
    public void selectAll(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<TUser> tUsers = mapper.selectAll();
        for(TUser tUser:tUsers){
            System.out.println(tUser);
        }
        sqlSession.close();
    }

    @Test
    public void testgetUserByName(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        TUser user = mapper.getUserByUsername("憨憨怪");
        System.out.println(user);
        sqlSession.close();
    }
    @Test
    public void checklogin(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        TUser user = mapper.checkLogin("憨憨怪", "123456");
        System.out.println(user);
        sqlSession.close();
    }
    @Test
    public void checkloginByParam(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        TUser user = mapper.checkLoginByParam("憨憨怪", "123456");
        System.out.println(user);
        sqlSession.close();
    }
    @Test
    public void getCount(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Integer count = mapper.getCount();
        System.out.println(count);
        sqlSession.close();
    }
    @Test
    public void getUserByIdMap(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Object> userByIdMap = mapper.getUserByIdMap(4);
        System.out.println(userByIdMap);
        sqlSession.close();
    }
    @Test
    public void getUserAllMap(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<Map<String, Object>> allUserToMap = mapper.getAllUserToMap();
        for(Map<String, Object> map:allUserToMap){
            System.out.println(map);
        }
        sqlSession.close();
    }
    @Test
    public void insertUser(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int rows = mapper.insertUser(new TUser(null, "阿伟", "123456", 27, "女", "123@qq.com"));
        System.out.println(rows);

        sqlSession.close();
    }

}
