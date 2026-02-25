package pedrohmoura.transferpay.adapters.outbound.repositories;

import pedrohmoura.transferpay.adapters.outbound.entities.JpaUserEntity;
import pedrohmoura.transferpay.domains.model.User;
import pedrohmoura.transferpay.domains.repository.UserRepository;

import java.util.Optional;
import java.util.UUID;

public class UserRepositoryImpl implements UserRepository {

    private final JpaUserRepository jpaUserRepository;

    public UserRepositoryImpl(JpaUserRepository jpaUserRepository) {
        this.jpaUserRepository = jpaUserRepository;
    }

    @Override
    public User save(User user) {
        JpaUserEntity userEntity = new JpaUserEntity(user);
        this.jpaUserRepository.save(userEntity);
        return new User(userEntity.getId(), userEntity.getName(), userEntity.getCpf(), userEntity.getEmail(), userEntity.getPassword(), userEntity.getBalance(), userEntity.getRole());
    }

    @Override
    public User findById(UUID id) {
        Optional<JpaUserEntity> userEntity = this.jpaUserRepository.findById(id);
        return userEntity.map(user -> new User(user.getId(), user.getName(), user.getCpf(), user.getEmail(), user.getPassword(), user.getBalance(), user.getRole())).orElse(null);
    }
}
