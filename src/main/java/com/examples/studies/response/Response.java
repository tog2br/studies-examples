package com.examples.studies.response;

public class Response {
	
	private String id;
	private String name;
	
	public Response(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Response [id=" + id + ", name=" + name + "]";
	}
}