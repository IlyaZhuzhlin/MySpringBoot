package com.zhuzhlin.springb.MySpringBoot.service;

import com.zhuzhlin.springb.MySpringBoot.model.User;
import java.util.List;

public interface UserService {
    public List<User> getAllUsers();

    public void saveUser(User user);

    public User getUser(int id);

    public void deleteUser(int id);

    public void updateUser(User user, int id);
}
