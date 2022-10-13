package orderService.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import orderService.Mapper.OrderServiceMapper;
import orderService.Repository.OrderServiceRepository;
import orderService.Service.OrderService;
import orderService.Vo.OrderVo;
import orderService.model.Order;

@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderServiceRepository OsRepository;
	@Autowired
	private OrderServiceMapper OsMapper;

	@Override
	public OrderVo addOrder(OrderVo vo) {
		Order order = OsMapper.OrderToEntity(vo);
		OsRepository.save(order);
		OrderVo orderVo = OsMapper.EntityToOrder(order);
		return orderVo;
	}

	@Override
	public List<OrderVo> getAllorderVo() {
		List<Order>  orderList = OsRepository.findAll();
		//List<OrderVo> orderVo = OsMapper.OrderToEntity(orderList);
		
		
		return null;
	}

}
