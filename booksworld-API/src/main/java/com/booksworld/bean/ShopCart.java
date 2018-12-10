package com.booksworld.bean;

import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
@NoArgsConstructor
public class ShopCart implements Serializable {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private int userId;
    @Column
    private int skuId;
    @Column
    private BigDecimal cartPrice;
    @Column
    private int skuNum;
    @Column
    private String imgUrl;
    @Column
    private String skuName;
    @Column
    private BigDecimal skuPrice;
    @Column
    private String isChecked;
    @Column
    private int isDelete;
    @Column
    private int reserve;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getSkuId() {
        return skuId;
    }

    public void setSkuId(int skuId) {
        this.skuId = skuId;
    }

    public BigDecimal getCartPrice() {
        return cartPrice;
    }

    public void setCartPrice(BigDecimal cartPrice) {
        this.cartPrice = cartPrice;
    }

    public int getSkuNum() {
        return skuNum;
    }

    public void setSkuNum(int skuNum) {
        this.skuNum = skuNum;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public BigDecimal getSkuPrice() {
        return skuPrice;
    }

    public void setSkuPrice(BigDecimal skuPrice) {
        this.skuPrice = skuPrice;
    }

    public String getIsChecked() {
        return isChecked;
    }

    public void setIsChecked(String isChecked) {
        this.isChecked = isChecked;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

    public int getReserve() {
        return reserve;
    }

    public void setReserve(int reserve) {
        this.reserve = reserve;
    }

    @Override
    public String toString() {
        return "ShopCart{" +
                "id=" + id +
                ", userId=" + userId +
                ", skuId=" + skuId +
                ", cartPrice=" + cartPrice +
                ", skuNum=" + skuNum +
                ", imgUrl='" + imgUrl + '\'' +
                ", skuName='" + skuName + '\'' +
                ", skuPrice=" + skuPrice +
                ", isChecked='" + isChecked + '\'' +
                ", isDelete=" + isDelete +
                ", reserve=" + reserve +
                '}';
    }
}
