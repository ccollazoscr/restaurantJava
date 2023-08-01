package com.food.ordering.system.order.service.domain.dto.create;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

@Getter
@Builder
public class OrderAddress {
    @NotNull
    @Max(value=50)
    private final String street;
    @NotNull
    @Max(value=10)
    private final String postalCode;
    @NotNull
    @Max(value=50)
    private final String city;

    private OrderAddress(Builder builder) {
        street = builder.street;
        postalCode = builder.postalCode;
        city = builder.city;
    }

    public String getStreet() {
        return street;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCity() {
        return city;
    }

    public OrderAddress(String street, String postalCode, String city) {
        this.street = street;
        this.postalCode = postalCode;
        this.city = city;
    }
    public static OrderAddress.Builder builder(){
        return  new OrderAddress.Builder();
    }

    public static final class Builder {
        private @NotNull @Max(value = 50) String street;
        private @NotNull @Max(value = 10) String postalCode;
        private @NotNull @Max(value = 50) String city;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder street(@NotNull @Max(value = 50) String val) {
            street = val;
            return this;
        }

        public Builder postalCode(@NotNull @Max(value = 10) String val) {
            postalCode = val;
            return this;
        }

        public Builder city(@NotNull @Max(value = 50) String val) {
            city = val;
            return this;
        }

        public OrderAddress build() {
            return new OrderAddress(this);
        }
    }
}
