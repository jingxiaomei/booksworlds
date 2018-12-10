package com.booksworld.bean;


import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
@NoArgsConstructor
public class SkuAttrValue implements Serializable{

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private int atttId;
    @Column
    private int valueId;
    @Column
    private int skuId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAtttId() {
        return atttId;
    }

    public void setAtttId(int atttId) {
        this.atttId = atttId;
    }

    public int getValueId() {
        return valueId;
    }

    public void setValueId(int valueId) {
        this.valueId = valueId;
    }

    public int getSkuId() {
        return skuId;
    }

    public void setSkuId(int skuId) {
        this.skuId = skuId;
    }

    @Override
    public String toString() {
        return "SkuAttrValue{" +
                "id=" + id +
                ", atttId=" + atttId +
                ", valueId=" + valueId +
                ", skuId=" + skuId +
                '}';
    }
}
