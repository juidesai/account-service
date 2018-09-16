package com.solstice.accountservice.com.solstice.accountservice.Repository;


import com.solstice.accountservice.com.solstice.accountservice.Domain.Account;
import com.solstice.accountservice.com.solstice.accountservice.Domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account,Long> {

}
