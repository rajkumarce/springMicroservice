package com.mrk.app.model;

//import lombok.AllArgsConstructor;
//import lombok.Data;

//@Data
//@AllArgsConstructor
public class CustomerDTO {
    private int id;
	private String name;
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

    public CustomerDTO(int id, String name){
    	this.id = id;
    	this.name = name;
    }
}
