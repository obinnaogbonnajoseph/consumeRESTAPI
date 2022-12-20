package com.udacity.consumeRESTAPI.entity;

public class Currency {

    private String id;
    private String symbol;
    private String currencySymbol;
    private String type;
    private Double rateUsd;

    public Currency() {}

    public Currency(String id, String symbol, String currencySymbol, String type, Double rateUsd) {
        this.id = id;
        this.symbol = symbol;
        this.currencySymbol = currencySymbol;
        this.type = type;
        this.rateUsd = rateUsd;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getCurrencySymbol() {
        return currencySymbol;
    }

    public void setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getRateUsd() {
        return rateUsd;
    }

    public void setRateUsd(Double rateUsd) {
        this.rateUsd = rateUsd;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "id='" + id + '\'' +
                ", symbol='" + symbol + '\'' +
                ", currencySymbol='" + currencySymbol + '\'' +
                ", type='" + type + '\'' +
                ", rateUsd=" + rateUsd +
                '}';
    }
}
