package com.booksworld.bean;

import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
@NoArgsConstructor
public class SkuSaleAttrValue implements Serializable {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private int skuId;
    @Column
    private int saleAttrId;
    @Column
    private int saleAttrValueId;
    @Column
    private String saleAttrName;
    @Column
    private String saleAttrValueName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSkuId() {
        return skuId;
    }

    public void setSkuId(int skuId) {
        this.skuId = skuId;
    }

    public int getSaleAttrId() {
        return saleAttrId;
    }

    public void setSaleAttrId(int saleAttrId) {
        this.saleAttrId = saleAttrId;
    }

    public int getSaleAttrValueId() {
        return saleAttrValueId;
    }

    public void setSaleAttrValueId(int saleAttrValueId) {
        this.saleAttrValueId = saleAttrValueId;
    }

    public String getSaleAttrName() {
        return saleAttrName;
    }

    public void setSaleAttrName(String saleAttrName) {
        this.saleAttrName = saleAttrName;
    }

    public String getSaleAttrValueName() {
        return saleAttrValueName;
    }

    public void setSaleAttrValueName(String saleAttrValueName) {
        this.saleAttrValueName = saleAttrValueName;
    }

    @Override
    public String toString() {
        return "SkuSaleAttrValue{" +
                "id=" + id +
                ", skuId=" + skuId +
                ", saleAttrId=" + saleAttrId +
                ", saleAttrValueId=" + saleAttrValueId +
                ", saleAttrName='" + saleAttrName + '\'' +
                ", saleAttrValueName='" + saleAttrValueName + '\'' +
                '}';
    }
}
