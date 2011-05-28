package jp.co.pooh.FlexJsonTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest {

	@Test
	public void testFromJson() {
		final String json = "{\"name\":\"hoge\"," + 
							"\"age\":27," + 
							"\"detail\":{\"address\":\"foofoo\"}" + 
							"}";
		
		Person.fromJson(json);
	}

}
