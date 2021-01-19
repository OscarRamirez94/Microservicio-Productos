package com.example.productos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.commons.models.Producto;
import com.example.productos.dao.IProductoDao;

import com.example.productos.iservice.IProductoService;

@Service
public class ProductoService implements IProductoService {
@Autowired
private IProductoDao productoDao;


@Override
@Transactional(readOnly = true)
public List<Producto> findAll() {
	return productoDao.findAll();
}

@Override
@Transactional(readOnly = true)
public Producto findyById(Long id) {
	
	return productoDao.findById(id).orElse(null);
}

@Override
@Transactional
public Producto save(Producto producto) {
	return productoDao.save(producto);
}

@Override
public void eliminar(Long id) {
	productoDao.deleteById(id);
	
}

}
