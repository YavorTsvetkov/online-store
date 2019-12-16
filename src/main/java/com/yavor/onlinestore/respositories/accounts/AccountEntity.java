package com.yavor.onlinestore.respositories.accounts;

import com.yavor.onlinestore.respositories.orders.OrderEntity;
import com.yavor.onlinestore.respositories.users.UserEntity;

import java.util.List;

public class AccountEntity {

    private Long Id;
    private UserEntity user;
    private String status;
    private List<OrderEntity> orders;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<OrderEntity> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderEntity> orders) {
        this.orders = orders;
    }
}
