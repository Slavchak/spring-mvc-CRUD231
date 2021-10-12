package web.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDAO;
import web.model.User;

import java.util.*;

@Service
public class UserServiceImpl implements UserService{

    private final UserDAO userDAO;

    public UserServiceImpl(UserDAO userDAO){
        this.userDAO = userDAO;
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> getAllUser() {
        return userDAO.getAllUser();
    }

    @Override
    @Transactional(readOnly = true)
    public User getById(Long id) {
        return userDAO.getById(id);
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        userDAO.saveUser(user);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        userDAO.deleteById(id);
    }

    @Override
    @Transactional
    public void update(User user) {
         userDAO.update(user);
    }
}
