package com.mfu.wallet.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConvertRequest {
	private TokenRequest token;
	private String currencyName;
	private String previousCurrency;
}
