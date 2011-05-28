package jp.co.pooh.FlexJsonTest;

import flexjson.JSONDeserializer;
import flexjson.locators.TypeLocator;

public class Persons {
	
	public static Person<PersonDetail> fromJson(String json){
		//return new JSONDeserializer<Person>().use(null, Person.class).use("detail", new TypeLocator<String>("type").add("personDetail", PersonDetail.class)).deserialize(json);
		return new JSONDeserializer<Person<PersonDetail>>().use(null, Person.class).use("detail", PersonDetail.class).deserialize(json);
	}
}
