package com.expensetracker.backend.controller;

import com.expensetracker.backend.dto.UserRegisterRequest;
import com.expensetracker.backend.entity.User;
import com.expensetracker.backend.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {
    private final UserService userService;

    @PostMapping("/register")
    public User register(@RequestBody UserRegisterRequest request){
        return userService.register(request);
    }
}
