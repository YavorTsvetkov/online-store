package com.yavor.onlinestore.respositories.categories;

import com.yavor.onlinestore.respositories.products.ProductEntity;

import java.util.List;

public class CategoryEntity {

    private Long id;
    private String name;
    private List<ProductEntity> products;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ProductEntity> getProducts() {
        return products;
    }

    public void setProducts(List<ProductEntity> products) {
        this.products = products;
    }
}
