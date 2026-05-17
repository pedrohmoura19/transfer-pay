package pedrohmoura.transferpay.domains.repository;

import pedrohmoura.transferpay.domains.model.User;

import java.util.List;
import java.util.UUID;

public interface UserRepository {
    User save(User user);

    User findById(UUID id);

    User findByCpf(String cpf);

    List<User> findAll();
}
