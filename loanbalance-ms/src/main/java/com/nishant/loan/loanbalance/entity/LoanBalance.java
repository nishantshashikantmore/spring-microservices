package com.nishant.loan.loanbalance.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoanBalance {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name="balanceId")
  @JsonProperty
  private Long balanceId;

  @Column(name="amount")
  @NotNull
  @JsonProperty
  private Double amount;

  @Column(name="currency")
  @NotNull
  @JsonProperty
  private String currency;

}
