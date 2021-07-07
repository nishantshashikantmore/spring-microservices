package com.nishant.loyalty.loyaltybalance.service;

import com.nishant.loyalty.loyaltybalance.dao.LoyaltyBalanceDao;
import com.nishant.loyalty.loyaltybalance.entity.LoyaltyBalance;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("LoyaltyBalanceService")
@Slf4j
public class LoyaltyBalanceServiceImpl implements LoyaltyBalanceService {
  @Autowired
  private LoyaltyBalanceDao loyaltyBalanceDao;

  @Override
  public LoyaltyBalance addLoyaltyBalance(LoyaltyBalance loyaltyBalance) {
    log.info("Inside Add Loyalty Balance Service");
    return loyaltyBalanceDao.addLoyaltyBalance(loyaltyBalance);
  }

  @Override
  public LoyaltyBalance getLoyaltyBalance(long loyaltyBalanceId) {
    return loyaltyBalanceDao.getLoyaltyBalance(loyaltyBalanceId);
  }

  @Override
  public Integer deleteLoyaltyBalance(Long loyaltyBalanceId) {
    return loyaltyBalanceDao.deleteLoyaltyBalance(loyaltyBalanceId);
  }

  @Override
  public LoyaltyBalance updateLoyaltyBalance(LoyaltyBalance loyaltyBalance) {
    return loyaltyBalanceDao.updateLoyaltyBalance(loyaltyBalance);
  }
}
