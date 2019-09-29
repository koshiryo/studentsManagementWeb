package com.students.programmer.model;


public class Page {
	private int start;
	private int currentPage;
	private int pageSize;
	public Page(int currentPage,int pageSize){
		this.start = (currentPage-1)*pageSize;
		this.currentPage = currentPage;
		this.pageSize = pageSize;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
}


