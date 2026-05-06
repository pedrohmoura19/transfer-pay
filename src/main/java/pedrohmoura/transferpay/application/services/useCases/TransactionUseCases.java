package pedrohmoura.transferpay.application.services.useCases;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

import pedrohmoura.transferpay.domains.model.Transaction;

public interface TransactionUseCases {
        public UUID executeTransaction(UUID senderId, UUID receiverId, BigDecimal amount);
        public Transaction getTransactionById(UUID transactionId);
        public List<Transaction> getTransactionsByUserId(UUID userId);
        public List<Transaction> getAllTransactions();    
}
