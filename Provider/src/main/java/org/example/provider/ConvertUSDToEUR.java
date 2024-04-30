package org.example.provider;

import org.example.service.CurrencyConverter;

public class ConvertUSDToEUR implements CurrencyConverter {

    private static final double USD_TO_EUR = 0.93;
    private static final double EUR_TO_USD = 1.07;
    private static final String symbol = "€";

    @Override
    public double convertUSD(double amount) {
        return amount * USD_TO_EUR;
    }

    @Override
    public double revertUSD(double amount) {
        return amount * EUR_TO_USD;
    }

    @Override
    public String currencySymbol() {
        return symbol;
    }
}
