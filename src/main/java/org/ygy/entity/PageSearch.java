package org.ygy.entity;

public class PageSearch {
	private Integer page;
	private Integer rows;
	private String channelId;
	private String channelType;
	private String startDate;
	private String endDate;
	private boolean act = true;

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getChannelType() {
		return channelType;
	}

	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	

	public boolean isAct() {
		return act;
	}

	public void setAct(boolean act) {
		this.act = act;
	}

	@Override
	public String toString() {
		return "PageSearch [page=" + page + ", rows=" + rows + ", channelType=" + channelType + ", startDate="
				+ startDate + ", endDate=" + endDate + "]";
	}
	
}
