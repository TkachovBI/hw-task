package com.example.springapp.Services;

import com.example.springapp.Models.User;

public interface UserService {
    /**
     * Returns created user.
     *
     * @param user specifies a user
     * @return created user
     */
    User createUser(User user);
}
