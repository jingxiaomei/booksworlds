package com.booksworld.adminprovider.service;


import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "BOOKSWORLD-SKUSALEATTRVALUE")
public interface SkuSaleAttrValueService {
}
