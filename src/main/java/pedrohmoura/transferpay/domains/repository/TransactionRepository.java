package pedrohmoura.transferpay.domains.repository;

import pedrohmoura.transferpay.domains.model.Transaction;

import java.util.UUID;

public interface TransactionRepository {
    Transaction save(Transaction transaction);

    Transaction findById(UUID id);
}
