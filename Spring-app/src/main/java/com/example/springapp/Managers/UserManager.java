package com.example.springapp.Managers;

import com.example.springapp.Models.User;

public interface UserManager {
    /**
     * Returns updated user.
     *
     * @param user specifies a user
     * @return updated user
     */
    User save(User user);
}
