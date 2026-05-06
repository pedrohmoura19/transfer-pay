package pedrohmoura.transferpay.domains.dto;

import java.math.BigDecimal;

import pedrohmoura.transferpay.domains.model.Role;

public class UserDTO {
    private String name;
    private String cpf;
    private String email;
    private String password;
    private BigDecimal balance;
    private Role role;

    public UserDTO() {
    }

    public UserDTO(
                String name,
                String cpf,
                String email,
                String password,
                BigDecimal balance,
                Role role) {
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.password = password;
        this.balance = balance;
        this.role = role;
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
