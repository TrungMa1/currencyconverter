package org.example.consumer;

import org.example.service.CurrencyConverter;

import java.util.ServiceLoader;

public class Main {

    public static void main(String[] args) {

        ServiceLoader<CurrencyConverter> serviceLoader = ServiceLoader.load(CurrencyConverter.class);

        for (CurrencyConverter converter : serviceLoader) {
            double USD = 100;

            double amountInEUR = converter.convertUSD(USD);

            double amountInUSDFromEUR = converter.revertUSD(USD);

            System.out.println(USD + "$ USD = " + amountInEUR + converter.currencySymbol());
            System.out.println("100.0" + converter.currencySymbol() + " = " + amountInUSDFromEUR + "$ USD\n");
        }
    }
}
