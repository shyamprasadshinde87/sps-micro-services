package orderService.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import orderService.Vo.OrderVo;
import orderService.model.Order;

@Mapper(componentModel="spring")
public interface OrderServiceMapper {
	
	OrderServiceMapper mapper = Mappers.getMapper(OrderServiceMapper.class);
	
	Order OrderToEntity(OrderVo orderVo);
	
	OrderVo EntityToOrder(Order order);
	
	

}
