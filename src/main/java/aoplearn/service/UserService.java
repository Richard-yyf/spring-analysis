package aoplearn.service;


import aoplearn.model.User;

public interface UserService {

    User createUser(String firstName, String lastName, int age);

    User queryUser();
}
