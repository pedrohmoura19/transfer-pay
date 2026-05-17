package pedrohmoura.transferpay.adapters.outbound.repositories;

import pedrohmoura.transferpay.adapters.outbound.entities.JpaUserEntity;
import pedrohmoura.transferpay.domains.model.User;
import pedrohmoura.transferpay.domains.repository.UserRepository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

@Repository
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

    @Override
    public User findByCpf(String cpf) {
        Optional<JpaUserEntity> userEntity = this.jpaUserRepository.findByCpf(cpf);
        return userEntity.map(user -> new User(user.getId(), user.getName(), user.getCpf(), user.getEmail(), user.getPassword(), user.getBalance(), user.getRole())).orElse(null);
    }

    @Override
    public List<User> findAll() {
        return this.jpaUserRepository.findAll().stream()
                .map(userEntity -> new User(userEntity.getId(), userEntity.getName(), userEntity.getCpf(), userEntity.getEmail(), userEntity.getPassword(), userEntity.getBalance(), userEntity.getRole()))
                .toList();
    }

    @Override
    public User updateUserBalance(UUID userId, BigDecimal newBalance) {
        Optional<JpaUserEntity> userEntityOptional = this.jpaUserRepository.findById(userId);
        if (userEntityOptional.isPresent()) {
            JpaUserEntity userEntity = userEntityOptional.get();
            userEntity.setBalance(newBalance);
            this.jpaUserRepository.save(userEntity);
            return new User(userEntity.getId(), userEntity.getName(), userEntity.getCpf(), userEntity.getEmail(), userEntity.getPassword(), userEntity.getBalance(), userEntity.getRole());
        }
        return null;
    }
}
