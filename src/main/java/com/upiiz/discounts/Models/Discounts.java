package com.upiiz.discounts.Models;

public class Discounts {
    private Long id;
    private String code;
    private String amount;
    private String until;

    public Discounts() {
    }

    public Discounts(long id, String code, String amount, String until) {
        this.id = id;
        this.code = code;
        this.amount = amount;
        this.until = until;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getUntil() {
        return until;
    }

    public void setUntil(String until) {
        this.until = until;
    }
}
