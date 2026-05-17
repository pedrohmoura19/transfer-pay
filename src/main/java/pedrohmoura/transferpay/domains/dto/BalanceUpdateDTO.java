package pedrohmoura.transferpay.domains.dto;

import java.math.BigDecimal;

public class BalanceUpdateDTO {
    private BigDecimal amount;

    public BigDecimal getAmount() { 
        return amount; 
    };

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    };
}
