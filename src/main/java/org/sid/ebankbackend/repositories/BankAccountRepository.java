package org.sid.ebankbackend.repositories;

import org.sid.ebankbackend.entities.BankAccount;
import org.sid.ebankbackend.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,String> {
}
