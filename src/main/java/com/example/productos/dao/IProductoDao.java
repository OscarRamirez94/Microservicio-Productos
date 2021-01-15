package com.example.productos.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.productos.entity.Producto;

@Repository
public interface IProductoDao  extends JpaRepository<Producto, Long>{
	
	
}
