package com.nishant.loyalty.loyaltybalance.controller;

import com.nishant.loyalty.loyaltybalance.entity.LoyaltyBalance;
import com.nishant.loyalty.loyaltybalance.service.LoyaltyBalanceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

@RestController
@RequestMapping("/loyaltybalances")
@Slf4j
@Validated
public class LoyaltyBalanceController {

  @Autowired
  private LoyaltyBalanceService loyaltyBalanceService;

  @PostMapping("/")
  public LoyaltyBalance addLoyaltyBalance(@RequestBody @Valid LoyaltyBalance loyaltyBalance) {
    log.info("Add Loyalty Balance Controller");
    return loyaltyBalanceService.addLoyaltyBalance(loyaltyBalance);
  }

  @GetMapping("/{loyaltyBalanceId}")
  public LoyaltyBalance getLoyaltyBalance(@PathVariable("loyaltyBalanceId") Long loyaltyBalanceId, HttpServletResponse response ) {
    log.info("Get Loyalty Balance Controller");
    LoyaltyBalance loyaltyBalance = loyaltyBalanceService.getLoyaltyBalance(loyaltyBalanceId);
    if(loyaltyBalance == null)
    {
      response.setStatus(404);
    }
    return loyaltyBalanceService.getLoyaltyBalance(loyaltyBalanceId);
  }

  @DeleteMapping("/{loyaltyBalanceId}")
  public ResponseEntity deleteLoyaltyBalance(
      @PathVariable("loyaltyBalanceId") Long loyaltyBalanceId) {
    log.info("Delete Loyalty Balance");
    if (loyaltyBalanceService.deleteLoyaltyBalance(loyaltyBalanceId) == Integer.valueOf(1)) {
      return new ResponseEntity(HttpStatus.NO_CONTENT);
    } else {
      return new ResponseEntity(HttpStatus.NOT_FOUND);
    }
  }

  @PutMapping("/{loyaltyBalanceId}")
  public LoyaltyBalance updateLoyaltyBalance(@RequestBody @Valid LoyaltyBalance loyaltyBalance,
                                             @PathVariable("loyaltyBalanceId") Long loyaltyBalanceId) {
    log.info("Update Loyalty Balance");
    loyaltyBalance.setBalanceId(loyaltyBalanceId);
    return loyaltyBalanceService.updateLoyaltyBalance(loyaltyBalance);
  }
}
