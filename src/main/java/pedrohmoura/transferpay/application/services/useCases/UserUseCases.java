package pedrohmoura.transferpay.application.services.useCases;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

import pedrohmoura.transferpay.domains.dto.UserDTO;
import pedrohmoura.transferpay.domains.model.User;

public interface UserUseCases {
    public User createUser(UserDTO user);

    public User getUserById(UUID userId);

    public User getUserByCpf(String cpf);

    public List<User> getAllUsers();

    public User updateUserBalance(UUID userId, BigDecimal newBalance);
}
