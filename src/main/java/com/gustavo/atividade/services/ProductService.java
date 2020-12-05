package com.gustavo.atividade.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gustavo.atividade.entities.Product;
import com.gustavo.atividade.entities.Product;
import com.gustavo.atividade.entities.Product;
import com.gustavo.atividade.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product findByID(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	public Product insert(Product obj) {
		return repository.save(obj);
	}
	
	public Product update(Long id, Product obj) {
		Product entity = repository.getOne(id);
		updateData(entity, obj);
		return repository.save(entity);
		
	}
	
	private void updateData(Product entity, Product obj) {
		entity.setName(obj.getName());
		entity.setDescription(obj.getDescription());
		entity.setPrice(obj.getPrice());
		
	}
}
