package com.kodilla.accounts.controller;

import com.kodilla.accounts.dto.AccountDto;
import com.kodilla.accounts.rest.response.GetCustomerAccountsResponse;
import com.kodilla.accounts.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(path = "/v1/accounts", produces = {MediaType.APPLICATION_JSON_VALUE})
@RequiredArgsConstructor
@RestController
public class AccountsController {

    private final AccountService accountService;

    @GetMapping("/{id}")
    public GetCustomerAccountsResponse getCustomerAccounts(@PathVariable("id") Long customerId) {

        List<AccountDto> accounts = accountService.getCustomerAccounts(customerId);

        return GetCustomerAccountsResponse.of(accounts);
    }
}
