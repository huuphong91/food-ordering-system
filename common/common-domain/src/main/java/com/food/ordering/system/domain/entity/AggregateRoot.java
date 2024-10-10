package com.food.ordering.system.domain.entity;

public class AggregateRoot<ID> extends BaseEntity<ID> {
    private boolean active;

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}

