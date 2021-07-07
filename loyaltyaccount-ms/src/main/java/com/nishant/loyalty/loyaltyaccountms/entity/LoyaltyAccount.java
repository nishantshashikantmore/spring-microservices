package com.nishant.loyalty.loyaltyaccountms.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.nishant.loyalty.loyaltybalance.entity.LoyaltyBalance;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoyaltyAccount {
  @Id
  @GeneratedValue
  @Column(name="accountId")
  @JsonProperty
  private Long accountId;

  @Column(name="accountName")
  @JsonProperty
  @NotNull
  private Long accountName;

  @OneToOne
  @JoinColumn(name = "balanceId", referencedColumnName = "balanceId")
  @JsonProperty
  @NotNull
  private LoyaltyBalance balance;


}
