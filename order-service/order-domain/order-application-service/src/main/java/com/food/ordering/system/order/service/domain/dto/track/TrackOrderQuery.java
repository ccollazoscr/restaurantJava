package com.food.ordering.system.order.service.domain.dto.track;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.UUID;

@Getter
@Builder
public class TrackOrderQuery {
    private final UUID orderTrackingId;

    public UUID getOrderTrackingId() {
        return orderTrackingId;
    }

    public TrackOrderQuery(UUID orderTrackingId) {
        this.orderTrackingId = orderTrackingId;
    }
}
