package com.nishant.loyalty.loyaltybalance.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoyaltyBalance {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name="balanceId")
  @JsonProperty
  private Long balanceId;

  @Column(name="amount")
  @NotNull
  @Min(1000)
  @JsonProperty
  private Double amount;

  @Column(name="currency")
  @NotNull
  @JsonProperty
  private String currency;

}
