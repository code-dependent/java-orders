package local.jlwilliams.orders.services;

import local.jlwilliams.orders.models.Agent;
import local.jlwilliams.orders.models.Customer;
import local.jlwilliams.orders.repositories.AgentRepository;
import local.jlwilliams.orders.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "customerService")
public class CustomerServiceImpl
        implements CustomerServices
{
    @Autowired
    private CustomerRepository customerrepos;

    @Override
    public Customer save(Customer customer)
    {
        return customerrepos.save(customer);
    }
}
