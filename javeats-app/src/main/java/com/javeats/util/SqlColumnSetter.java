package com.javeats.util;

import java.sql.SQLException;

@FunctionalInterface
public interface SqlColumnSetter<U> {
	U accept(int index) throws SQLException;	
}
