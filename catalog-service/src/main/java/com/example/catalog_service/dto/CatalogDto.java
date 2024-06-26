package com.example.catalog_service.dto;

import lombok.Data;
import java.io.Serializable;

@Data
public class CatalogDto implements Serializable{
    private String productId;
    private Integer aty;
    private Integer unitPrice;
    private Integer totalPrice;

    private String orderId;
    private String userId;
}   
