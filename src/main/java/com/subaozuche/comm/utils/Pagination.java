package com.subaozuche.comm.utils;

import java.util.List;

public class Pagination<E> {
	private static int DEFAULT_PAGE_SIZE = 20;

	private int itemPerPage = DEFAULT_PAGE_SIZE;
	private int totalCount;
	private int totalPage;
	private int curPage;
	private int startIndex;
	private List<E> itemList;

	public void initialize() {
		totalCount = totalCount > 0 ? totalCount : 0;
		itemPerPage = itemPerPage > 0 ? itemPerPage : DEFAULT_PAGE_SIZE;
		totalPage = totalCount > 0 ? ((totalCount - 1) / itemPerPage + 1) : 0;

		if (totalCount > 0) {
			curPage = curPage > 0 ? curPage : 0;
			curPage = curPage > totalPage ? totalPage : curPage;
		} else {
			curPage = 0;
		}

		startIndex = 0;
		if (curPage > 0) {
			startIndex = (curPage - 1) * itemPerPage + 1;
		}
	}

	public boolean hasPrev() {
		return curPage > 1;
	}

	public boolean hasNext() {
		return curPage < totalPage;
	}

	public boolean isPrev() {
		return hasPrev();
	}

	public boolean isNext() {
		return hasNext();
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getCurPage() {
		return curPage;
	}

	public void setCurPage(int curPage) {
		this.curPage = curPage;
	}

	public int getItemPerPage() {
		return itemPerPage;
	}

	public void setItemPerPage(int itemPerPage) {
		this.itemPerPage = itemPerPage;
	}

	public int getStartIndex() {
		return startIndex;
	}

	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}

	public List<E> getItemList() {
		return itemList;
	}

	public void setItemList(List<E> itemList) {
		this.itemList = itemList;
	}

	@Override
	public String toString() {
		return "Pagination [itemPerPage=" + itemPerPage + ", totalCount=" + totalCount + ", totalPage=" + totalPage
				+ ", curPage=" + curPage + ", startIndex=" + startIndex + ", itemList=" + itemList + "]";
	}

}
