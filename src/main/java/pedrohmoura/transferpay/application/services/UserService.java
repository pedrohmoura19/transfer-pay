package pedrohmoura.transferpay.application.services;

import java.math.BigDecimal;
import java.util.UUID;

import org.springframework.stereotype.Service;

import pedrohmoura.transferpay.application.services.useCases.UserUseCases;
import pedrohmoura.transferpay.domains.dto.UserDTO;
import pedrohmoura.transferpay.domains.model.User;
import pedrohmoura.transferpay.domains.repository.UserRepository;

@Service
public class UserService implements UserUseCases {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(UserDTO data) {
        User user = new User();
        user.setName(data.getName());
        user.setCpf(data.getCpf());
        user.setEmail(data.getEmail());
        user.setPassword(data.getPassword());
        user.setBalance(BigDecimal.ZERO);
        user.setRole(data.getRole());

        return userRepository.save(user);
    }

    @Override
    public User getUserById(UUID userId) {
        return userRepository.findById(userId);
    }

    @Override
    public User updateUserBalance(UUID userId, BigDecimal newBalance) {
        User user = userRepository.findById(userId);
        user.setBalance(newBalance);
        return userRepository.save(user);
    }
}
