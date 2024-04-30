import org.example.provider.ConvertUSDToEUR;
import org.example.provider.ConvertUSDToGBP;
import org.example.provider.ConvertUSDToSEK;
import org.example.service.CurrencyConverter;

module provider {
    requires org.example.service;
    provides CurrencyConverter with ConvertUSDToEUR, ConvertUSDToGBP, ConvertUSDToSEK;
}