package com.robert.dbsplit.core;

import com.robert.dbsplit.core.strategy.HorizontalHashSplitStrategy;
import com.robert.dbsplit.core.strategy.SplitStrategy;
import com.robert.dbsplit.core.strategy.SplitStrategyType;
import com.robert.dbsplit.core.strategy.VerticalHashSplitStrategy;

import java.util.List;

/**
 * 分片的表
 */
public class SplitTable {
	private String dbNamePrefix;
	private String tableNamePrefix;

	private int dbNum;
	private int tableNum;

	private SplitStrategyType splitStrategyType = SplitStrategyType.VERTICAL;
	private SplitStrategy splitStrategy;
	private List<SplitNode> splitNodes;

	private boolean readWriteSeparate = true;

	public void init() {
		if (splitStrategyType == SplitStrategyType.VERTICAL)
			this.splitStrategy = new VerticalHashSplitStrategy(
					splitNodes.size(), dbNum, tableNum);
		else if (splitStrategyType == SplitStrategyType.HORIZONTAL)
			this.splitStrategy = new HorizontalHashSplitStrategy(
					splitNodes.size(), dbNum, tableNum);
	}

	public void setSplitStrategyType(String splitStrategyType) {
		this.splitStrategyType = SplitStrategyType.valueOf(splitStrategyType);
	}

	public String getDbNamePrefix() {
		return dbNamePrefix;
	}

	public void setDbNamePrefix(String dbNamePrifix) {
		this.dbNamePrefix = dbNamePrifix;
	}

	public String getTableNamePrefix() {
		return tableNamePrefix;
	}

	public void setTableNamePrefix(String tableNamePrifix) {
		this.tableNamePrefix = tableNamePrifix;
	}

	public int getDbNum() {
		return dbNum;
	}

	public void setDbNum(int dbNum) {
		this.dbNum = dbNum;
	}

	public int getTableNum() {
		return tableNum;
	}

	public void setTableNum(int tableNum) {
		this.tableNum = tableNum;
	}

	public List<SplitNode> getSplitNodes() {
		return splitNodes;
	}

	public void setSplitNodes(List<SplitNode> splitNodes) {
		this.splitNodes = splitNodes;
	}

	public SplitStrategy getSplitStrategy() {
		return splitStrategy;
	}

	public void setSplitStrategy(SplitStrategy splitStrategy) {
		this.splitStrategy = splitStrategy;
	}

	public boolean isReadWriteSeparate() {
		return readWriteSeparate;
	}

	public void setReadWriteSeparate(boolean readWriteSeparate) {
		this.readWriteSeparate = readWriteSeparate;
	}
}
