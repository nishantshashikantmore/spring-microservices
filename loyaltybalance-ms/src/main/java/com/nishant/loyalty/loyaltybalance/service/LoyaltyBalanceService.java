package com.nishant.loyalty.loyaltybalance.service;

import com.nishant.loyalty.loyaltybalance.entity.LoyaltyBalance;

public interface LoyaltyBalanceService {
  public LoyaltyBalance addLoyaltyBalance(LoyaltyBalance loyaltyBalance);
  public LoyaltyBalance getLoyaltyBalance(long loyaltyBalanceId);
  public Integer deleteLoyaltyBalance(Long loyaltyBalanceId);
  public LoyaltyBalance updateLoyaltyBalance(LoyaltyBalance loyaltyBalance);
}
