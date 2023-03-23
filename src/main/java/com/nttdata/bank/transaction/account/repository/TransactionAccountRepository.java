package com.nttdata.bank.transaction.account.repository;


import com.nttdata.bank.transaction.account.model.TransactionAccount;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface TransactionAccountRepository extends ReactiveMongoRepository<TransactionAccount,Integer> {

  Flux<TransactionAccount> getByAccountId(Integer accountId);
}
