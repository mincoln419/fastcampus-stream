package com.mermer.ch6;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Order {

	private long id;
	private LocalDateTime createdAt;
	private long createdByUserId;
	private OrderStatus status;
	private int quantity;
	private BigDecimal amount;
	
	public enum OrderStatus{
		CREATED,
		IN_PROGRESS,
		ERROR,
		PROCESSED
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public long getCreatedByUserId() {
		return createdByUserId;
	}

	public void setCreatedByUserId(long createdByUserId) {
		this.createdByUserId = createdByUserId;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", createdAt=" + createdAt + ", createdByUserId=" + createdByUserId + ", status="
				+ status + ", quantity=" + quantity + ", amount=" + amount + "]";
	}
	
	
	
}
