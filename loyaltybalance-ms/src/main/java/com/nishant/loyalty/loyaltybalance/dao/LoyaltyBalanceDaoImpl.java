package com.nishant.loyalty.loyaltybalance.dao;

import com.nishant.loyalty.loyaltybalance.entity.LoyaltyBalance;
import com.nishant.loyalty.loyaltybalance.repository.LoyaltyBalanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository("LoyaltyBalanceDao")
public class LoyaltyBalanceDaoImpl implements LoyaltyBalanceDao{

  @Autowired
  private LoyaltyBalanceRepository loyaltyBalanceRepository;

  @Override
  public LoyaltyBalance addLoyaltyBalance(LoyaltyBalance loyaltyBalance) {
    return loyaltyBalanceRepository.save(loyaltyBalance);
  }

  @Override
  public LoyaltyBalance getLoyaltyBalance(Long loyaltyBalanceId) {
    return loyaltyBalanceRepository.findByBalanceId(loyaltyBalanceId);
  }

  @Override
  @Transactional
  public Integer deleteLoyaltyBalance(Long loyaltyBalanceId) {
    return loyaltyBalanceRepository.deleteByBalanceId(loyaltyBalanceId);
  }

  @Override
  public LoyaltyBalance updateLoyaltyBalance(LoyaltyBalance loyaltyBalance) {
    return loyaltyBalanceRepository.save(loyaltyBalance);
  }
}
