package com.nishant.loan.loanbalance.controller;

import com.nishant.loan.loanbalance.entity.LoanBalance;
import com.nishant.loan.loanbalance.service.LoanBalanceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/loanbalances")
@Slf4j
@Validated
public class LoanBalanceController {

  @Autowired
  private LoanBalanceService loanBalanceService;

  @PostMapping("/")
  public LoanBalance addLoanBalance(@RequestBody @Valid LoanBalance loanBalance){
    log.info("Add Loan Balance Controller");
    return loanBalanceService.addLoanBalance(loanBalance);
  }

  @GetMapping("/{loanBalanceId}")
  public LoanBalance getLoanBalance(@PathVariable("loanBalanceId") Long loanBalanceId){
    log.info("Get Loan Balance Controller");
    return loanBalanceService.getLoanBalance(loanBalanceId);
  }

}
