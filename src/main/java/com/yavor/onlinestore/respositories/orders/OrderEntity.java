package com.yavor.onlinestore.respositories.orders;

import com.yavor.onlinestore.respositories.accounts.AccountEntity;
import com.yavor.onlinestore.respositories.products.ProductEntity;

import java.util.List;

public class OrderEntity {

    private Long Id;
    private List<ProductEntity> products;
    private AccountEntity account;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public List<ProductEntity> getProducts() {
        return products;
    }

    public void setProducts(List<ProductEntity> products) {
        this.products = products;
    }

    public AccountEntity getAccount() {
        return account;
    }

    public void setAccount(AccountEntity account) {
        this.account = account;
    }
}
