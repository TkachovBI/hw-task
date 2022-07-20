package com.example.springapp.Controllers;

import com.example.springapp.Mappers.UserMapper;
import com.example.springapp.Models.UserRequest;
import com.example.springapp.Models.UserResponse;
import com.example.springapp.Services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/api/admin/v1/user")
@RestController
public class UserController {

    private final UserService userService;
    private final UserMapper userMapper;

    /**
     * Returns created user.
     *
     * @param userRequest specifies a data for creating a user
     * @return created user
     */

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public UserResponse createUser(@RequestBody UserRequest userRequest) {
        return userMapper.toResponse(
                userService.createUser(
                        userMapper.fromRequest(
                                userRequest
                        )
                )
        );
    }

}