package com.nishant.loyalty.loyaltybalance.repository;

import com.nishant.loyalty.loyaltybalance.entity.LoyaltyBalance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface LoyaltyBalanceRepository extends JpaRepository<LoyaltyBalance, Long> {

  LoyaltyBalance findByBalanceId(Long loyaltyBalanceId);
  Integer deleteByBalanceId(Long loyaltyBalanceId);
}
