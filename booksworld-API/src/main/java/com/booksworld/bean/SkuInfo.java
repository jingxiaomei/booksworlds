package com.booksworld.bean;


import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
@NoArgsConstructor
public class SkuInfo implements Serializable {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private int spuId;
    @Column
    private BigDecimal price;
    @Column
    private String skuName;
    @Column
    private String skuDesc;
    @Column
    private BigDecimal weight;
    @Column
    private int tmId;
    @Column
    private int catalog3Id;
    @Column
    private String skuDefaultImg;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSpuId() {
        return spuId;
    }

    public void setSpuId(int spuId) {
        this.spuId = spuId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public String getSkuDesc() {
        return skuDesc;
    }

    public void setSkuDesc(String skuDesc) {
        this.skuDesc = skuDesc;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public int getTmId() {
        return tmId;
    }

    public void setTmId(int tmId) {
        this.tmId = tmId;
    }

    public int getCatalog3Id() {
        return catalog3Id;
    }

    public void setCatalog3Id(int catalog3Id) {
        this.catalog3Id = catalog3Id;
    }

    public String getSkuDefaultImg() {
        return skuDefaultImg;
    }

    public void setSkuDefaultImg(String skuDefaultImg) {
        this.skuDefaultImg = skuDefaultImg;
    }

    @Override
    public String toString() {
        return "SkuInfo{" +
                "id=" + id +
                ", spuId=" + spuId +
                ", price=" + price +
                ", skuName='" + skuName + '\'' +
                ", skuDesc='" + skuDesc + '\'' +
                ", weight=" + weight +
                ", tmId=" + tmId +
                ", catalog3Id=" + catalog3Id +
                ", skuDefaultImg='" + skuDefaultImg + '\'' +
                '}';
    }
}
