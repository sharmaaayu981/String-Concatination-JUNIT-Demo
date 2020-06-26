package org.example;
import org.hamcrest.Matchers;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.regex.Matcher;

import static org.junit.Assert.assertThat;

public class CurrencyTest {
    private Currency currency;

    @Before
    public void init() {
        currency = new Currency();
    }

    @Test
    public void getCurrency() {
      Assert.assertThat(currency.getCurrency(),Matchers.arrayContaining("EUR","USD","INR"));
    }
}