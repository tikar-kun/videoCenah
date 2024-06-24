package com.videoplayer.demovideo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import com.videoplayer.demovideo.models.Product;
import com.videoplayer.demovideo.models.ProductDTO;
import com.videoplayer.demovideo.services.ProductsRepository;

@Controller
@RequestMapping("/products")
public class ProductsControllers {
    @Autowired
    private ProductsRepository repo;

    @GetMapping({"","/"})
    public String showVideoList (Model model){
        List<Product> products = repo.findAll();
        model.addAttribute("products", products);
        return "products/index" ;
       }

       @GetMapping({"/create"})
       public String showCreateVideo (Model model){
           ProductDTO productDTO = new ProductDTO();
           model.addAttribute("productDTO", productDTO);
           return "products/CreateProduct" ;
          }
}
