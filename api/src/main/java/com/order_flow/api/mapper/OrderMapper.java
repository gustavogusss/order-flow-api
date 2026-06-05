package com.order_flow.api.mapper;

import com.order_flow.api.dto.OrderItemResponse;
import com.order_flow.api.dto.OrderResponse;
import com.order_flow.api.entity.OrderEntity;
import com.order_flow.api.entity.OrderItemEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderMapper {

    OrderResponse toResponse(OrderEntity entity);

    OrderItemResponse toResponse(OrderItemEntity entity);

}
