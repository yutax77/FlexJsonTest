package jp.co.pooh.FlexJsonTest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class HumanTest {

	@Test
	public void testToJson() {
		Human h = new Human();
		h.setName("hoge");
		List<String> hobbies = new ArrayList<String>();
		hobbies.add("jazz");
		hobbies.add("drums");
		h.setHobbies(hobbies);
		
		String expected = "{\"hobbies\":[\"jazz\",\"drums\"],\"name\":\"hoge\"}";
		assertEquals(expected, h.toJson());
	}

}
