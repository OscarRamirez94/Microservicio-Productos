package com.example.productos.iservice;

import java.util.List;

import com.example.commons.models.Producto;


public interface IProductoService {
	
	public List<Producto> findAll();
	public Producto findyById(Long id);
	public Producto save(Producto producto);
	public void eliminar(Long id);
	
}
