package com.nishant.loan.loanbalance.dao;

import com.nishant.loan.loanbalance.entity.LoanBalance;

public interface LoanBalanceDao {
  public LoanBalance addLoanBalance(LoanBalance loanBalance);
  public LoanBalance getLoanBalance(Long loanBalanceId);
}
