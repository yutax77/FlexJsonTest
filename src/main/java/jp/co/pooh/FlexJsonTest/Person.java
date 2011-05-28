package jp.co.pooh.FlexJsonTest;

import flexjson.JSONDeserializer;

public class Person<T extends Detail> {
	private String name;
	private int age;
	private T detail;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public T getDetail() {
		return detail;
	}
	public void setDetail(T detail) {
		this.detail = detail;
	}
	
	public static Person<PersonDetail> fromJson(String json){
		return new JSONDeserializer<Person<PersonDetail>>()
				.use(null, Person.class)
				.use("detail", PersonDetail.class)
				.deserialize(json);
	}
}
