package com.nishant.loan.loanbalance.repository;

import com.nishant.loan.loanbalance.entity.LoanBalance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface LoanBalanceRepository extends JpaRepository<LoanBalance, Long> {

  LoanBalance findByBalanceId(Long loanBalanceId);
}
