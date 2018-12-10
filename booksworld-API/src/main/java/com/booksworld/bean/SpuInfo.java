package com.booksworld.bean;

import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
@NoArgsConstructor
public class SpuInfo implements Serializable {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String spuName;
    @Column
    private String description;
    @Column
    private int catalog3Id;
    @Column
    private int tmId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSpuName() {
        return spuName;
    }

    public void setSpuName(String spuName) {
        this.spuName = spuName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCatalog3Id() {
        return catalog3Id;
    }

    public void setCatalog3Id(int catalog3Id) {
        this.catalog3Id = catalog3Id;
    }

    public int getTmId() {
        return tmId;
    }

    public void setTmId(int tmId) {
        this.tmId = tmId;
    }

    @Override
    public String toString() {
        return "SpuInfo{" +
                "id=" + id +
                ", spuName='" + spuName + '\'' +
                ", description='" + description + '\'' +
                ", catalog3Id=" + catalog3Id +
                ", tmId=" + tmId +
                '}';
    }
}
