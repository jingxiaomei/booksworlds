package com.booksworld.bean;

import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
@NoArgsConstructor
public class SpuSaleAttrValue implements Serializable {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private int spuId;
    @Column
    private int saleAttrId;
    @Column
    private int saleAttrValueName;

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

    public int getSaleAttrId() {
        return saleAttrId;
    }

    public void setSaleAttrId(int saleAttrId) {
        this.saleAttrId = saleAttrId;
    }

    public int getSaleAttrValueName() {
        return saleAttrValueName;
    }

    public void setSaleAttrValueName(int saleAttrValueName) {
        this.saleAttrValueName = saleAttrValueName;
    }

    @Override
    public String toString() {
        return "SpuSaleAttrValue{" +
                "id=" + id +
                ", spuId=" + spuId +
                ", saleAttrId=" + saleAttrId +
                ", saleAttrValueName=" + saleAttrValueName +
                '}';
    }
}
