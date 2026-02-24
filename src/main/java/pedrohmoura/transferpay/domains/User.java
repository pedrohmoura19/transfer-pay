package pedrohmoura.transferpay.domains;

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
}
