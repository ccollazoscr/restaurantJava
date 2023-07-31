package com.food.ordering.system.order.service.domain.event;

import com.food.ordering.system.domain.event.DomainEvent;
import com.food.ordering.system.order.service.domain.entity.Order;

import java.time.ZonedDateTime;

public class OrderCancellEvent extends OrderEvent {
    public OrderCancellEvent(Order order, ZonedDateTime createdAt) {
        super(order, createdAt);
    }
}