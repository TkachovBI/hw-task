package com.example.springapp.Services;

import com.example.springapp.Managers.UserManager;
import com.example.springapp.Models.User;
import lombok.*;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserManager userManager;

    /**
     * {@inheritDoc}
     */
    @Override
    public User createUser(User us) {
        return userManager.save(us);
    }
}
