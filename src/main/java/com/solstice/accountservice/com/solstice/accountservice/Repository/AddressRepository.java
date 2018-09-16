package com.solstice.accountservice.com.solstice.accountservice.Repository;


import com.solstice.accountservice.com.solstice.accountservice.Domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
    @Query(value = "select * " +
            "from address o " +
            "where o.account_addres_id = ?1 and o.address_id = ?2", nativeQuery = true)
    Address findByAccountIdAndAddressId(@Param("account_addres_id") long accountId, @Param("address_id") long address_id);

//    @Query(value = "select * " +
//            "from address o " +
//            "where o.account_addres_id = ?1", nativeQuery = true)
//    Address findByAccountId(@Param("account_addres_id") long accountId);
    @Query(value = "select * " +
        "from address o " +
        "where o.address_id = ?1", nativeQuery = true)
    Address findById(long addressId);

    @Query(value = "select * " +
            "from address o " +
            "where o.account_addres_id = ?1", nativeQuery = true)
    List<Address> findAllAdressesByAccountId(long accountId);
}
