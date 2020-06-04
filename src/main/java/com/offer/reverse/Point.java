package com.offer.reverse;

import java.math.BigDecimal;

/**
 * @ClassName Point
 * @Description TODO
 * @Author Administrator
 * @Date 2019/9/27 14:54
 * Version 1.0
 **/
public class Point {
    /**
     * 电量
     */
    private BigDecimal electricQuantity;
    /**
     * 电价
     */
    private BigDecimal electricPrice;

    /**
     * 功率
     */
    private BigDecimal power;

    public BigDecimal getElectricQuantity() {
        return electricQuantity;
    }

    public void setElectricQuantity(BigDecimal electricQuantity) {
        this.electricQuantity = electricQuantity;
    }

    public BigDecimal getElectricPrice() {
        return electricPrice;
    }

    public void setElectricPrice(BigDecimal electricPrice) {
        this.electricPrice = electricPrice;
    }

    public BigDecimal getPower() {
        return power;
    }

    public void setPower(BigDecimal power) {
        this.power = power;
    }
}
