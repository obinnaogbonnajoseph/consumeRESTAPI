package com.udacity.consumeRESTAPI.dao;

import com.udacity.consumeRESTAPI.entity.Currency;

import java.sql.Timestamp;

public class CurrencyResponse {

    private Currency data;
    private Timestamp timestamp;

    public CurrencyResponse() {}

    public CurrencyResponse(Currency data, Timestamp timestamp) {
        this.data = data;
        this.timestamp = timestamp;
    }

    public Currency getData() {
        return data;
    }

    public void setData(Currency data) {
        this.data = data;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "CurrencyResponse{" +
                "data=" + data.toString() +
                ", timestamp=" + timestamp +
                '}';
    }
}
