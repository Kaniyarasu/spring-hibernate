package com.kaniyarasu.stock;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: kaniyarasu
 * Date: 4/3/13
 * Time: 5:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class Stock implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer stockId;
    private String stockCode;
    private String stockName;

    public Stock() {
    }

    public Stock(String stockCode, String stockName) {
        this.stockCode = stockCode;
        this.stockName = stockName;
    }

    public Integer getStockId() {
        return this.stockId;
    }

    public void setStockId(Integer stockId) {
        this.stockId = stockId;
    }

    public String getStockCode() {
        return this.stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public String getStockName() {
        return this.stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }
}
