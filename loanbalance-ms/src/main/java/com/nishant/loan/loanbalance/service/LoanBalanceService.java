package com.nishant.loan.loanbalance.service;

import com.nishant.loan.loanbalance.entity.LoanBalance;

public interface LoanBalanceService {
  public LoanBalance addLoanBalance(LoanBalance loanBalance);
  public LoanBalance getLoanBalance(long loanBalanceId);

}
