package com.ishan.fakestore.services.impl;

import java.util.Arrays;
import java.util.List;

import com.ishan.fakestore.constants.FakeStoreApiConstants;
import com.ishan.fakestore.exceptions.UserNotFoundException;
import com.ishan.fakestore.models.User;
import com.ishan.fakestore.services.UserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserServiceImpl implements UserService {

    @Value("${user.fakestore.api.url}")
    private String apiUrl;

    private final RestTemplate restTemplate;

    public UserServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<User> getAllUsers() {
        ResponseEntity<User[]> response = restTemplate.getForEntity(apiUrl, User[].class);
        if (response.getStatusCode() != HttpStatusCode.valueOf(200)) {
            throw new UserNotFoundException(FakeStoreApiConstants.DATA_NOT_FOUND);
        }
        return Arrays.asList(response.getBody());
    }

    @Override
    public User getUserById(Long id) {
        User user = restTemplate.getForObject(apiUrl + "/" + id, User.class);
        if (user == null) {
            throw new UserNotFoundException(FakeStoreApiConstants.DATA_NOT_FOUND);
        }
        return user;
    }

    @Override
    public List<User> getUsersLimited(int limit) {
        ResponseEntity<User[]> response = restTemplate.getForEntity(apiUrl + "?limit=" + limit, User[].class);
        if (response.getStatusCode() != HttpStatusCode.valueOf(200)) {
            throw new UserNotFoundException(FakeStoreApiConstants.DATA_NOT_FOUND);
        }
        return Arrays.asList(response.getBody());
    }

    @Override
    public List<User> getUsersSorted(String sort) {
        ResponseEntity<User[]> response = restTemplate.getForEntity(apiUrl + "?sort=" + sort, User[].class);
        if (response.getStatusCode() != HttpStatusCode.valueOf(200)) {
            throw new UserNotFoundException(FakeStoreApiConstants.DATA_NOT_FOUND);
        }
        return Arrays.asList(response.getBody());
    }

    @Override
    public User addUser(User user) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<User> request = new HttpEntity<>(user, headers);
        ResponseEntity<User> response = restTemplate.exchange(apiUrl, HttpMethod.POST, request, User.class);
        if (response.getStatusCode() != HttpStatusCode.valueOf(200)) {
            throw new UserNotFoundException(FakeStoreApiConstants.DATA_NOT_FOUND);
        }
        return response.getBody();
    }

    @Override
    public User updateUser(Long id, User user) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<User> request = new HttpEntity<>(user, headers);
        ResponseEntity<User> response = restTemplate.exchange(apiUrl + "/" + id, HttpMethod.PUT, request, User.class);
        if (response.getStatusCode() != HttpStatusCode.valueOf(200)) {
            throw new UserNotFoundException(FakeStoreApiConstants.DATA_NOT_FOUND);
        }
        return response.getBody();
    }

    @Override
    public void deleteUser(Long id) {
        restTemplate.delete(apiUrl + "/" + id);
    }
}