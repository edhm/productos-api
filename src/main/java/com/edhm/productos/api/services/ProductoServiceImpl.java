package com.edhm.productos.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edhm.productos.api.entities.Producto;
import com.edhm.productos.api.repositories.ProductoRepository;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
@Service
@Transactional
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	private ProductoRepository productoRepository;

	@Override
	public List<Producto> findAll() {
		return productoRepository.findAll();
	}

	@Override
	public Producto findById(Long id) {
		return productoRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("No existe regisro"));
	}

	@Override
	public void save(Producto producto) {
		productoRepository.save(producto);

	}

	@Override
	public void deleteById(Long id) {
		productoRepository.deleteById(id);

	}

}
