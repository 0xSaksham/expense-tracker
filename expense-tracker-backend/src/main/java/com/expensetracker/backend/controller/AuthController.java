package com.expensetracker.backend.controller;

import com.expensetracker.backend.dto.LoginRequest;
import com.expensetracker.backend.dto.UserRegisterRequest;
import com.expensetracker.backend.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class AuthController {
    private final UserService userService;

    public record ApiResponse<T>(boolean success, T data, String message) {}
    public record LoginResponse(String token){}

    @PostMapping("/register")
    public ResponseEntity<ApiResponse<String>> register(@RequestBody UserRegisterRequest request){
        try {
            String message = userService.registerUser(request);
            return ResponseEntity.ok(new ApiResponse<>(true, message, null));
        }
        catch (RuntimeException e){
            return ResponseEntity.badRequest().body(new ApiResponse<>(false, null, e.getMessage()));
        }
    }

    @PostMapping("/login")
    public ResponseEntity<ApiResponse<LoginResponse>> login(@RequestBody LoginRequest request){
        try {
            String token = userService.loginUser(request);
            return ResponseEntity.ok(new ApiResponse<>(true,new LoginResponse(token),null));
        }
        catch (RuntimeException e){
            return ResponseEntity.badRequest().body(new ApiResponse<>(false, null , e.getMessage()));
        }
    }
}
