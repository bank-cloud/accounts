package com.kodilla.accounts.dto;

import com.kodilla.accounts.domain.Currency;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
public class AccountDto {
    private Long id;

    private String name;

    private BigDecimal availableFunds;

    private Currency currency;

    private Long customerId;
}
