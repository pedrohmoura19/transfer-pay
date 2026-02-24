package pedrohmoura.transferpay.adapters.outbound.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pedrohmoura.transferpay.domains.model.Role;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name="users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JpaUserEntity {
    @Id
    @GeneratedValue
    private UUID id;

    private String name;
    private String cpf;
    private String email;
    private String password;
    private BigDecimal balance;
    private Role role;
}
