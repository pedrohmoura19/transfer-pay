package pedrohmoura.transferpay.domains.model;

import java.math.BigDecimal;
import java.util.UUID;

public class User {
    private UUID id;
    private String name;
    private String cpf;
    private String email;
    private String password;
    private BigDecimal balance;
    private Role role;

    public User() {
    }

    public User(UUID id,
                String name,
                String cpf,
                String email,
                String password,
                BigDecimal balance,
                Role role) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.password = password;
        this.balance = balance;
        this.role = role;
    }


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
