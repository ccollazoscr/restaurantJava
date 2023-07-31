package com.food.ordering.system.order.service.domain.ports.output.message.publisher.payment;

import com.food.ordering.system.domain.event.publisher.DomaninEventPublisher;
import com.food.ordering.system.order.service.domain.event.OrderCancellEvent;

public interface OrderCancelledPaymentRequestMessagePublisher extends DomaninEventPublisher<OrderCancellEvent> {
}
