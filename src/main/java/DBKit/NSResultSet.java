package DBKit;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Guillermo Facundo Colunga
 */
public final class NSResultSet {

	private ResultSet rs = null;

	/**
	 * Initializer for the result set.
	 * 
	 * @param rs
	 */
	public NSResultSet(ResultSet rs) {
		this.rs = rs;
	}

	/**
	 * Returns the self object of the result set, that is the original java
	 * interface ResultSet.
	 * 
	 * @returnthe original java interface ResultSet object.
	 */
	public ResultSet self() {
		return this.rs;
	}

	/**
	 * Returns the size of a result set.
	 * 
	 * @return the size of a result set.
	 * @throws SQLException if any error occurs while computing it.
	 */
	public int size() throws SQLException {
		int result = 0;
		while (this.rs != null) {
			this.rs.beforeFirst();
			this.rs.last();
			result = this.rs.getRow();
		}
		return result;
	}

	/**
	 * Translates the result set to a bidimensional array.
	 * 
	 * @return he result set as a bidimensional array.
	 * @throws SQLException if any error occurs while computing it.
	 */
	public Object[][] asArray() throws SQLException {
		List<Object[]> res = new ArrayList<Object[]>();
		int columns = this.size();
		Object[] register;
		while (rs.next()) {
			register = new Object[columns];
			for (int i = 0; i < columns; i++) {
				register[i] = rs.getObject(i + 1);
				res.add(register);
			}
		}
		Object[][] toReturn = new Object[res.size()][columns];
		for (int i = 0; i < res.size(); i++) {
			for (int j = 0; j < columns; j++) {
				toReturn[i][j] = res.get(i)[j];
			}
		}
		return toReturn;
	}

}
