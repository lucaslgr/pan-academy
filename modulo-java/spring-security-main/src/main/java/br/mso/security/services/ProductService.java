package br.mso.security.services;

import java.util.List;

import br.mso.security.models.Product;
import br.mso.security.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
  @Autowired
  private ProductRepository repo;
  
  public List<Product> listAll() {
    return repo.findAll();
  }
  
  public void save(Product product) {
    repo.save(product);
  }
  
  public Product get(Long id) {
    return repo.findById(id).get();
  }
  
  public void delete(Long id) {
    repo.deleteById(id);
  }
}
