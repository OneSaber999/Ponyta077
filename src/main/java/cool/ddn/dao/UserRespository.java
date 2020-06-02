package cool.ddn.dao;

import cool.ddn.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRespository extends JpaRepository<User,Long> {

    //该方法 继承了JPA 实现 直接根据用户名密码 查询数据库
    User findByUsernameAndPassword(String username,String password);
}
