package com.ishan.registeruser.services;

import com.ishan.registeruser.models.User;
import com.ishan.registeruser.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRespository) {
        this.userRepository = userRespository;
    }

    @Override
    public User signupUser(String name, String email, String password) throws Exception {
        User user = userRepository.findByEmail(email);
        if(user != null){
            throw new Exception("User already exists");
        }
        user = new User();
        user.setEmail(email);
        user.setName(name);
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        user.setPassword(encoder.encode(password));
        return userRepository.save(user);
    }

    @Override
    public boolean login(String email, String password) throws Exception {
        User user = userRepository.findByEmail(email);
        if(user == null){
            throw new Exception("User not found");
        }
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.matches(password, user.getPassword());
    }
}
