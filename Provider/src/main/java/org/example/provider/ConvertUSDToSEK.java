package org.example.provider;

import org.example.service.CurrencyConverter;

public class ConvertUSDToSEK implements CurrencyConverter {

    private static final double USD_TO_SEK = 10.97;
    private static final double SEK_TO_USD = 0.091;
    private static final String symbol = "Kr SEK";

    @Override
    public double convertUSD(double amount) {
        return amount * USD_TO_SEK;
    }

    @Override
    public double revertUSD(double amount) {
        return amount * SEK_TO_USD;
    }

    @Override
    public String currencySymbol() {
        return symbol;
    }
}