package mapper;

import jdk.nashorn.internal.runtime.linker.LinkerCallSite;
import org.apache.ibatis.annotations.Param;
import pojo.TUser;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    void updateUser();
    void deleteUser();
    TUser selectUserById();
    List<TUser> selectAll();

    TUser getUserByUsername(String uname);

    TUser checkLogin(String uname,String pwd);

    TUser checkLoginByParam(@Param("uname") String uname,
                            @Param("pwd") String pwd);
    Integer getCount();

    Map<String,Object> getUserByIdMap(@Param("id") Integer id);
    List<Map<String, Object>> getAllUserToMap();
    int insertUser(TUser tUser);
}
