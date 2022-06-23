package com.zhuzhlin.springb.MySpringBoot.dao;

import com.zhuzhlin.springb.MySpringBoot.model.User;

import java.util.List;

public interface UserDAO {
    public List<User> getAllUsers();

   public void saveUser(User user);

  public User getUser(int id);

  public void deleteUser(int id);
  public void updateUser(User user, int id);
}
