package com.order_flow.api.dto;

import com.order_flow.api.enums.OrderStatus;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public record OrderResponse(
        UUID id,
        OrderStatus status,
        List<OrderItemResponse> items,
        LocalDateTime createdAt,
        LocalDateTime updatedAt,
        LocalDateTime finalizedAt
) {
}
