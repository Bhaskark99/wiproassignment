package com.wipro.prod.rep;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.wipro.prod.entity.Product;

@Repository
public interface ProductResp extends JpaRepository<Product, Integer>
{
  public Product findByprice(double price);
  
  public List<Product> findBypriceGreaterThan(double price);
  
  @Query("select p from Product p")
  public List<Product> getallpro();
  
   @Modifying
   @Query("update Product p set p.price=2400.0 where p.productId= :pi")
  public Product updpr(int pi);
}
