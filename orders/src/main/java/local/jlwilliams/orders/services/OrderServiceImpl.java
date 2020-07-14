package local.jlwilliams.orders.services;

import local.jlwilliams.orders.models.Customer;
import local.jlwilliams.orders.models.Order;
import local.jlwilliams.orders.repositories.CustomerRepository;
import local.jlwilliams.orders.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "orderService")
public class OrderServiceImpl
        implements OrderServices
{
    @Autowired
    private OrderRepository orderrepos;

    @Override
    public Order save(Order order)
    {
        return orderrepos.save(order);
    }
}
