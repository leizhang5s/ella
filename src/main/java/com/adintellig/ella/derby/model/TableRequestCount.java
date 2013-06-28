package com.adintellig.ella.derby.model;

import java.sql.Timestamp;

public class TableRequestCount {
	private String tableName = null;
	private long writeCount = 0;
	private long readCount = 0;
	private long totalCount = 0;
	private Timestamp updateTime = null;
	private Timestamp insertTime = null;

	public TableRequestCount() {
		super();
	}

	public TableRequestCount(String tableName, long writeCount, long readCount,
			long totalCount, Timestamp updateTime, Timestamp insertTime) {
		super();
		this.tableName = tableName;
		this.writeCount = writeCount;
		this.readCount = readCount;
		this.totalCount = totalCount;
		this.updateTime = updateTime;
		this.insertTime = insertTime;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public long getWriteCount() {
		return writeCount;
	}

	public void setWriteCount(long writeCount) {
		this.writeCount = writeCount;
	}

	public long getReadCount() {
		return readCount;
	}

	public void setReadCount(long readCount) {
		this.readCount = readCount;
	}

	public long getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(long totalCount) {
		this.totalCount = totalCount;
	}

	public Timestamp getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}

	public Timestamp getInsertTime() {
		return insertTime;
	}

	public void setInsertTime(Timestamp insertTime) {
		this.insertTime = insertTime;
	}

	@Override
	public String toString() {
		return "TableRequestCount [tableName=" + tableName + ", writeCount="
				+ writeCount + ", readCount=" + readCount + ", totalCount="
				+ totalCount + ", updateTime=" + updateTime + ", insertTime="
				+ insertTime + "]";
	}

}
