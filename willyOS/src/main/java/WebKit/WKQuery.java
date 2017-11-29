package WebKit;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import Foundation.NSFile;

/**
 * A <code>WKQuery</code> object represents a pure string query. It can be
 * loaded from a <code>NSFile</code> as a .sql file.
 *
 * @author Guillermo Facundo Colunga
 * @version 0.1
 * @since 0.1
 * @formatter Oviedo Computing Community
 */
public final class WKQuery {

	private String query;

	/**
	 * Initiates a WKQuery from a sql statement as an string.
	 * 
	 * @param query The sql query to store.
	 */
	public WKQuery(String query) {
		this.query = query;
	}

	/**
	 * Initiates a WKQuery from an <code>NSFile</code>.
	 * 
	 * @param file The file containning the query.
	 */
	public WKQuery(NSFile file) {
		this.query = load(file).query;
	}

	/**
	 * @return The query as a pure String object.
	 */
	public String queryValue() {
		return this.query;
	}

	/**
	 * Loads a sql file into a WKQuery object.
	 * 
	 * @param sqlFile The sql file containing the query.
	 * @return The WKQuery that contains the query.
	 */
	public static WKQuery load(NSFile sqlFile) {

		BufferedReader br = null;
		StringBuilder sb = null;
		try {
			br = new BufferedReader(new FileReader(sqlFile.path()));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			sb = new StringBuilder();
			String line = br.readLine();

			while (line != null) {
				sb.append(line);
				sb.append("\n");
				line = br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return new WKQuery(sb.toString());
	}

}
