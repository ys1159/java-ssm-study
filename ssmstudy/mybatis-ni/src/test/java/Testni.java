import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.mybatis.mapper.EmpMapper;
import com.mybatis.pojo.Emp;
import com.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class Testni {
    @Test
    public void TestgetAll(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        List<Emp> emps = mapper.selectByExample(null);
        Emp emp = new Emp();
        mapper.updateByPrimaryKeySelective(emp);
        mapper.updateByPrimaryKey(emp);
        emps.forEach(System.out::println);


    }
    @Test
    public void testgetpage(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        //开启分页
        Page<Object> page = PageHelper.startPage(1, 5);
        List<Emp> emps = mapper.selectByExample(null);
        emps.forEach(System.out::println);
        System.out.println(page);


    }
}
