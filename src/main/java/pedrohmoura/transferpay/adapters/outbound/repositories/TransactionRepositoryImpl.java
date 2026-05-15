package pedrohmoura.transferpay.adapters.outbound.repositories;

import pedrohmoura.transferpay.adapters.outbound.entities.JpaTransactionEntity;
import pedrohmoura.transferpay.domains.model.Transaction;
import pedrohmoura.transferpay.domains.repository.TransactionRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

@Repository
public class TransactionRepositoryImpl implements TransactionRepository {

    private final JpaTransactionRepository jpaTransactionRepository;

    public TransactionRepositoryImpl(JpaTransactionRepository jpaTransactionRepository) {
        this.jpaTransactionRepository = jpaTransactionRepository;
    }

    @Override
    public Transaction save(Transaction transaction) {
        JpaTransactionEntity transactionEntity = new JpaTransactionEntity(transaction);
        this.jpaTransactionRepository.save(transactionEntity);
        return new Transaction(transactionEntity.getId(), transactionEntity.getAmount(), transactionEntity.getPayer(), transactionEntity.getPayee(), transactionEntity.getCreatedAt());
    }

    @Override
    public Transaction findById(UUID id) {
        Optional<JpaTransactionEntity> transactionEntity = this.jpaTransactionRepository.findById(id);
        return transactionEntity.map(entity -> new Transaction(entity.getId(), entity.getAmount(), entity.getPayer(), entity.getPayee(), entity.getCreatedAt())).orElse(null);
    }

    @Override
    public List<Transaction> findAll() {
        return this.jpaTransactionRepository.findAll().stream()
                .map(entity -> new Transaction(entity.getId(), entity.getAmount(), entity.getPayer(), entity.getPayee(), entity.getCreatedAt()))
                .collect(java.util.stream.Collectors.toList());
    }
}
