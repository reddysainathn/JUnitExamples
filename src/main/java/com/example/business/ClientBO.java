package com.example.business;

import java.util.List;

import com.example.business.exception.DifferentCurrenciesException;
import com.example.model.Amount;
import com.example.model.Product;

public interface ClientBO {

	Amount getClientProductsSum(List<Product> products)
			throws DifferentCurrenciesException;

}