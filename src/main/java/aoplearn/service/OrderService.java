package aoplearn.service;


import aoplearn.model.Order;

public interface OrderService {

    Order createOrder(String username, String product);

    Order queryOrder(String username);
}
