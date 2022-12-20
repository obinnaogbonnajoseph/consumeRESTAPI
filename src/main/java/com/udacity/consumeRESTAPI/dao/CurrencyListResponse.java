package com.udacity.consumeRESTAPI.dao;

import com.udacity.consumeRESTAPI.entity.Currency;

import java.sql.Timestamp;
import java.util.List;

public class CurrencyListResponse {

    private List<Currency> data;
    private Timestamp timestamp;

    public CurrencyListResponse() {
    }

    public CurrencyListResponse(List<Currency> data, Timestamp timestamp) {
        this.data = data;
        this.timestamp = timestamp;
    }

    public List<Currency> getData() {
        return data;
    }

    public void setData(List<Currency> data) {
        this.data = data;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}
