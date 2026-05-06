package pedrohmoura.transferpay.adapters.inbound.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pedrohmoura.transferpay.application.services.UserService;
import pedrohmoura.transferpay.domains.dto.UserDTO;
import pedrohmoura.transferpay.domains.model.User;

@RestController
@RequestMapping("/api/users")
public class UserController {
    
    private UserService userService;

    @PostMapping
    public ResponseEntity<User> createUser(@ModelAttribute UserDTO userDTO) {
        User createdUser = userService.createUser(userDTO);
        return ResponseEntity.ok(createdUser);
    }
}
