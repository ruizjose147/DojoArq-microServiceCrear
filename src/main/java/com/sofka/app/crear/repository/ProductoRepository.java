package com.sofka.app.crear.repository;

import com.sofka.app.crear.model.Producto;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProductoRepository extends ReactiveMongoRepository<Producto, String> {
}
