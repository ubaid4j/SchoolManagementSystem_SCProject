package com.ubaid.app.model.strategy;

import java.util.Map;
import org.json.JSONArray;

public interface RequestHandler
{
	/**
	 * 
	 * @param map of String, String[] which holds the parameters of 
	 * requests generated from ajax in the front end
	 * @return an json object
	 */
	JSONArray get(Map<String, String[]> map);
	
}
