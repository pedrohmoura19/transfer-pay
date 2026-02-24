package pedrohmoura.transferpay.domains.model;

import java.math.BigDecimal;
import java.util.UUID;

public class Transaction {
    private UUID id;
    private BigDecimal amount;
    private User from;
    private User destination;
    private String time;

    private Transaction() {
    }

    public Transaction(UUID id,
                       BigDecimal amount,
                       User from,
                       User destination,
                       String time) {
        this.id = id;
        this.amount = amount;
        this.from = from;
        this.destination = destination;
        this.time = time;
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

    public User getFrom() {
        return from;
    }

    public void setFrom(User from) {
        this.from = from;
    }

    public User getDestination() {
        return destination;
    }

    public void setDestination(User destination) {
        this.destination = destination;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
