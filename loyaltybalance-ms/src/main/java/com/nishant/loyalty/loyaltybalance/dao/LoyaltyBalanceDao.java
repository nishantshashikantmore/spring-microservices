package com.nishant.loyalty.loyaltybalance.dao;

import com.nishant.loyalty.loyaltybalance.entity.LoyaltyBalance;

public interface LoyaltyBalanceDao {
  public LoyaltyBalance addLoyaltyBalance(LoyaltyBalance loyaltyBalance);
  public LoyaltyBalance getLoyaltyBalance(Long loyaltyBalanceId);
  public Integer deleteLoyaltyBalance(Long loyaltyBalanceId);
  public LoyaltyBalance updateLoyaltyBalance(LoyaltyBalance loyaltyBalance);
}
