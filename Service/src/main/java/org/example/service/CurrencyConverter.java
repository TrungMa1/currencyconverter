package org.example.service;

public interface CurrencyConverter {
    double convertUSD(double amount);
    double revertUSD(double amount);
    String currencySymbol();
}
