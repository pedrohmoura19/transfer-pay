CREATE TABLE transactions (
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    amount NUMERIC(19, 2) NOT NULL,
    payer UUID NOT NULL,
    payee UUID NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (payer) REFERENCES users(id),
    FOREIGN KEY (payee) REFERENCES users(id)
);