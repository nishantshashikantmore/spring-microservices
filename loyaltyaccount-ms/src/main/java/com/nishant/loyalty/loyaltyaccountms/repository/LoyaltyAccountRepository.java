package com.nishant.loyalty.loyaltyaccountms.repository;

import com.nishant.loyalty.loyaltyaccountms.entity.LoyaltyAccount;
import com.nishant.loyalty.loyaltybalance.entity.LoyaltyBalance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoyaltyAccountRepository extends JpaRepository<LoyaltyAccount, Long> {
  LoyaltyBalance findByBalanceId(Long loyaltyBalanceId);
  Integer deleteByBalanceId(Long loyaltyBalanceId);
}
