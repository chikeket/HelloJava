package com.yedam.guestManager.app;

public class Beauty {
//field
	private int id;
	private String name;
	private String reserDate;
	private String firstDate;
	private String reVisitDate;
	private String reserType;
	private String content;
	private String cut;
	private String perm;
	private String care;
	private String intro;
	private String noshow;
	
//생성자
	public Beauty() {}
	public Beauty(int id, String reserDate, String name) {
		this.id = id;
		this.reserDate = reserDate;
		this.name = name;
	}
	

//getter setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getReserDate() {
		return reserDate;
	}

	public void setReserDate(String reserDate) {
		this.reserDate = reserDate;
	}

	public String getFirstDate() {
		return firstDate;
	}

	public void setFirstDate(String firstDate) {
		this.firstDate = firstDate;
	}

	public String getReVisitDate() {
		return reVisitDate;
	}

	public void setReVisitDate(String reVisitDate) {
		this.reVisitDate = reVisitDate;
	}

	public String getReserType() {
		return reserType;
	}

	public void setReserType(String reserType) {
		this.reserType = reserType;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCut() {
		return cut;
	}

	public void setCut(String cut) {
		this.cut = cut;
	}

	public String getPerm() {
		return perm;
	}

	public void setPerm(String perm) {
		this.perm = perm;
	}

	public String getCare() {
		return care;
	}

	public void setCare(String care) {
		this.care = care;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public String getNoshow() {
		return noshow;
	}

	public void setNoshow(String noshow) {
		this.noshow = noshow;
	}
	
	
	}

