package orderService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import orderService.model.Order;

@Repository
public interface OrderServiceRepository extends JpaRepository<Order, Long> {

}
