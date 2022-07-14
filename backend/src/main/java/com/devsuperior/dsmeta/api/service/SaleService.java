package com.devsuperior.dsmeta.api.service;

import com.devsuperior.dsmeta.api.domain.Sale;
import com.devsuperior.dsmeta.api.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {

    @Autowired
    private SaleRepository repository;

    public List<Sale> findSales() {
        return repository.findAll();
    }
}
