package org.example.provider;

import org.example.service.CurrencyConverter;

public class ConvertUSDToGBP implements CurrencyConverter {

    private static final double USD_TO_GBP = 0.80;
    private static final double GBP_TO_USD = 1.25;
    private static final String symbol = "£ GBP";

    @Override
    public double convertUSD(double amount) {
        return amount * USD_TO_GBP;
    }

    @Override
    public double revertUSD(double amount) {
        return amount * GBP_TO_USD;
    }

    @Override
    public String currencySymbol() {
        return symbol;
    }
}