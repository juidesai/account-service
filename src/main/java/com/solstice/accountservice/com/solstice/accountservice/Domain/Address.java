package com.solstice.accountservice.com.solstice.accountservice.Domain;


import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity(name = "Address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "addressId")
    private long addressId;
    @Column(name = "street")
    private String street;
    @Column(name = "apt")
    private String apt;
    @Column(name = "city")
    private String city;
    @Column(name = "state")
    private String state;
    @Column(name = "zipcode")
    private long zipcode;
    @Column(name = "country")
    private String country;

    @ManyToOne
    @JoinColumn(name = "account_addres_id")
    private Account account;

    public Address(){}

    public Address(long addressId, String street, String apt, String city, String state, long zipcode, String country, Account account) {
        this.addressId = addressId;
        this.street = street;
        this.apt = apt;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.country = country;
        this.account=account;
    }

    public long getAddressId() {
        return addressId;
    }

    public void setAddressId(long addressId) {
        this.addressId = addressId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getApt() {
        return apt;
    }

    public void setApt(String apt) {
        this.apt = apt;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public long getZipcode() {
        return zipcode;
    }

    public void setZipcode(long zipcode) {
        this.zipcode = zipcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
