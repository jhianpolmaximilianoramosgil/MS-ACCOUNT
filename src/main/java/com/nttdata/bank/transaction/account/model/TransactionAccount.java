package com.nttdata.bank.transaction.account.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(collection = "transactions_accounts")
public class TransactionAccount {
  @Id
  private Integer transactionId;
  private String transactionType; //Deposito(D) - Retiro(R)
  private Integer accountId;
  private Float transactionAmount;
  private Date transactionDate;
}