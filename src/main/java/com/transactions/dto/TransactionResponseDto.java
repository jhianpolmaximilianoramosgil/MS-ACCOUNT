package com.transactions.dto;

import com.transactions.model.Transaction;
import lombok.Getter;
import lombok.Setter;

/**
 * Clase de transferencia de datos para la respuesta de Transacciones
 */
@Getter
@Setter
public class TransactionResponseDto {
	private Transaction transaction;
	private Message statusDto;
}
