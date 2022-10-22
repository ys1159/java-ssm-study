import com.mapper.EmpMapper;
import com.pojo.Emp;
import com.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TextDSQL {
    @Test
    public void testDSQL(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        List<Emp> emps = mapper.selectEmp(new Emp(null, "ys", 29, "男"));
        emps.forEach(System.out::println);


    }
    @Test
    public void testinsertmoreEmp(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp1 = new Emp(null,"张三",20,"男");
        Emp emp2 = new Emp(null,"李四",20,"男");
        Emp emp3 = new Emp(null,"王五",20,"男");
        List<Emp> list = Arrays.asList(emp1, emp2, emp3);
        mapper.insertMoreEmp(list);

    }

    @Test
    public void testdeletemoreEmp(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        mapper.deleteMoreEmp(new Integer[]{4,5});

    }
}
