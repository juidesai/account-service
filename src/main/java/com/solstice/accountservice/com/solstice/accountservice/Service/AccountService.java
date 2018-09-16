package com.solstice.accountservice.com.solstice.accountservice.Service;

import com.solstice.accountservice.com.solstice.accountservice.Domain.Account;
import com.solstice.accountservice.com.solstice.accountservice.Domain.Address;
import com.solstice.accountservice.com.solstice.accountservice.Repository.AccountRepository;
import com.solstice.accountservice.com.solstice.accountservice.Repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private AddressRepository addressRepository;

    public AccountService(AccountRepository accountRepository) { this.accountRepository = accountRepository;
    }

    public List<Account> getAllAccountList() {
        return accountRepository.findAll();
    }

    public void addNewAccounts(Account account) {
        accountRepository.save(account);
    }

//    public List<Address> getAddressesByAccountId(long accountId){
//        Account account = accountRepository.getOne(accountId);
//        return account.getAddressList();
//    }

//    public void deleteAccount(long accountId){
//        Account account=accountRepository.getOne(accountId);
//        accountRepository.delete(account);
//        Address address=addressRepository.findByAccountId(accountId);
//        addressRepository.delete(address);
//    }

}

