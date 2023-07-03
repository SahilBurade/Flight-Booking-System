package com.payment.service;

import java.util.ArrayList;
import java.util.List;

import com.payment.models.*;
import com.payment.models.TransactionDetails;

/**
 *
 *
 * @author Sahil Burade
 */
public interface PaymentService {
	/**
	 *
	 *
	 * @author Sahil Burade
	 */

	TransactionDetails createTransaction(Double amount);

}
