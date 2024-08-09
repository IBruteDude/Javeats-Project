package com.javeats.util;

import java.sql.SQLException;

@FunctionalInterface
public interface SqlColumnGetter<U> {
	void accept(int index, U value) throws SQLException;	
}
