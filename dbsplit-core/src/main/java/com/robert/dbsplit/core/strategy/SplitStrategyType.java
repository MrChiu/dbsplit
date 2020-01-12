package com.robert.dbsplit.core.strategy;

/**
 * 分片策略枚举
 */
public enum SplitStrategyType {

	VERTICAL("vertical"), HORIZONTAL("horizontal");

	private String value;

	SplitStrategyType(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return value;
	}
}
