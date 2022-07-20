package com.example.springapp.Managers;

import com.example.springapp.Mappers.UserEntityMapper;
import com.example.springapp.Models.User;
import com.example.springapp.Repositories.UserRepository;
import lombok.*;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserManagerImpl implements UserManager {

    private final UserRepository userRepository;
    private final UserEntityMapper userEntityMapper;

    /**
     * {@inheritDoc}
     */
    @Override
    public User save(User user) {
        return userEntityMapper.fromEntity(
                userRepository.save(
                        userEntityMapper.toEntity(user)
                )
        );
    }
}
