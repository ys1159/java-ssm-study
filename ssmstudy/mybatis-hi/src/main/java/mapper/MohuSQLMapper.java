package mapper;

import org.apache.ibatis.annotations.Param;
import pojo.TUser;

import java.util.List;

public interface MohuSQLMapper {
    List<TUser> getuserByname(@Param("uname") String uname);
}
