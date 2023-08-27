package com.edhm.productos.api.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.edhm.productos.api.entities.Producto;

public interface ProductoRepository extends CrudRepository<Producto, Long>{
@Override
List<Producto> findAll();
}
