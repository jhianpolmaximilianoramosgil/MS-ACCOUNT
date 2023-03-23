package com.nttdata.bank.transaction.account.service;

import com.nttdata.bank.transaction.account.model.TransactionAccount;
import com.nttdata.bank.transaction.account.model.TransactionAccountDto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TransactionAccountService {

  Flux<TransactionAccount> getAll();

  Mono<TransactionAccount> save(TransactionAccountDto transactionAccountDto);

  Mono<TransactionAccount> update(TransactionAccountDto transactionAccountDto);

  Mono<Void> delete(Integer transactionAccountId);

  Flux<TransactionAccount> getByAccountId(Integer accountId);

}
