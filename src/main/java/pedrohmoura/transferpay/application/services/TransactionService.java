package pedrohmoura.transferpay.application.services;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import pedrohmoura.transferpay.application.services.useCases.TransactionUseCases;
import pedrohmoura.transferpay.domains.model.Transaction;
import pedrohmoura.transferpay.domains.model.User;
import pedrohmoura.transferpay.domains.repository.TransactionRepository;

@Service
public class TransactionService implements TransactionUseCases {


    private UserService userService;
    private TransactionRepository transactionRepository;
    
    @Override
    @Transactional()
    public UUID executeTransaction(UUID senderId, UUID receiverId, BigDecimal amount) {
        User sender = userService.getUserById(senderId);
        User receiver = userService.getUserById(receiverId);

        if(sender.getBalance().compareTo(amount) == -1) {
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        
        userService.updateUserBalance(senderId, sender.getBalance().subtract(amount));       
        userService.updateUserBalance(receiverId, receiver.getBalance().add(amount));

         throw new UnsupportedOperationException("Unimplemented method 'getTransactionById'");
    }

    @Override
    public Transaction getTransactionById(UUID transactionId) {
        return transactionRepository.findById(transactionId);
    }

    @Override
    public List<Transaction> getTransactionsByUserId(UUID userId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTransactionsByUserId'");
    }

    @Override
    public List<Transaction> getAllTransactions() {
       return transactionRepository.findAll();
    }
}
