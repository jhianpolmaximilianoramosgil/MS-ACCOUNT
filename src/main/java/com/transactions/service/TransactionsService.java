package com.transactions.service;

import com.transactions.dto.Message;
import com.transactions.dto.TransactionRequestDto;
import com.transactions.model.Transaction;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Clase interfaz de servicio para las Transacciones
 */
public interface TransactionsService {

	Flux<Transaction> getAll();

	Mono<Transaction> getTransactionById(String transactionId);

	Flux<Transaction> getTransactionByCustomerId(String customerId);

	Mono<Transaction> createTransaction(TransactionRequestDto transactionRequestDto);

	Mono<Transaction> updateTransaction(TransactionRequestDto transactionRequestDto);

	Mono<Message> deleteTransaction(String transactionId);

	Flux<Transaction> getAllXProductId(String productId);

}
