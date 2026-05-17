package pedrohmoura.transferpay.adapters.inbound.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import pedrohmoura.transferpay.application.services.UserService;
import pedrohmoura.transferpay.domains.dto.BalanceUpdateDTO;
import pedrohmoura.transferpay.domains.dto.UserDTO;
import pedrohmoura.transferpay.domains.model.User;

@RestController
@RequestMapping("/api/users")
public class UserController {
    
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @Operation(summary = "Create a new user")
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody UserDTO body) {
        User createdUser = userService.createUser(body);
        return ResponseEntity.ok(createdUser);
    }

    @Operation(summary = "Get user by ID")
    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable UUID id) {
        User user = userService.getUserById(id);
        return ResponseEntity.ok(user);
    }

    @Operation(summary = "Get user by CPF")
    @GetMapping("/cpf/{cpf}")
    public ResponseEntity<User> getUserByCpf(@PathVariable String cpf) {
        User user = userService.getUserByCpf(cpf);
        return ResponseEntity.ok(user);
    }

    @Operation(summary = "Get all users")
    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());    
    }

    @Operation(summary = "Update user balance")
    @PatchMapping("/{id}/balance")
    public ResponseEntity<User> updateUserBalance(@PathVariable UUID id, @RequestBody BalanceUpdateDTO body) {
        User updatedUser = userService.updateUserBalance(id, body.getAmount());
        return ResponseEntity.ok(updatedUser);
    }
}
