package com.booksworld.adminprovider.service;


import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "BOOKSWORLD-SPUSALEATTR")
public interface SpuSaleAttrService {
}
