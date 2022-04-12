package com.sofka.app.crear.controller;

import com.sofka.app.crear.dto.ProductoDto;
import com.sofka.app.crear.model.Producto;
import com.sofka.app.crear.service.ProductoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@CrossOrigin(origins = "*")
public class ProductoController {

    @Autowired
    ProductoService service;
    ModelMapper mapper;

    public ProductoController(ModelMapper mapper){
        this.mapper = mapper;
    }

    @PostMapping("/producto")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Producto> save(@RequestBody ProductoDto productoDto){
        Producto producto = mapper.map(productoDto, Producto.class);
        return service.save(producto);
    }
}
