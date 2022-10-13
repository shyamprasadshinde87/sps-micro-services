package orderService.Service;

import java.util.List;

import orderService.Vo.OrderVo;

public interface OrderService {

	public OrderVo addOrder(OrderVo vo);

	List<OrderVo> getAllorderVo();

}
