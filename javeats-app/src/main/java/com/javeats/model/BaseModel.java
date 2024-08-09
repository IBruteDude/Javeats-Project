package com.javeats.model;

import java.sql.ResultSet;
import java.util.Map;

import com.javeats.util.SqlColumnData;

public class BaseModel {
	protected String _tablename;
	Map<String, SqlColumnData<?>> _columns;

	BaseModel(ResultSet rs) {

	}	
}
