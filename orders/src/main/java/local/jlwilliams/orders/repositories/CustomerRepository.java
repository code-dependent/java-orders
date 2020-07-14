package local.jlwilliams.orders.repositories;

import local.jlwilliams.orders.models.Agent;
import local.jlwilliams.orders.models.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository
        extends CrudRepository<Customer, Long>
{
}
