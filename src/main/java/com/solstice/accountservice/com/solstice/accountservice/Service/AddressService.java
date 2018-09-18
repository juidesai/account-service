package com.solstice.accountservice.com.solstice.accountservice.Service;


import com.solstice.accountservice.com.solstice.accountservice.Domain.Account;
import com.solstice.accountservice.com.solstice.accountservice.Domain.Address;
import com.solstice.accountservice.com.solstice.accountservice.Repository.AccountRepository;
import com.solstice.accountservice.com.solstice.accountservice.Repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private AccountRepository accountRepository;

    public AddressService(AddressRepository addressRepository) { this.addressRepository = addressRepository;
    }

    public List<Address> getAllAddresses() {
        return addressRepository.findAll();
    }

//    public void addNewAddress(Address address) {
//        addressRepository.save(address);
//    }

    public Address addNewAddressById(Address address, long accountId){
        Account account=accountRepository.getOne(accountId);
        address.setAccount(account);
        return addressRepository.save(address);
    }

    public void updateAddressById(Address address, long accountId, long addressId){
        Address address1= addressRepository.findByAccountIdAndAddressId(accountId, addressId);
        address1.setApt(address.getApt());
        address1.setCity(address.getCity());
        address1.setStreet(address.getStreet());
        address1.setState(address.getState());
        address1.setCountry(address.getCountry());
        address1.setZipcode(address.getZipcode());
        addressRepository.save(address1);
    }

    public void deleteAddressById(long accountId, long addressId){
        Address address=addressRepository.findByAccountIdAndAddressId(accountId,addressId);
        addressRepository.delete(address);
        System.out.println("Deleted Successfully");
    }

    public Address getAddressById(long addressId){
        return addressRepository.findById(addressId);
    }

    public List<Address> getAllAddressByAccountId(long accountId){
        return addressRepository.findAllAdressesByAccountId(accountId);
    }


}

