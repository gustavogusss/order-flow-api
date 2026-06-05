package com.order_flow.api.dto;

import java.util.UUID;

public record AddItemRequest(
        UUID productId,
        Integer quantity
) {
}
