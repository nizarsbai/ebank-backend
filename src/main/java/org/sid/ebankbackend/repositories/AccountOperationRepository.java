package org.sid.ebankbackend.repositories;

import org.sid.ebankbackend.entities.AccountOperation;
import org.sid.ebankbackend.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountOperationRepository extends JpaRepository<AccountOperation,Long> {
}
