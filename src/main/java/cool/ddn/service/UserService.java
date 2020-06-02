package cool.ddn.service;

import cool.ddn.po.User;

public interface UserService {

    User checkUser(String username, String password);
}
