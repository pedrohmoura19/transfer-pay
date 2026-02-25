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
import pedrohmoura.transferpay.domains.model.User;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "users")
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

    public JpaUserEntity(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.cpf = user.getCpf();
        this.email = user.getEmail();
        this.password = user.getPassword();
        this.balance = user.getBalance();
        this.role = user.getRole();
    }
}
