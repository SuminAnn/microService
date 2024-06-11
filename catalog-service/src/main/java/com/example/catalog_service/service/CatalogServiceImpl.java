package com.example.catalog_service.service;

import org.springframework.stereotype.Service;

import com.example.catalog_service.jpa.CatalogEntity;
import com.example.catalog_service.jpa.CatalogRepository;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@Service
public class CatalogServiceImpl implements CatalogService{
    CatalogRepository catalogRepository;

    public CatalogServiceImpl(CatalogRepository catalogRepository) {
        this.catalogRepository = catalogRepository;
    }



    @Override
    public Iterable<CatalogEntity> getAllCatalogs() {
        return catalogRepository.findAll();
    }

}
