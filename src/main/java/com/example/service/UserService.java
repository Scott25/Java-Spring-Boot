package com.example.service;

import com.example.Repository.Users;
import com.example.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

@Service
@Transactional
public class UserService {
    private Users users;

    @Autowired
    public UserService(Users users) {
        this.users = users;
    }

    public User getUserDetails(int idCode, String email) {
        return users.getUsersByIdcodeOrEmail(idCode, email);
    }

    public User checkIfUserExists(int idCode, String email) {
        return users.getUsersByIdcodeOrEmail(idCode, email);
    }
    public void createNewUser(User user) {
        users.save(user);
    }
}
