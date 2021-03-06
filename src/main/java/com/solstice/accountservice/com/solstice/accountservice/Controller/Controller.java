package com.solstice.accountservice.com.solstice.accountservice.Controller;

import com.solstice.accountservice.com.solstice.accountservice.Domain.Account;
import com.solstice.accountservice.com.solstice.accountservice.Domain.Address;
import com.solstice.accountservice.com.solstice.accountservice.Repository.AccountRepository;
import com.solstice.accountservice.com.solstice.accountservice.Service.AccountService;
import com.solstice.accountservice.com.solstice.accountservice.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class Controller {

    @Autowired
    AccountService accountService;

    @Autowired
    AddressService addressService;

    @Autowired
    AccountRepository accountRepository;

    @GetMapping("/accounts/{accountId}")
    public Optional<Account> getAccountById(@PathVariable(name = "accountId") long accountId){
        return accountService.getAccountById(accountId);
    }

    @GetMapping("/accounts/{id}/addresses")
    public List<Address> getAllAdressesByAccountId(@PathVariable(name = "id") long accountId){
        return addressService.getAllAddressByAccountId(accountId);
    }

    @GetMapping("/addresses/{addressId}")
    public Address getAddressById(@PathVariable(name = "addressId") long addressId){
        return addressService.getAddressById(addressId);
    }

    @PostMapping("/accounts/{id}/addresses")
    public Address addNewAddressById(@RequestBody Address address, @PathVariable(name = "id")long accountId){
        return addressService.addNewAddressById(address,accountId);
    }

    @PutMapping("/accounts/{accountId}/addresses/{addressId}")
    public void updateAddressById(@RequestBody Address address, @PathVariable(name = "accountId")long accountId, @PathVariable(name ="addressId") long addressId){
         addressService.updateAddressById(address,accountId,addressId);
    }

    @DeleteMapping("/accounts/{accountId}/addresses/{addressId}")
    public void deleteAddressById(@PathVariable(name = "accountId")long accountId, @PathVariable(name ="addressId") long addressId){
        addressService.deleteAddressById(accountId,addressId);
    }

//    @DeleteMapping("/accounts/{accountId}")
//    public void deleteAccountById(@PathVariable(name = "accountId")long accountId){
//        accountService.deleteAccount(accountId);
//    }


}
