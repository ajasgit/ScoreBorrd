package com.ajas.jasper.model;

public class ScoreModel {

	private Integer id;
	private String name;
	private Integer sub1;
	private Integer sub2;
	private Integer total;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSub1() {
		return sub1;
	}
	public void setSub1(Integer sub1) {
		this.sub1 = sub1;
	}
	public Integer getSub2() {
		return sub2;
	}
	public void setSub2(Integer sub2) {
		this.sub2 = sub2;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public ScoreModel(Integer id, String name, Integer sub1, Integer sub2, Integer total) {
		super();
		this.id = id;
		this.name = name;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.total = total;
	}
	public ScoreModel() {
		super();
	}
	@Override
	public String toString() {
		return "ScoreModel [id=" + id + ", name=" + name + ", sub1=" + sub1 + ", sub2=" + sub2 + ", total=" + total
				+ "]";
	}
	
	
	
}
