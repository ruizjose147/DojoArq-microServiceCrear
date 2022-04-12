package com.sofka.app.crear.service;

import com.sofka.app.crear.model.Producto;
import com.sofka.app.crear.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class ProductoService {

    @Autowired
    ProductoRepository repository;

    public Mono<Producto> save(Producto producto) {
        return this.repository.save(producto);
    }



}
