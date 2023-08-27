package com.edhm.productos.api.services;

import java.util.List;

import com.edhm.productos.api.entities.Producto;

public interface ProductoService {
public List<Producto> findAll();
public Producto findById(Long id);
public void save(Producto producto);
public void deleteById(Long id); 
}
