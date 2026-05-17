package pedrohmoura.transferpay.adapters.outbound.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pedrohmoura.transferpay.adapters.outbound.entities.JpaUserEntity;

import java.util.Optional;
import java.util.UUID;

public interface JpaUserRepository extends JpaRepository<JpaUserEntity, UUID> {
    Optional<JpaUserEntity> findByCpf(String cpf);
}
