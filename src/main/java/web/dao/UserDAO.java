package web.dao;

import web.model.User;

import java.util.List;

public interface UserDAO {

    List <User> getAllUser();

    User getById(Long id);

    void saveUser(User user);

    void deleteById(Long id);

    User update(User user);


}