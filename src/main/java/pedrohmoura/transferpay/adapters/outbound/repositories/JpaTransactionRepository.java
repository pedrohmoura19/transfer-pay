package pedrohmoura.transferpay.adapters.outbound.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pedrohmoura.transferpay.adapters.outbound.entities.JpaTransactionEntity;

import java.util.UUID;

public interface JpaTransactionRepository extends JpaRepository<JpaTransactionEntity,UUID> {}
