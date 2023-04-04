package com.transactions.repository;

import com.transactions.model.Transaction;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

/**
 * Clase Repositorio para los métodos de acceso a la base de datos
 */
public interface TransactionsRepository extends ReactiveMongoRepository<Transaction, String> {
	Flux<Transaction> findByCustomerId(String customerId);
}
