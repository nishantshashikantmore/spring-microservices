package com.nishant.loan.loanbalance.dao;

import com.nishant.loan.loanbalance.entity.LoanBalance;
import com.nishant.loan.loanbalance.repository.LoanBalanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("LoanBalanceDao")
public class LoanBalanceDaoImpl implements LoanBalanceDao{

  @Autowired
  private LoanBalanceRepository loanBalanceRepository;

  @Override
  public LoanBalance addLoanBalance(LoanBalance loanBalance) {
    return loanBalanceRepository.save(loanBalance);
  }

  @Override
  public LoanBalance getLoanBalance(Long loanBalanceId) {
    return loanBalanceRepository.findByBalanceId(loanBalanceId);
  }
}
