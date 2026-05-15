package pedrohmoura.transferpay.adapters.outbound.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pedrohmoura.transferpay.domains.model.Transaction;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "transactions")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JpaTransactionEntity {
    @Id
    @GeneratedValue
    private UUID id;

    private BigDecimal amount;
    private UUID payer;
    private UUID payee;
    @jakarta.persistence.Column(name = "created_at")
    private String createdAt;

    public JpaTransactionEntity(Transaction transaction) {
        this.id = transaction.getId();
        this.amount = transaction.getAmount();
        this.payer = transaction.getPayer();
        this.payee = transaction.getPayee();
        this.createdAt = transaction.getCreatedAt();
    }
}
