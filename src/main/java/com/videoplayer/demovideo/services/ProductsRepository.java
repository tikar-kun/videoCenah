package com.videoplayer.demovideo.services;

import org.springframework.data.jpa.repository.JpaRepository;
import com.videoplayer.demovideo.models.Product;

public interface ProductsRepository extends JpaRepository<Product, Integer> {
    
}
