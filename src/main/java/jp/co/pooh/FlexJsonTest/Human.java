package jp.co.pooh.FlexJsonTest;

import java.util.List;

import flexjson.JSONSerializer;

public class Human {
	private String name;
	private List<String> hobbies;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getHobbies() {
		return hobbies;
	}
	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}
	
	public String toJson(){
		return new JSONSerializer().exclude("*.class")
					.include("hobbies")
					.serialize(this);
	}
}
