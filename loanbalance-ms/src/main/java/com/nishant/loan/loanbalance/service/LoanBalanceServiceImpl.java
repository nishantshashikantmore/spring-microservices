package com.nishant.loan.loanbalance.service;

import com.nishant.loan.loanbalance.dao.LoanBalanceDao;
import com.nishant.loan.loanbalance.entity.LoanBalance;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("LoanBalanceService")
@Slf4j
public class LoanBalanceServiceImpl implements LoanBalanceService {
  @Autowired
  private LoanBalanceDao loanBalanceDao;

  @Override
  public LoanBalance addLoanBalance(LoanBalance loanBalance) {
    log.info("Inside Add Loan Balance Service");
    return loanBalanceDao.addLoanBalance(loanBalance);
  }

  @Override
  public LoanBalance getLoanBalance(long loanBalanceId) {
    return loanBalanceDao.getLoanBalance(loanBalanceId);
  }
}
