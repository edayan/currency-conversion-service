package com.in28minutes.microservices.currencyconversionservice;

import com.in28minutes.microservices.currencyconversionservice.bean.CurrencyConversionBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyConversionController {

    @GetMapping("currency-converter/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversionBean conertCurrency(@PathVariable("from") final String from,
                                                 @PathVariable("to") final String to,
                                                 @PathVariable("quantity") final BigDecimal quantity
    ) {

        return new CurrencyConversionBean(1L, from, to, BigDecimal.ONE, quantity, quantity, 0);
    }
}
