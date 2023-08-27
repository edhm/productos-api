package com.edhm.productos.api.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.edhm.productos.api.entities.Producto;

public interface ProductoRepository extends CrudRepository<Producto, Long> {
	@Override
	List<Producto> findAll();
	@Query("SELECT p FROM Producto p WHERE p.nombre LIKE %:name%")
	List<Producto> searchByNameLike(@Param("name") String name);

	/*
@Query("SELECT p FROM productos p WHERE p.nombre LIKE %:name%")
	List<Producto> searchByNameLike(@Param("name") String name);
	 * */
}
