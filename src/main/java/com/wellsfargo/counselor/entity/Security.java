package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Security {
    @Id
    @GeneratedValue()
    private long securityId;
    @Column(nullable = false)
    private String securityName;
    @Column(nullable = false)
    private String categoryType;
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date purchaseDate;
    @Column(nullable = false)
    private BigDecimal purchasePrice;
    @Column(nullable = false)
    private int quantity;
    @Column(nullable = false)
    private long portfolioId;

    protected Security(){

    }
    public Security(String securityName, String categoryType,
                    Date purchaseDate, BigDecimal purchasePrice, int quantity, long portfolioId){
        this.securityName=securityName;
        this.categoryType = categoryType;
        this.purchaseDate= purchaseDate;
        this.purchasePrice=purchasePrice;
        this.quantity = quantity;
        this.portfolioId= portfolioId;

    }

    public long getSecurityId() {
        return securityId;
    }

    public String getSecurityName() {
        return securityName;
    }

    public void setSecurityName(String securityName) {
        this.securityName = securityName;
    }

    public String getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(String categoryType) {
        this.categoryType = categoryType;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(long portfolioId) {
        this.portfolioId = portfolioId;
    }
}
