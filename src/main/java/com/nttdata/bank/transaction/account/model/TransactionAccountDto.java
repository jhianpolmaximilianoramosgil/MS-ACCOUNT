package com.nttdata.bank.transaction.account.model;

import lombok.Data;

import java.util.Date;

@Data
public class TransactionAccountDto {

  private Integer transactionId;
  private String transactionType; //Deposito - Retiro
  private Integer accountId;
  private Float transactionAmount;
  private Date transactionDate;

}