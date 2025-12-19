package com.expensetracker.backend.service;

import com.expensetracker.backend.dto.UserRegisterRequest;
import com.expensetracker.backend.entity.User;

public interface UserService {
    User register(UserRegisterRequest request);
}
