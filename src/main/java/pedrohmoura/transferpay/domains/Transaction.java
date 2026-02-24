package pedrohmoura.transferpay.domains;

import java.math.BigDecimal;
import java.util.UUID;

public class Transaction {
    private UUID id;
    private BigDecimal amount;
    private User from;
    private User destination;
    private String time;
}
