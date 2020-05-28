package com.bpby.dao;

import com.bpby.entity.User;

import java.util.List;

public interface UserDao {


    User saveOrUpdateUser(User user);

    void deleteUser(Long id);

    User getUserById(Long id);

    List<User> listUsers();


}