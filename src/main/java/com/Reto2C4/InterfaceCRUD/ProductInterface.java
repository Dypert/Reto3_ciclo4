/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Reto2C4.InterfaceCRUD;

import com.Reto2C4.Entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Home
 */
public interface ProductInterface extends MongoRepository<Product, Integer>{
    
}
