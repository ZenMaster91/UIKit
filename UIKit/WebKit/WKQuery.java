package WebKit;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import Foundation.NSFile;

public final class WKQuery {
	
	private String query;
	
	public WKQuery(String query) {
		this.query = query;
	}
	
	public String queryValue() {
		return this.query;
	}
	
	public static WKQuery load(NSFile query) {
		
		BufferedReader br = null;
		StringBuilder sb = null;
		try {
			br = new BufferedReader(new FileReader(query.completePath()));
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
