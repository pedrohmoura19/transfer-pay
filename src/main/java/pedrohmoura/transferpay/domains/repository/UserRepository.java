package pedrohmoura.transferpay.domains.repository;

import pedrohmoura.transferpay.domains.model.User;

import java.util.UUID;

public interface UserRepository {
    User save(User user);

    User findById(UUID id);
}
