package com.food.ordering.system.domain.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Setter
@Getter
public abstract class BaseEntity<ID> {
    private ID Id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseEntity<?> that = (BaseEntity<?>) o;
        return Id.equals(that.Id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id);
    }

}
