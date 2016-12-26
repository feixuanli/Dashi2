
package model;

import static org.junit.Assert.*;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

public class RestaurantTest {
	Restaurant restaurant;

	@Test
	public void testJsonArrayToString() {
		JSONArray jsonArray = new JSONArray();
		jsonArray.put("Chinese");
		jsonArray.put("Japanese");
		jsonArray.put("Italian");
		assertEquals("Chinese,Japanese,Italian", 
			Restaurant.jsonArrayToString(jsonArray));
	}
}
