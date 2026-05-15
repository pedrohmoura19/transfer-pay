package pedrohmoura.transferpay.domains.model;

import java.math.BigDecimal;
import java.util.UUID;

public class Transaction {
    private UUID id;
    private BigDecimal amount;
    private UUID payer;
    private UUID payee;
    private String createdAt;

    public Transaction() {
    }

    public Transaction(UUID id,
                       BigDecimal amount,
                       UUID payer,
                       UUID payee,
                       String createdAt) {
        this.id = id;
        this.amount = amount;
        this.payer = payer;
        this.payee = payee;
        this.createdAt = createdAt;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public UUID getPayer() {
        return payer;
    }

    public void setPayer(UUID payer) {
        this.payer = payer;
    }

    public UUID getPayee() {
        return payee;
    }

    public void setPayee(UUID payee) {
        this.payee = payee;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}
