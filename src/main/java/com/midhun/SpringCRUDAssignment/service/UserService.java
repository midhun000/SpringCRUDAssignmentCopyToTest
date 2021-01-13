package com.midhun.SpringCRUDAssignment.service;

import com.midhun.SpringCRUDAssignment.dao.UserDAO;
import com.midhun.SpringCRUDAssignment.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    
    @Autowired
    UserDAO userDAO;

    public List<User> getAllUsers(){
        List<User>userList=new ArrayList<User>();
        userDAO.findAll().forEach(user -> userList.add(user));
        return userList;
    }

    public Optional<User> getUserById(int id){
        return userDAO.findById(id);
    }

    public void saveOrUpdate(User user){
        userDAO.save(user);
    }

    public void delete(int id){
        userDAO.deleteById(id);
    }
}
