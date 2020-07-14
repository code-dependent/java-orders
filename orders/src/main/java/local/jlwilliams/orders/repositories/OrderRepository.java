package local.jlwilliams.orders.repositories;

import local.jlwilliams.orders.models.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository
        extends CrudRepository<Order, Long>
{
}
