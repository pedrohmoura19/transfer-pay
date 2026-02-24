package pedrohmoura.transferpay.adapters.outbound.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pedrohmoura.transferpay.domains.model.User;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name="transactions")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JpaTransactionEntity {
    @Id
    @GeneratedValue
    private UUID id;

    private BigDecimal amount;
    private User from;
    private User destination;
    private String time;
}
