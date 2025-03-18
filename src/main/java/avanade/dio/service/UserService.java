package avanade.dio.service;

import avanade.dio.domain.model.User;

import java.util.List;

public interface UserService {

    User save(User user);
    List<User> listAll();
    User findById(Integer id);
}
